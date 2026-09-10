package k2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import b2.v0;
import bi.h8;
import bi.q3;
import e9.a1;
import fg.s1;
import i2.l1;
import i2.r0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class h0 extends r2.r implements r0 {
    public final Context X0;
    public final of.b Y0;
    public final p Z0;
    public final r2.j f12137a1;
    public int f12138b1;
    public boolean f12139c1;
    public boolean f12140d1;
    public b2.s f12141e1;
    public b2.s f12142f1;
    public long f12143g1;
    public boolean f12144h1;
    public boolean f12145i1;
    public boolean f12146j1;
    public int f12147k1;
    public boolean l1;
    public long f12148m1;

    public h0(Context context, r2.k kVar, Handler handler, i2.b0 b0Var, p pVar) {
        super(1, kVar, 44100.0f);
        r2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new r2.j();
        } else {
            jVar = null;
        }
        this.X0 = context.getApplicationContext();
        this.Z0 = pVar;
        this.f12137a1 = jVar;
        this.f12147k1 = -1000;
        this.Y0 = new of.b(handler, (j) b0Var);
        this.f12148m1 = -9223372036854775807L;
        ((e0) pVar).f12121t = new xa.c(this, 28);
    }

    public final int A0(r2.o oVar, b2.s sVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(oVar.f41182a) && (i10 = Build.VERSION.SDK_INT) < 24 && (i10 != 23 || !e2.d0.N(this.X0))) {
            return -1;
        }
        return sVar.f2003s;
    }

    public final void B0() {
        l();
        long i10 = ((e0) this.Z0).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.f12144h1) {
                i10 = Math.max(this.f12143g1, i10);
            }
            this.f12143g1 = i10;
            this.f12144h1 = false;
        }
    }

    @Override
    public final i2.h D(r2.o oVar, b2.s sVar, b2.s sVar2) {
        int i10;
        i2.h b10 = oVar.b(sVar, sVar2);
        int i11 = b10.e;
        if (this.V == null && u0(sVar2)) {
            i11 |= 32768;
        }
        if (A0(oVar, sVar2) > this.f12138b1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f41182a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.h(str, sVar, sVar2, i10, i12);
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
        if (sVar.f2002r == null) {
            f7 = a1.e;
        } else {
            if (((e0) this.Z0).G(sVar)) {
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
        HashMap hashMap = r2.w.f41225a;
        ArrayList arrayList = new ArrayList(f7);
        Collections.sort(arrayList, new q3(new org.telegram.tgnet.j(sVar, 18), 3));
        return arrayList;
    }

    @Override
    public final long P(long j3, long j10) {
        boolean z10;
        float f7;
        if (this.f12148m1 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.l1) {
            if (z10 || this.K0) {
                return 1000000L;
            }
        } else {
            long h = ((e0) this.Z0).h();
            if (z10 && h != -9223372036854775807L) {
                float min = (float) Math.min(h, this.f12148m1 - j3);
                if (h() != null) {
                    f7 = h().f2029a;
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
        if (Build.VERSION.SDK_INT >= 29 && (sVar = hVar.f9208a) != null && Objects.equals(sVar.f2002r, "audio/opus") && this.f41219x0) {
            ByteBuffer byteBuffer = hVar.f9211f;
            byteBuffer.getClass();
            b2.s sVar2 = hVar.f9208a;
            sVar2.getClass();
            int i10 = sVar2.M;
            if (byteBuffer.remaining() == 8) {
                ((e0) this.Z0).D(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override
    public final void X(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new f(bVar, exc, 0));
        }
    }

    @Override
    public final void Y(long j3, long j10, String str) {
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new a3.g0(bVar, str, j3, j10, 1));
        }
    }

    @Override
    public final void Z(String str) {
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new s1(26, bVar, str));
        }
    }

    @Override
    public final long a() {
        if (this.f10177n == 2) {
            B0();
        }
        return this.f12143g1;
    }

    @Override
    public final i2.h a0(of.b bVar) {
        b2.s sVar = (b2.s) bVar.f14295c;
        sVar.getClass();
        this.f12141e1 = sVar;
        i2.h a02 = super.a0(bVar);
        of.b bVar2 = this.Y0;
        Handler handler = (Handler) bVar2.f14294b;
        if (handler != null) {
            handler.post(new gg.a0(bVar2, sVar, a02, 13));
        }
        return a02;
    }

    @Override
    public final boolean b() {
        boolean z10 = this.f12146j1;
        this.f12146j1 = false;
        return z10;
    }

    @Override
    public final void b0(b2.s sVar, MediaFormat mediaFormat) {
        int i10;
        b2.s sVar2 = this.f12142f1;
        boolean z10 = true;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (this.f41198b0 != null) {
            mediaFormat.getClass();
            String str = sVar.f2002r;
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
            rVar.f1946q = b2.r0.n("audio/raw");
            rVar.K = i10;
            rVar.L = sVar.M;
            rVar.M = sVar.N;
            rVar.f1940k = sVar.f1996l;
            rVar.f1933a = sVar.f1988a;
            rVar.f1934b = sVar.f1989b;
            rVar.f1935c = e9.i0.v(sVar.f1990c);
            rVar.d = sVar.d;
            rVar.e = sVar.e;
            rVar.f1936f = sVar.f1991f;
            rVar.I = mediaFormat.getInteger("channel-count");
            rVar.J = mediaFormat.getInteger("sample-rate");
            sVar = new b2.s(rVar);
            boolean z11 = this.f12139c1;
            int i12 = sVar.J;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f12140d1) {
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
                if (this.f41219x0) {
                    l1 l1Var = this.d;
                    l1Var.getClass();
                    if (l1Var.f10268a != 0) {
                        l1 l1Var2 = this.d;
                        l1Var2.getClass();
                        int i15 = l1Var2.f10268a;
                        e0 e0Var = (e0) pVar;
                        e0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        e0Var.f12109k = i15;
                    }
                }
                e0 e0Var2 = (e0) pVar;
                e0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                e2.d.g(z10);
                e0Var2.f12109k = 0;
            }
            ((e0) pVar).d(sVar, iArr);
        } catch (l e) {
            throw d(e, e.f12173a, false, 5001);
        }
    }

    @Override
    public final void c(int i10, Object obj) {
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
                                        i2.h0 h0Var = (i2.h0) obj;
                                        h0Var.getClass();
                                        this.W = h0Var;
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                ((e0) pVar).A(intValue);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f12137a1) != null) {
                                    jVar.d(intValue);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            e0 e0Var = (e0) pVar;
                            e0Var.F = ((Boolean) obj).booleanValue();
                            if (e0Var.H()) {
                                v0Var = v0.d;
                            } else {
                                v0Var = e0Var.E;
                            }
                            x xVar = new x(v0Var, -9223372036854775807L, -9223372036854775807L);
                            if (e0Var.q()) {
                                e0Var.C = xVar;
                                return;
                            } else {
                                e0Var.D = xVar;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f12147k1 = ((Integer) obj).intValue();
                        r2.l lVar = this.f41198b0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f12147k1));
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
                ((e0) pVar).C(fVar);
                return;
            }
            b2.e eVar = (b2.e) obj;
            eVar.getClass();
            ((e0) pVar).z(eVar);
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        e0 e0Var2 = (e0) pVar;
        if (e0Var2.Q != floatValue) {
            e0Var2.Q = floatValue;
            if (e0Var2.q()) {
                e0Var2.f12124x.setVolume(e0Var2.Q);
            }
        }
    }

    @Override
    public final void c0() {
        this.Z0.getClass();
    }

    @Override
    public final void e0() {
        ((e0) this.Z0).N = true;
    }

    @Override
    public final void f(v0 v0Var) {
        ((e0) this.Z0).F(v0Var);
    }

    @Override
    public final v0 h() {
        return ((e0) this.Z0).E;
    }

    @Override
    public final boolean h0(long j3, long j10, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.f12148m1 = -9223372036854775807L;
        if (this.f12142f1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        p pVar = this.Z0;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f10207f += i12;
            ((e0) pVar).N = true;
            return true;
        }
        try {
            if (((e0) pVar).n(j11, i12, byteBuffer)) {
                if (lVar != null) {
                    lVar.c(i10);
                }
                this.O0.e += i12;
                return true;
            }
            this.f12148m1 = j11;
            return false;
        } catch (m e) {
            b2.s sVar2 = this.f12141e1;
            if (this.f41219x0) {
                l1 l1Var = this.d;
                l1Var.getClass();
                if (l1Var.f10268a != 0) {
                    i14 = 5004;
                    throw d(e, sVar2, e.f12176b, i14);
                }
            }
            i14 = 5001;
            throw d(e, sVar2, e.f12176b, i14);
        } catch (o e7) {
            if (this.f41219x0) {
                l1 l1Var2 = this.d;
                l1Var2.getClass();
                if (l1Var2.f10268a != 0) {
                    i13 = 5003;
                    throw d(e7, sVar, e7.f12186b, i13);
                }
            }
            i13 = 5002;
            throw d(e7, sVar, e7.f12186b, i13);
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
            ((e0) this.Z0).w();
            long j3 = this.I0;
            if (j3 != -9223372036854775807L) {
                this.f12148m1 = j3;
            }
        } catch (o e) {
            if (this.f41219x0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw d(e, e.f12187c, e.f12186b, i10);
        }
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            e0 e0Var = (e0) this.Z0;
            if (e0Var.q()) {
                if (e0Var.U && !e0Var.o()) {
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
        if (!((e0) this.Z0).o() && !super.m()) {
            return false;
        }
        return true;
    }

    @Override
    public final void o() {
        of.b bVar = this.Y0;
        this.f12145i1 = true;
        this.f12141e1 = null;
        this.f12148m1 = -9223372036854775807L;
        try {
            ((e0) this.Z0).g();
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
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new g(bVar, obj, 1));
        }
        l1 l1Var = this.d;
        l1Var.getClass();
        boolean z12 = l1Var.f10269b;
        p pVar = this.Z0;
        if (z12) {
            e0 e0Var = (e0) pVar;
            e2.d.g(e0Var.Y);
            if (!e0Var.f12098d0) {
                e0Var.f12098d0 = true;
                e0Var.g();
            }
        } else {
            e0 e0Var2 = (e0) pVar;
            if (e0Var2.f12098d0) {
                e0Var2.f12098d0 = false;
                e0Var2.g();
            }
        }
        j2.k kVar = this.f10176f;
        kVar.getClass();
        e0 e0Var3 = (e0) pVar;
        e0Var3.f12120s = kVar;
        e2.x xVar = this.h;
        xVar.getClass();
        e0Var3.h.I = xVar;
    }

    @Override
    public final void q(long j3, boolean z10) {
        super.q(j3, z10);
        ((e0) this.Z0).g();
        this.f12143g1 = j3;
        this.f12148m1 = -9223372036854775807L;
        this.f12146j1 = false;
        this.f12144h1 = true;
    }

    @Override
    public final void r() {
        r2.j jVar;
        c cVar;
        h8 h8Var = ((e0) this.Z0).f12126z;
        if (h8Var != null) {
            Context context = (Context) h8Var.f2794b;
            if (h8Var.f2793a) {
                h8Var.h = null;
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) h8Var.e) != null) {
                    e0.b.K(context, cVar);
                }
                context.unregisterReceiver((androidx.mediarouter.app.g) h8Var.f2796f);
                d dVar = (d) h8Var.f2797g;
                if (dVar != null) {
                    dVar.f12080a.unregisterContentObserver(dVar);
                }
                h8Var.f2793a = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f12137a1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void s() {
        p pVar = this.Z0;
        this.f12146j1 = false;
        this.f12148m1 = -9223372036854775807L;
        try {
            this.f41219x0 = false;
            l0();
            j0();
            hc.b.D(this.V, null);
            this.V = null;
        } finally {
            if (this.f12145i1) {
                this.f12145i1 = false;
                ((e0) pVar).y();
            }
        }
    }

    @Override
    public final void t() {
        ((e0) this.Z0).u();
        this.l1 = true;
    }

    @Override
    public final void u() {
        B0();
        this.l1 = false;
        ((e0) this.Z0).t();
    }

    @Override
    public final boolean u0(b2.s sVar) {
        l1 l1Var = this.d;
        l1Var.getClass();
        if (l1Var.f10268a != 0) {
            int z02 = z0(sVar);
            if ((z02 & 512) != 0) {
                l1 l1Var2 = this.d;
                l1Var2.getClass();
                if (l1Var2.f10268a != 2 && (z02 & 1024) == 0) {
                    if (sVar.M == 0 && sVar.N == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return ((e0) this.Z0).G(sVar);
    }

    @Override
    public final int v0(r2.i r18, b2.s r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.h0.v0(r2.i, b2.s):int");
    }

    public final int z0(b2.s sVar) {
        int i10;
        e j3 = ((e0) this.Z0).j(sVar);
        if (!j3.f12086a) {
            return 0;
        }
        if (j3.f12087b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (j3.f12088c) {
            return i10 | 2048;
        }
        return i10;
    }

    @Override
    public final r0 i() {
        return this;
    }
}
