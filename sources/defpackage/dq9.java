package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.messenger.voip.GroupCallEngine;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
public final class dq9 extends w96 implements AudioManager.OnAudioFocusChangeListener {
    public boolean O;
    public NativeInstance P;
    public final aq9 Q;
    public boolean R;
    public long S;
    public boolean T;
    public final HashSet U;
    public rr9 V;
    public sr9 W;
    public boolean X;
    public g01 Y;
    public volatile boolean Z;
    public String a0;
    public VideoSink b0;

    public dq9(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2, boolean z3) {
        super(context, i, storyItem, j, i2, z, inputGroupCall, z2);
        this.O = false;
        this.U = new HashSet();
        this.R = z3;
        aq9 aq9Var = new aq9(this);
        this.Q = aq9Var;
        if (z2) {
            this.S = NativeInstance.createVideoCapturer(aq9Var, z3 ? 1 : 0);
        }
        I();
    }

    public static NativeInstance.SsrcGroup[] J(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i = 0; i < size; i++) {
            ssrcGroupArr[i] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    iArr[i2] = tL_groupCallParticipantVideoSourceGroup.sources.get(i2).intValue();
                    i2++;
                }
            }
        }
        return ssrcGroupArr;
    }

    @Override
    public final void D(boolean z) {
        if (this.n && this.O != z) {
            this.O = z;
            NativeInstance nativeInstance = this.P;
            if (nativeInstance != null) {
                nativeInstance.setMuteMicrophone(z);
            }
        }
    }

    @Override
    public final void H() {
        if (!this.n) {
            return;
        }
        long j = this.S;
        boolean z = !this.R;
        this.R = z;
        NativeInstance.switchCameraCapturer(j, z);
    }

    public final void I() {
        boolean z;
        CallAudioDevice.setPlayoutUsage(1);
        CallAudioDevice.setPlayoutStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        if (this.h) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.n) {
            audioManager.setMode(3);
            if (audioManager.requestAudioFocus(this, 0, 2) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.T = z;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    public final void K(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int length;
        int i = 0;
        while (true) {
            if (ssrcGroupArr == null) {
                length = 0;
            } else {
                length = ssrcGroupArr.length;
            }
            if (i >= length) {
                break;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    this.U.add(Integer.valueOf(iArr[i2]));
                    i2++;
                }
            }
            i++;
        }
        if (!this.w) {
            a();
        }
    }

    public final void L(VideoSink videoSink) {
        if (this.b0 == videoSink) {
            return;
        }
        this.b0 = videoSink;
        this.Q.setTarget(videoSink);
    }

    public final void M() {
        olc olcVar;
        g01 g01Var = this.Y;
        if (g01Var != null) {
            g01Var.k();
            this.Y = null;
        }
        this.Z = false;
        if (this.P != null) {
            to3 to3Var = Utilities.e;
            NativeInstance nativeInstance = this.P;
            Objects.requireNonNull(nativeInstance);
            to3Var.c(new vp9(nativeInstance, (byte) 0));
            this.U.clear();
            this.P = null;
        }
        rr9 rr9Var = this.V;
        if (rr9Var != null) {
            sr9 sr9Var = this.W;
            if (sr9Var != null) {
                olcVar = new olc(sr9Var, (byte) 0);
            } else {
                olcVar = null;
            }
            if (!rr9Var.b.post(new kr9(rr9Var, olcVar, (byte) 1)) && olcVar != null) {
                olcVar.run();
            }
            this.V = null;
            this.W = null;
        }
        this.X = false;
    }

    public final void N() {
        if (this.Y == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = this.a0;
        if (str != null) {
            arrayList.add(new uz0(str, 2));
        }
        g01 g01Var = this.Y;
        g01Var.getClass();
        g01Var.b.post(new a30(g01Var, new ArrayList(arrayList), (byte) 25));
    }

    @Override
    public final void a() {
        rr9 rr9Var = this.V;
        if (rr9Var != null) {
            rr9Var.b.post(new jt(rr9Var, this.H, (byte) 5));
        }
        if (this.P != null) {
            Iterator it = this.U.iterator();
            while (it.hasNext()) {
                this.P.setVolume(((Integer) it.next()).intValue(), this.H);
            }
        }
    }

    @Override
    public final boolean b() {
        TLRPC.GroupCall groupCall;
        if (!this.w && !this.n && this.r && w96.N == null && (groupCall = this.s) != null && !groupCall.rtmp_stream && groupCall.creator) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        if (this.P != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        L(null);
    }

    @Override
    public final void f() {
        if (this.n) {
            return;
        }
        String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        jve.b(strArr, strArr, new sh9(this, (byte) 1));
    }

    @Override
    public final void n() {
        if (this.w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(xkc.d("live_" + this.f.id), 0L, false, xea.E0, new zp9(this), new iy8((byte) 18), new zp9(this), false, 0, GroupCallEngine.isReference(this.e), OpusDred.GroupSettings.NONE);
        this.P = makeGroup;
        makeGroup.setBroadcastStateCallback(new wp9(this, makeGroup));
        this.P.setOnStateUpdatedListener(new bq9(this));
        this.P.resetGroupInstance(false, false);
    }

    @Override
    public final boolean r() {
        if (this.n && this.O) {
            return true;
        }
        return false;
    }

    @Override
    public final void t() {
        if (this.n) {
            this.Q.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.S);
        }
        M();
        if (this.T) {
            ((AudioManager) this.d.getSystemService("audio")).abandonAudioFocus(this);
            this.T = false;
        }
        if (this.n) {
            VoipAudioManager.get().setSpeakerphoneOn(false);
        }
    }

    @Override
    public final void u() {
        if (this.Z) {
            this.Z = false;
            g01 g01Var = this.Y;
            if (g01Var != null) {
                Handler handler = g01Var.b;
                xz0 xz0Var = g01Var.d;
                Objects.requireNonNull(xz0Var);
                handler.post(new gz0(xz0Var, (byte) 7));
            }
        }
    }

    @Override
    public final void x() {
        M();
        n();
    }

    @Override
    public final void y(TLRPC.TL_dataJSON tL_dataJSON, boolean z) {
        if (tL_dataJSON != null && !tL_dataJSON.data.startsWith("{\"stream\":true")) {
            NativeInstance nativeInstance = this.P;
            if (nativeInstance != null) {
                nativeInstance.setJoinResponsePayload(tL_dataJSON.data);
            }
        } else {
            NativeInstance nativeInstance2 = this.P;
            if (nativeInstance2 != null) {
                nativeInstance2.prepareForStream(z);
            }
        }
        if (this.n) {
            this.P.setMuteMicrophone(this.O);
            this.P.activateVideoCapturer(this.S);
            this.P.setupOutgoingVideoCreated(this.S);
        } else if (z) {
            hl.c3(new xp9(this, (byte) 0));
        } else if (!this.Z) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.y;
            if (groupCallParticipant == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.f;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new yp9(this, (byte) 0));
                return;
            }
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
            if (tL_groupCallParticipantVideo != null) {
                NativeInstance nativeInstance3 = this.P;
                String str = tL_groupCallParticipantVideo.endpoint;
                NativeInstance.SsrcGroup[] J = J(tL_groupCallParticipantVideo);
                K(J);
                nativeInstance3.addIncomingVideoOutput(2, str, J, this.Q, wf3.n(this.y.peer));
                hl.c3(new en9(this, this.y.video.endpoint, (byte) 5));
                return;
            }
            hl.c3(new xp9(this, (byte) 1));
        }
    }

    @Override
    public final void z(boolean z) {
        rr9 rr9Var = this.V;
        if (rr9Var != null) {
            rr9Var.k(z);
        }
        g01 g01Var = this.Y;
        if (g01Var != null) {
            g01Var.b.post(new xac((byte) 6, g01Var, z));
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
    }
}
