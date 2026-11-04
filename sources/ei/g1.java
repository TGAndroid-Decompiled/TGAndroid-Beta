package ei;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class g1 implements cs, AudioManager.OnAudioFocusChangeListener {
    public static g1 X;
    public int E;
    public NativeInstance F;
    public TLRPC.GroupCallParticipant H;
    public final e1 I;
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
    public final TL_stories.StoryItem f10296a;
    public final long f10297b;
    public final int f10298c;
    public final Context d;
    public final int f10299e;
    public final TLRPC.InputGroupCall f10300f;
    public final boolean h;
    public boolean f10301n;
    public TLRPC.GroupCall f10304w;
    public boolean f10306y;
    public boolean f10302r = false;
    public boolean f10303s = false;
    public boolean f10305x = false;
    public final HashMap G = new HashMap();
    public final HashSet N = new HashSet();
    public float O = 1.0f;
    public int T = -1;
    public int U = -1;

    public g1(Context context, int i3, TL_stories.StoryItem storyItem, long j10, int i10, boolean z10, TLRPC.InputGroupCall inputGroupCall, boolean z11, boolean z12) {
        this.J = false;
        this.d = context;
        this.f10299e = i3;
        this.f10300f = inputGroupCall;
        this.f10296a = storyItem;
        this.f10297b = j10;
        this.f10298c = i10;
        this.h = z10;
        this.f10301n = z11;
        this.J = z12;
        e1 e1Var = new e1(this);
        this.I = e1Var;
        org.telegram.messenger.a8.b("[LivePlayer] setup to call " + inputGroupCall.f27018id);
        hs.f(i3).b(this, hs.f23335x2);
        if (z11) {
            this.K = NativeInstance.createVideoCapturer(e1Var, z12 ? 1 : 0);
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
        for (int i3 = 0; i3 < size; i3++) {
            ssrcGroupArr[i3] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i3);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i3];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i3].ssrcs;
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
        if (!this.f10305x && !this.f10301n && this.f10303s && X == null && (groupCall = this.f10304w) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f10304w == null || l()) {
            return false;
        }
        return !this.f10304w.messages_enabled;
    }

    public final void c() {
        boolean z10;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.f10301n) {
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23335x2) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.f10297b == longValue) {
                dg.d.a(this.f10304w, groupCall);
                this.f10304w = groupCall;
                hs.f(this.f10299e).k(hs.G2, Long.valueOf(groupCall.f27011id));
            }
        }
    }

    public final void e() {
        if (!this.f10305x) {
            this.f10305x = true;
            u(false);
            hs.f(this.f10299e).n(this, hs.f23335x2);
            org.telegram.messenger.a8.b("[LivePlayer] destroyed");
            if (this.f10306y) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.f10300f;
                ConnectionsManager.getInstance(this.f10299e).sendRequest(leavegroupcall, new y0(this, 5));
            }
            if (this.f10301n) {
                this.I.setTarget(null);
                NativeInstance.destroyVideoCapturer(this.K);
            }
            if (this.F != null) {
                org.telegram.messenger.p5 p5Var = Utilities.f21387e;
                NativeInstance nativeInstance = this.F;
                Objects.requireNonNull(nativeInstance);
                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                this.N.clear();
                this.F = null;
            }
            if (this.M) {
                ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
                this.M = false;
            }
            if (this.f10301n) {
                VoipAudioManager.get().setSpeakerphoneOn(false);
            }
            if (X == this) {
                X = null;
                hs.f(this.f10299e).k(hs.G2, Long.valueOf(g()));
            }
        }
    }

    public final boolean f(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.f10300f;
        if (inputGroupCall2 != inputGroupCall && inputGroupCall2.f27018id != inputGroupCall.f27018id) {
            return false;
        }
        return true;
    }

    public final long g() {
        TLRPC.GroupCall groupCall = this.f10304w;
        if (groupCall != null) {
            return groupCall.f27011id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.f10300f;
        if (inputGroupCall != null) {
            return inputGroupCall.f27018id;
        }
        return 0L;
    }

    public final int h() {
        TLRPC.GroupCall groupCall = this.f10304w;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    public final TLRPC.Peer i() {
        TLRPC.GroupCall groupCall = this.f10304w;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long j() {
        TLRPC.GroupCall groupCall = this.f10304w;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void k() {
        if (this.f10305x) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(org.telegram.ui.Components.voip.n1.d("live_" + this.f10300f.f27018id), 0L, false, az.I0, new x0(this, 0), new d2.t1(14), new x0(this, 2), new x0(this, 3), new x0(this, 4), new x0(this, 5), false);
        this.F = makeGroup;
        makeGroup.setOnStateUpdatedListener(new f1(this));
        this.F.resetGroupInstance(false, false);
    }

    public final boolean l() {
        TLRPC.GroupCall groupCall = this.f10304w;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        long j10 = this.f10297b;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.f10299e;
        if (i3 >= 0) {
            if (h10.i(i10).e() == j10) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, hp.s1(i10).M0(Long.valueOf(-j10)));
    }

    public final boolean m() {
        int i3 = this.E;
        if (i3 == 3 || i3 == 1 || i3 == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (!this.f10305x && this.f10303s) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f10301n && this.f10302r) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.R = null;
        if (this.f10305x) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.f10300f;
        checkgroupcall.sources.add(Integer.valueOf(this.L));
        ConnectionsManager.getInstance(this.f10299e).sendRequest(checkgroupcall, new y0(this, 3));
    }

    public final void q() {
        this.S = null;
        if (this.f10305x) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.f10300f;
        ConnectionsManager.getInstance(this.f10299e).sendRequest(getgroupcall, new y0(this, 1));
    }

    public final void r(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int length;
        int i3 = 0;
        while (true) {
            if (ssrcGroupArr == null) {
                length = 0;
            } else {
                length = ssrcGroupArr.length;
            }
            if (i3 < length) {
                int i10 = 0;
                while (true) {
                    int[] iArr = ssrcGroupArr[i3].ssrcs;
                    if (i10 < iArr.length) {
                        this.N.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                }
                i3++;
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
        if (!this.f10305x && this.f10303s != z10) {
            if (this.f10301n && z10) {
                return;
            }
            this.f10303s = z10;
            hs.f(this.f10299e).k(hs.G2, Long.valueOf(g()));
        }
    }

    public final void u(boolean z10) {
        int i3;
        if (this.f10305x) {
            z10 = false;
        }
        if (this.Q != z10) {
            this.Q = z10;
            if (!z10) {
                int i10 = this.T;
                int i11 = this.f10299e;
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
            a1 a1Var = new a1(this, 0);
            this.R = a1Var;
            org.telegram.messenger.g0.i3(a1Var, 4000L);
            Runnable runnable4 = this.S;
            if (runnable4 != null) {
                org.telegram.messenger.g0.r(runnable4);
            }
            a1 a1Var2 = new a1(this, 1);
            this.S = a1Var2;
            if (l()) {
                i3 = 5000;
            } else {
                i3 = 20000;
            }
            org.telegram.messenger.g0.i3(a1Var2, i3);
        }
    }

    public final void v(float f10) {
        float l10 = Utilities.l(f10);
        n1 n1Var = n1.f10647a0;
        if (n1Var.T && n1Var.f10656w == this) {
            l10 = 1.0f;
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
        int i3 = this.f10299e;
        tL_updateStory.peer = hp.s1(i3).z1(this.f10297b);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.f27240id = this.f10298c;
        hp.s1(i3).P1().c0(tL_updateStory);
        e();
    }

    public final void x() {
        if (!this.f10305x && this.F != null) {
            Iterator it = this.N.iterator();
            while (it.hasNext()) {
                this.F.setVolume(((Integer) it.next()).intValue(), this.O);
            }
        }
    }

    @Override
    public final void onAudioFocusChange(int i3) {
    }
}
