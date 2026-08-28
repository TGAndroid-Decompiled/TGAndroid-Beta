package j3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import h3.x1;
import ih.h3;
import ih.j7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
public final class m0 extends y3.q implements d5.o {
    public final Context E0;
    public final m F0;
    public final s G0;
    public int H0;
    public boolean I0;
    public h3.t0 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public h3.l0 O0;

    public m0(Context context, y3.j jVar, Handler handler, h3.h0 h0Var, s sVar) {
        super(1, jVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = sVar;
        this.F0 = new m(handler, h0Var);
        ((i0) sVar).f13274r = new k5.i(this, 20);
    }

    public static o8.z R(y3.r rVar, h3.t0 t0Var, boolean z10, s sVar) {
        y3.n nVar;
        String str = t0Var.B;
        if (str == null) {
            o8.x xVar = o8.z.f19105b;
            return o8.l0.f19056e;
        }
        if (((i0) sVar).h(t0Var) != 0) {
            List e10 = y3.w.e("audio/raw", false, false);
            if (e10.isEmpty()) {
                nVar = null;
            } else {
                nVar = (y3.n) e10.get(0);
            }
            if (nVar != null) {
                return o8.z.y(nVar);
            }
        }
        rVar.getClass();
        List e11 = y3.w.e(str, z10, false);
        String b10 = y3.w.b(t0Var);
        if (b10 == null) {
            return o8.z.u(e11);
        }
        List e12 = y3.w.e(b10, z10, false);
        o8.x xVar2 = o8.z.f19105b;
        o8.w wVar = new o8.w();
        wVar.b(e11);
        wVar.b(e12);
        return wVar.c();
    }

    @Override
    public final void A() {
        ((i0) this.G0).G = true;
    }

    @Override
    public final boolean C(long j10, long j11, y3.k kVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j12, boolean z10, boolean z11, h3.t0 t0Var) {
        byteBuffer.getClass();
        if (this.J0 != null && (i10 & 2) != 0) {
            kVar.getClass();
            kVar.releaseOutputBuffer(i9, false);
            return true;
        }
        s sVar = this.G0;
        if (z10) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i9, false);
            }
            this.f49549z0.f14601f += i11;
            ((i0) sVar).G = true;
            return true;
        }
        try {
            if (!((i0) sVar).l(j12, i11, byteBuffer)) {
                return false;
            }
            if (kVar != null) {
                kVar.releaseOutputBuffer(i9, false);
            }
            this.f49549z0.f14600e += i11;
            return true;
        } catch (p e10) {
            throw createRendererException(e10, e10.f13302c, e10.f13301b, 5001);
        } catch (r e11) {
            throw createRendererException(e11, t0Var, e11.f13335b, 5002);
        }
    }

    @Override
    public final void F() {
        try {
            ((i0) this.G0).t();
        } catch (r e10) {
            throw createRendererException(e10, e10.f13336c, e10.f13335b, 5002);
        }
    }

    @Override
    public final boolean L(h3.t0 t0Var) {
        if (((i0) this.G0).h(t0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int M(y3.r r13, h3.t0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: j3.m0.M(y3.r, h3.t0):int");
    }

    public final int Q(y3.n nVar, h3.t0 t0Var) {
        int i9;
        if ("OMX.google.raw.decoder".equals(nVar.f49505a) && (i9 = d5.f0.f4349a) < 24 && (i9 != 23 || !d5.f0.F(this.E0))) {
            return -1;
        }
        return t0Var.C;
    }

    public final void S() {
        long g10 = ((i0) this.G0).g(isEnded());
        if (g10 != Long.MIN_VALUE) {
            if (!this.M0) {
                g10 = Math.max(this.K0, g10);
            }
            this.K0 = g10;
            this.M0 = false;
        }
    }

    @Override
    public final k3.l b(y3.n nVar, h3.t0 t0Var, h3.t0 t0Var2) {
        int i9;
        k3.l b10 = nVar.b(t0Var, t0Var2);
        int i10 = b10.f14615e;
        if (Q(nVar, t0Var2) > this.H0) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = nVar.f49505a;
        if (i11 != 0) {
            i9 = 0;
        } else {
            i9 = b10.d;
        }
        return new k3.l(str, t0Var, t0Var2, i9, i11);
    }

    @Override
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final x1 getPlaybackParameters() {
        i0 i0Var = (i0) this.G0;
        if (i0Var.f13267k) {
            return i0Var.f13280y;
        }
        return i0Var.i().f13238a;
    }

    @Override
    public final long getPositionUs() {
        if (getState() == 2) {
            S();
        }
        return this.K0;
    }

    @Override
    public final void handleMessage(int i9, Object obj) {
        boolean z10;
        s sVar = this.G0;
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 6) {
                    switch (i9) {
                        case 9:
                            i0 i0Var = (i0) sVar;
                            i0Var.x(i0Var.i().f13238a, ((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            i0 i0Var2 = (i0) sVar;
                            if (i0Var2.W != intValue) {
                                i0Var2.W = intValue;
                                if (intValue != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i0Var2.V = z10;
                                i0Var2.e();
                                return;
                            }
                            return;
                        case 11:
                            this.O0 = (h3.l0) obj;
                            return;
                        case 12:
                            if (d5.f0.f4349a >= 23) {
                                l0.a(sVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                ((i0) sVar).z((w) obj);
                return;
            }
            e eVar = (e) obj;
            i0 i0Var3 = (i0) sVar;
            if (!i0Var3.v.equals(eVar)) {
                i0Var3.v = eVar;
                if (!i0Var3.Z) {
                    i0Var3.e();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        i0 i0Var4 = (i0) sVar;
        if (i0Var4.J != floatValue) {
            i0Var4.J = floatValue;
            if (i0Var4.o()) {
                if (d5.f0.f4349a >= 21) {
                    i0Var4.f13277u.setVolume(i0Var4.J);
                    return;
                }
                AudioTrack audioTrack = i0Var4.f13277u;
                float f10 = i0Var4.J;
                audioTrack.setStereoVolume(f10, f10);
            }
        }
    }

    @Override
    public final boolean isEnded() {
        if (this.f49542v0) {
            i0 i0Var = (i0) this.G0;
            if (i0Var.o()) {
                if (i0Var.S && !i0Var.m()) {
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
        if (!((i0) this.G0).m() && !super.isReady()) {
            return false;
        }
        return true;
    }

    @Override
    public final float l(float f10, h3.t0[] t0VarArr) {
        int i9 = -1;
        for (h3.t0 t0Var : t0VarArr) {
            int i10 = t0Var.P;
            if (i10 != -1) {
                i9 = Math.max(i9, i10);
            }
        }
        if (i9 == -1) {
            return -1.0f;
        }
        return i9 * f10;
    }

    @Override
    public final ArrayList m(y3.r rVar, h3.t0 t0Var, boolean z10) {
        o8.z R = R(rVar, t0Var, z10, this.G0);
        Pattern pattern = y3.w.f49555a;
        ArrayList arrayList = new ArrayList(R);
        Collections.sort(arrayList, new bg.l0(new t0.c(t0Var, 6), 5));
        return arrayList;
    }

    @Override
    public final y3.i o(y3.n r13, h3.t0 r14, android.media.MediaCrypto r15, float r16) {
        throw new UnsupportedOperationException("Method not decompiled: j3.m0.o(y3.n, h3.t0, android.media.MediaCrypto, float):y3.i");
    }

    @Override
    public final void onDisabled() {
        m mVar = this.F0;
        this.N0 = true;
        try {
            ((i0) this.G0).e();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    @Override
    public final void onEnabled(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.f49549z0 = obj;
        m mVar = this.F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new l(mVar, obj, 0));
        }
        boolean z12 = getConfiguration().f9505a;
        s sVar = this.G0;
        if (z12) {
            ((i0) sVar).d();
        } else {
            i0 i0Var = (i0) sVar;
            if (i0Var.Z) {
                i0Var.Z = false;
                i0Var.e();
            }
        }
        ((i0) sVar).f13273q = getPlayerId();
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        ((i0) this.G0).e();
        this.K0 = j10;
        this.L0 = true;
        this.M0 = true;
    }

    @Override
    public final void onQueueInputBuffer(k3.i iVar) {
        if (this.L0 && !iVar.isDecodeOnly()) {
            if (Math.abs(iVar.d - this.K0) > 500000) {
                this.K0 = iVar.d;
            }
            this.L0 = false;
        }
    }

    @Override
    public final void onReset() {
        s sVar = this.G0;
        try {
            super.onReset();
        } finally {
            if (this.N0) {
                this.N0 = false;
                ((i0) sVar).v();
            }
        }
    }

    @Override
    public final void onStarted() {
        ((i0) this.G0).r();
    }

    @Override
    public final void onStopped() {
        S();
        ((i0) this.G0).q();
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        ((i0) this.G0).A(x1Var);
    }

    @Override
    public final void t(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        m mVar = this.F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new k(mVar, exc, 0));
        }
    }

    @Override
    public final void u(long j10, long j11, String str) {
        m mVar = this.F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new e5.y(mVar, str, j10, j11, 3));
        }
    }

    @Override
    public final void v(String str) {
        m mVar = this.F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new j7(6, mVar, str));
        }
    }

    @Override
    public final k3.l w(h3.u0 u0Var) {
        k3.l w8 = super.w(u0Var);
        h3.t0 t0Var = u0Var.f9778b;
        m mVar = this.F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new h3(mVar, t0Var, w8, 8));
        }
        return w8;
    }

    @Override
    public final void x(h3.t0 t0Var, MediaFormat mediaFormat) {
        int i9;
        h3.t0 t0Var2 = this.J0;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (this.I != null) {
            String str = t0Var.B;
            int i10 = t0Var.O;
            if ("audio/raw".equals(str)) {
                i9 = t0Var.Q;
            } else if (d5.f0.f4349a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i9 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i9 = d5.f0.u(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i9 = 2;
            }
            h3.s0 s0Var = new h3.s0();
            s0Var.f9705o = "audio/raw";
            s0Var.D = i9;
            s0Var.E = t0Var.R;
            s0Var.F = t0Var.S;
            s0Var.B = mediaFormat.getInteger("channel-count");
            s0Var.C = mediaFormat.getInteger("sample-rate");
            t0Var = new h3.t0(s0Var);
            if (this.I0 && t0Var.O == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            ((i0) this.G0).b(t0Var, iArr);
        } catch (o e10) {
            throw createRendererException(e10, e10.f13299a, 5001);
        }
    }

    @Override
    public final void y() {
        this.G0.getClass();
    }

    @Override
    public final d5.o getMediaClock() {
        return this;
    }
}
