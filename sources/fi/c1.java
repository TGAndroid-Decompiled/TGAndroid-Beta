package fi;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class c1 implements gs, AudioManager.OnAudioFocusChangeListener {
    public static c1 X;
    public int E;
    public NativeInstance F;
    public TLRPC.GroupCallParticipant H;
    public final a1 I;
    public boolean J;
    public long K;
    public int L;
    public boolean M;
    public VideoSink P;
    public boolean Q;
    public Runnable R;
    public Runnable S;
    public ArrayList V;
    public ArrayList W;
    public final TL_stories.StoryItem f11785a;
    public final long f11786b;
    public final int f11787c;
    public final Context d;
    public final int f11788e;
    public final TLRPC.InputGroupCall f11789f;
    public final boolean h;
    public boolean f11790n;
    public TLRPC.GroupCall f11793w;
    public boolean f11795y;
    public boolean f11791r = false;
    public boolean f11792s = false;
    public boolean f11794x = false;
    public final HashMap G = new HashMap();
    public final HashSet N = new HashSet();
    public float O = 1.0f;
    public int T = -1;
    public int U = -1;

    public c1(Context context, int i7, TL_stories.StoryItem storyItem, long j3, int i10, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.J = false;
        this.d = context;
        this.f11788e = i7;
        this.f11789f = inputGroupCall;
        this.f11785a = storyItem;
        this.f11786b = j3;
        this.f11787c = i10;
        this.h = z10;
        this.f11790n = z11;
        this.J = z12;
        a1 a1Var = new a1(this);
        this.I = a1Var;
        org.telegram.messenger.a8.b("[LivePlayer] setup to call " + inputGroupCall.f28415id);
        ls.f(i7).b(this, ls.f25378x2);
        if (z11) {
            this.K = NativeInstance.createVideoCapturer(a1Var, z12 ? 1 : 0);
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
        if (!this.f11794x && !this.f11790n && this.f11792s && X == null && (groupCall = this.f11793w) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f11793w == null || l()) {
            return false;
        }
        return !this.f11793w.messages_enabled;
    }

    public final void c() {
        boolean z10;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f11790n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25378x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.f11786b == longValue) {
                cg.d.a(this.f11793w, groupCall);
                this.f11793w = groupCall;
                ls.f(this.f11788e).k(ls.G2, Long.valueOf(groupCall.f28408id));
            }
        }
    }

    public final void e() {
        if (!this.f11794x) {
            this.f11794x = true;
            u(false);
            ls.f(this.f11788e).n(this, ls.f25378x2);
            org.telegram.messenger.a8.b("[LivePlayer] destroyed");
            if (this.f11795y) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f11789f;
                leavegroupcall.source = this.L;
                ConnectionsManager.getInstance(this.f11788e).sendRequest(leavegroupcall, new x0(this, 5));
            }
            if (this.f11790n) {
                this.I.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.K);
            }
            if (this.F != null) {
                org.telegram.messenger.q5 q5Var = Utilities.f22774e;
                NativeInstance nativeInstance = this.F;
                Objects.requireNonNull(nativeInstance);
                q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                this.N.clear();
                this.F = null;
            }
            if (this.M) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.M = false;
            }
            if (this.f11790n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (X == this) {
                X = null;
                ls.f(this.f11788e).k(ls.G2, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f11789f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f28415id != inputGroupCall.f28415id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.f11793w;
        if (groupCall != null) {
            return groupCall.f28408id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f11789f;
        if (inputGroupCall != null) {
            return inputGroupCall.f28415id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.f11793w;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.f11793w;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.f11793w;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.f11794x) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.b2.d("live_" + this.f11789f.f28415id), 0L, false, cz.I0, new u0(this, 0), new ci.v(25), new u0(this, 2), new u0(this, 3), new u0(this, 4), new u0(this, 5), false);
        this.F = makeGroup;
        makeGroup.setOnStateUpdatedListener(new b1(this));
        this.F.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.f11793w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j3 = this.f11786b;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f11788e;
        if (i7 >= 0) {
            if (k10.i(i10).e() == j3) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.v3.w(14, np.u1(i10).O0(Long.valueOf(-j3)));
    }

    public final boolean m() {
        int i7 = this.E;
        if (i7 == 3 || i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f11794x && this.f11792s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f11790n && this.f11791r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.R = null;
        if (this.f11794x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f11789f;
        checkgroupcall.sources.add(Integer.valueOf(this.L));
        ConnectionsManager.getInstance(this.f11788e).sendRequest(checkgroupcall, new x0(this, 3));
    }

    public final void q() {
        this.S = null;
        if (this.f11794x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f11789f;
        ConnectionsManager.getInstance(this.f11788e).sendRequest(getgroupcall, new x0(this, 0));
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
                        this.N.add(Integer.valueOf(iArr[i10]));
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
        if (this.P == videoSink) {
            return;
        }
        this.P = videoSink;
        this.I.setTarget(videoSink);
    }

    public final void t(boolean z10) {
        if (!this.f11794x && this.f11792s != z10) {
            if (this.f11790n && z10) {
                return;
            }
            this.f11792s = z10;
            ls.f(this.f11788e).k(ls.G2, Long.valueOf(g()));
        }
    }

    public final void u(boolean z10) {
        int i7;
        if (this.f11794x) {
            z10 = false;
        }
        if (this.Q != z10) {
            this.Q = z10;
            if (!z10) {
                int i10 = this.T;
                int i11 = this.f11788e;
                if (i10 != -1) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.T, true);
                    this.T = -1;
                }
                if (this.U != -1) {
                    ConnectionsManager.getInstance(i11).cancelRequest(this.U, true);
                    this.U = -1;
                }
                Runnable runnable = this.R;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    this.R = null;
                }
                Runnable runnable2 = this.S;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.r(runnable2);
                    this.S = null;
                    return;
                }
                return;
            }
            Runnable runnable3 = this.R;
            if (runnable3 != null) {
                org.telegram.messenger.g0.r(runnable3);
            }
            w0 w0Var = new w0(this, 0);
            this.R = w0Var;
            org.telegram.messenger.g0.h3(w0Var, 4000L);
            Runnable runnable4 = this.S;
            if (runnable4 != null) {
                org.telegram.messenger.g0.r(runnable4);
            }
            w0 w0Var2 = new w0(this, 1);
            this.S = w0Var2;
            if (l()) {
                i7 = 5000;
            } else {
                i7 = 20000;
            }
            org.telegram.messenger.g0.h3(w0Var2, i7);
        }
    }

    public final void v(float f10) {
        wi.n nVar;
        float l10 = Utilities.l(f10);
        e1 e1Var = e1.f11863w;
        if (e1Var != null && e1Var.f11865b == this && (nVar = e1Var.f11864a) != null && nVar.d() && e1Var.f11864a.f59999c != 0) {
            e1 e1Var2 = e1.f11863w;
            l10 = (e1Var2 == null || !e1Var2.f11871s) ? 1.0f : 0.0f;
        }
        org.telegram.messenger.a8.b("setVolume(" + l10 + ")");
        if (Math.abs(l10 - this.O) < 0.01f) {
            return;
        }
        this.O = l10;
        x();
    }

    public final void w() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i7 = this.f11788e;
        tL_updateStory.peer = np.u1(i7).B1(this.f11786b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f28637id = this.f11787c;
        np.u1(i7).R1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f11794x && this.F != null) {
            Iterator it = this.N.iterator();
            while (it.hasNext()) {
                this.F.setVolume(((Integer) it.next()).intValue(), this.O);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
    }
}
