package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class nm9 extends t76 implements AudioManager.OnAudioFocusChangeListener {
    public boolean O;
    public NativeInstance P;
    public final km9 Q;
    public boolean R;
    public long S;
    public boolean T;
    public final HashSet U;
    public ao9 V;
    public bo9 W;
    public boolean X;
    public yz0 Y;
    public volatile boolean Z;
    public String a0;
    public VideoSink b0;

    public nm9(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2, boolean z3) {
        super(context, i, storyItem, j, i2, z, inputGroupCall, z2);
        this.O = false;
        this.U = new HashSet();
        this.R = z3;
        km9 km9Var = new km9(this);
        this.Q = km9Var;
        if (z2) {
            this.S = NativeInstance.createVideoCapturer(km9Var, z3 ? 1 : 0);
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
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
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
        kbc kbcVar;
        yz0 yz0Var = this.Y;
        if (yz0Var != null) {
            yz0Var.k();
            this.Y = null;
        }
        this.Z = false;
        if (this.P != null) {
            co3 co3Var = Utilities.e;
            NativeInstance nativeInstance = this.P;
            Objects.requireNonNull(nativeInstance);
            co3Var.c(new jm9(nativeInstance, (byte) 0));
            this.U.clear();
            this.P = null;
        }
        ao9 ao9Var = this.V;
        if (ao9Var != null) {
            bo9 bo9Var = this.W;
            if (bo9Var != null) {
                kbcVar = new kbc(bo9Var, (byte) 13);
            } else {
                kbcVar = null;
            }
            if (!ao9Var.b.post(new tn9(ao9Var, kbcVar, (byte) 1)) && kbcVar != null) {
                kbcVar.run();
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
            arrayList.add(new mz0(str, 2));
        }
        yz0 yz0Var = this.Y;
        yz0Var.getClass();
        yz0Var.b.post(new z20(yz0Var, new ArrayList(arrayList), (byte) 25));
    }

    @Override
    public final void a() {
        ao9 ao9Var = this.V;
        if (ao9Var != null) {
            ao9Var.b.post(new kt(ao9Var, this.H, (byte) 5));
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
        if (!this.w && !this.n && this.r && t76.N == null && (groupCall = this.s) != null && !groupCall.rtmp_stream && groupCall.creator) {
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
        rqe.b(strArr, strArr, new ae9(this, (byte) 1));
    }

    @Override
    public final void n() {
        if (this.w) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(rgc.d("live_" + this.f.id), 0L, false, gba.E0, new hm9(this), new sc8((byte) 27), new hm9(this), false);
        this.P = makeGroup;
        makeGroup.setBroadcastStateCallback(new im9(this, makeGroup));
        this.P.setOnStateUpdatedListener(new lm9(this));
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
            yz0 yz0Var = this.Y;
            if (yz0Var != null) {
                Handler handler = yz0Var.b;
                pz0 pz0Var = yz0Var.d;
                Objects.requireNonNull(pz0Var);
                handler.post(new yy0(pz0Var, (byte) 7));
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
            gl.c3(new gm9(this, (byte) 2));
        } else if (!this.Z) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.y;
            if (groupCallParticipant == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.f;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.e).sendRequest(getgroupcall, new n35(this, (byte) 29));
                return;
            }
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
            if (tL_groupCallParticipantVideo != null) {
                NativeInstance nativeInstance3 = this.P;
                String str = tL_groupCallParticipantVideo.endpoint;
                NativeInstance.SsrcGroup[] J = J(tL_groupCallParticipantVideo);
                K(J);
                nativeInstance3.addIncomingVideoOutput(2, str, J, this.Q, cf3.n(this.y.peer));
                gl.c3(new tj9(this, this.y.video.endpoint, (byte) 5));
                return;
            }
            gl.c3(new gm9(this, (byte) 0));
        }
    }

    @Override
    public final void z(boolean z) {
        ao9 ao9Var = this.V;
        if (ao9Var != null) {
            ao9Var.k(z);
        }
        yz0 yz0Var = this.Y;
        if (yz0Var != null) {
            yz0Var.b.post(new x6c((byte) 6, yz0Var, z));
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
    }
}
