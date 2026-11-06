package di;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class g1 implements ls, AudioManager.OnAudioFocusChangeListener {
    public static g1 W;
    public int D;
    public NativeInstance E;
    public TLRPC.GroupCallParticipant G;
    public final e1 H;
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
    public final TL_stories.StoryItem f9022a;
    public final long f9023b;
    public final int f9024c;
    public final Context d;
    public final int f9025e;
    public final TLRPC.InputGroupCall f9026f;
    public final boolean h;
    public boolean f9027n;
    public TLRPC.GroupCall f9030w;
    public boolean f9032y;
    public boolean f9028r = false;
    public boolean f9029s = false;
    public boolean f9031x = false;
    public final HashMap F = new HashMap();
    public final HashSet M = new HashSet();
    public float N = 1.0f;
    public int S = -1;
    public int T = -1;

    public g1(Context context, int i7, TL_stories.StoryItem storyItem, long j3, int i10, boolean z9, TLRPC.InputGroupCall inputGroupCall, boolean z10, boolean z11) {
        this.I = false;
        this.d = context;
        this.f9025e = i7;
        this.f9026f = inputGroupCall;
        this.f9022a = storyItem;
        this.f9023b = j3;
        this.f9024c = i10;
        this.h = z9;
        this.f9027n = z10;
        this.I = z11;
        e1 e1Var = new e1(this);
        this.H = e1Var;
        org.telegram.messenger.a8.b("[LivePlayer] setup to call " + inputGroupCall.f26969id);
        qs.f(i7).b(this, qs.f25089x2);
        if (z10) {
            this.J = NativeInstance.createVideoCapturer(e1Var, z11 ? 1 : 0);
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
        for (int i7 = 0; i7 < size; i7++) {
            ssrcGroupArr[i7] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i7);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i7];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i7].ssrcs;
                if (i10 < iArr.length) {
                    iArr[i10] = tL_groupCallParticipantVideoSourceGroup.sources.get(i10).intValue();
                    i10++;
                }
            }
        }
        return ssrcGroupArr;
    }

    public final boolean a() {
        TLRPC.GroupCall groupCall;
        if (!this.f9031x && !this.f9027n && this.f9029s && W == null && (groupCall = this.f9030w) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f9030w == null || l()) {
            return false;
        }
        return !this.f9030w.messages_enabled;
    }

    public final void c() {
        boolean z9;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f9027n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.L = z9;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25089x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.f9023b == longValue) {
                cg.d.a(this.f9030w, groupCall);
                this.f9030w = groupCall;
                qs.f(this.f9025e).k(qs.G2, Long.valueOf(groupCall.f26962id));
            }
        }
    }

    public final void e() {
        if (!this.f9031x) {
            this.f9031x = true;
            u(false);
            qs.f(this.f9025e).n(this, qs.f25089x2);
            org.telegram.messenger.a8.b("[LivePlayer] destroyed");
            if (this.f9032y) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f9026f;
                leavegroupcall.source = this.K;
                ConnectionsManager.getInstance(this.f9025e).sendRequest(leavegroupcall, new y0(this, 5));
            }
            if (this.f9027n) {
                this.H.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.J);
            }
            if (this.E != null) {
                org.telegram.messenger.p5 p5Var = Utilities.f21333e;
                NativeInstance nativeInstance = this.E;
                Objects.requireNonNull(nativeInstance);
                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                this.M.clear();
                this.E = null;
            }
            if (this.L) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.L = false;
            }
            if (this.f9027n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (W == this) {
                W = null;
                qs.f(this.f9025e).k(qs.G2, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f9026f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f26969id != inputGroupCall.f26969id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.f9030w;
        if (groupCall != null) {
            return groupCall.f26962id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f9026f;
        if (inputGroupCall != null) {
            return inputGroupCall.f26969id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.f9030w;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.f9030w;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.f9030w;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.f9031x) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.y1.d("live_" + this.f9026f.f26969id), 0L, false, iz.I0, new v0(this, 0), new a1(0), new v0(this, 2), new v0(this, 3), new v0(this, 4), new v0(this, 5), false);
        this.E = makeGroup;
        makeGroup.setOnStateUpdatedListener(new f1(this));
        this.E.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.f9030w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j3 = this.f9023b;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f9025e;
        if (i7 >= 0) {
            if (p10.i(i10).e() == j3) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, qp.s1(i10).M0(Long.valueOf(-j3)));
    }

    public final boolean m() {
        int i7 = this.D;
        if (i7 == 3 || i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f9031x && this.f9029s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f9027n && this.f9028r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.Q = null;
        if (this.f9031x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f9026f;
        checkgroupcall.sources.add(Integer.valueOf(this.K));
        ConnectionsManager.getInstance(this.f9025e).sendRequest(checkgroupcall, new y0(this, 3));
    }

    public final void q() {
        this.R = null;
        if (this.f9031x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f9026f;
        ConnectionsManager.getInstance(this.f9025e).sendRequest(getgroupcall, new y0(this, 0));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int length;
        int i7 = 0;
        while (true) {
            if (ssrcGroupArr == null) {
                length = 0;
            } else {
                length = ssrcGroupArr.length;
            }
            if (i7 < length) {
                int i10 = 0;
                while (true) {
                    int[] iArr = ssrcGroupArr[i7].ssrcs;
                    if (i10 < iArr.length) {
                        this.M.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                }
                i7++;
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

    public final void t(boolean z9) {
        if (!this.f9031x && this.f9029s != z9) {
            if (this.f9027n && z9) {
                return;
            }
            this.f9029s = z9;
            qs.f(this.f9025e).k(qs.G2, Long.valueOf(g()));
        }
    }

    public final void u(boolean z9) {
        int i7;
        if (this.f9031x) {
            z9 = false;
        }
        if (this.P != z9) {
            this.P = z9;
            if (!z9) {
                int i10 = this.S;
                int i11 = this.f9025e;
                if (i10 != -1) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.S, true);
                    this.S = -1;
                }
                if (this.T != -1) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.T, true);
                    this.T = -1;
                }
                Runnable runnable = this.Q;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    this.Q = null;
                }
                Runnable runnable2 = this.R;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.r(runnable2);
                    this.R = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.Q;
            if (runnable3 != null) {
                org.telegram.messenger.g0.r(runnable3);
            }
            x0 x0Var = new x0(this, 0);
            this.Q = x0Var;
            org.telegram.messenger.g0.i3(x0Var, 4000L);
            Runnable runnable4 = this.R;
            if (runnable4 != null) {
                org.telegram.messenger.g0.r(runnable4);
            }
            x0 x0Var2 = new x0(this, 1);
            this.R = x0Var2;
            if (l()) {
                i7 = 5000;
            } else {
                i7 = 20000;
            }
            org.telegram.messenger.g0.i3(x0Var2, i7);
        }
    }

    public final void v(float f10) {
        ti.o oVar;
        float l10 = Utilities.l(f10);
        i1 i1Var = i1.f9120w;
        if (i1Var != null && i1Var.f9122b == this && (oVar = i1Var.f9121a) != null && oVar.d() && i1Var.f9121a.f56008c != 0) {
            i1 i1Var2 = i1.f9120w;
            l10 = (i1Var2 == null || !i1Var2.f9128s) ? 1.0f : 0.0f;
        }
        org.telegram.messenger.a8.b("setVolume(" + l10 + ")");
        if (Math.abs(l10 - this.N) < 0.01f) {
            return;
        }
        this.N = l10;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i7 = this.f9025e;
        tL_updateStory.peer = qp.s1(i7).z1(this.f9023b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f27191id = this.f9024c;
        qp.s1(i7).P1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f9031x && this.E != null) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                this.E.setVolume(((Integer) it.next()).intValue(), this.N);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
    }
}
