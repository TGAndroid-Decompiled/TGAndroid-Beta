package lh;

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
public final class d1 implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static d1 S;
    public NativeInstance A;
    public TLRPC.GroupCallParticipant C;
    public final b1 D;
    public boolean E;
    public long F;
    public int G;
    public boolean H;
    public VideoSink K;
    public boolean L;
    public Runnable M;
    public Runnable N;
    public ArrayList Q;
    public ArrayList R;
    public final TL_stories.StoryItem f15453a;
    public final long f15454b;
    public final int f15455c;
    public final Context d;
    public final int f15456e;
    public final TLRPC.InputGroupCall f15457f;
    public final boolean h;
    public boolean f15458n;
    public TLRPC.GroupCall v;
    public boolean f15462x;
    public int f15463y;
    public boolean f15459r = false;
    public boolean f15460s = false;
    public boolean f15461w = false;
    public final HashMap B = new HashMap();
    public final HashSet I = new HashSet();
    public float J = 1.0f;
    public int O = -1;
    public int P = -1;

    public d1(Context context, int i10, TL_stories.StoryItem storyItem, long j10, int i11, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.E = false;
        this.d = context;
        this.f15456e = i10;
        this.f15457f = inputGroupCall;
        this.f15453a = storyItem;
        this.f15454b = j10;
        this.f15455c = i11;
        this.h = z10;
        this.f15458n = z11;
        this.E = z12;
        b1 b1Var = new b1(this);
        this.D = b1Var;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.f22409id);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z11) {
            this.F = NativeInstance.createVideoCapturer(b1Var, z12 ? 1 : 0);
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
        if (!this.f15461w && !this.f15458n && this.f15460s && S == null && (groupCall = this.v) != null && !groupCall.rtmp_stream && groupCall.creator) {
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
        } else if (this.f15458n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
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
            if (this.f15454b == longValue) {
                kf.d.a(this.v, groupCall);
                this.v = groupCall;
                NotificationCenter.getInstance(this.f15456e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.f22402id));
            }
        }
    }

    public final void e() {
        if (!this.f15461w) {
            this.f15461w = true;
            u(false);
            NotificationCenter.getInstance(this.f15456e).removeObserver(this, NotificationCenter.storyGroupCallUpdated);
            FileLog.d("[LivePlayer] destroyed");
            if (this.f15462x) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f15457f;
                ConnectionsManager.getInstance(this.f15456e).sendRequest(leavegroupcall, new w0(this, 5));
            }
            if (this.f15458n) {
                this.D.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.F);
            }
            if (this.A != null) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                NativeInstance nativeInstance = this.A;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                this.I.clear();
                this.A = null;
            }
            if (this.H) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.H = false;
            }
            if (this.f15458n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (S == this) {
                S = null;
                NotificationCenter.getInstance(this.f15456e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f15457f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f22409id != inputGroupCall.f22409id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null) {
            return groupCall.f22402id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f15457f;
        if (inputGroupCall != null) {
            return inputGroupCall.f22409id;
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
        if (this.f15461w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.h2.d("live_" + this.f15457f.f22409id), 0L, false, SharedConfig.noiseSupression, new v0(this, 0), new k3.d(20), new v0(this, 2), new v0(this, 3), new v0(this, 4), new v0(this, 5), false);
        this.A = makeGroup;
        makeGroup.setOnStateUpdatedListener(new c1(this));
        this.A.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.v;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        int i10 = this.f15456e;
        long j10 = this.f15454b;
        if (j10 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j10) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 14);
    }

    public final boolean m() {
        int i10 = this.f15463y;
        if (i10 == 3 || i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f15461w && this.f15460s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f15458n && this.f15459r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.M = null;
        if (this.f15461w) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f15457f;
        checkgroupcall.sources.add(Integer.valueOf(this.G));
        ConnectionsManager.getInstance(this.f15456e).sendRequest(checkgroupcall, new w0(this, 3));
    }

    public final void q() {
        this.N = null;
        if (this.f15461w) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f15457f;
        ConnectionsManager.getInstance(this.f15456e).sendRequest(getgroupcall, new w0(this, 1));
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
                        this.I.add(Integer.valueOf(iArr[i11]));
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
        if (this.K == videoSink) {
            return;
        }
        this.K = videoSink;
        this.D.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (!this.f15461w && this.f15460s != z10) {
            if (this.f15458n && z10) {
                return;
            }
            this.f15460s = z10;
            NotificationCenter.getInstance(this.f15456e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(g()));
        }
    }

    public final void u(boolean z10) {
        int i10;
        if (this.f15461w) {
            z10 = false;
        }
        if (this.L != z10) {
            this.L = z10;
            if (!z10) {
                int i11 = this.O;
                int i12 = this.f15456e;
                if (i11 != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.O, true);
                    this.O = -1;
                }
                if (this.P != -1) {
                    ConnectionsManager.getInstance(i12).cancelRequest(this.P, true);
                    this.P = -1;
                }
                Runnable runnable = this.M;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.M = null;
                }
                Runnable runnable2 = this.N;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.N = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.M;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
            }
            y0 y0Var = new y0(this, 0);
            this.M = y0Var;
            AndroidUtilities.runOnUIThread(y0Var, 4000L);
            Runnable runnable4 = this.N;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
            }
            y0 y0Var2 = new y0(this, 1);
            this.N = y0Var2;
            if (l()) {
                i10 = 5000;
            } else {
                i10 = 20000;
            }
            AndroidUtilities.runOnUIThread(y0Var2, i10);
        }
    }

    public final void v(float f9) {
        float clamp01 = Utilities.clamp01(f9);
        i1 i1Var = i1.V;
        if (i1Var.O && i1Var.v == this) {
            clamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + clamp01 + ")");
        if (Math.abs(clamp01 - this.J) < 0.01f) {
            return;
        }
        this.J = clamp01;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i10 = this.f15456e;
        tL_updateStory.peer = MessagesController.getInstance(i10).getPeer(this.f15454b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f22629id = this.f15455c;
        MessagesController.getInstance(i10).getStoriesController().Z(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f15461w && this.A != null) {
            Iterator it = this.I.iterator();
            while (it.hasNext()) {
                this.A.setVolume(((Integer) it.next()).intValue(), this.J);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
    }
}
