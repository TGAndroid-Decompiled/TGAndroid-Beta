package n2;

import a8.la;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import di.s4;
import h9.t1;
import hi.w4;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l2.m1;
import org.telegram.ui.wc1;
public final class u0 extends u2.r implements l2.t0 {
    public final Context f21272a1;
    public final k8.a f21273b1;
    public final x f21274c1;
    public final u2.j f21275d1;
    public int f21276e1;
    public boolean f21277f1;
    public boolean f21278g1;
    public e2.u f21279h1;
    public e2.u f21280i1;
    public long f21281j1;
    public boolean f21282k1;
    public boolean l1;
    public boolean f21283m1;
    public boolean n1;
    public int f21284o1;
    public boolean f21285p1;
    public long f21286q1;

    public u0(Context context, u2.k kVar, Handler handler, l2.z zVar, x xVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        u2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new u2.j();
        } else {
            jVar = null;
        }
        this.f21272a1 = context.getApplicationContext();
        this.f21274c1 = xVar;
        this.f21275d1 = jVar;
        this.f21284o1 = -1000;
        this.f21273b1 = new k8.a(handler, zVar);
        this.f21286q1 = -9223372036854775807L;
    }

    public final int D0(e2.u uVar) {
        f a10;
        int i7;
        r0 r0Var = (r0) this.f21274c1;
        if (r0Var.X) {
            a10 = f.d;
        } else {
            k b10 = ((i0) r0Var.f21259r).b(r0Var.i(uVar));
            ?? obj = new Object();
            obj.f16208a = b10.f21193a;
            obj.f16209b = b10.f21194b;
            obj.f16210c = b10.f21195c;
            a10 = obj.a();
        }
        if (!a10.f21121a) {
            return 0;
        }
        if (a10.f21122b) {
            i7 = 1536;
        } else {
            i7 = 512;
        }
        if (a10.f21123c) {
            return i7 | 2048;
        }
        return i7;
    }

    public final int E0(u2.o oVar, e2.u uVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f58383a) && Build.VERSION.SDK_INT == 23 && !h2.l0.P(this.f21272a1)) {
            return -1;
        }
        return uVar.f10799t;
    }

    public final void F0() {
        l();
        long h = ((r0) this.f21274c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f21282k1) {
                h = Math.max(this.f21281j1, h);
            }
            this.f21281j1 = h;
            this.f21282k1 = false;
        }
    }

    @Override
    public final l2.e H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z10) {
        int i7;
        l2.e b10 = oVar.b(uVar, uVar2);
        int i10 = b10.f19323e;
        if (this.Y == null && y0(uVar2)) {
            i10 |= 32768;
        }
        if (E0(oVar, uVar2) > this.f21276e1) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = oVar.f58383a;
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
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z10) {
        t1 g10;
        u2.o oVar;
        if (uVar.f10798s == null) {
            g10 = t1.f14103e;
        } else {
            if (((r0) this.f21274c1).j(uVar) != 0) {
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
            g10 = u2.w.g(iVar, uVar, z10, false);
        }
        HashMap hashMap = u2.w.f58430a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new s4(new wc1(14, this.f21272a1, uVar), 4));
        return arrayList;
    }

    @Override
    public final long R(long j3, long j10, boolean z10) {
        boolean z11;
        float f10;
        r0 r0Var = (r0) this.f21274c1;
        if (r0Var.n() && this.f21286q1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f21285p1) {
            if (z11 || this.L0) {
                return 1000000L;
            }
        } else {
            long g10 = r0Var.g();
            if (this.n1 && z11 && g10 != -9223372036854775807L) {
                float min = (float) Math.min(g10, this.f21286q1 - j3);
                if (j() != null) {
                    f10 = j().f10821a;
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
        throw new UnsupportedOperationException("Method not decompiled: n2.u0.T(u2.o, e2.u, android.media.MediaCrypto, float):a8.b8");
    }

    @Override
    public final void U(k2.h hVar) {
        e2.u uVar;
        o0 o0Var;
        if (Build.VERSION.SDK_INT >= 29 && (uVar = hVar.f18156a) != null && Objects.equals(uVar.f10798s, "audio/opus") && this.f58426z0) {
            ByteBuffer byteBuffer = hVar.f18160f;
            byteBuffer.getClass();
            e2.u uVar2 = hVar.f18156a;
            uVar2.getClass();
            int i7 = uVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                r0 r0Var = (r0) this.f21274c1;
                g0 g0Var = r0Var.f21261t;
                if (g0Var != null && g0Var.c() && (o0Var = r0Var.f21257p) != null && ((n) o0Var.f21224e).f21218k) {
                    r0Var.f21261t.d(i7, i10);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f19288n == 2) {
            F0();
        }
        return this.f21281j1;
    }

    @Override
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        k8.a aVar = this.f21273b1;
        Handler handler = (Handler) aVar.f18214b;
        if (handler != null) {
            handler.post(new p(aVar, exc, 0));
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.f21283m1;
        this.f21283m1 = false;
        return z10;
    }

    @Override
    public final void b0(long j3, String str, long j10) {
        k8.a aVar = this.f21273b1;
        Handler handler = (Handler) aVar.f18214b;
        if (handler != null) {
            handler.post(new d3.e0(aVar, str, j3, j10, 3));
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        e2.w0 w0Var;
        u2.j jVar;
        x xVar = this.f21274c1;
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
                                        ((r0) xVar).y((o) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    r0 r0Var = (r0) xVar;
                                    r0Var.getClass();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (r0Var.U != intValue) {
                                        r0Var.U = intValue;
                                        r0Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((r0) xVar).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f21275d1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            r0 r0Var2 = (r0) xVar;
                            r0Var2.f21265y = ((Boolean) obj).booleanValue();
                            if (r0Var2.D()) {
                                w0Var = e2.w0.d;
                            } else {
                                w0Var = r0Var2.f21264x;
                            }
                            p0 p0Var = new p0(w0Var, -9223372036854775807L, -9223372036854775807L);
                            if (r0Var2.p()) {
                                r0Var2.v = p0Var;
                                return;
                            } else {
                                r0Var2.f21263w = p0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f21284o1 = ((Integer) obj).intValue();
                        u2.l lVar = this.f58406e0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f21284o1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    r0 r0Var3 = (r0) xVar;
                    r0Var3.T = audioDeviceInfo;
                    g0 g0Var = r0Var3.f21261t;
                    if (g0Var != null) {
                        g0Var.f21131a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                e2.f fVar = (e2.f) obj;
                fVar.getClass();
                ((r0) xVar).A(fVar);
                return;
            }
            e2.e eVar = (e2.e) obj;
            eVar.getClass();
            r0 r0Var4 = (r0) xVar;
            if (!r0Var4.f21262u.equals(eVar)) {
                r0Var4.f21262u = eVar;
                if (!r0Var4.V) {
                    r0Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        r0 r0Var5 = (r0) xVar;
        if (r0Var5.H != floatValue) {
            r0Var5.H = floatValue;
            if (r0Var5.p()) {
                r0Var5.f21261t.f21131a.setVolume(r0Var5.H);
            }
        }
    }

    @Override
    public final void c0(l2.c cVar) {
        k8.a aVar = this.f21273b1;
        Handler handler = (Handler) aVar.f18214b;
        if (handler != null) {
            handler.post(new ji.i(26, aVar, cVar));
        }
    }

    @Override
    public final void d0(String str) {
        k8.a aVar = this.f21273b1;
        Handler handler = (Handler) aVar.f18214b;
        if (handler != null) {
            handler.post(new ji.i(25, aVar, str));
        }
    }

    @Override
    public final void e(e2.w0 w0Var) {
        ((r0) this.f21274c1).C(w0Var);
    }

    @Override
    public final l2.e e0(k8.a aVar) {
        e2.u uVar = (e2.u) aVar.f18215c;
        uVar.getClass();
        this.f21279h1 = uVar;
        l2.e e02 = super.e0(aVar);
        k8.a aVar2 = this.f21273b1;
        Handler handler = (Handler) aVar2.f18214b;
        if (handler != null) {
            handler.post(new kg.y(aVar2, uVar, e02, 13));
        }
        return e02;
    }

    @Override
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        int i7;
        e2.u uVar2 = this.f21280i1;
        boolean z10 = true;
        int[] iArr = null;
        if (uVar2 != null) {
            uVar = uVar2;
        } else if (this.f58406e0 != null) {
            mediaFormat.getClass();
            String str = uVar.f10798s;
            int i10 = uVar.K;
            if ("audio/raw".equals(str)) {
                i7 = uVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i7 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i7 = h2.l0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i7 = 2;
            }
            e2.t tVar = new e2.t();
            tVar.f10746r = e2.s0.n("audio/raw");
            tVar.L = i7;
            tVar.M = uVar.N;
            tVar.N = uVar.O;
            tVar.f10739k = uVar.f10791l;
            tVar.f10731a = uVar.f10782a;
            tVar.f10732b = uVar.f10783b;
            tVar.f10733c = h9.i0.q(uVar.f10784c);
            tVar.d = uVar.d;
            tVar.f10734e = uVar.f10785e;
            tVar.f10735f = uVar.f10786f;
            tVar.J = mediaFormat.getInteger("channel-count");
            tVar.K = mediaFormat.getInteger("sample-rate");
            uVar = new e2.u(tVar);
            boolean z11 = this.f21277f1;
            int i11 = uVar.K;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f21278g1) {
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
            x xVar = this.f21274c1;
            if (i13 >= 29) {
                if (this.f58426z0) {
                    m1 m1Var = this.d;
                    m1Var.getClass();
                    if (m1Var.f19481a != 0) {
                        m1 m1Var2 = this.d;
                        m1Var2.getClass();
                        int i14 = m1Var2.f19481a;
                        r0 r0Var = (r0) xVar;
                        r0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        la.p(z10);
                        r0Var.f21250i = i14;
                    }
                }
                r0 r0Var2 = (r0) xVar;
                r0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                la.p(z10);
                r0Var2.f21250i = 0;
            }
            ((r0) xVar).c(uVar, iArr);
        } catch (t e10) {
            throw d(e10, e10.f21268a, false, 5001);
        }
    }

    @Override
    public final void g0() {
        this.f21274c1.getClass();
    }

    @Override
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void i0() {
        ((r0) this.f21274c1).E = true;
    }

    @Override
    public final e2.w0 j() {
        return ((r0) this.f21274c1).f21264x;
    }

    @Override
    public final boolean l() {
        if (this.L0) {
            r0 r0Var = (r0) this.f21274c1;
            if (r0Var.p()) {
                if (r0Var.L && !r0Var.n()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z10, boolean z11, e2.u uVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.f21286q1 = -9223372036854775807L;
        if (this.f21280i1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.e(i7);
            return true;
        }
        x xVar = this.f21274c1;
        if (z10) {
            if (lVar != null) {
                lVar.e(i7);
            }
            this.P0.f19309f += i11;
            ((r0) xVar).E = true;
            return true;
        }
        try {
            if (((r0) xVar).m(j11, i11, byteBuffer)) {
                if (lVar != null) {
                    lVar.e(i7);
                }
                this.P0.f19308e += i11;
                return true;
            }
            this.f21286q1 = j11;
            return false;
        } catch (u e10) {
            e2.u uVar2 = this.f21279h1;
            if (this.f58426z0) {
                m1 m1Var = this.d;
                m1Var.getClass();
                if (m1Var.f19481a != 0) {
                    i13 = 5004;
                    throw d(e10, uVar2, e10.f21270a, i13);
                }
            }
            i13 = 5001;
            throw d(e10, uVar2, e10.f21270a, i13);
        } catch (w e11) {
            if (this.f58426z0) {
                m1 m1Var2 = this.d;
                m1Var2.getClass();
                if (m1Var2.f19481a != 0) {
                    i12 = 5003;
                    throw d(e11, uVar, e11.f21292b, i12);
                }
            }
            i12 = 5002;
            throw d(e11, uVar, e11.f21292b, i12);
        }
    }

    @Override
    public final boolean m() {
        return ((r0) this.f21274c1).n();
    }

    @Override
    public final void n() {
        k8.a aVar = this.f21273b1;
        this.l1 = true;
        this.f21279h1 = null;
        this.f21286q1 = -9223372036854775807L;
        this.n1 = false;
        try {
            ((r0) this.f21274c1).f();
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
        this.P0 = obj;
        k8.a aVar = this.f21273b1;
        Handler handler = (Handler) aVar.f18214b;
        if (handler != null) {
            handler.post(new q(aVar, obj, 1));
        }
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z12 = m1Var.f19482b;
        x xVar = this.f21274c1;
        if (z12) {
            r0 r0Var = (r0) xVar;
            la.p(r0Var.P);
            if (!r0Var.V) {
                r0Var.V = true;
                r0Var.v();
            }
        } else {
            r0 r0Var2 = (r0) xVar;
            if (r0Var2.V) {
                r0Var2.V = false;
                r0Var2.v();
            }
        }
        m2.i iVar = this.f19287f;
        iVar.getClass();
        r0 r0Var3 = (r0) xVar;
        r0Var3.f21254m = iVar;
        h2.g0 g0Var = this.h;
        g0Var.getClass();
        ((i0) r0Var3.f21259r).f21163g = g0Var;
        r0Var3.f21255n = new w4(this, 15);
    }

    @Override
    public final void o0() {
        int i7;
        try {
            ((r0) this.f21274c1).t();
            long j3 = this.Q0.f58401f;
            if (j3 != -9223372036854775807L) {
                this.f21286q1 = j3;
            }
        } catch (w e10) {
            if (this.f58426z0) {
                i7 = 5003;
            } else {
                i7 = 5002;
            }
            throw d(e10, e10.f21293c, e10.f21292b, i7);
        }
    }

    @Override
    public final void p(long j3, boolean z10, boolean z11) {
        super.p(j3, z10, z11);
        ((r0) this.f21274c1).f();
        this.f21281j1 = j3;
        this.f21286q1 = -9223372036854775807L;
        this.f21283m1 = false;
        this.n1 = false;
        this.f21282k1 = true;
    }

    @Override
    public final void q() {
        u2.j jVar;
        ((i0) ((r0) this.f21274c1).f21259r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f21275d1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        x xVar = this.f21274c1;
        this.f21283m1 = false;
        this.n1 = false;
        this.f21286q1 = -9223372036854775807L;
        try {
            this.f58426z0 = false;
            p0();
            n0();
            p5.c.w(this.Y, null);
            this.Y = null;
        } finally {
            if (this.l1) {
                this.l1 = false;
                ((r0) xVar).w();
            }
        }
    }

    @Override
    public final void s() {
        ((r0) this.f21274c1).r();
        this.f21285p1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f21285p1 = false;
        ((r0) this.f21274c1).q();
        this.n1 = false;
    }

    @Override
    public final boolean y0(e2.u uVar) {
        m1 m1Var = this.d;
        m1Var.getClass();
        if (m1Var.f19481a != 0) {
            int D0 = D0(uVar);
            if ((D0 & 512) != 0) {
                m1 m1Var2 = this.d;
                m1Var2.getClass();
                if (m1Var2.f19481a == 2 || (D0 & 1024) != 0 || (uVar.N == 0 && uVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((r0) this.f21274c1).j(uVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(u2.i r18, e2.u r19) {
        throw new UnsupportedOperationException("Method not decompiled: n2.u0.z0(u2.i, e2.u):int");
    }

    @Override
    public final l2.t0 h() {
        return this;
    }
}
