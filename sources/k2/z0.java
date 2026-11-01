package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import bi.v6;
import e9.x1;
import i2.s1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v7.t6;
public final class z0 extends r2.r implements i2.x0 {
    public final Context Z0;
    public final hf.b f10814a1;
    public final b0 f10815b1;
    public final r2.j f10816c1;
    public int f10817d1;
    public boolean f10818e1;
    public boolean f10819f1;
    public b2.x f10820g1;
    public b2.x f10821h1;
    public long f10822i1;
    public boolean f10823j1;
    public boolean f10824k1;
    public boolean l1;
    public boolean f10825m1;
    public int f10826n1;
    public boolean f10827o1;
    public long f10828p1;

    public z0(Context context, r2.k kVar, Handler handler, i2.c0 c0Var, b0 b0Var) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        r2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new r2.j();
        } else {
            jVar = null;
        }
        this.Z0 = context.getApplicationContext();
        this.f10815b1 = b0Var;
        this.f10816c1 = jVar;
        this.f10826n1 = -1000;
        this.f10814a1 = new hf.b(handler, (w) c0Var);
        this.f10828p1 = -9223372036854775807L;
    }

    public final int D0(b2.x xVar) {
        g a2;
        int i10;
        w0 w0Var = (w0) this.f10815b1;
        if (w0Var.X) {
            a2 = g.d;
        } else {
            l b10 = ((n0) w0Var.f10801r).b(w0Var.i(xVar));
            ?? obj = new Object();
            obj.f6459a = b10.f10695a;
            obj.f6460b = b10.f10696b;
            obj.f6461c = b10.f10697c;
            a2 = obj.a();
        }
        if (!a2.f10658a) {
            return 0;
        }
        if (a2.f10659b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (a2.f10660c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int E0(r2.o oVar, b2.x xVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f46252a) && Build.VERSION.SDK_INT == 23 && !e2.l0.P(this.Z0)) {
            return -1;
        }
        return xVar.f2424t;
    }

    public final void F0() {
        l();
        long h = ((w0) this.f10815b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f10823j1) {
                h = Math.max(this.f10822i1, h);
            }
            this.f10822i1 = h;
            this.f10823j1 = false;
        }
    }

    @Override
    public final i2.e H(r2.o oVar, b2.x xVar, b2.x xVar2, boolean z10) {
        int i10;
        i2.e b10 = oVar.b(xVar, xVar2);
        int i11 = b10.e;
        if (this.X == null && y0(xVar2)) {
            i11 |= 32768;
        }
        if (E0(oVar, xVar2) > this.f10817d1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f46252a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.e(str, xVar, xVar2, i10, i12);
    }

    @Override
    public final float P(float f7, b2.x xVar, b2.x[] xVarArr) {
        int i10 = -1;
        for (b2.x xVar2 : xVarArr) {
            int i11 = xVar2.L;
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
    public final ArrayList Q(r2.i iVar, b2.x xVar, boolean z10) {
        x1 g10;
        r2.o oVar;
        if (xVar.f2423s == null) {
            g10 = x1.e;
        } else {
            if (((w0) this.f10815b1).j(xVar) != 0) {
                List e = r2.w.e("audio/raw", false, false);
                if (e.isEmpty()) {
                    oVar = null;
                } else {
                    oVar = (r2.o) e.get(0);
                }
                if (oVar != null) {
                    g10 = e9.n0.y(oVar);
                }
            }
            g10 = r2.w.g(iVar, xVar, z10, false);
        }
        HashMap hashMap = r2.w.f46297a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new v6(new org.telegram.ui.web.k0(9, this.Z0, xVar), 3));
        return arrayList;
    }

    @Override
    public final long R(long j10, long j11, boolean z10) {
        boolean z11;
        float f7;
        w0 w0Var = (w0) this.f10815b1;
        if (w0Var.n() && this.f10828p1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f10827o1) {
            if (z11 || this.K0) {
                return 1000000L;
            }
        } else {
            long g10 = w0Var.g();
            if (this.f10825m1 && z11 && g10 != -9223372036854775807L) {
                float min = (float) Math.min(g10, this.f10828p1 - j10);
                if (g() != null) {
                    f7 = g().f2443a;
                } else {
                    f7 = 1.0f;
                }
                return Math.max(10000L, (min / f7) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final j2.f T(r2.o r17, b2.x r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: k2.z0.T(r2.o, b2.x, android.media.MediaCrypto, float):j2.f");
    }

    @Override
    public final void U(h2.h hVar) {
        b2.x xVar;
        ji.a aVar;
        if (Build.VERSION.SDK_INT >= 29 && (xVar = hVar.f7585a) != null && Objects.equals(xVar.f2423s, "audio/opus") && this.f46292y0) {
            ByteBuffer byteBuffer = hVar.f7588f;
            byteBuffer.getClass();
            b2.x xVar2 = hVar.f7585a;
            xVar2.getClass();
            int i10 = xVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                w0 w0Var = (w0) this.f10815b1;
                j0 j0Var = w0Var.f10803t;
                if (j0Var != null && j0Var.c() && (aVar = w0Var.f10799p) != null && ((o) aVar.e).f10725k) {
                    w0Var.f10803t.d(i10, i11);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f7812n == 2) {
            F0();
        }
        return this.f10822i1;
    }

    @Override
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        hf.b bVar = this.f10814a1;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 0));
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.l1;
        this.l1 = false;
        return z10;
    }

    @Override
    public final void b0(long j10, String str, long j11) {
        hf.b bVar = this.f10814a1;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new a3.h0(bVar, str, j10, j11, 1));
        }
    }

    @Override
    public final void c(b2.z0 z0Var) {
        ((w0) this.f10815b1).C(z0Var);
    }

    @Override
    public final void c0(i2.c cVar) {
        hf.b bVar = this.f10814a1;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new u(1, bVar, cVar));
        }
    }

    @Override
    public final void d(int i10, Object obj) {
        b2.z0 z0Var;
        r2.j jVar;
        b0 b0Var = this.f10815b1;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 12) {
                        if (i10 != 16) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    if (i10 != 19) {
                                        if (i10 != 20) {
                                            super.d(i10, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        ((w0) b0Var).y((p) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    w0 w0Var = (w0) b0Var;
                                    w0Var.getClass();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (w0Var.U != intValue) {
                                        w0Var.U = intValue;
                                        w0Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((w0) b0Var).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f10816c1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            w0 w0Var2 = (w0) b0Var;
                            w0Var2.f10807y = ((Boolean) obj).booleanValue();
                            if (w0Var2.D()) {
                                z0Var = b2.z0.d;
                            } else {
                                z0Var = w0Var2.f10806x;
                            }
                            u0 u0Var = new u0(z0Var, -9223372036854775807L, -9223372036854775807L);
                            if (w0Var2.p()) {
                                w0Var2.v = u0Var;
                                return;
                            } else {
                                w0Var2.f10805w = u0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f10826n1 = ((Integer) obj).intValue();
                        r2.l lVar = this.f46272d0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f10826n1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    w0 w0Var3 = (w0) b0Var;
                    w0Var3.T = audioDeviceInfo;
                    j0 j0Var = w0Var3.f10803t;
                    if (j0Var != null) {
                        j0Var.f10675a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                b2.g gVar = (b2.g) obj;
                gVar.getClass();
                ((w0) b0Var).A(gVar);
                return;
            }
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            w0 w0Var4 = (w0) b0Var;
            if (!w0Var4.f10804u.equals(fVar)) {
                w0Var4.f10804u = fVar;
                if (!w0Var4.V) {
                    w0Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        w0 w0Var5 = (w0) b0Var;
        if (w0Var5.H != floatValue) {
            w0Var5.H = floatValue;
            if (w0Var5.p()) {
                w0Var5.f10803t.f10675a.setVolume(w0Var5.H);
            }
        }
    }

    @Override
    public final void d0(String str) {
        hf.b bVar = this.f10814a1;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new u(0, bVar, str));
        }
    }

    @Override
    public final i2.e e0(hf.b bVar) {
        b2.x xVar = (b2.x) bVar.f7659c;
        xVar.getClass();
        this.f10820g1 = xVar;
        i2.e e02 = super.e0(bVar);
        hf.b bVar2 = this.f10814a1;
        Handler handler = (Handler) bVar2.f7658b;
        if (handler != null) {
            handler.post(new a3.l0(bVar2, xVar, e02, 26));
        }
        return e02;
    }

    @Override
    public final void f0(b2.x xVar, MediaFormat mediaFormat) {
        int i10;
        b2.x xVar2 = this.f10821h1;
        boolean z10 = true;
        int[] iArr = null;
        if (xVar2 != null) {
            xVar = xVar2;
        } else if (this.f46272d0 != null) {
            mediaFormat.getClass();
            String str = xVar.f2423s;
            int i11 = xVar.K;
            if ("audio/raw".equals(str)) {
                i10 = xVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e2.l0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i10 = 2;
            }
            b2.w wVar = new b2.w();
            wVar.f2370r = b2.v0.n("audio/raw");
            wVar.L = i10;
            wVar.M = xVar.N;
            wVar.N = xVar.O;
            wVar.f2363k = xVar.f2416l;
            wVar.f2356a = xVar.f2408a;
            wVar.f2357b = xVar.f2409b;
            wVar.f2358c = e9.n0.u(xVar.f2410c);
            wVar.d = xVar.d;
            wVar.e = xVar.e;
            wVar.f2359f = xVar.f2411f;
            wVar.J = mediaFormat.getInteger("channel-count");
            wVar.K = mediaFormat.getInteger("sample-rate");
            xVar = new b2.x(wVar);
            boolean z11 = this.f10818e1;
            int i12 = xVar.K;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f10819f1) {
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
            b0 b0Var = this.f10815b1;
            if (i14 >= 29) {
                if (this.f46292y0) {
                    s1 s1Var = this.d;
                    s1Var.getClass();
                    if (s1Var.f8080a != 0) {
                        s1 s1Var2 = this.d;
                        s1Var2.getClass();
                        int i15 = s1Var2.f8080a;
                        w0 w0Var = (w0) b0Var;
                        w0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        t6.p(z10);
                        w0Var.f10792i = i15;
                    }
                }
                w0 w0Var2 = (w0) b0Var;
                w0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                t6.p(z10);
                w0Var2.f10792i = 0;
            }
            ((w0) b0Var).c(xVar, iArr);
        } catch (x e) {
            throw e(e, e.f10809a, false, 5001);
        }
    }

    @Override
    public final b2.z0 g() {
        return ((w0) this.f10815b1).f10806x;
    }

    @Override
    public final void g0() {
        this.f10815b1.getClass();
    }

    @Override
    public final void i0() {
        ((w0) this.f10815b1).E = true;
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            w0 w0Var = (w0) this.f10815b1;
            if (w0Var.p()) {
                if (w0Var.L && !w0Var.n()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean l0(long j10, long j11, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.x xVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.f10828p1 = -9223372036854775807L;
        if (this.f10821h1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        b0 b0Var = this.f10815b1;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f7827f += i12;
            ((w0) b0Var).E = true;
            return true;
        }
        try {
            if (((w0) b0Var).m(j12, i12, byteBuffer)) {
                if (lVar != null) {
                    lVar.c(i10);
                }
                this.O0.e += i12;
                return true;
            }
            this.f10828p1 = j12;
            return false;
        } catch (a0 e) {
            if (this.f46292y0) {
                s1 s1Var = this.d;
                s1Var.getClass();
                if (s1Var.f8080a != 0) {
                    i14 = 5003;
                    throw e(e, xVar, e.f10597b, i14);
                }
            }
            i14 = 5002;
            throw e(e, xVar, e.f10597b, i14);
        } catch (y e7) {
            b2.x xVar2 = this.f10820g1;
            if (this.f46292y0) {
                s1 s1Var2 = this.d;
                s1Var2.getClass();
                if (s1Var2.f8080a != 0) {
                    i13 = 5004;
                    throw e(e7, xVar2, e7.f10811a, i13);
                }
            }
            i13 = 5001;
            throw e(e7, xVar2, e7.f10811a, i13);
        }
    }

    @Override
    public final boolean m() {
        return ((w0) this.f10815b1).n();
    }

    @Override
    public final void n() {
        hf.b bVar = this.f10814a1;
        this.f10824k1 = true;
        this.f10820g1 = null;
        this.f10828p1 = -9223372036854775807L;
        this.f10825m1 = false;
        try {
            ((w0) this.f10815b1).f();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
            }
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.O0 = obj;
        hf.b bVar = this.f10814a1;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new r(bVar, obj, 1));
        }
        s1 s1Var = this.d;
        s1Var.getClass();
        boolean z12 = s1Var.f8081b;
        b0 b0Var = this.f10815b1;
        if (z12) {
            w0 w0Var = (w0) b0Var;
            t6.p(w0Var.P);
            if (!w0Var.V) {
                w0Var.V = true;
                w0Var.v();
            }
        } else {
            w0 w0Var2 = (w0) b0Var;
            if (w0Var2.V) {
                w0Var2.V = false;
                w0Var2.v();
            }
        }
        j2.l lVar = this.f7811f;
        lVar.getClass();
        w0 w0Var3 = (w0) b0Var;
        w0Var3.f10796m = lVar;
        e2.g0 g0Var = this.h;
        g0Var.getClass();
        ((n0) w0Var3.f10801r).f10714g = g0Var;
        w0Var3.f10797n = new a6.i(this, 29);
    }

    @Override
    public final void o0() {
        int i10;
        try {
            ((w0) this.f10815b1).t();
            long j10 = this.P0.f46268f;
            if (j10 != -9223372036854775807L) {
                this.f10828p1 = j10;
            }
        } catch (a0 e) {
            if (this.f46292y0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw e(e, e.f10598c, e.f10597b, i10);
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((w0) this.f10815b1).f();
        this.f10822i1 = j10;
        this.f10828p1 = -9223372036854775807L;
        this.l1 = false;
        this.f10825m1 = false;
        this.f10823j1 = true;
    }

    @Override
    public final void q() {
        r2.j jVar;
        ((n0) ((w0) this.f10815b1).f10801r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f10816c1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        b0 b0Var = this.f10815b1;
        this.l1 = false;
        this.f10825m1 = false;
        this.f10828p1 = -9223372036854775807L;
        try {
            this.f46292y0 = false;
            p0();
            n0();
            i0.a.x(this.X, null);
            this.X = null;
        } finally {
            if (this.f10824k1) {
                this.f10824k1 = false;
                ((w0) b0Var).w();
            }
        }
    }

    @Override
    public final void s() {
        ((w0) this.f10815b1).r();
        this.f10827o1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f10827o1 = false;
        ((w0) this.f10815b1).q();
        this.f10825m1 = false;
    }

    @Override
    public final boolean y0(b2.x xVar) {
        s1 s1Var = this.d;
        s1Var.getClass();
        if (s1Var.f8080a != 0) {
            int D0 = D0(xVar);
            if ((D0 & 512) != 0) {
                s1 s1Var2 = this.d;
                s1Var2.getClass();
                if (s1Var2.f8080a == 2 || (D0 & 1024) != 0 || (xVar.N == 0 && xVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((w0) this.f10815b1).j(xVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(r2.i r18, b2.x r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.z0.z0(r2.i, b2.x):int");
    }

    @Override
    public final i2.x0 i() {
        return this;
    }
}
