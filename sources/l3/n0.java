package l3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import c2.z0;
import j3.g2;
import j3.v1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
public final class n0 extends d4.r implements h5.n {
    public final Context R0;
    public final f7.b S0;
    public final v T0;
    public int U0;
    public boolean V0;
    public j3.n0 W0;
    public j3.n0 X0;
    public long Y0;
    public boolean Z0;
    public boolean f11565a1;
    public boolean f11566b1;
    public j3.g0 f11567c1;

    public n0(Context context, d4.j jVar, Handler handler, j3.c0 c0Var, v vVar) {
        super(1, jVar, 44100.0f);
        this.R0 = context.getApplicationContext();
        this.T0 = vVar;
        this.S0 = new f7.b(handler, c0Var);
        ((k0) vVar).f11551r = new ja.c(this);
    }

    public static s8.i0 r0(d4.s sVar, j3.n0 n0Var, boolean z4, v vVar) {
        Iterable e6;
        d4.n nVar;
        if (n0Var.C == null) {
            s8.t tVar = s8.v.f47174b;
            return s8.i0.f47139e;
        }
        if (((k0) vVar).i(n0Var) != 0) {
            List e10 = d4.y.e("audio/raw", false, false);
            if (e10.isEmpty()) {
                nVar = null;
            } else {
                nVar = (d4.n) e10.get(0);
            }
            if (nVar != null) {
                return s8.v.x(nVar);
            }
        }
        Pattern pattern = d4.y.f4279a;
        String str = n0Var.C;
        sVar.getClass();
        List e11 = d4.y.e(str, z4, false);
        String b10 = d4.y.b(n0Var);
        if (b10 == null) {
            s8.t tVar2 = s8.v.f47174b;
            e6 = s8.i0.f47139e;
        } else {
            e6 = d4.y.e(b10, z4, false);
        }
        s8.t tVar3 = s8.v.f47174b;
        ?? wVar = new com.google.android.gms.common.api.internal.w();
        wVar.d(e11);
        wVar.d(e6);
        return wVar.i();
    }

