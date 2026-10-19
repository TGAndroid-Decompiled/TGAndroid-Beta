package k2;

import ai.t5;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import e9.x1;
import i2.p1;
import ig.e2;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v7.u6;
public final class x0 extends r2.r implements i2.w0 {
    public final Context Z0;
    public final qf.b f14833a1;
    public final z f14834b1;
    public final r2.j f14835c1;
    public int f14836d1;
    public boolean f14837e1;
    public boolean f14838f1;
    public b2.w f14839g1;
    public b2.w f14840h1;
    public long f14841i1;
    public boolean f14842j1;
    public boolean f14843k1;
    public boolean l1;
    public boolean f14844m1;
    public int f14845n1;
    public boolean f14846o1;
    public long f14847p1;

    public x0(Context context, r2.k kVar, Handler handler, i2.c0 c0Var, z zVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        r2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new r2.j();
        } else {
            jVar = null;
        }
        this.Z0 = context.getApplicationContext();
        this.f14834b1 = zVar;
        this.f14835c1 = jVar;
        this.f14845n1 = -1000;
        this.f14833a1 = new qf.b(handler, c0Var);
        this.f14847p1 = -9223372036854775807L;
    }

    public final int D0(b2.w wVar) {
        g a2;
        int i10;
        t0 t0Var = (t0) this.f14834b1;
        if (t0Var.X) {
            a2 = g.d;
        } else {
            l b10 = ((k0) t0Var.f14818r).b(t0Var.i(wVar));
            ?? obj = new Object();
            obj.f4248a = b10.f14731a;
            obj.f4249b = b10.f14732b;
            obj.f4250c = b10.f14733c;
            a2 = obj.a();
        }
        if (!a2.f14685a) {
            return 0;
        }
        if (a2.f14686b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (a2.f14687c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int E0(r2.o oVar, b2.w wVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f44931a) && Build.VERSION.SDK_INT == 23 && !e2.m0.P(this.Z0)) {
            return -1;
        }
        return wVar.f4131t;
    }

    public final void F0() {
        l();
        long h = ((t0) this.f14834b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.f14842j1) {
                h = Math.max(this.f14841i1, h);
            }
            this.f14841i1 = h;
            this.f14842j1 = false;
        }
    }

    @Override
    public final i2.g H(r2.o oVar, b2.w wVar, b2.w wVar2, boolean z10) {
        int i10;
        i2.g b10 = oVar.b(wVar, wVar2);
        int i11 = b10.e;
        if (this.X == null && y0(wVar2)) {
            i11 |= 32768;
        }
        if (E0(oVar, wVar2) > this.f14836d1) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f44931a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.g(str, wVar, wVar2, i10, i12);
    }

    @Override
    public final float P(float f7, b2.w wVar, b2.w[] wVarArr) {
        int i10 = -1;
        for (b2.w wVar2 : wVarArr) {
            int i11 = wVar2.L;
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
    public final ArrayList Q(r2.i iVar, b2.w wVar, boolean z10) {
        x1 g10;
        r2.o oVar;
        if (wVar.f4130s == null) {
            g10 = x1.e;
        } else {
            if (((t0) this.f14834b1).j(wVar) != 0) {
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
            g10 = r2.w.g(iVar, wVar, z10, false);
        }
        HashMap hashMap = r2.w.f44976a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new t5(new org.telegram.ui.web.m(3, this.Z0, wVar), 4));
        return arrayList;
    }

    @Override
    public final long R(long j10, long j11, boolean z10) {
        boolean z11;
        float f7;
        t0 t0Var = (t0) this.f14834b1;
        if (t0Var.n() && this.f14847p1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f14846o1) {
            if (z11 || this.K0) {
                return 1000000L;
            }
        } else {
            long g10 = t0Var.g();
            if (this.f14844m1 && z11 && g10 != -9223372036854775807L) {
                float min = (float) Math.min(g10, this.f14847p1 - j10);
                if (h() != null) {
                    f7 = h().f4154a;
                } else {
                    f7 = 1.0f;
                }
                return Math.max(10000L, (min / f7) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final com.google.firebase.messaging.l T(r2.o r17, b2.w r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: k2.x0.T(r2.o, b2.w, android.media.MediaCrypto, float):com.google.firebase.messaging.l");
    }

    @Override
    public final void U(h2.h hVar) {
        b2.w wVar;
        q0 q0Var;
        if (Build.VERSION.SDK_INT >= 29 && (wVar = hVar.f11634a) != null && Objects.equals(wVar.f4130s, "audio/opus") && this.f44971y0) {
            ByteBuffer byteBuffer = hVar.f11637f;
            byteBuffer.getClass();
            b2.w wVar2 = hVar.f11634a;
            wVar2.getClass();
            int i10 = wVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                t0 t0Var = (t0) this.f14834b1;
                i0 i0Var = t0Var.f14820t;
                if (i0Var != null && i0Var.c() && (q0Var = t0Var.f14816p) != null && ((o) q0Var.e).f14775k) {
                    t0Var.f14820t.d(i10, i11);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f12317n == 2) {
            F0();
        }
        return this.f14841i1;
    }

    @Override
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        qf.b bVar = this.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
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
        qf.b bVar = this.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new a3.h0(bVar, str, j10, j11, 3));
        }
    }

    @Override
    public final void c(int i10, Object obj) {
        b2.z0 z0Var;
        r2.j jVar;
        z zVar = this.f14834b1;
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
                                        ((t0) zVar).y((p) obj);
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    t0 t0Var = (t0) zVar;
                                    t0Var.getClass();
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (t0Var.U != intValue) {
                                        t0Var.U = intValue;
                                        t0Var.v();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                ((t0) zVar).z(intValue2);
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f14835c1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            t0 t0Var2 = (t0) zVar;
                            t0Var2.f14824y = ((Boolean) obj).booleanValue();
                            if (t0Var2.D()) {
                                z0Var = b2.z0.d;
                            } else {
                                z0Var = t0Var2.f14823x;
                            }
                            r0 r0Var = new r0(z0Var, -9223372036854775807L, -9223372036854775807L);
                            if (t0Var2.p()) {
                                t0Var2.v = r0Var;
                                return;
                            } else {
                                t0Var2.f14822w = r0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f14845n1 = ((Integer) obj).intValue();
                        r2.l lVar = this.f44951d0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f14845n1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    t0 t0Var3 = (t0) zVar;
                    t0Var3.T = audioDeviceInfo;
                    i0 i0Var = t0Var3.f14820t;
                    if (i0Var != null) {
                        i0Var.f14696a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                b2.g gVar = (b2.g) obj;
                gVar.getClass();
                ((t0) zVar).A(gVar);
                return;
            }
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            t0 t0Var4 = (t0) zVar;
            if (!t0Var4.f14821u.equals(fVar)) {
                t0Var4.f14821u = fVar;
                if (!t0Var4.V) {
                    t0Var4.v();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        t0 t0Var5 = (t0) zVar;
        if (t0Var5.H != floatValue) {
            t0Var5.H = floatValue;
            if (t0Var5.p()) {
                t0Var5.f14820t.f14696a.setVolume(t0Var5.H);
            }
        }
    }

    @Override
    public final void c0(i2.d dVar) {
        qf.b bVar = this.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new hi.t(16, bVar, dVar));
        }
    }

    @Override
    public final void d0(String str) {
        qf.b bVar = this.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new hi.t(15, bVar, str));
        }
    }

    @Override
    public final i2.g e0(qf.b bVar) {
        b2.w wVar = (b2.w) bVar.f44438c;
        wVar.getClass();
        this.f14839g1 = wVar;
        i2.g e02 = super.e0(bVar);
        qf.b bVar2 = this.f14833a1;
        Handler handler = (Handler) bVar2.f44437b;
        if (handler != null) {
            handler.post(new e2(bVar2, wVar, e02, 1));
        }
        return e02;
    }

    @Override
    public final void f(b2.z0 z0Var) {
        ((t0) this.f14834b1).C(z0Var);
    }

    @Override
    public final void f0(b2.w wVar, MediaFormat mediaFormat) {
        int i10;
        b2.w wVar2 = this.f14840h1;
        boolean z10 = true;
        int[] iArr = null;
        if (wVar2 != null) {
            wVar = wVar2;
        } else if (this.f44951d0 != null) {
            mediaFormat.getClass();
            String str = wVar.f4130s;
            int i11 = wVar.K;
            if ("audio/raw".equals(str)) {
                i10 = wVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e2.m0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i10 = 2;
            }
            b2.v vVar = new b2.v();
            vVar.f4077r = b2.v0.n("audio/raw");
            vVar.L = i10;
            vVar.M = wVar.N;
            vVar.N = wVar.O;
            vVar.f4070k = wVar.f4123l;
            vVar.f4063a = wVar.f4115a;
            vVar.f4064b = wVar.f4116b;
            vVar.f4065c = e9.n0.u(wVar.f4117c);
            vVar.d = wVar.d;
            vVar.e = wVar.e;
            vVar.f4066f = wVar.f4118f;
            vVar.J = mediaFormat.getInteger("channel-count");
            vVar.K = mediaFormat.getInteger("sample-rate");
            wVar = new b2.w(vVar);
            boolean z11 = this.f14837e1;
            int i12 = wVar.K;
            if (z11 && i12 == 6 && i11 < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f14838f1) {
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
            z zVar = this.f14834b1;
            if (i14 >= 29) {
                if (this.f44971y0) {
                    p1 p1Var = this.d;
                    p1Var.getClass();
                    if (p1Var.f12533a != 0) {
                        p1 p1Var2 = this.d;
                        p1Var2.getClass();
                        int i15 = p1Var2.f12533a;
                        t0 t0Var = (t0) zVar;
                        t0Var.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        u6.p(z10);
                        t0Var.f14809i = i15;
                    }
                }
                t0 t0Var2 = (t0) zVar;
                t0Var2.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                u6.p(z10);
                t0Var2.f14809i = 0;
            }
            ((t0) zVar).c(wVar, iArr);
        } catch (v e) {
            throw d(e, e.f14827a, false, 5001);
        }
    }

    @Override
    public final void g0() {
        this.f14834b1.getClass();
    }

    @Override
    public final b2.z0 h() {
        return ((t0) this.f14834b1).f14823x;
    }

    @Override
    public final void i0() {
        ((t0) this.f14834b1).E = true;
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            t0 t0Var = (t0) this.f14834b1;
            if (t0Var.p()) {
                if (t0Var.L && !t0Var.n()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean l0(long j10, long j11, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.w wVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.f14847p1 = -9223372036854775807L;
        if (this.f14840h1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        z zVar = this.f14834b1;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f12347f += i12;
            ((t0) zVar).E = true;
            return true;
        }
        try {
            if (((t0) zVar).m(j12, i12, byteBuffer)) {
                if (lVar != null) {
                    lVar.c(i10);
                }
                this.O0.e += i12;
                return true;
            }
            this.f14847p1 = j12;
            return false;
        } catch (w e) {
            b2.w wVar2 = this.f14839g1;
            if (this.f44971y0) {
                p1 p1Var = this.d;
                p1Var.getClass();
                if (p1Var.f12533a != 0) {
                    i14 = 5004;
                    throw d(e, wVar2, e.f14829a, i14);
                }
            }
            i14 = 5001;
            throw d(e, wVar2, e.f14829a, i14);
        } catch (y e7) {
            if (this.f44971y0) {
                p1 p1Var2 = this.d;
                p1Var2.getClass();
                if (p1Var2.f12533a != 0) {
                    i13 = 5003;
                    throw d(e7, wVar, e7.f14849b, i13);
                }
            }
            i13 = 5002;
            throw d(e7, wVar, e7.f14849b, i13);
        }
    }

    @Override
    public final boolean m() {
        return ((t0) this.f14834b1).n();
    }

    @Override
    public final void n() {
        qf.b bVar = this.f14833a1;
        this.f14843k1 = true;
        this.f14839g1 = null;
        this.f14847p1 = -9223372036854775807L;
        this.f14844m1 = false;
        try {
            ((t0) this.f14834b1).f();
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
        qf.b bVar = this.f14833a1;
        Handler handler = (Handler) bVar.f44437b;
        if (handler != null) {
            handler.post(new r(bVar, obj, 1));
        }
        p1 p1Var = this.d;
        p1Var.getClass();
        boolean z12 = p1Var.f12534b;
        z zVar = this.f14834b1;
        if (z12) {
            t0 t0Var = (t0) zVar;
            u6.p(t0Var.P);
            if (!t0Var.V) {
                t0Var.V = true;
                t0Var.v();
            }
        } else {
            t0 t0Var2 = (t0) zVar;
            if (t0Var2.V) {
                t0Var2.V = false;
                t0Var2.v();
            }
        }
        j2.k kVar = this.f12316f;
        kVar.getClass();
        t0 t0Var3 = (t0) zVar;
        t0Var3.f14813m = kVar;
        e2.g0 g0Var = this.h;
        g0Var.getClass();
        ((k0) t0Var3.f14818r).f14727g = g0Var;
        t0Var3.f14814n = new w0(this, 0);
    }

    @Override
    public final void o0() {
        int i10;
        try {
            ((t0) this.f14834b1).t();
            long j10 = this.P0.f44947f;
            if (j10 != -9223372036854775807L) {
                this.f14847p1 = j10;
            }
        } catch (y e) {
            if (this.f44971y0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw d(e, e.f14850c, e.f14849b, i10);
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((t0) this.f14834b1).f();
        this.f14841i1 = j10;
        this.f14847p1 = -9223372036854775807L;
        this.l1 = false;
        this.f14844m1 = false;
        this.f14842j1 = true;
    }

    @Override
    public final void q() {
        r2.j jVar;
        ((k0) ((t0) this.f14834b1).f14818r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f14835c1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        z zVar = this.f14834b1;
        this.l1 = false;
        this.f14844m1 = false;
        this.f14847p1 = -9223372036854775807L;
        try {
            this.f44971y0 = false;
            p0();
            n0();
            i2.e.D(this.X, null);
            this.X = null;
        } finally {
            if (this.f14843k1) {
                this.f14843k1 = false;
                ((t0) zVar).w();
            }
        }
    }

    @Override
    public final void s() {
        ((t0) this.f14834b1).r();
        this.f14846o1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f14846o1 = false;
        ((t0) this.f14834b1).q();
        this.f14844m1 = false;
    }

    @Override
    public final boolean y0(b2.w wVar) {
        p1 p1Var = this.d;
        p1Var.getClass();
        if (p1Var.f12533a != 0) {
            int D0 = D0(wVar);
            if ((D0 & 512) != 0) {
                p1 p1Var2 = this.d;
                p1Var2.getClass();
                if (p1Var2.f12533a == 2 || (D0 & 1024) != 0 || (wVar.N == 0 && wVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((t0) this.f14834b1).j(wVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(r2.i r18, b2.w r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.x0.z0(r2.i, b2.w):int");
    }

    @Override
    public final i2.w0 i() {
        return this;
    }
}
