package l3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import j3.x1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import jh.w2;
public final class o0 extends a4.t implements f5.n {
    public final Context E0;
    public final n F0;
    public final t G0;
    public int H0;
    public boolean I0;
    public j3.t0 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public j3.l0 O0;

    public o0(Context context, a4.m mVar, Handler handler, j3.h0 h0Var, t tVar) {
        super(1, mVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = tVar;
        this.F0 = new n(handler, h0Var);
        ((k0) tVar).f14134r = new za.c(this, 23);
    }

    public static q8.z R(a4.u uVar, j3.t0 t0Var, boolean z10, t tVar) {
        a4.q qVar;
        String str = t0Var.B;
        if (str == null) {
            q8.x xVar = q8.z.f46511b;
            return q8.l0.f46462e;
        }
        if (((k0) tVar).h(t0Var) != 0) {
            List e10 = a4.b0.e("audio/raw", false, false);
            if (e10.isEmpty()) {
                qVar = null;
            } else {
                qVar = (a4.q) e10.get(0);
            }
            if (qVar != null) {
                return q8.z.y(qVar);
            }
        }
        uVar.getClass();
        List e11 = a4.b0.e(str, z10, false);
        String b10 = a4.b0.b(t0Var);
        if (b10 == null) {
            return q8.z.u(e11);
        }
        List e12 = a4.b0.e(b10, z10, false);
        q8.x xVar2 = q8.z.f46511b;
        q8.w wVar = new q8.w();
        wVar.b(e11);
        wVar.b(e12);
        return wVar.c();
    }

    @Override
    public final void A() {
        ((k0) this.G0).G = true;
    }

    @Override
    public final boolean C(long j10, long j11, a4.n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, j3.t0 t0Var) {
        byteBuffer.getClass();
        if (this.J0 != null && (i11 & 2) != 0) {
            nVar.getClass();
            nVar.releaseOutputBuffer(i10, false);
            return true;
        }
        t tVar = this.G0;
        if (z10) {
            if (nVar != null) {
                nVar.releaseOutputBuffer(i10, false);
            }
            this.f148z0.f16821f += i12;
            ((k0) tVar).G = true;
            return true;
        }
        try {
            if (!((k0) tVar).l(j12, i12, byteBuffer)) {
                return false;
            }
            if (nVar != null) {
                nVar.releaseOutputBuffer(i10, false);
            }
            this.f148z0.f16820e += i12;
            return true;
        } catch (q e10) {
            throw createRendererException(e10, e10.f14161c, e10.f14160b, 5001);
        } catch (s e11) {
            throw createRendererException(e11, t0Var, e11.f14175b, 5002);
        }
    }

    @Override
    public final void F() {
        try {
            ((k0) this.G0).t();
        } catch (s e10) {
            throw createRendererException(e10, e10.f14176c, e10.f14175b, 5002);
        }
    }

    @Override
    public final boolean L(j3.t0 t0Var) {
        if (((k0) this.G0).h(t0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int M(a4.u r13, j3.t0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: l3.o0.M(a4.u, j3.t0):int");
    }

    public final int Q(a4.q qVar, j3.t0 t0Var) {
        int i10;
        if ("OMX.google.raw.decoder".equals(qVar.f104a) && (i10 = f5.d0.f6579a) < 24 && (i10 != 23 || !f5.d0.F(this.E0))) {
            return -1;
        }
        return t0Var.C;
    }

    public final void S() {
        long g10 = ((k0) this.G0).g(isEnded());
        if (g10 != Long.MIN_VALUE) {
            if (!this.M0) {
                g10 = Math.max(this.K0, g10);
            }
            this.K0 = g10;
            this.M0 = false;
        }
    }

    @Override
    public final m3.l b(a4.q qVar, j3.t0 t0Var, j3.t0 t0Var2) {
        int i10;
        m3.l b10 = qVar.b(t0Var, t0Var2);
        int i11 = b10.f16835e;
        if (Q(qVar, t0Var2) > this.H0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = qVar.f104a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new m3.l(str, t0Var, t0Var2, i10, i12);
    }

    @Override
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final x1 getPlaybackParameters() {
        k0 k0Var = (k0) this.G0;
        if (k0Var.f14127k) {
            return k0Var.f14140y;
        }
        return k0Var.i().f14102a;
    }

    @Override
    public final long getPositionUs() {
        if (getState() == 2) {
            S();
        }
        return this.K0;
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        boolean z10;
        t tVar = this.G0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            k0 k0Var = (k0) tVar;
                            k0Var.x(k0Var.i().f14102a, ((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            k0 k0Var2 = (k0) tVar;
                            if (k0Var2.W != intValue) {
                                k0Var2.W = intValue;
                                if (intValue != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                k0Var2.V = z10;
                                k0Var2.e();
                                return;
                            }
                            return;
                        case 11:
                            this.O0 = (j3.l0) obj;
                            return;
                        case 12:
                            if (f5.d0.f6579a >= 23) {
                                n0.a(tVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                ((k0) tVar).z((x) obj);
                return;
            }
            e eVar = (e) obj;
            k0 k0Var3 = (k0) tVar;
            if (!k0Var3.v.equals(eVar)) {
                k0Var3.v = eVar;
                if (!k0Var3.Z) {
                    k0Var3.e();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        k0 k0Var4 = (k0) tVar;
        if (k0Var4.J != floatValue) {
            k0Var4.J = floatValue;
            if (k0Var4.o()) {
                if (f5.d0.f6579a >= 21) {
                    k0Var4.f14137u.setVolume(k0Var4.J);
                    return;
                }
                AudioTrack audioTrack = k0Var4.f14137u;
                float f9 = k0Var4.J;
                audioTrack.setStereoVolume(f9, f9);
            }
        }
    }

    @Override
    public final boolean isEnded() {
        if (this.f141v0) {
            k0 k0Var = (k0) this.G0;
            if (k0Var.o()) {
                if (k0Var.S && !k0Var.m()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean isReady() {
        if (!((k0) this.G0).m() && !super.isReady()) {
            return false;
        }
        return true;
    }

    @Override
    public final float l(float f9, j3.t0[] t0VarArr) {
        int i10 = -1;
        for (j3.t0 t0Var : t0VarArr) {
            int i11 = t0Var.P;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f9;
    }

    @Override
    public final ArrayList m(a4.u uVar, j3.t0 t0Var, boolean z10) {
        q8.z R = R(uVar, t0Var, z10, this.G0);
        Pattern pattern = a4.b0.f54a;
        ArrayList arrayList = new ArrayList(R);
        Collections.sort(arrayList, new a4.v(new a1.c(t0Var, 1), 0));
        return arrayList;
    }

    @Override
    public final a4.l o(a4.q r13, j3.t0 r14, android.media.MediaCrypto r15, float r16) {
        throw new UnsupportedOperationException("Method not decompiled: l3.o0.o(a4.q, j3.t0, android.media.MediaCrypto, float):a4.l");
    }

    @Override
    public final void onDisabled() {
        n nVar = this.F0;
        this.N0 = true;
        try {
            ((k0) this.G0).e();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.onDisabled();
                throw th2;
            } finally {
            }
        }
    }

    @Override
    public final void onEnabled(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.f148z0 = obj;
        n nVar = this.F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new l(nVar, obj, 0));
        }
        boolean z12 = getConfiguration().f10542a;
        t tVar = this.G0;
        if (z12) {
            ((k0) tVar).d();
        } else {
            k0 k0Var = (k0) tVar;
            if (k0Var.Z) {
                k0Var.Z = false;
                k0Var.e();
            }
        }
        ((k0) tVar).f14133q = getPlayerId();
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        ((k0) this.G0).e();
        this.K0 = j10;
        this.L0 = true;
        this.M0 = true;
    }

    @Override
    public final void onQueueInputBuffer(m3.i iVar) {
        if (this.L0 && !iVar.isDecodeOnly()) {
            if (Math.abs(iVar.d - this.K0) > 500000) {
                this.K0 = iVar.d;
            }
            this.L0 = false;
        }
    }

    @Override
    public final void onReset() {
        t tVar = this.G0;
        try {
            super.onReset();
        } finally {
            if (this.N0) {
                this.N0 = false;
                ((k0) tVar).v();
            }
        }
    }

    @Override
    public final void onStarted() {
        ((k0) this.G0).r();
    }

    @Override
    public final void onStopped() {
        S();
        ((k0) this.G0).q();
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        ((k0) this.G0).A(x1Var);
    }

    @Override
    public final void t(Exception exc) {
        f5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        n nVar = this.F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new k(nVar, exc, 0));
        }
    }

    @Override
    public final void u(long j10, long j11, String str) {
        n nVar = this.F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new g5.x(nVar, str, j10, j11, 2));
        }
    }

    @Override
    public final void v(String str) {
        n nVar = this.F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new w2(20, nVar, str));
        }
    }

    @Override
    public final m3.l w(j3.u0 u0Var) {
        m3.l w10 = super.w(u0Var);
        j3.t0 t0Var = u0Var.f10815b;
        n nVar = this.F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new m(nVar, t0Var, w10, 0));
        }
        return w10;
    }

    @Override
    public final void x(j3.t0 t0Var, MediaFormat mediaFormat) {
        int i10;
        j3.t0 t0Var2 = this.J0;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (this.I != null) {
            String str = t0Var.B;
            int i11 = t0Var.O;
            if ("audio/raw".equals(str)) {
                i10 = t0Var.Q;
            } else if (f5.d0.f6579a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = f5.d0.u(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            j3.s0 s0Var = new j3.s0();
            s0Var.f10742o = "audio/raw";
            s0Var.D = i10;
            s0Var.E = t0Var.R;
            s0Var.F = t0Var.S;
            s0Var.B = mediaFormat.getInteger("channel-count");
            s0Var.C = mediaFormat.getInteger("sample-rate");
            t0Var = new j3.t0(s0Var);
            if (this.I0 && t0Var.O == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr[i12] = i12;
                }
            }
        }
        try {
            ((k0) this.G0).b(t0Var, iArr);
        } catch (p e10) {
            throw createRendererException(e10, e10.f14152a, 5001);
        }
    }

    @Override
    public final void y() {
        this.G0.getClass();
    }

    @Override
    public final f5.n getMediaClock() {
        return this;
    }
}