    @Override
    public final n3.k A(d4.n nVar, j3.n0 n0Var, j3.n0 n0Var2) {
        int i10;
        n3.k b10 = nVar.b(n0Var, n0Var2);
        int i11 = b10.f15225e;
        if (this.P == null && l0(n0Var2)) {
            i11 |= 32768;
        }
        if (q0(nVar, n0Var2) > this.U0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = nVar.f4235a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new n3.k(str, n0Var, n0Var2, i10, i12);
    }

    @Override
    public final float K(float f10, j3.n0[] n0VarArr) {
        int i10 = -1;
        for (j3.n0 n0Var : n0VarArr) {
            int i11 = n0Var.Q;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override
    public final ArrayList L(d4.s sVar, j3.n0 n0Var, boolean z4) {
        s8.i0 r02 = r0(sVar, n0Var, z4, this.T0);
        Pattern pattern = d4.y.f4279a;
        ArrayList arrayList = new ArrayList(r02);
        Collections.sort(arrayList, new d4.t(new a1.c(n0Var, 10), 0));
        return arrayList;
    }

    @Override
    public final d4.i M(d4.n r13, j3.n0 r14, android.media.MediaCrypto r15, float r16) {
        throw new UnsupportedOperationException("Method not decompiled: l3.n0.M(d4.n, j3.n0, android.media.MediaCrypto, float):d4.i");
    }

    @Override
    public final void R(Exception exc) {
        h5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new o(bVar, exc, 0));
        }
    }

    @Override
    public final void S(long j10, long j11, String str) {
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new i5.x(bVar, str, j10, j11, 1));
        }
    }

    @Override
    public final void T(String str) {
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new gf.c(20, bVar, str));
        }
    }

    @Override
    public final n3.k U(f7.b bVar) {
        j3.n0 n0Var = (j3.n0) bVar.f6121c;
        n0Var.getClass();
        this.W0 = n0Var;
        n3.k U = super.U(bVar);
        j3.n0 n0Var2 = this.W0;
        f7.b bVar2 = this.S0;
        Handler handler = (Handler) bVar2.f6120b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar2, n0Var2, U, 14));
        }
        return U;
    }

    @Override
    public final void V(j3.n0 n0Var, MediaFormat mediaFormat) {
        int i10;
        j3.n0 n0Var2 = this.X0;
        int[] iArr = null;
        if (n0Var2 != null) {
            n0Var = n0Var2;
        } else if (this.V != null) {
            String str = n0Var.C;
            int i11 = n0Var.P;
            if ("audio/raw".equals(str)) {
                i10 = n0Var.R;
            } else if (h5.d0.f7237a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = h5.d0.v(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            j3.m0 m0Var = new j3.m0();
            m0Var.f9265o = "audio/raw";
            m0Var.D = i10;
            m0Var.E = n0Var.S;
            m0Var.F = n0Var.T;
            m0Var.B = mediaFormat.getInteger("channel-count");
            m0Var.C = mediaFormat.getInteger("sample-rate");
            n0Var = new j3.n0(m0Var);
            if (this.V0 && n0Var.P == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr[i12] = i12;
                }
            }
        }
        try {
            ((k0) this.T0).b(n0Var, iArr);
        } catch (r e6) {
            throw a(e6, e6.f11596a, false, 5001);
        }
    }

    @Override
    public final void W() {
        this.T0.getClass();
    }

    @Override
    public final void Y() {
        ((k0) this.T0).K = true;
    }

    @Override
    public final void Z(n3.i iVar) {
        if (this.Z0 && !iVar.e(Integer.MIN_VALUE)) {
            if (Math.abs(iVar.f15218f - this.Y0) > 500000) {
                this.Y0 = iVar.f15218f;
            }
            this.Z0 = false;
        }
    }

    @Override
    public final void b(int i10, Object obj) {
        v1 v1Var;
        boolean z4;
        v vVar = this.T0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            k0 k0Var = (k0) vVar;
                            k0Var.C = ((Boolean) obj).booleanValue();
                            if (k0Var.z()) {
                                v1Var = v1.d;
                            } else {
                                v1Var = k0Var.B;
                            }
                            h0 h0Var = new h0(v1Var, -9223372036854775807L, -9223372036854775807L);
                            if (k0Var.o()) {
                                k0Var.f11558z = h0Var;
                                return;
                            } else {
                                k0Var.A = h0Var;
                                return;
                            }
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            k0 k0Var2 = (k0) vVar;
                            if (k0Var2.X != intValue) {
                                k0Var2.X = intValue;
                                if (intValue != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                k0Var2.W = z4;
                                k0Var2.e();
                                return;
                            }
                            return;
                        case 11:
                            this.f11567c1 = (j3.g0) obj;
                            return;
                        case 12:
                            if (h5.d0.f7237a >= 23) {
                                m0.a(vVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                ((k0) vVar).x((z) obj);
                return;
            }
            d dVar = (d) obj;
            k0 k0Var3 = (k0) vVar;
            if (!k0Var3.f11557y.equals(dVar)) {
                k0Var3.f11557y = dVar;
                if (!k0Var3.f11531a0) {
                    k0Var3.e();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        k0 k0Var4 = (k0) vVar;
        if (k0Var4.N != floatValue) {
            k0Var4.N = floatValue;
            if (k0Var4.o()) {
                if (h5.d0.f7237a >= 21) {
                    k0Var4.v.setVolume(k0Var4.N);
                    return;
                }
                AudioTrack audioTrack = k0Var4.v;
                float f10 = k0Var4.N;
                audioTrack.setStereoVolume(f10, f10);
            }
        }
    }

    @Override
    public final void c(v1 v1Var) {
        ((k0) this.T0).y(v1Var);
    }

    @Override
    public final boolean c0(long j10, long j11, d4.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z4, boolean z10, j3.n0 n0Var) {
        byteBuffer.getClass();
        if (this.X0 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.releaseOutputBuffer(i10, false);
            return true;
        }
        v vVar = this.T0;
        if (z4) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.M0.f15210f += i12;
            ((k0) vVar).K = true;
            return true;
        }
        try {
            if (!((k0) vVar).l(byteBuffer, j12, i12)) {
                return false;
            }
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.M0.f15209e += i12;
            return true;
        } catch (s e6) {
            throw a(e6, this.W0, e6.f11617b, 5001);
        } catch (u e10) {
            throw a(e10, n0Var, e10.f11634b, 5002);
        }
    }

    @Override
    public final v1 d() {
        return ((k0) this.T0).B;
    }

    @Override
    public final long e() {
        if (this.h == 2) {
            s0();
        }
        return this.Y0;
    }

    @Override
    public final void f0() {
        try {
            ((k0) this.T0).t();
        } catch (u e6) {
            throw a(e6, e6.f11635c, e6.f11634b, 5002);
        }
    }

    @Override
    public final String g() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean i() {
        if (this.I0) {
            k0 k0Var = (k0) this.T0;
            if (k0Var.o()) {
                if (k0Var.T && !k0Var.m()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean j() {
        if (!((k0) this.T0).m() && !super.j()) {
            return false;
        }
        return true;
    }

    @Override
    public final void k() {
        f7.b bVar = this.S0;
        this.f11566b1 = true;
        this.W0 = null;
        try {
            ((k0) this.T0).e();
            try {
                super.k();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.k();
                throw th2;
            } finally {
            }
        }
    }

    @Override
    public final void l(boolean z4, boolean z10) {
        ?? obj = new Object();
        this.M0 = obj;
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new p(bVar, obj, 0));
        }
        g2 g2Var = this.d;
        g2Var.getClass();
        boolean z11 = g2Var.f9161a;
        v vVar = this.T0;
        if (z11) {
            ((k0) vVar).d();
        } else {
            k0 k0Var = (k0) vVar;
            if (k0Var.f11531a0) {
                k0Var.f11531a0 = false;
                k0Var.e();
            }
        }
        k3.k kVar = this.f9055f;
        kVar.getClass();
        ((k0) vVar).f11550q = kVar;
    }

    @Override
    public final boolean l0(j3.n0 n0Var) {
        if (((k0) this.T0).i(n0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(long j10, boolean z4) {
        super.m(j10, z4);
        ((k0) this.T0).e();
        this.Y0 = j10;
        this.Z0 = true;
        this.f11565a1 = true;
    }

    @Override
    public final int m0(d4.s r13, j3.n0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: l3.n0.m0(d4.s, j3.n0):int");
    }

    @Override
    public final void n() {
        i iVar;
        z0 z0Var = ((k0) this.T0).f11556x;
        if (z0Var != null) {
            Context context = (Context) z0Var.f2224b;
            if (z0Var.f2223a) {
                z0Var.h = null;
                if (h5.d0.f7237a >= 23 && (iVar = (i) z0Var.f2226e) != null) {
                    h.b(context, iVar);
                }
                androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) z0Var.f2227f;
                if (hVar != null) {
                    context.unregisterReceiver(hVar);
                }
                j jVar = (j) z0Var.f2228g;
                if (jVar != null) {
                    jVar.f11518a.unregisterContentObserver(jVar);
                }
                z0Var.f2223a = false;
            }
        }
    }

    @Override
    public final void o() {
        v vVar = this.T0;
        try {
            C();
            e0();
            l.d.D(this.P, null);
            this.P = null;
        } finally {
            if (this.f11566b1) {
                this.f11566b1 = false;
                ((k0) vVar).v();
            }
        }
    }

    @Override
    public final void p() {
        ((k0) this.T0).r();
    }

    @Override
    public final void q() {
        s0();
        ((k0) this.T0).q();
    }

    public final int q0(d4.n nVar, j3.n0 n0Var) {
        int i10;
        if ("OMX.google.raw.decoder".equals(nVar.f4235a) && (i10 = h5.d0.f7237a) < 24 && (i10 != 23 || !h5.d0.F(this.R0))) {
            return -1;
        }
        return n0Var.D;
    }

    public final void s0() {
        long h = ((k0) this.T0).h(i());
        if (h != Long.MIN_VALUE) {
            if (!this.f11565a1) {
                h = Math.max(this.Y0, h);
            }
            this.Y0 = h;
            this.f11565a1 = false;
        }
    }

    @Override
    public final h5.n f() {
        return this;
    }
}
