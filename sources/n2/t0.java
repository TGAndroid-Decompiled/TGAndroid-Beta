package n2;

import a8.ia;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import bi.h4;
import bi.s5;
import h9.t1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l2.q1;
import li.j3;
import org.telegram.ui.Cells.f1;
public final class t0 extends u2.r implements l2.w0 {
    public final Context Z0;
    public final j2.n f20303a1;
    public final x f20304b1;
    public final u2.j f20305c1;
    public int f20306d1;
    public boolean f20307e1;
    public boolean f20308f1;
    public e2.u f20309g1;
    public e2.u f20310h1;
    public long f20311i1;
    public boolean f20312j1;
    public boolean f20313k1;
    public boolean l1;
    public boolean f20314m1;
    public int n1;
    public boolean f20315o1;
    public long f20316p1;

    public t0(Context context, u2.k kVar, Handler handler, l2.c0 c0Var, x xVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        u2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new u2.j();
        } else {
            jVar = null;
        }
        this.Z0 = context.getApplicationContext();
        this.f20304b1 = xVar;
        this.f20305c1 = jVar;
        this.n1 = -1000;
        this.f20303a1 = new j2.n(handler, c0Var);
        this.f20316p1 = -9223372036854775807L;
    }

    public final int D0(e2.u uVar) {
        f a10;
        int i7;
        q0 q0Var = (q0) this.f20304b1;
        if (q0Var.X) {
            a10 = f.d;
        } else {
            k b10 = ((h0) q0Var.f20289r).b(q0Var.i(uVar));
            ?? obj = new Object();
            obj.f15410a = b10.f20228a;
            obj.f15411b = b10.f20229b;
            obj.f15412c = b10.f20230c;
            a10 = obj.a();
        }
        if (!a10.f20157a) {
            return 0;
        }
        if (a10.f20158b) {
            i7 = 1536;
        } else {
            i7 = 512;
        }
        if (a10.f20159c) {
            return i7 | 2048;
        }
        return i7;
    }

    public final int E0(u2.o oVar, e2.u uVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f56260a) && Build.VERSION.SDK_INT == 23 && !h2.m0.P(this.Z0)) {
            return -1;
        }
        return uVar.f10616t;
    }

    public final void F0() {
        l();
        long h = ((q0) this.f20304b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f20312j1) {
                h = Math.max(this.f20311i1, h);
            }
            this.f20311i1 = h;
            this.f20312j1 = false;
        }
    }

    @Override
    public final l2.e H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z9) {
        int i7;
        l2.e b10 = oVar.b(uVar, uVar2);
        int i10 = b10.f17794e;
        if (this.X == null && y0(uVar2)) {
            i10 |= 32768;
        }
        if (E0(oVar, uVar2) > this.f20306d1) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = oVar.f56260a;
        if (i11 != 0) {
            i7 = 0;
        } else {
            i7 = b10.d;
        }
        return new l2.e(str, uVar, uVar2, i7, i11);
    }

    @Override
    public final float P(float f10, e2.u uVar, e2.u[] uVarArr) {
        int i7 = -1;
        for (e2.u uVar2 : uVarArr) {
            int i10 = uVar2.L;
            if (i10 != -1) {
                i7 = Math.max(i7, i10);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return i7 * f10;
    }

    @Override
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z9) {
        t1 g10;
        u2.o oVar;
        if (uVar.f10615s == null) {
            g10 = t1.f14397e;
        } else {
            if (((q0) this.f20304b1).j(uVar) != 0) {
                List e10 = u2.w.e("audio/raw", false, false);
                if (e10.isEmpty()) {
                    oVar = null;
                } else {
                    oVar = (u2.o) e10.get(0);
                }
                if (oVar != null) {
                    g10 = h9.i0.u(oVar);
                }
            }
            g10 = u2.w.g(iVar, uVar, z9, false);
        }
        HashMap hashMap = u2.w.f56307a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new s5(new org.telegram.ui.web.a0(10, this.Z0, uVar), 6));
        return arrayList;
    }

    @Override
    public final long R(long j3, long j10, boolean z9) {
        boolean z10;
        float f10;
        q0 q0Var = (q0) this.f20304b1;
        if (q0Var.n() && this.f20316p1 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f20315o1) {
            if (z10 || this.K0) {
                return 1000000L;
            }
        } else {
            long g10 = q0Var.g();
            if (this.f20314m1 && z10 && g10 != -9223372036854775807L) {
                float min = (float) Math.min(g10, this.f20316p1 - j3);
                if (j() != null) {
                    f10 = j().f10638a;
                } else {
                    f10 = 1.0f;
                }
                return Math.max(10000L, (min / f10) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final a8.b8 T(u2.o r17, e2.u r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.t0.T(u2.o, e2.u, android.media.MediaCrypto, float):a8.b8");
    }

    @Override
    public final void U(k2.h hVar) {
        e2.u uVar;
        n0 n0Var;
        if (Build.VERSION.SDK_INT >= 29 && (uVar = hVar.f17173a) != null && Objects.equals(uVar.f10615s, "audio/opus") && this.f56302y0) {
            ByteBuffer byteBuffer = hVar.f17177f;
            byteBuffer.getClass();
            e2.u uVar2 = hVar.f17173a;
            uVar2.getClass();
            int i7 = uVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                q0 q0Var = (q0) this.f20304b1;
                f0 f0Var = q0Var.f20291t;
                if (f0Var != null && f0Var.c() && (n0Var = q0Var.f20287p) != null && ((n) n0Var.f20257e).f20253k) {
                    q0Var.f20291t.d(i7, i10);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f17764n == 2) {
            F0();
        }
        return this.f20311i1;
    }

    @Override
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        j2.n nVar = this.f20303a1;
        Handler handler = (Handler) nVar.f16456b;
        if (handler != null) {
            handler.post(new p(nVar, exc, 0));
        }
    }

    @Override
    public final boolean b() {
        boolean z9 = this.l1;
        this.l1 = false;
        return z9;
    }

    @Override
    public final void b0(long j3, String str, long j10) {
        j2.n nVar = this.f20303a1;
        Handler handler = (Handler) nVar.f16456b;
        if (handler != null) {
            handler.post(new h4(nVar, str, j3, j10, 3));
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        e2.w0 w0Var;
        u2.j jVar;
        x xVar = this.f20304b1;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 6) {
                    if (i7 != 12) {
                        if (i7 != 16) {
                            if (i7 != 9) {
                                if (i7 != 10) {
                                    if (i7 != 19) {
                                        if (i7 != 20) {
                                            super.c(i7, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        ((q0) xVar).y((o) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    q0 q0Var = (q0) xVar;
                                    q0Var.getClass();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (q0Var.U != intValue) {
                                        q0Var.U = intValue;
                                        q0Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((q0) xVar).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f20305c1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            q0 q0Var2 = (q0) xVar;
                            q0Var2.f20295y = ((Boolean) obj).booleanValue();
                            if (q0Var2.D()) {
                                w0Var = e2.w0.d;
                            } else {
                                w0Var = q0Var2.f20294x;
                            }
                            o0 o0Var = new o0(w0Var, -9223372036854775807L, -9223372036854775807L);
                            if (q0Var2.p()) {
                                q0Var2.v = o0Var;
                                return;
                            } else {
                                q0Var2.f20293w = o0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.n1 = ((Integer) obj).intValue();
                        u2.l lVar = this.f56282d0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.n1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    q0 q0Var3 = (q0) xVar;
                    q0Var3.T = audioDeviceInfo;
                    f0 f0Var = q0Var3.f20291t;
                    if (f0Var != null) {
                        f0Var.f20162a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                e2.f fVar = (e2.f) obj;
                fVar.getClass();
                ((q0) xVar).A(fVar);
                return;
            }
            e2.e eVar = (e2.e) obj;
            eVar.getClass();
            q0 q0Var4 = (q0) xVar;
            if (!q0Var4.f20292u.equals(eVar)) {
                q0Var4.f20292u = eVar;
                if (!q0Var4.V) {
                    q0Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        q0 q0Var5 = (q0) xVar;
        if (q0Var5.H != floatValue) {
            q0Var5.H = floatValue;
            if (q0Var5.p()) {
                q0Var5.f20291t.f20162a.setVolume(q0Var5.H);
            }
        }
    }

    @Override
    public final void c0(l2.c cVar) {
        j2.n nVar = this.f20303a1;
        Handler handler = (Handler) nVar.f16456b;
        if (handler != null) {
            handler.post(new j3(10, nVar, cVar));
        }
    }

    @Override
    public final void d0(String str) {
        j2.n nVar = this.f20303a1;
        Handler handler = (Handler) nVar.f16456b;
        if (handler != null) {
            handler.post(new j3(9, nVar, str));
        }
    }

    @Override
    public final void e(e2.w0 w0Var) {
        ((q0) this.f20304b1).C(w0Var);
    }

    @Override
    public final l2.e e0(wf.b bVar) {
        e2.u uVar = (e2.u) bVar.f57656c;
        uVar.getClass();
        this.f20309g1 = uVar;
        l2.e e02 = super.e0(bVar);
        j2.n nVar = this.f20303a1;
        Handler handler = (Handler) nVar.f16456b;
        if (handler != null) {
            handler.post(new l2.z0(nVar, uVar, e02, 9));
        }
        return e02;
    }

    @Override
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        int i7;
        e2.u uVar2 = this.f20310h1;
        boolean z9 = true;
        int[] iArr = null;
        if (uVar2 != null) {
            uVar = uVar2;
        } else if (this.f56282d0 != null) {
            mediaFormat.getClass();
            String str = uVar.f10615s;
            int i10 = uVar.K;
            if ("audio/raw".equals(str)) {
                i7 = uVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i7 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i7 = h2.m0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i7 = 2;
            }
            e2.t tVar = new e2.t();
            tVar.f10563r = e2.s0.n("audio/raw");
            tVar.L = i7;
            tVar.M = uVar.N;
            tVar.N = uVar.O;
            tVar.f10556k = uVar.f10608l;
            tVar.f10548a = uVar.f10599a;
            tVar.f10549b = uVar.f10600b;
            tVar.f10550c = h9.i0.q(uVar.f10601c);
            tVar.d = uVar.d;
            tVar.f10551e = uVar.f10602e;
            tVar.f10552f = uVar.f10603f;
            tVar.J = mediaFormat.getInteger("channel-count");
            tVar.K = mediaFormat.getInteger("sample-rate");
            uVar = new e2.u(tVar);
            boolean z10 = this.f20307e1;
            int i11 = uVar.K;
            if (z10 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f20308f1) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                if (i11 == 8) {
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
            int i13 = Build.VERSION.SDK_INT;
            x xVar = this.f20304b1;
            if (i13 >= 29) {
                if (this.f56302y0) {
                    q1 q1Var = this.d;
                    q1Var.getClass();
                    if (q1Var.f18000a != 0) {
                        q1 q1Var2 = this.d;
                        q1Var2.getClass();
                        int i14 = q1Var2.f18000a;
                        q0 q0Var = (q0) xVar;
                        q0Var.getClass();
                        if (i13 < 29) {
                            z9 = false;
                        }
                        ia.p(z9);
                        q0Var.f20280i = i14;
                    }
                }
                q0 q0Var2 = (q0) xVar;
                q0Var2.getClass();
                if (i13 < 29) {
                    z9 = false;
                }
                ia.p(z9);
                q0Var2.f20280i = 0;
            }
            ((q0) xVar).c(uVar, iArr);
        } catch (t e10) {
            throw d(e10, e10.f20302a, false, 5001);
        }
    }

    @Override
    public final void g0() {
        this.f20304b1.getClass();
    }

    @Override
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void i0() {
        ((q0) this.f20304b1).E = true;
    }

    @Override
    public final e2.w0 j() {
        return ((q0) this.f20304b1).f20294x;
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            q0 q0Var = (q0) this.f20304b1;
            if (q0Var.p()) {
                if (q0Var.L && !q0Var.n()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z9, boolean z10, e2.u uVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.f20316p1 = -9223372036854775807L;
        if (this.f20310h1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.c(i7);
            return true;
        }
        x xVar = this.f20304b1;
        if (z9) {
            if (lVar != null) {
                lVar.c(i7);
            }
            this.O0.f17780f += i11;
            ((q0) xVar).E = true;
            return true;
        }
        try {
            if (((q0) xVar).m(j11, i11, byteBuffer)) {
                if (lVar != null) {
                    lVar.c(i7);
                }
                this.O0.f17779e += i11;
                return true;
            }
            this.f20316p1 = j11;
            return false;
        } catch (u e10) {
            e2.u uVar2 = this.f20309g1;
            if (this.f56302y0) {
                q1 q1Var = this.d;
                q1Var.getClass();
                if (q1Var.f18000a != 0) {
                    i13 = 5004;
                    throw d(e10, uVar2, e10.f20317a, i13);
                }
            }
            i13 = 5001;
            throw d(e10, uVar2, e10.f20317a, i13);
        } catch (w e11) {
            if (this.f56302y0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f18000a != 0) {
                    i12 = 5003;
                    throw d(e11, uVar, e11.f20337b, i12);
                }
            }
            i12 = 5002;
            throw d(e11, uVar, e11.f20337b, i12);
        }
    }

    @Override
    public final boolean m() {
        return ((q0) this.f20304b1).n();
    }

    @Override
    public final void n() {
        j2.n nVar = this.f20303a1;
        this.f20313k1 = true;
        this.f20309g1 = null;
        this.f20316p1 = -9223372036854775807L;
        this.f20314m1 = false;
        try {
            ((q0) this.f20304b1).f();
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
    public final void o(boolean z9, boolean z10) {
        ?? obj = new Object();
        this.O0 = obj;
        j2.n nVar = this.f20303a1;
        Handler handler = (Handler) nVar.f16456b;
        if (handler != null) {
            handler.post(new q(nVar, obj, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z11 = q1Var.f18001b;
        x xVar = this.f20304b1;
        if (z11) {
            q0 q0Var = (q0) xVar;
            ia.p(q0Var.P);
            if (!q0Var.V) {
                q0Var.V = true;
                q0Var.v();
            }
        } else {
            q0 q0Var2 = (q0) xVar;
            if (q0Var2.V) {
                q0Var2.V = false;
                q0Var2.v();
            }
        }
        m2.j jVar = this.f17763f;
        jVar.getClass();
        q0 q0Var3 = (q0) xVar;
        q0Var3.f20284m = jVar;
        h2.g0 g0Var = this.h;
        g0Var.getClass();
        ((h0) q0Var3.f20289r).f20190g = g0Var;
        q0Var3.f20285n = new g6.d0(this, 20);
    }

    @Override
    public final void o0() {
        int i7;
        try {
            ((q0) this.f20304b1).t();
            long j3 = this.P0.f56278f;
            if (j3 != -9223372036854775807L) {
                this.f20316p1 = j3;
            }
        } catch (w e10) {
            if (this.f56302y0) {
                i7 = 5003;
            } else {
                i7 = 5002;
            }
            throw d(e10, e10.f20338c, e10.f20337b, i7);
        }
    }

    @Override
    public final void p(long j3, boolean z9, boolean z10) {
        super.p(j3, z9, z10);
        ((q0) this.f20304b1).f();
        this.f20311i1 = j3;
        this.f20316p1 = -9223372036854775807L;
        this.l1 = false;
        this.f20314m1 = false;
        this.f20312j1 = true;
    }

    @Override
    public final void q() {
        u2.j jVar;
        ((h0) ((q0) this.f20304b1).f20289r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f20305c1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        x xVar = this.f20304b1;
        this.l1 = false;
        this.f20314m1 = false;
        this.f20316p1 = -9223372036854775807L;
        try {
            this.f56302y0 = false;
            p0();
            n0();
            f1.B(this.X, null);
            this.X = null;
        } finally {
            if (this.f20313k1) {
                this.f20313k1 = false;
                ((q0) xVar).w();
            }
        }
    }

    @Override
    public final void s() {
        ((q0) this.f20304b1).r();
        this.f20315o1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f20315o1 = false;
        ((q0) this.f20304b1).q();
        this.f20314m1 = false;
    }

    @Override
    public final boolean y0(e2.u uVar) {
        q1 q1Var = this.d;
        q1Var.getClass();
        if (q1Var.f18000a != 0) {
            int D0 = D0(uVar);
            if ((D0 & 512) != 0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f18000a == 2 || (D0 & 1024) != 0 || (uVar.N == 0 && uVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((q0) this.f20304b1).j(uVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(u2.i r18, e2.u r19) {
        throw new UnsupportedOperationException("Method not decompiled: n2.t0.z0(u2.i, e2.u):int");
    }

    @Override
    public final l2.w0 h() {
        return this;
    }
}
