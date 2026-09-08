package k2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import b2.v0;
import bi.l7;
import di.g7;
import e9.a1;
import i2.m1;
import i2.s0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ji.b5;
import ji.k5;
public final class h0 extends r2.r implements s0 {
    public final Context X0;
    public final n4.y Y0;
    public final p Z0;
    public final r2.j f14608a1;
    public int f14609b1;
    public boolean f14610c1;
    public boolean f14611d1;
    public b2.s f14612e1;
    public b2.s f14613f1;
    public long f14614g1;
    public boolean f14615h1;
    public boolean f14616i1;
    public boolean f14617j1;
    public int f14618k1;
    public boolean l1;
    public long f14619m1;

    public h0(Context context, r2.k kVar, Handler handler, i2.c0 c0Var, p pVar) {
        super(1, kVar, 44100.0f);
        r2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new r2.j();
        } else {
            jVar = null;
        }
        this.X0 = context.getApplicationContext();
        this.Z0 = pVar;
        this.f14608a1 = jVar;
        this.f14618k1 = -1000;
        this.Y0 = new n4.y(handler, c0Var);
        this.f14619m1 = -9223372036854775807L;
        ((d0) pVar).f14587t = new g0(this, 0);
    }

    public final int A0(r2.o oVar, b2.s sVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(oVar.f44859a) && (i10 = Build.VERSION.SDK_INT) < 24 && (i10 != 23 || !e2.d0.N(this.X0))) {
            return -1;
        }
        return sVar.f2398s;
    }

    public final void B0() {
        l();
        long i10 = ((d0) this.Z0).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.f14615h1) {
                i10 = Math.max(this.f14614g1, i10);
            }
            this.f14614g1 = i10;
            this.f14615h1 = false;
        }
    }

    @Override
    public final i2.i D(r2.o oVar, b2.s sVar, b2.s sVar2) {
        int i10;
        i2.i b10 = oVar.b(sVar, sVar2);
        int i11 = b10.f11613e;
        if (this.V == null && u0(sVar2)) {
            i11 |= 32768;
        }
        if (A0(oVar, sVar2) > this.f14609b1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f44859a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.i(str, sVar, sVar2, i10, i12);
    }

    @Override
    public final float N(float f7, b2.s sVar, b2.s[] sVarArr) {
        int i10 = -1;
        for (b2.s sVar2 : sVarArr) {
            int i11 = sVar2.K;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f7;
    }

    @Override
    public final ArrayList O(r2.i iVar, b2.s sVar, boolean z10) {
        a1 f7;
        r2.o oVar;
        if (sVar.f2397r == null) {
            f7 = a1.f8948e;
        } else {
            if (((d0) this.Z0).G(sVar)) {
                List d = r2.w.d("audio/raw", false, false);
                if (d.isEmpty()) {
                    oVar = null;
                } else {
                    oVar = (r2.o) d.get(0);
                }
                if (oVar != null) {
                    f7 = e9.i0.z(oVar);
                }
            }
            f7 = r2.w.f(iVar, sVar, z10, false);
        }
        HashMap hashMap = r2.w.f44904a;
        ArrayList arrayList = new ArrayList(f7);
        Collections.sort(arrayList, new l7(new k5(sVar, 18), 3));
        return arrayList;
    }

    @Override
    public final long P(long j3, long j10) {
        boolean z10;
        float f7;
        if (this.f14619m1 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.l1) {
            if (z10 || this.K0) {
                return 1000000L;
            }
        } else {
            long h = ((d0) this.Z0).h();
            if (z10 && h != -9223372036854775807L) {
                float min = (float) Math.min(h, this.f14619m1 - j3);
                if (h() != null) {
                    f7 = h().f2427a;
                } else {
                    f7 = 1.0f;
                }
                this.h.getClass();
                return Math.max(10000L, ((min / f7) / 2.0f) - (e2.d0.Q(SystemClock.elapsedRealtime()) - j10));
            }
        }
        return 10000L;
    }

    @Override
    public final com.google.firebase.messaging.n Q(r2.o r13, b2.s r14, android.media.MediaCrypto r15, float r16) {
        throw new UnsupportedOperationException("Method not decompiled: k2.h0.Q(r2.o, b2.s, android.media.MediaCrypto, float):com.google.firebase.messaging.n");
    }

    @Override
    public final void R(h2.h hVar) {
        b2.s sVar;
        if (Build.VERSION.SDK_INT >= 29 && (sVar = hVar.f10874a) != null && Objects.equals(sVar.f2397r, "audio/opus") && this.f44898x0) {
            ByteBuffer byteBuffer = hVar.f10878f;
            byteBuffer.getClass();
            b2.s sVar2 = hVar.f10874a;
            sVar2.getClass();
            int i10 = sVar2.M;
            if (byteBuffer.remaining() == 8) {
                ((d0) this.Z0).D(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override
    public final void X(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.f16523b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 0));
        }
    }

    @Override
    public final void Y(long j3, long j10, String str) {
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.f16523b;
        if (handler != null) {
            handler.post(new a3.g0(yVar, str, j3, j10, 2));
        }
    }

    @Override
    public final void Z(String str) {
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.f16523b;
        if (handler != null) {
            handler.post(new b5(3, yVar, str));
        }
    }

    @Override
    public final long a() {
        if (this.f11525n == 2) {
            B0();
        }
        return this.f14614g1;
    }

    @Override
    public final i2.i a0(n4.y yVar) {
        b2.s sVar = (b2.s) yVar.f16524c;
        sVar.getClass();
        this.f14612e1 = sVar;
        i2.i a02 = super.a0(yVar);
        n4.y yVar2 = this.Y0;
        Handler handler = (Handler) yVar2.f16523b;
        if (handler != null) {
            handler.post(new hg.t(yVar2, sVar, a02, 19));
        }
        return a02;
    }

    @Override
    public final boolean b() {
        boolean z10 = this.f14617j1;
        this.f14617j1 = false;
        return z10;
    }

    @Override
    public final void b0(b2.s sVar, MediaFormat mediaFormat) {
        int i10;
        b2.s sVar2 = this.f14613f1;
        boolean z10 = true;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (this.f44877b0 != null) {
            mediaFormat.getClass();
            String str = sVar.f2397r;
            int i11 = sVar.J;
            if ("audio/raw".equals(str)) {
                i10 = sVar.L;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e2.d0.B(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i10 = 2;
            }
            b2.r rVar = new b2.r();
            rVar.f2339q = r0.n("audio/raw");
            rVar.K = i10;
            rVar.L = sVar.M;
            rVar.M = sVar.N;
            rVar.f2333k = sVar.f2391l;
            rVar.f2325a = sVar.f2382a;
            rVar.f2326b = sVar.f2383b;
            rVar.f2327c = e9.i0.v(sVar.f2384c);
            rVar.d = sVar.d;
            rVar.f2328e = sVar.f2385e;
            rVar.f2329f = sVar.f2386f;
            rVar.I = mediaFormat.getInteger("channel-count");
            rVar.J = mediaFormat.getInteger("sample-rate");
            sVar = new b2.s(rVar);
            boolean z11 = this.f14610c1;
            int i12 = sVar.J;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f14611d1) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
        }
        try {
            int i14 = Build.VERSION.SDK_INT;
            p pVar = this.Z0;
            if (i14 >= 29) {
                if (this.f44898x0) {
                    m1 m1Var = this.d;
                    m1Var.getClass();
                    if (m1Var.f11669a != 0) {
                        m1 m1Var2 = this.d;
                        m1Var2.getClass();
                        int i15 = m1Var2.f11669a;
                        d0 d0Var = (d0) pVar;
                        d0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        d0Var.f14575k = i15;
                    }
                }
                d0 d0Var2 = (d0) pVar;
                d0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                e2.d.g(z10);
                d0Var2.f14575k = 0;
            }
            ((d0) pVar).d(sVar, iArr);
        } catch (l e7) {
            throw c(e7, e7.f14647a, false, 5001);
        }
    }

    @Override
    public final void c0() {
        this.Z0.getClass();
    }

    @Override
    public final void d(int i10, Object obj) {
        v0 v0Var;
        r2.j jVar;
        p pVar = this.Z0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 12) {
                        if (i10 != 16) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    if (i10 == 11) {
                                        i2.i0 i0Var = (i2.i0) obj;
                                        i0Var.getClass();
                                        this.W = i0Var;
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                ((d0) pVar).A(intValue);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f14608a1) != null) {
                                    jVar.d(intValue);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            d0 d0Var = (d0) pVar;
                            d0Var.F = ((Boolean) obj).booleanValue();
                            if (d0Var.H()) {
                                v0Var = v0.d;
                            } else {
                                v0Var = d0Var.E;
                            }
                            w wVar = new w(v0Var, -9223372036854775807L, -9223372036854775807L);
                            if (d0Var.q()) {
                                d0Var.C = wVar;
                                return;
                            } else {
                                d0Var.D = wVar;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f14618k1 = ((Integer) obj).intValue();
                        r2.l lVar = this.f44877b0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f14618k1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        e0.b.x(pVar, obj);
                        return;
                    } else {
                        return;
                    }
                }
                b2.f fVar = (b2.f) obj;
                fVar.getClass();
                ((d0) pVar).C(fVar);
                return;
            }
            b2.e eVar = (b2.e) obj;
            eVar.getClass();
            ((d0) pVar).z(eVar);
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        d0 d0Var2 = (d0) pVar;
        if (d0Var2.Q != floatValue) {
            d0Var2.Q = floatValue;
            if (d0Var2.q()) {
                d0Var2.f14590x.setVolume(d0Var2.Q);
            }
        }
    }

    @Override
    public final void e0() {
        ((d0) this.Z0).N = true;
    }

    @Override
    public final void f(v0 v0Var) {
        ((d0) this.Z0).F(v0Var);
    }

    @Override
    public final v0 h() {
        return ((d0) this.Z0).E;
    }

    @Override
    public final boolean h0(long j3, long j10, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.f14619m1 = -9223372036854775807L;
        if (this.f14613f1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        p pVar = this.Z0;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f11602f += i12;
            ((d0) pVar).N = true;
            return true;
        }
        try {
            if (((d0) pVar).n(j11, i12, byteBuffer)) {
                if (lVar != null) {
                    lVar.c(i10);
                }
                this.O0.f11601e += i12;
                return true;
            }
            this.f14619m1 = j11;
            return false;
        } catch (m e7) {
            b2.s sVar2 = this.f14612e1;
            if (this.f44898x0) {
                m1 m1Var = this.d;
                m1Var.getClass();
                if (m1Var.f11669a != 0) {
                    i14 = 5004;
                    throw c(e7, sVar2, e7.f14650b, i14);
                }
            }
            i14 = 5001;
            throw c(e7, sVar2, e7.f14650b, i14);
        } catch (o e10) {
            if (this.f44898x0) {
                m1 m1Var2 = this.d;
                m1Var2.getClass();
                if (m1Var2.f11669a != 0) {
                    i13 = 5003;
                    throw c(e10, sVar, e10.f14660b, i13);
                }
            }
            i13 = 5002;
            throw c(e10, sVar, e10.f14660b, i13);
        }
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void k0() {
        int i10;
        try {
            ((d0) this.Z0).w();
            long j3 = this.I0;
            if (j3 != -9223372036854775807L) {
                this.f14619m1 = j3;
            }
        } catch (o e7) {
            if (this.f44898x0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw c(e7, e7.f14661c, e7.f14660b, i10);
        }
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            d0 d0Var = (d0) this.Z0;
            if (d0Var.q()) {
                if (d0Var.U && !d0Var.o()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean m() {
        if (!((d0) this.Z0).o() && !super.m()) {
            return false;
        }
        return true;
    }

    @Override
    public final void o() {
        n4.y yVar = this.Y0;
        this.f14616i1 = true;
        this.f14612e1 = null;
        this.f14619m1 = -9223372036854775807L;
        try {
            ((d0) this.Z0).g();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.o();
                throw th2;
            } finally {
            }
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.O0 = obj;
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.f16523b;
        if (handler != null) {
            handler.post(new g(yVar, obj, 1));
        }
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z12 = m1Var.f11670b;
        p pVar = this.Z0;
        if (z12) {
            d0 d0Var = (d0) pVar;
            e2.d.g(d0Var.Y);
            if (!d0Var.f14563d0) {
                d0Var.f14563d0 = true;
                d0Var.g();
            }
        } else {
            d0 d0Var2 = (d0) pVar;
            if (d0Var2.f14563d0) {
                d0Var2.f14563d0 = false;
                d0Var2.g();
            }
        }
        j2.k kVar = this.f11524f;
        kVar.getClass();
        d0 d0Var3 = (d0) pVar;
        d0Var3.f14586s = kVar;
        e2.x xVar = this.h;
        xVar.getClass();
        d0Var3.h.I = xVar;
    }

    @Override
    public final void q(long j3, boolean z10) {
        super.q(j3, z10);
        ((d0) this.Z0).g();
        this.f14614g1 = j3;
        this.f14619m1 = -9223372036854775807L;
        this.f14617j1 = false;
        this.f14615h1 = true;
    }

    @Override
    public final void r() {
        r2.j jVar;
        c cVar;
        g7 g7Var = ((d0) this.Z0).f14592z;
        if (g7Var != null) {
            Context context = (Context) g7Var.f7293b;
            if (g7Var.f7292a) {
                g7Var.h = null;
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) g7Var.f7295e) != null) {
                    e0.b.K(context, cVar);
                }
                context.unregisterReceiver((androidx.mediarouter.app.g) g7Var.f7296f);
                d dVar = (d) g7Var.f7297g;
                if (dVar != null) {
                    dVar.f14551a.unregisterContentObserver(dVar);
                }
                g7Var.f7292a = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f14608a1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void s() {
        p pVar = this.Z0;
        this.f14617j1 = false;
        this.f14619m1 = -9223372036854775807L;
        try {
            this.f44898x0 = false;
            l0();
            j0();
            i2.g.D(this.V, null);
            this.V = null;
        } finally {
            if (this.f14616i1) {
                this.f14616i1 = false;
                ((d0) pVar).y();
            }
        }
    }

    @Override
    public final void t() {
        ((d0) this.Z0).u();
        this.l1 = true;
    }

    @Override
    public final void u() {
        B0();
        this.l1 = false;
        ((d0) this.Z0).t();
    }

    @Override
    public final boolean u0(b2.s sVar) {
        m1 m1Var = this.d;
        m1Var.getClass();
        if (m1Var.f11669a != 0) {
            int z02 = z0(sVar);
            if ((z02 & 512) != 0) {
                m1 m1Var2 = this.d;
                m1Var2.getClass();
                if (m1Var2.f11669a != 2 && (z02 & 1024) == 0) {
                    if (sVar.M == 0 && sVar.N == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return ((d0) this.Z0).G(sVar);
    }

    @Override
    public final int v0(r2.i r18, b2.s r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.h0.v0(r2.i, b2.s):int");
    }

    public final int z0(b2.s sVar) {
        int i10;
        e j3 = ((d0) this.Z0).j(sVar);
        if (!j3.f14593a) {
            return 0;
        }
        if (j3.f14594b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (j3.f14595c) {
            return i10 | 2048;
        }
        return i10;
    }

    @Override
    public final s0 i() {
        return this;
    }
}
