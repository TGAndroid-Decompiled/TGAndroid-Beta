package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import bi.q7;
import e9.x1;
import i2.q1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ji.v2;
import v7.u6;
public final class v0 extends r2.r implements i2.w0 {
    public final Context Z0;
    public final qf.b f14026a1;
    public final z f14027b1;
    public final r2.j f14028c1;
    public int f14029d1;
    public boolean f14030e1;
    public boolean f14031f1;
    public b2.x f14032g1;
    public b2.x f14033h1;
    public long f14034i1;
    public boolean f14035j1;
    public boolean f14036k1;
    public boolean l1;
    public boolean f14037m1;
    public int f14038n1;
    public boolean f14039o1;
    public long f14040p1;

    public v0(Context context, r2.k kVar, Handler handler, i2.b0 b0Var, z zVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        r2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new r2.j();
        } else {
            jVar = null;
        }
        this.Z0 = context.getApplicationContext();
        this.f14027b1 = zVar;
        this.f14028c1 = jVar;
        this.f14038n1 = -1000;
        this.f14026a1 = new qf.b(handler, b0Var);
        this.f14040p1 = -9223372036854775807L;
    }

    public final int D0(b2.x xVar) {
        g a2;
        int i10;
        s0 s0Var = (s0) this.f14027b1;
        if (s0Var.X) {
            a2 = g.d;
        } else {
            l b10 = ((j0) s0Var.f14012r).b(s0Var.i(xVar));
            ?? obj = new Object();
            obj.f2637a = b10.f13950a;
            obj.f2638b = b10.f13951b;
            obj.f2639c = b10.f13952c;
            a2 = obj.a();
        }
        if (!a2.f13883a) {
            return 0;
        }
        if (a2.f13884b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (a2.f13885c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int E0(r2.o oVar, b2.x xVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f43603a) && Build.VERSION.SDK_INT == 23 && !e2.m0.P(this.Z0)) {
            return -1;
        }
        return xVar.f2524t;
    }

    public final void F0() {
        l();
        long h = ((s0) this.f14027b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f14035j1) {
                h = Math.max(this.f14034i1, h);
            }
            this.f14034i1 = h;
            this.f14035j1 = false;
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
        if (E0(oVar, xVar2) > this.f14029d1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f43603a;
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
        x1 g10;
        r2.o oVar;
        if (xVar.f2523s == null) {
            g10 = x1.e;
        } else {
            if (((s0) this.f14027b1).j(xVar) != 0) {
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
        HashMap hashMap = r2.w.f43648a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new q7(new org.telegram.ui.web.o0(1, this.Z0, xVar), 3));
        return arrayList;
    }

    @Override
    public final long R(long j10, long j11, boolean z10) {
        boolean z11;
        float f7;
        s0 s0Var = (s0) this.f14027b1;
        if (s0Var.n() && this.f14040p1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f14039o1) {
            if (z11 || this.K0) {
                return 1000000L;
            }
        } else {
            long g10 = s0Var.g();
            if (this.f14037m1 && z11 && g10 != -9223372036854775807L) {
                float min = (float) Math.min(g10, this.f14040p1 - j10);
                if (h() != null) {
                    f7 = h().f2077a;
                } else {
                    f7 = 1.0f;
                }
                return Math.max(10000L, (min / f7) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final com.google.firebase.messaging.m T(r2.o r17, b2.x r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: k2.v0.T(r2.o, b2.x, android.media.MediaCrypto, float):com.google.firebase.messaging.m");
    }

    @Override
    public final void U(h2.h hVar) {
        b2.x xVar;
        p0 p0Var;
        if (Build.VERSION.SDK_INT >= 29 && (xVar = hVar.f10328a) != null && Objects.equals(xVar.f2523s, "audio/opus") && this.f43643y0) {
            ByteBuffer byteBuffer = hVar.f10331f;
            byteBuffer.getClass();
            b2.x xVar2 = hVar.f10328a;
            xVar2.getClass();
            int i10 = xVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                s0 s0Var = (s0) this.f14027b1;
                h0 h0Var = s0Var.f14014t;
                if (h0Var != null && h0Var.c() && (p0Var = s0Var.f14010p) != null && ((o) p0Var.e).f13973k) {
                    s0Var.f14014t.d(i10, i11);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f10923n == 2) {
            F0();
        }
        return this.f14034i1;
    }

    @Override
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        qf.b bVar = this.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
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
    public final void b0(long j10, long j11, String str) {
        qf.b bVar = this.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new a3.h0(bVar, str, j10, j11, 2));
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        b2.a1 a1Var;
        r2.j jVar;
        z zVar = this.f14027b1;
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
                                        ((s0) zVar).y((p) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    s0 s0Var = (s0) zVar;
                                    s0Var.getClass();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (s0Var.U != intValue) {
                                        s0Var.U = intValue;
                                        s0Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((s0) zVar).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f14028c1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            s0 s0Var2 = (s0) zVar;
                            s0Var2.f14018y = ((Boolean) obj).booleanValue();
                            if (s0Var2.D()) {
                                a1Var = b2.a1.d;
                            } else {
                                a1Var = s0Var2.f14017x;
                            }
                            q0 q0Var = new q0(a1Var, -9223372036854775807L, -9223372036854775807L);
                            if (s0Var2.p()) {
                                s0Var2.v = q0Var;
                                return;
                            } else {
                                s0Var2.f14016w = q0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f14038n1 = ((Integer) obj).intValue();
                        r2.l lVar = this.f43623d0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f14038n1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    s0 s0Var3 = (s0) zVar;
                    s0Var3.T = audioDeviceInfo;
                    h0 h0Var = s0Var3.f14014t;
                    if (h0Var != null) {
                        h0Var.f13893a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                b2.g gVar = (b2.g) obj;
                gVar.getClass();
                ((s0) zVar).A(gVar);
                return;
            }
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            s0 s0Var4 = (s0) zVar;
            if (!s0Var4.f14015u.equals(fVar)) {
                s0Var4.f14015u = fVar;
                if (!s0Var4.V) {
                    s0Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        s0 s0Var5 = (s0) zVar;
        if (s0Var5.H != floatValue) {
            s0Var5.H = floatValue;
            if (s0Var5.p()) {
                s0Var5.f14014t.f13893a.setVolume(s0Var5.H);
            }
        }
    }

    @Override
    public final void c0(i2.c cVar) {
        qf.b bVar = this.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new v2(6, bVar, cVar));
        }
    }

    @Override
    public final void d0(String str) {
        qf.b bVar = this.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new v2(5, bVar, str));
        }
    }

    @Override
    public final i2.f e0(qf.b bVar) {
        b2.x xVar = (b2.x) bVar.f43098c;
        xVar.getClass();
        this.f14032g1 = xVar;
        i2.f e02 = super.e0(bVar);
        qf.b bVar2 = this.f14026a1;
        Handler handler = (Handler) bVar2.f43097b;
        if (handler != null) {
            handler.post(new hg.t(bVar2, xVar, e02, 20));
        }
        return e02;
    }

    @Override
    public final void f(b2.a1 a1Var) {
        ((s0) this.f14027b1).C(a1Var);
    }

    @Override
    public final void f0(b2.x xVar, MediaFormat mediaFormat) {
        int i10;
        b2.x xVar2 = this.f14033h1;
        boolean z10 = true;
        int[] iArr = null;
        if (xVar2 != null) {
            xVar = xVar2;
        } else if (this.f43623d0 != null) {
            mediaFormat.getClass();
            String str = xVar.f2523s;
            int i11 = xVar.K;
            if ("audio/raw".equals(str)) {
                i10 = xVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e2.m0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i10 = 2;
            }
            b2.w wVar = new b2.w();
            wVar.f2470r = b2.w0.n("audio/raw");
            wVar.L = i10;
            wVar.M = xVar.N;
            wVar.N = xVar.O;
            wVar.f2463k = xVar.f2516l;
            wVar.f2456a = xVar.f2508a;
            wVar.f2457b = xVar.f2509b;
            wVar.f2458c = e9.n0.u(xVar.f2510c);
            wVar.d = xVar.d;
            wVar.e = xVar.e;
            wVar.f2459f = xVar.f2511f;
            wVar.J = mediaFormat.getInteger("channel-count");
            wVar.K = mediaFormat.getInteger("sample-rate");
            xVar = new b2.x(wVar);
            boolean z11 = this.f14030e1;
            int i12 = xVar.K;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f14031f1) {
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
            z zVar = this.f14027b1;
            if (i14 >= 29) {
                if (this.f43643y0) {
                    q1 q1Var = this.d;
                    q1Var.getClass();
                    if (q1Var.f11147a != 0) {
                        q1 q1Var2 = this.d;
                        q1Var2.getClass();
                        int i15 = q1Var2.f11147a;
                        s0 s0Var = (s0) zVar;
                        s0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        u6.p(z10);
                        s0Var.f14003i = i15;
                    }
                }
                s0 s0Var2 = (s0) zVar;
                s0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                u6.p(z10);
                s0Var2.f14003i = 0;
            }
            ((s0) zVar).c(xVar, iArr);
        } catch (v e) {
            throw d(e, e.f14025a, false, 5001);
        }
    }

    @Override
    public final void g0() {
        this.f14027b1.getClass();
    }

    @Override
    public final b2.a1 h() {
        return ((s0) this.f14027b1).f14017x;
    }

    @Override
    public final void i0() {
        ((s0) this.f14027b1).E = true;
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            s0 s0Var = (s0) this.f14027b1;
            if (s0Var.p()) {
                if (s0Var.L && !s0Var.n()) {
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
        this.f14040p1 = -9223372036854775807L;
        if (this.f14033h1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.e(i10);
            return true;
        }
        z zVar = this.f14027b1;
        if (z10) {
            if (lVar != null) {
                lVar.e(i10);
            }
            this.O0.f10947f += i12;
            ((s0) zVar).E = true;
            return true;
        }
        try {
            if (((s0) zVar).m(j12, i12, byteBuffer)) {
                if (lVar != null) {
                    lVar.e(i10);
                }
                this.O0.e += i12;
                return true;
            }
            this.f14040p1 = j12;
            return false;
        } catch (w e) {
            b2.x xVar2 = this.f14032g1;
            if (this.f43643y0) {
                q1 q1Var = this.d;
                q1Var.getClass();
                if (q1Var.f11147a != 0) {
                    i14 = 5004;
                    throw d(e, xVar2, e.f14041a, i14);
                }
            }
            i14 = 5001;
            throw d(e, xVar2, e.f14041a, i14);
        } catch (y e7) {
            if (this.f43643y0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f11147a != 0) {
                    i13 = 5003;
                    throw d(e7, xVar, e7.f14060b, i13);
                }
            }
            i13 = 5002;
            throw d(e7, xVar, e7.f14060b, i13);
        }
    }

    @Override
    public final boolean m() {
        return ((s0) this.f14027b1).n();
    }

    @Override
    public final void n() {
        qf.b bVar = this.f14026a1;
        this.f14036k1 = true;
        this.f14032g1 = null;
        this.f14040p1 = -9223372036854775807L;
        this.f14037m1 = false;
        try {
            ((s0) this.f14027b1).f();
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
        qf.b bVar = this.f14026a1;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new r(bVar, obj, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.f11148b;
        z zVar = this.f14027b1;
        if (z12) {
            s0 s0Var = (s0) zVar;
            u6.p(s0Var.P);
            if (!s0Var.V) {
                s0Var.V = true;
                s0Var.v();
            }
        } else {
            s0 s0Var2 = (s0) zVar;
            if (s0Var2.V) {
                s0Var2.V = false;
                s0Var2.v();
            }
        }
        j2.k kVar = this.f10922f;
        kVar.getClass();
        s0 s0Var3 = (s0) zVar;
        s0Var3.f14007m = kVar;
        e2.g0 g0Var = this.h;
        g0Var.getClass();
        ((j0) s0Var3.f14012r).f13921g = g0Var;
        s0Var3.f14008n = new a6.m(this, 28);
    }

    @Override
    public final void o0() {
        int i10;
        try {
            ((s0) this.f14027b1).t();
            long j10 = this.P0.f43619f;
            if (j10 != -9223372036854775807L) {
                this.f14040p1 = j10;
            }
        } catch (y e) {
            if (this.f43643y0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw d(e, e.f14061c, e.f14060b, i10);
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((s0) this.f14027b1).f();
        this.f14034i1 = j10;
        this.f14040p1 = -9223372036854775807L;
        this.l1 = false;
        this.f14037m1 = false;
        this.f14035j1 = true;
    }

    @Override
    public final void q() {
        r2.j jVar;
        ((j0) ((s0) this.f14027b1).f14012r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f14028c1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        z zVar = this.f14027b1;
        this.l1 = false;
        this.f14037m1 = false;
        this.f14040p1 = -9223372036854775807L;
        try {
            this.f43643y0 = false;
            p0();
            n0();
            i2.d.D(this.X, null);
            this.X = null;
        } finally {
            if (this.f14036k1) {
                this.f14036k1 = false;
                ((s0) zVar).w();
            }
        }
    }

    @Override
    public final void s() {
        ((s0) this.f14027b1).r();
        this.f14039o1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f14039o1 = false;
        ((s0) this.f14027b1).q();
        this.f14037m1 = false;
    }

    @Override
    public final boolean y0(b2.x xVar) {
        q1 q1Var = this.d;
        q1Var.getClass();
        if (q1Var.f11147a != 0) {
            int D0 = D0(xVar);
            if ((D0 & 512) != 0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f11147a == 2 || (D0 & 1024) != 0 || (xVar.N == 0 && xVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((s0) this.f14027b1).j(xVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(r2.i r18, b2.x r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.v0.z0(r2.i, b2.x):int");
    }

    @Override
    public final i2.w0 i() {
        return this;
    }
}
