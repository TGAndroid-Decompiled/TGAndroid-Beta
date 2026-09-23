package ai;

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
public final class d2 implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static d2 W;
    public NativeInstance E;
    public TLRPC.GroupCallParticipant G;
    public final b2 H;
    public boolean I;
    public long J;
    public int K;
    public boolean L;
    public VideoSink O;
    public boolean P;
    public Runnable Q;
    public Runnable R;
    public ArrayList U;
    public ArrayList V;
    public final TL_stories.StoryItem f694a;
    public final long f695b;
    public final int f696c;
    public final Context d;
    public final int e;
    public final TLRPC.InputGroupCall f697f;
    public final boolean h;
    public boolean f698n;
    public TLRPC.GroupCall v;
    public boolean f702x;
    public int f703y;
    public boolean f699r = false;
    public boolean f700s = false;
    public boolean f701w = false;
    public final HashMap F = new HashMap();
    public final HashSet M = new HashSet();
    public float N = 1.0f;
    public int S = -1;
    public int T = -1;

    public d2(Context context, int i10, TL_stories.StoryItem storyItem, long j3, int i11, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.I = false;
        this.d = context;
        this.e = i10;
        this.f697f = inputGroupCall;
        this.f694a = storyItem;
        this.f695b = j3;
        this.f696c = i11;
        this.h = z10;
        this.f698n = z11;
        this.I = z12;
        b2 b2Var = new b2(this);
        this.H = b2Var;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.f18100id);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z11) {
            this.J = NativeInstance.createVideoCapturer(b2Var, z12 ? 1 : 0);
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
        if (!this.f701w && !this.f698n && this.f700s && W == null && (groupCall = this.v) != null && !groupCall.rtmp_stream && groupCall.creator) {
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
        boolean z10;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f698n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
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
            if (this.f695b == longValue) {
                zf.d.a(this.v, groupCall);
                this.v = groupCall;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.f18093id));
            }
        }
    }

    public final void e() {
        if (!this.f701w) {
            this.f701w = true;
            u(false);
            NotificationCenter.getInstance(this.e).removeObserver(this, NotificationCenter.storyGroupCallUpdated);
            FileLog.d("[LivePlayer] destroyed");
            if (this.f702x) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f697f;
                ConnectionsManager.getInstance(this.e).sendRequest(leavegroupcall, new q1(this, 5));
            }
            if (this.f698n) {
                this.H.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.J);
            }
            if (this.E != null) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                NativeInstance nativeInstance = this.E;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                this.M.clear();
                this.E = null;
            }
            if (this.L) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.L = false;
            }
            if (this.f698n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (W == this) {
                W = null;
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f697f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f18100id != inputGroupCall.f18100id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null) {
            return groupCall.f18093id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f697f;
        if (inputGroupCall != null) {
            return inputGroupCall.f18100id;
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
        if (this.f701w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.f2.d("live_" + this.f697f.f18100id), 0L, false, SharedConfig.noiseSupression, new p1(this, 0), new w1(0), new p1(this, 2), new p1(this, 3), new p1(this, 4), new p1(this, 5), false);
        this.E = makeGroup;
        makeGroup.setOnStateUpdatedListener(new c2(this));
        this.E.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        int i10 = this.e;
        long j3 = this.f695b;
        if (j3 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j3) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 14);
    }

    public final boolean m() {
        int i10 = this.f703y;
        if (i10 == 3 || i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f701w && this.f700s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f698n && this.f699r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.Q = null;
        if (this.f701w) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f697f;
        checkgroupcall.sources.add(Integer.valueOf(this.K));
        ConnectionsManager.getInstance(this.e).sendRequest(checkgroupcall, new q1(this, 3));
    }

    public final void q() {
        this.R = null;
        if (this.f701w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f697f;
        ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new q1(this, 1));
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
                        this.M.add(Integer.valueOf(iArr[i11]));
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
        if (this.O == videoSink) {
            return;
        }
        this.O = videoSink;
        this.H.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (!this.f701w && this.f700s != z10) {
            if (this.f698n && z10) {
                return;
            }
            this.f700s = z10;
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
        }
    }

    public final void u(boolean z10) {
        int i10;
        if (this.f701w) {
            z10 = false;
        }
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                int i11 = this.S;
                int i12 = this.e;
                if (i11 != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.S, true);
                    this.S = -1;
                }
                if (this.T != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.T, true);
                    this.T = -1;
                }
                Runnable runnable = this.Q;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.Q = null;
                }
                Runnable runnable2 = this.R;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.R = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.Q;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
            }
            t1 t1Var = new t1(this, 0);
            this.Q = t1Var;
            AndroidUtilities.runOnUIThread(t1Var, 4000L);
            Runnable runnable4 = this.R;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
            }
            t1 t1Var2 = new t1(this, 1);
            this.R = t1Var2;
            if (l()) {
                i10 = 5000;
            } else {
                i10 = 20000;
            }
            AndroidUtilities.runOnUIThread(t1Var2, i10);
        }
    }

    public final void v(float f7) {
        float clamp01 = Utilities.clamp01(f7);
        m2 m2Var = m2.Z;
        if (m2Var.S && m2Var.v == this) {
            clamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + clamp01 + ")");
        if (Math.abs(clamp01 - this.N) < 0.01f) {
            return;
        }
        this.N = clamp01;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i10 = this.e;
        tL_updateStory.peer = MessagesController.getInstance(i10).getPeer(this.f695b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f18318id = this.f696c;
        MessagesController.getInstance(i10).getStoriesController().Z(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f701w && this.E != null) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                this.E.setVolume(((Integer) it.next()).intValue(), this.N);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
    }
}
