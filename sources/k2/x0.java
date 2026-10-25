package k2;

import a8.yb;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import bi.p5;
import f9.s1;
import hi.u2;
import i2.q1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jg.f1;
import org.telegram.ui.zg1;
public final class x0 extends r2.r implements i2.x0 {
    public final Context Z0;
    public final rf.b f16312a1;
    public final a0 f16313b1;
    public final r2.j f16314c1;
    public int f16315d1;
    public boolean f16316e1;
    public boolean f16317f1;
    public b2.x f16318g1;
    public b2.x f16319h1;
    public long f16320i1;
    public boolean f16321j1;
    public boolean f16322k1;
    public boolean l1;
    public boolean f16323m1;
    public int f16324n1;
    public boolean f16325o1;
    public long f16326p1;

    public x0(Context context, r2.k kVar, Handler handler, i2.d0 d0Var, a0 a0Var) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        r2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new r2.j();
        } else {
            jVar = null;
        }
        this.Z0 = context.getApplicationContext();
        this.f16313b1 = a0Var;
        this.f16314c1 = jVar;
        this.f16324n1 = -1000;
        this.f16312a1 = new rf.b(handler, d0Var);
        this.f16326p1 = -9223372036854775807L;
    }

    public final int D0(b2.x xVar) {
        h a2;
        int i10;
        u0 u0Var = (u0) this.f16313b1;
        if (u0Var.X) {
            a2 = h.d;
        } else {
            m b10 = ((l0) u0Var.f16299r).b(u0Var.i(xVar));
            ?? obj = new Object();
            obj.f6189a = b10.f16212a;
            obj.f6190b = b10.f16213b;
            obj.f6191c = b10.f16214c;
            a2 = obj.a();
        }
        if (!a2.f16166a) {
            return 0;
        }
        if (a2.f16167b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (a2.f16168c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int E0(r2.o oVar, b2.x xVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f47221a) && Build.VERSION.SDK_INT == 23 && !e2.n0.P(this.Z0)) {
            return -1;
        }
        return xVar.f3587t;
    }

    public final void F0() {
        l();
        long h = ((u0) this.f16313b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f16321j1) {
                h = Math.max(this.f16320i1, h);
            }
            this.f16320i1 = h;
            this.f16321j1 = false;
        }
    }

    @Override
    public final i2.f H(r2.o oVar, b2.x xVar, b2.x xVar2, boolean z10) {
        int i10;
        i2.f b10 = oVar.b(xVar, xVar2);
        int i11 = b10.e;
        if (this.X == null && y0(xVar2)) {
            i11 |= 32768;
        }
        if (E0(oVar, xVar2) > this.f16315d1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f47221a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.f(str, xVar, xVar2, i10, i12);
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
        s1 g7;
        r2.o oVar;
        if (xVar.f3586s == null) {
            g7 = s1.e;
        } else {
            if (((u0) this.f16313b1).j(xVar) != 0) {
                List e = r2.w.e("audio/raw", false, false);
                if (e.isEmpty()) {
                    oVar = null;
                } else {
                    oVar = (r2.o) e.get(0);
                }
                if (oVar != null) {
                    g7 = f9.i0.y(oVar);
                }
            }
            g7 = r2.w.g(iVar, xVar, z10, false);
        }
        HashMap hashMap = r2.w.f47266a;
        ArrayList arrayList = new ArrayList(g7);
        Collections.sort(arrayList, new p5(new zg1(9, this.Z0, xVar), 4));
        return arrayList;
    }

    @Override
    public final long R(long j10, long j11, boolean z10) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) this.f16313b1;
        if (u0Var.n() && this.f16326p1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f16325o1) {
            if (z11 || this.K0) {
                return 1000000L;
            }
        } else {
            long g7 = u0Var.g();
            if (this.f16323m1 && z11 && g7 != -9223372036854775807L) {
                float min = (float) Math.min(g7, this.f16326p1 - j10);
                if (h() != null) {
                    f7 = h().f3140a;
                } else {
                    f7 = 1.0f;
                }
                return Math.max(10000L, (min / f7) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final aa.m0 T(r2.o r17, b2.x r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: k2.x0.T(r2.o, b2.x, android.media.MediaCrypto, float):aa.m0");
    }

    @Override
    public final void U(h2.h hVar) {
        b2.x xVar;
        r0 r0Var;
        if (Build.VERSION.SDK_INT >= 29 && (xVar = hVar.f12568a) != null && Objects.equals(xVar.f3586s, "audio/opus") && this.f47261y0) {
            ByteBuffer byteBuffer = hVar.f12571f;
            byteBuffer.getClass();
            b2.x xVar2 = hVar.f12568a;
            xVar2.getClass();
            int i10 = xVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                u0 u0Var = (u0) this.f16313b1;
                j0 j0Var = u0Var.f16301t;
                if (j0Var != null && j0Var.c() && (r0Var = u0Var.f16297p) != null && ((p) r0Var.e).f16256k) {
                    u0Var.f16301t.d(i10, i11);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f13494n == 2) {
            F0();
        }
        return this.f16320i1;
    }

    @Override
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        rf.b bVar = this.f16312a1;
        Handler handler = (Handler) bVar.f47332b;
        if (handler != null) {
            handler.post(new r(bVar, exc, 0));
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.l1;
        this.l1 = false;
        return z10;
    }

    @Override
    public final void b0(long j10, long j11, String str) {
        rf.b bVar = this.f16312a1;
        Handler handler = (Handler) bVar.f47332b;
        if (handler != null) {
            handler.post(new a3.h0(bVar, str, j10, j11, 3));
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        b2.a1 a1Var;
        r2.j jVar;
        a0 a0Var = this.f16313b1;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 12) {
                        if (i10 != 16) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    if (i10 != 19) {
                                        if (i10 != 20) {
                                            super.c(i10, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        ((u0) a0Var).y((q) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    u0 u0Var = (u0) a0Var;
                                    u0Var.getClass();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (u0Var.U != intValue) {
                                        u0Var.U = intValue;
                                        u0Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((u0) a0Var).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f16314c1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            u0 u0Var2 = (u0) a0Var;
                            u0Var2.f16305y = ((Boolean) obj).booleanValue();
                            if (u0Var2.D()) {
                                a1Var = b2.a1.d;
                            } else {
                                a1Var = u0Var2.f16304x;
                            }
                            s0 s0Var = new s0(a1Var, -9223372036854775807L, -9223372036854775807L);
                            if (u0Var2.p()) {
                                u0Var2.v = s0Var;
                                return;
                            } else {
                                u0Var2.f16303w = s0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f16324n1 = ((Integer) obj).intValue();
                        r2.l lVar = this.f47241d0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f16324n1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    u0 u0Var3 = (u0) a0Var;
                    u0Var3.T = audioDeviceInfo;
                    j0 j0Var = u0Var3.f16301t;
                    if (j0Var != null) {
                        j0Var.f16177a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                b2.g gVar = (b2.g) obj;
                gVar.getClass();
                ((u0) a0Var).A(gVar);
                return;
            }
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            u0 u0Var4 = (u0) a0Var;
            if (!u0Var4.f16302u.equals(fVar)) {
                u0Var4.f16302u = fVar;
                if (!u0Var4.V) {
                    u0Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        u0 u0Var5 = (u0) a0Var;
        if (u0Var5.H != floatValue) {
            u0Var5.H = floatValue;
            if (u0Var5.p()) {
                u0Var5.f16301t.f16177a.setVolume(u0Var5.H);
            }
        }
    }

    @Override
    public final void c0(i2.d dVar) {
        rf.b bVar = this.f16312a1;
        Handler handler = (Handler) bVar.f47332b;
        if (handler != null) {
            handler.post(new u2(28, bVar, dVar));
        }
    }

    @Override
    public final void d0(String str) {
        rf.b bVar = this.f16312a1;
        Handler handler = (Handler) bVar.f47332b;
        if (handler != null) {
            handler.post(new u2(27, bVar, str));
        }
    }

    @Override
    public final i2.f e0(n4.s sVar) {
        b2.x xVar = (b2.x) sVar.f18697c;
        xVar.getClass();
        this.f16318g1 = xVar;
        i2.f e02 = super.e0(sVar);
        rf.b bVar = this.f16312a1;
        Handler handler = (Handler) bVar.f47332b;
        if (handler != null) {
            handler.post(new f1(bVar, xVar, e02, 2));
        }
        return e02;
    }

    @Override
    public final void f(b2.a1 a1Var) {
        ((u0) this.f16313b1).C(a1Var);
    }

    @Override
    public final void f0(b2.x xVar, MediaFormat mediaFormat) {
        int i10;
        b2.x xVar2 = this.f16319h1;
        boolean z10 = true;
        int[] iArr = null;
        if (xVar2 != null) {
            xVar = xVar2;
        } else if (this.f47241d0 != null) {
            mediaFormat.getClass();
            String str = xVar.f3586s;
            int i11 = xVar.K;
            if ("audio/raw".equals(str)) {
                i10 = xVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e2.n0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i10 = 2;
            }
            b2.w wVar = new b2.w();
            wVar.f3533r = b2.w0.n("audio/raw");
            wVar.L = i10;
            wVar.M = xVar.N;
            wVar.N = xVar.O;
            wVar.f3526k = xVar.f3579l;
            wVar.f3519a = xVar.f3571a;
            wVar.f3520b = xVar.f3572b;
            wVar.f3521c = f9.i0.u(xVar.f3573c);
            wVar.d = xVar.d;
            wVar.e = xVar.e;
            wVar.f3522f = xVar.f3574f;
            wVar.J = mediaFormat.getInteger("channel-count");
            wVar.K = mediaFormat.getInteger("sample-rate");
            xVar = new b2.x(wVar);
            boolean z11 = this.f16316e1;
            int i12 = xVar.K;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f16317f1) {
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
            a0 a0Var = this.f16313b1;
            if (i14 >= 29) {
                if (this.f47261y0) {
                    q1 q1Var = this.d;
                    q1Var.getClass();
                    if (q1Var.f13714a != 0) {
                        q1 q1Var2 = this.d;
                        q1Var2.getClass();
                        int i15 = q1Var2.f13714a;
                        u0 u0Var = (u0) a0Var;
                        u0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        yb.p(z10);
                        u0Var.f16290i = i15;
                    }
                }
                u0 u0Var2 = (u0) a0Var;
                u0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                yb.p(z10);
                u0Var2.f16290i = 0;
            }
            ((u0) a0Var).c(xVar, iArr);
        } catch (w e) {
            throw d(e, e.f16308a, false, 5001);
        }
    }

    @Override
    public final void g0() {
        this.f16313b1.getClass();
    }

    @Override
    public final b2.a1 h() {
        return ((u0) this.f16313b1).f16304x;
    }

    @Override
    public final void i0() {
        ((u0) this.f16313b1).E = true;
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            u0 u0Var = (u0) this.f16313b1;
            if (u0Var.p()) {
                if (u0Var.L && !u0Var.n()) {
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
        this.f16326p1 = -9223372036854775807L;
        if (this.f16319h1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.f(i10);
            return true;
        }
        a0 a0Var = this.f16313b1;
        if (z10) {
            if (lVar != null) {
                lVar.f(i10);
            }
            this.O0.f13516f += i12;
            ((u0) a0Var).E = true;
            return true;
        }
        try {
            if (((u0) a0Var).m(j12, i12, byteBuffer)) {
                if (lVar != null) {
                    lVar.f(i10);
                }
                this.O0.e += i12;
                return true;
            }
            this.f16326p1 = j12;
            return false;
        } catch (x e) {
            b2.x xVar2 = this.f16318g1;
            if (this.f47261y0) {
                q1 q1Var = this.d;
                q1Var.getClass();
                if (q1Var.f13714a != 0) {
                    i14 = 5004;
                    throw d(e, xVar2, e.f16310a, i14);
                }
            }
            i14 = 5001;
            throw d(e, xVar2, e.f16310a, i14);
        } catch (z e10) {
            if (this.f47261y0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f13714a != 0) {
                    i13 = 5003;
                    throw d(e10, xVar, e10.f16331b, i13);
                }
            }
            i13 = 5002;
            throw d(e10, xVar, e10.f16331b, i13);
        }
    }

    @Override
    public final boolean m() {
        return ((u0) this.f16313b1).n();
    }

    @Override
    public final void n() {
        rf.b bVar = this.f16312a1;
        this.f16322k1 = true;
        this.f16318g1 = null;
        this.f16326p1 = -9223372036854775807L;
        this.f16323m1 = false;
        try {
            ((u0) this.f16313b1).f();
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
        rf.b bVar = this.f16312a1;
        Handler handler = (Handler) bVar.f47332b;
        if (handler != null) {
            handler.post(new s(bVar, obj, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.f13715b;
        a0 a0Var = this.f16313b1;
        if (z12) {
            u0 u0Var = (u0) a0Var;
            yb.p(u0Var.P);
            if (!u0Var.V) {
                u0Var.V = true;
                u0Var.v();
            }
        } else {
            u0 u0Var2 = (u0) a0Var;
            if (u0Var2.V) {
                u0Var2.V = false;
                u0Var2.v();
            }
        }
        j2.j jVar = this.f13493f;
        jVar.getClass();
        u0 u0Var3 = (u0) a0Var;
        u0Var3.f16294m = jVar;
        e2.g0 g0Var = this.h;
        g0Var.getClass();
        ((l0) u0Var3.f16299r).f16208g = g0Var;
        u0Var3.f16295n = new a4.l(this, 26);
    }

    @Override
    public final void o0() {
        int i10;
        try {
            ((u0) this.f16313b1).t();
            long j10 = this.P0.f47237f;
            if (j10 != -9223372036854775807L) {
                this.f16326p1 = j10;
            }
        } catch (z e) {
            if (this.f47261y0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw d(e, e.f16332c, e.f16331b, i10);
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((u0) this.f16313b1).f();
        this.f16320i1 = j10;
        this.f16326p1 = -9223372036854775807L;
        this.l1 = false;
        this.f16323m1 = false;
        this.f16321j1 = true;
    }

    @Override
    public final void q() {
        r2.j jVar;
        ((l0) ((u0) this.f16313b1).f16299r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f16314c1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        a0 a0Var = this.f16313b1;
        this.l1 = false;
        this.f16323m1 = false;
        this.f16326p1 = -9223372036854775807L;
        try {
            this.f47261y0 = false;
            p0();
            n0();
            ic.a.B(this.X, null);
            this.X = null;
        } finally {
            if (this.f16322k1) {
                this.f16322k1 = false;
                ((u0) a0Var).w();
            }
        }
    }

    @Override
    public final void s() {
        ((u0) this.f16313b1).r();
        this.f16325o1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f16325o1 = false;
        ((u0) this.f16313b1).q();
        this.f16323m1 = false;
    }

    @Override
    public final boolean y0(b2.x xVar) {
        q1 q1Var = this.d;
        q1Var.getClass();
        if (q1Var.f13714a != 0) {
            int D0 = D0(xVar);
            if ((D0 & 512) != 0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f13714a == 2 || (D0 & 1024) != 0 || (xVar.N == 0 && xVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((u0) this.f16313b1).j(xVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(r2.i r18, b2.x r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.x0.z0(r2.i, b2.x):int");
    }

    @Override
    public final i2.x0 i() {
        return this;
    }
}
