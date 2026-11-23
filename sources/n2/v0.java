package n2;

import a8.ma;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import di.s4;
import h9.s1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l2.n1;
import org.telegram.ui.uc1;
public final class v0 extends u2.r implements l2.u0 {
    public final Context f21338a1;
    public final jb.m f21339b1;
    public final x f21340c1;
    public final u2.j f21341d1;
    public int f21342e1;
    public boolean f21343f1;
    public boolean f21344g1;
    public e2.u f21345h1;
    public e2.u f21346i1;
    public long f21347j1;
    public boolean f21348k1;
    public boolean l1;
    public boolean f21349m1;
    public boolean n1;
    public int f21350o1;
    public boolean f21351p1;
    public long f21352q1;

    public v0(Context context, u2.k kVar, Handler handler, l2.a0 a0Var, x xVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        u2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new u2.j();
        } else {
            jVar = null;
        }
        this.f21338a1 = context.getApplicationContext();
        this.f21340c1 = xVar;
        this.f21341d1 = jVar;
        this.f21350o1 = -1000;
        this.f21339b1 = new jb.m(handler, a0Var);
        this.f21352q1 = -9223372036854775807L;
    }

    public final int D0(e2.u uVar) {
        f a10;
        int i7;
        s0 s0Var = (s0) this.f21340c1;
        if (s0Var.X) {
            a10 = f.d;
        } else {
            k b10 = ((j0) s0Var.f21325r).b(s0Var.i(uVar));
            ?? obj = new Object();
            obj.f16271a = b10.f21236a;
            obj.f16272b = b10.f21237b;
            obj.f16273c = b10.f21238c;
            a10 = obj.a();
        }
        if (!a10.f21186a) {
            return 0;
        }
        if (a10.f21187b) {
            i7 = 1536;
        } else {
            i7 = 512;
        }
        if (a10.f21188c) {
            return i7 | 2048;
        }
        return i7;
    }

    public final int E0(u2.o oVar, e2.u uVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f58463a) && Build.VERSION.SDK_INT == 23 && !h2.l0.P(this.f21338a1)) {
            return -1;
        }
        return uVar.f10760t;
    }

    public final void F0() {
        k();
        long h = ((s0) this.f21340c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f21348k1) {
                h = Math.max(this.f21347j1, h);
            }
            this.f21347j1 = h;
            this.f21348k1 = false;
        }
    }

    @Override
    public final l2.f H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z10) {
        int i7;
        l2.f b10 = oVar.b(uVar, uVar2);
        int i10 = b10.f19393e;
        if (this.Y == null && y0(uVar2)) {
            i10 |= 32768;
        }
        if (E0(oVar, uVar2) > this.f21342e1) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = oVar.f58463a;
        if (i11 != 0) {
            i7 = 0;
        } else {
            i7 = b10.d;
        }
        return new l2.f(str, uVar, uVar2, i7, i11);
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
        s1 g10;
        u2.o oVar;
        if (uVar.f10759s == null) {
            g10 = s1.f14058e;
        } else {
            if (((s0) this.f21340c1).j(uVar) != 0) {
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
        HashMap hashMap = u2.w.f58510a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new s4(new uc1(14, this.f21338a1, uVar), 4));
        return arrayList;
    }

    @Override
    public final long R(long j3, long j10, boolean z10) {
        boolean z11;
        float f10;
        s0 s0Var = (s0) this.f21340c1;
        if (s0Var.n() && this.f21352q1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f21351p1) {
            if (z11 || this.L0) {
                return 1000000L;
            }
        } else {
            long g10 = s0Var.g();
            if (this.n1 && z11 && g10 != -9223372036854775807L) {
                float min = (float) Math.min(g10, this.f21352q1 - j3);
                if (l() != null) {
                    f10 = l().f10782a;
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
        throw new UnsupportedOperationException("Method not decompiled: n2.v0.T(u2.o, e2.u, android.media.MediaCrypto, float):a8.b8");
    }

    @Override
    public final void U(k2.h hVar) {
        e2.u uVar;
        p0 p0Var;
        if (Build.VERSION.SDK_INT >= 29 && (uVar = hVar.f18221a) != null && Objects.equals(uVar.f10759s, "audio/opus") && this.f58506z0) {
            ByteBuffer byteBuffer = hVar.f18225f;
            byteBuffer.getClass();
            e2.u uVar2 = hVar.f18221a;
            uVar2.getClass();
            int i7 = uVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                s0 s0Var = (s0) this.f21340c1;
                h0 h0Var = s0Var.f21327t;
                if (h0Var != null && h0Var.c() && (p0Var = s0Var.f21323p) != null && ((n) p0Var.f21293e).f21283k) {
                    s0Var.f21327t.d(i7, i10);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f19351n == 2) {
            F0();
        }
        return this.f21347j1;
    }

    @Override
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        jb.m mVar = this.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new p(mVar, exc, 0));
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.f21349m1;
        this.f21349m1 = false;
        return z10;
    }

    @Override
    public final void b0(long j3, String str, long j10) {
        jb.m mVar = this.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new d3.e0(mVar, str, j3, j10, 4));
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        e2.w0 w0Var;
        u2.j jVar;
        x xVar = this.f21340c1;
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
                                        ((s0) xVar).y((o) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    s0 s0Var = (s0) xVar;
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
                                ((s0) xVar).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f21341d1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            s0 s0Var2 = (s0) xVar;
                            s0Var2.f21331y = ((Boolean) obj).booleanValue();
                            if (s0Var2.D()) {
                                w0Var = e2.w0.d;
                            } else {
                                w0Var = s0Var2.f21330x;
                            }
                            q0 q0Var = new q0(w0Var, -9223372036854775807L, -9223372036854775807L);
                            if (s0Var2.p()) {
                                s0Var2.v = q0Var;
                                return;
                            } else {
                                s0Var2.f21329w = q0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f21350o1 = ((Integer) obj).intValue();
                        u2.l lVar = this.f58486e0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f21350o1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    s0 s0Var3 = (s0) xVar;
                    s0Var3.T = audioDeviceInfo;
                    h0 h0Var = s0Var3.f21327t;
                    if (h0Var != null) {
                        h0Var.f21197a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                e2.f fVar = (e2.f) obj;
                fVar.getClass();
                ((s0) xVar).A(fVar);
                return;
            }
            e2.e eVar = (e2.e) obj;
            eVar.getClass();
            s0 s0Var4 = (s0) xVar;
            if (!s0Var4.f21328u.equals(eVar)) {
                s0Var4.f21328u = eVar;
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
        s0 s0Var5 = (s0) xVar;
        if (s0Var5.H != floatValue) {
            s0Var5.H = floatValue;
            if (s0Var5.p()) {
                s0Var5.f21327t.f21197a.setVolume(s0Var5.H);
            }
        }
    }

    @Override
    public final void c0(l2.d dVar) {
        jb.m mVar = this.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new ji.f(28, mVar, dVar));
        }
    }

    @Override
    public final void d0(String str) {
        jb.m mVar = this.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new ji.f(27, mVar, str));
        }
    }

    @Override
    public final void e(e2.w0 w0Var) {
        ((s0) this.f21340c1).C(w0Var);
    }

    @Override
    public final l2.f e0(jb.m mVar) {
        e2.u uVar = (e2.u) mVar.f17465c;
        uVar.getClass();
        this.f21345h1 = uVar;
        l2.f e02 = super.e0(mVar);
        jb.m mVar2 = this.f21339b1;
        Handler handler = (Handler) mVar2.f17464b;
        if (handler != null) {
            handler.post(new kg.x(mVar2, uVar, e02, 14));
        }
        return e02;
    }

    @Override
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        int i7;
        e2.u uVar2 = this.f21346i1;
        boolean z10 = true;
        int[] iArr = null;
        if (uVar2 != null) {
            uVar = uVar2;
        } else if (this.f58486e0 != null) {
            mediaFormat.getClass();
            String str = uVar.f10759s;
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
            tVar.f10707r = e2.s0.n("audio/raw");
            tVar.L = i7;
            tVar.M = uVar.N;
            tVar.N = uVar.O;
            tVar.f10700k = uVar.f10752l;
            tVar.f10692a = uVar.f10743a;
            tVar.f10693b = uVar.f10744b;
            tVar.f10694c = h9.i0.q(uVar.f10745c);
            tVar.d = uVar.d;
            tVar.f10695e = uVar.f10746e;
            tVar.f10696f = uVar.f10747f;
            tVar.J = mediaFormat.getInteger("channel-count");
            tVar.K = mediaFormat.getInteger("sample-rate");
            uVar = new e2.u(tVar);
            boolean z11 = this.f21343f1;
            int i11 = uVar.K;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f21344g1) {
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
            x xVar = this.f21340c1;
            if (i13 >= 29) {
                if (this.f58506z0) {
                    n1 n1Var = this.d;
                    n1Var.getClass();
                    if (n1Var.f19551a != 0) {
                        n1 n1Var2 = this.d;
                        n1Var2.getClass();
                        int i14 = n1Var2.f19551a;
                        s0 s0Var = (s0) xVar;
                        s0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        ma.p(z10);
                        s0Var.f21316i = i14;
                    }
                }
                s0 s0Var2 = (s0) xVar;
                s0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                ma.p(z10);
                s0Var2.f21316i = 0;
            }
            ((s0) xVar).c(uVar, iArr);
        } catch (t e10) {
            throw d(e10, e10.f21333a, false, 5001);
        }
    }

    @Override
    public final void g0() {
        this.f21340c1.getClass();
    }

    @Override
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final void i0() {
        ((s0) this.f21340c1).E = true;
    }

    @Override
    public final boolean k() {
        if (this.L0) {
            s0 s0Var = (s0) this.f21340c1;
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
    public final e2.w0 l() {
        return ((s0) this.f21340c1).f21330x;
    }

    @Override
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z10, boolean z11, e2.u uVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.f21352q1 = -9223372036854775807L;
        if (this.f21346i1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.i(i7);
            return true;
        }
        x xVar = this.f21340c1;
        if (z10) {
            if (lVar != null) {
                lVar.i(i7);
            }
            this.P0.f19379f += i11;
            ((s0) xVar).E = true;
            return true;
        }
        try {
            if (((s0) xVar).m(j11, i11, byteBuffer)) {
                if (lVar != null) {
                    lVar.i(i7);
                }
                this.P0.f19378e += i11;
                return true;
            }
            this.f21352q1 = j11;
            return false;
        } catch (u e10) {
            e2.u uVar2 = this.f21345h1;
            if (this.f58506z0) {
                n1 n1Var = this.d;
                n1Var.getClass();
                if (n1Var.f19551a != 0) {
                    i13 = 5004;
                    throw d(e10, uVar2, e10.f21335a, i13);
                }
            }
            i13 = 5001;
            throw d(e10, uVar2, e10.f21335a, i13);
        } catch (w e11) {
            if (this.f58506z0) {
                n1 n1Var2 = this.d;
                n1Var2.getClass();
                if (n1Var2.f19551a != 0) {
                    i12 = 5003;
                    throw d(e11, uVar, e11.f21354b, i12);
                }
            }
            i12 = 5002;
            throw d(e11, uVar, e11.f21354b, i12);
        }
    }

    @Override
    public final boolean m() {
        return ((s0) this.f21340c1).n();
    }

    @Override
    public final void n() {
        jb.m mVar = this.f21339b1;
        this.l1 = true;
        this.f21345h1 = null;
        this.f21352q1 = -9223372036854775807L;
        this.n1 = false;
        try {
            ((s0) this.f21340c1).f();
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
        jb.m mVar = this.f21339b1;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new q(mVar, obj, 1));
        }
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.f19552b;
        x xVar = this.f21340c1;
        if (z12) {
            s0 s0Var = (s0) xVar;
            ma.p(s0Var.P);
            if (!s0Var.V) {
                s0Var.V = true;
                s0Var.v();
            }
        } else {
            s0 s0Var2 = (s0) xVar;
            if (s0Var2.V) {
                s0Var2.V = false;
                s0Var2.v();
            }
        }
        m2.i iVar = this.f19350f;
        iVar.getClass();
        s0 s0Var3 = (s0) xVar;
        s0Var3.f21320m = iVar;
        h2.g0 g0Var = this.h;
        g0Var.getClass();
        ((j0) s0Var3.f21325r).f21232g = g0Var;
        s0Var3.f21321n = new h6.o(this, 17);
    }

    @Override
    public final void o0() {
        int i7;
        try {
            ((s0) this.f21340c1).t();
            long j3 = this.Q0.f58481f;
            if (j3 != -9223372036854775807L) {
                this.f21352q1 = j3;
            }
        } catch (w e10) {
            if (this.f58506z0) {
                i7 = 5003;
            } else {
                i7 = 5002;
            }
            throw d(e10, e10.f21355c, e10.f21354b, i7);
        }
    }

    @Override
    public final void p(long j3, boolean z10, boolean z11) {
        super.p(j3, z10, z11);
        ((s0) this.f21340c1).f();
        this.f21347j1 = j3;
        this.f21352q1 = -9223372036854775807L;
        this.f21349m1 = false;
        this.n1 = false;
        this.f21348k1 = true;
    }

    @Override
    public final void q() {
        u2.j jVar;
        ((j0) ((s0) this.f21340c1).f21325r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f21341d1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        x xVar = this.f21340c1;
        this.f21349m1 = false;
        this.n1 = false;
        this.f21352q1 = -9223372036854775807L;
        try {
            this.f58506z0 = false;
            p0();
            n0();
            p5.c.w(this.Y, null);
            this.Y = null;
        } finally {
            if (this.l1) {
                this.l1 = false;
                ((s0) xVar).w();
            }
        }
    }

    @Override
    public final void s() {
        ((s0) this.f21340c1).r();
        this.f21351p1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f21351p1 = false;
        ((s0) this.f21340c1).q();
        this.n1 = false;
    }

    @Override
    public final boolean y0(e2.u uVar) {
        n1 n1Var = this.d;
        n1Var.getClass();
        if (n1Var.f19551a != 0) {
            int D0 = D0(uVar);
            if ((D0 & 512) != 0) {
                n1 n1Var2 = this.d;
                n1Var2.getClass();
                if (n1Var2.f19551a == 2 || (D0 & 1024) != 0 || (uVar.N == 0 && uVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((s0) this.f21340c1).j(uVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(u2.i r18, e2.u r19) {
        throw new UnsupportedOperationException("Method not decompiled: n2.v0.z0(u2.i, e2.u):int");
    }

    @Override
    public final l2.u0 h() {
        return this;
    }
}
