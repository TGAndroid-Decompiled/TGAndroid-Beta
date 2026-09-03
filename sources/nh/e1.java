package nh;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class e1 implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static e1 T;
    public NativeInstance B;
    public TLRPC.GroupCallParticipant D;
    public final c1 E;
    public boolean F;
    public long G;
    public int H;
    public boolean I;
    public VideoSink L;
    public boolean M;
    public Runnable N;
    public Runnable O;
    public ArrayList R;
    public ArrayList S;
    public final TL_stories.StoryItem f15272a;
    public final long f15273b;
    public final int f15274c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f15275f;
    public final boolean h;
    public boolean f15276n;
    public TLRPC.GroupCall v;
    public boolean f15280x;
    public int f15281y;
    public boolean f15277r = false;
    public boolean f15278s = false;
    public boolean f15279w = false;
    public final HashMap C = new HashMap();
    public final HashSet J = new HashSet();
    public float K = 1.0f;
    public int P = -1;
    public int Q = -1;

    public e1(Context context, int i10, TL_stories.StoryItem storyItem, long j10, int i11, boolean z4, TLRPC.InputGroupCall inputGroupCall, boolean z10, boolean z11) {
        this.F = false;
        this.d = context;
        this.e = i10;
        this.f15275f = inputGroupCall;
        this.f15272a = storyItem;
        this.f15273b = j10;
        this.f15274c = i11;
        this.h = z4;
        this.f15276n = z10;
        this.F = z11;
        c1 c1Var = new c1(this);
        this.E = c1Var;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.f19176id);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z10) {
            this.G = NativeInstance.createVideoCapturer(c1Var, z11 ? 1 : 0);
        }
        c();
        k();
    }

    public static NativeInstance.SsrcGroup[] d(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i10 = 0; i10 < size; i10++) {
            ssrcGroupArr[i10] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i10);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i10];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i11 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i10].ssrcs;
                if (i11 < iArr.length) {
                    iArr[i11] = tL_groupCallParticipantVideoSourceGroup.sources.get(i11).intValue();
                    i11++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public final boolean a() {
        TLRPC.GroupCall groupCall;
        if (!this.f15279w && !this.f15276n && this.f15278s && T == null && (groupCall = this.v) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.v == null || l()) {
            return false;
        }
        return !this.v.messages_enabled;
    }

    public final void c() {
        boolean z4;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f15276n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.I = z4;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyGroupCallUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.f15273b == longValue) {
                lf.d.a(this.v, groupCall);
                this.v = groupCall;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.f19169id));
            }
        }
    }

    public final void e() {
        if (!this.f15279w) {
            this.f15279w = true;
            u(false);
            NotificationCenter.getInstance(this.e).removeObserver(this, NotificationCenter.storyGroupCallUpdated);
            FileLog.d("[LivePlayer] destroyed");
            if (this.f15280x) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f15275f;
                ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new x0(this, 5));
            }
            if (this.f15276n) {
                this.E.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.G);
            }
            if (this.B != null) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                NativeInstance nativeInstance = this.B;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 3));
                this.J.clear();
                this.B = null;
            }
            if (this.I) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.I = false;
            }
            if (this.f15276n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (T == this) {
                T = null;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f15275f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f19176id != inputGroupCall.f19176id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null) {
            return groupCall.f19169id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f15275f;
        if (inputGroupCall != null) {
            return inputGroupCall.f19176id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.f15279w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.f2.d("live_" + this.f15275f.f19176id), 0L, false, SharedConfig.noiseSupression, new w0(this, 0), new m.j0(2), new w0(this, 2), new w0(this, 3), new w0(this, 4), new w0(this, 5), false);
        this.B = makeGroup;
        makeGroup.setOnStateUpdatedListener(new d1(this));
        this.B.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        int i10 = this.e;
        long j10 = this.f15273b;
        if (j10 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j10) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 14);
    }

    public final boolean m() {
        int i10 = this.f15281y;
        if (i10 == 3 || i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f15279w && this.f15278s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f15276n && this.f15277r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.N = null;
        if (this.f15279w) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f15275f;
        checkgroupcall.sources.add(Integer.valueOf(this.H));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new x0(this, 3));
    }

    public final void q() {
        this.O = null;
        if (this.f15279w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f15275f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new x0(this, 1));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int length;
        int i10 = 0;
        while (true) {
            if (ssrcGroupArr == null) {
                length = 0;
            } else {
                length = ssrcGroupArr.length;
            }
            if (i10 < length) {
                int i11 = 0;
                while (true) {
                    int[] iArr = ssrcGroupArr[i10].ssrcs;
                    if (i11 < iArr.length) {
                        this.J.add(Integer.valueOf(iArr[i11]));
                        i11++;
                    }
                }
                i10++;
            } else {
                x();
                return;
            }
        }
    }

    public final void s(VideoSink videoSink) {
        if (this.L == videoSink) {
            return;
        }
        this.L = videoSink;
        this.E.setTarget(videoSink);
    }

    public final void t(boolean z4) {
        if (!this.f15279w && this.f15278s != z4) {
            if (this.f15276n && z4) {
                return;
            }
            this.f15278s = z4;
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
        }
    }

    public final void u(boolean z4) {
        int i10;
        if (this.f15279w) {
            z4 = false;
        }
        if (this.M != z4) {
            this.M = z4;
            if (!z4) {
                int i11 = this.P;
                int i12 = this.e;
                if (i11 != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.P, true);
                    this.P = -1;
                }
                if (this.Q != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.Q, true);
                    this.Q = -1;
                }
                Runnable runnable = this.N;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.N = null;
                }
                Runnable runnable2 = this.O;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.O = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.N;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
            }
            z0 z0Var = new z0(this, 0);
            this.N = z0Var;
            AndroidUtilities.runOnUIThread(z0Var, 4000L);
            Runnable runnable4 = this.O;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
            }
            z0 z0Var2 = new z0(this, 1);
            this.O = z0Var2;
            if (l()) {
                i10 = 5000;
            } else {
                i10 = 20000;
            }
            AndroidUtilities.runOnUIThread(z0Var2, i10);
        }
    }

    public final void v(float f10) {
        float clamp01 = Utilities.clamp01(f10);
        j1 j1Var = j1.W;
        if (j1Var.P && j1Var.v == this) {
            clamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + clamp01 + ")");
        if (Math.abs(clamp01 - this.K) < 0.01f) {
            return;
        }
        this.K = clamp01;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i10 = this.e;
        tL_updateStory.peer = MessagesController.getInstance(i10).getPeer(this.f15273b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f19394id = this.f15274c;
        MessagesController.getInstance(i10).getStoriesController().Z(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f15279w && this.B != null) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                this.B.setVolume(((Integer) it.next()).intValue(), this.K);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
    }
}
