package m2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import b8.zb;
import ci.y4;
import g9.s1;
import gi.v5;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k2.q1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;
public final class v0 extends t2.r implements k2.w0 {
    public final Context f19011a1;
    public final t f19012b1;
    public final z f19013c1;
    public final t2.j f19014d1;
    public int f19015e1;
    public boolean f19016f1;
    public boolean f19017g1;
    public d2.v f19018h1;
    public d2.v f19019i1;
    public long f19020j1;
    public boolean k1;
    public boolean f19021l1;
    public boolean m1;
    public boolean f19022n1;
    public int f19023o1;
    public boolean f19024p1;
    public long f19025q1;

    public v0(Context context, t2.k kVar, Handler handler, k2.c0 c0Var, z zVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        t2.j jVar;
        if (Build.VERSION.SDK_INT >= 35) {
            jVar = new t2.j();
        } else {
            jVar = null;
        }
        this.f19011a1 = context.getApplicationContext();
        this.f19013c1 = zVar;
        this.f19014d1 = jVar;
        this.f19023o1 = -1000;
        this.f19012b1 = new t(handler, c0Var);
        this.f19025q1 = -9223372036854775807L;
    }

    public final int D0(d2.v vVar) {
        f a10;
        int i3;
        s0 s0Var = (s0) this.f19013c1;
        if (s0Var.X) {
            a10 = f.d;
        } else {
            k b10 = ((j0) s0Var.f18997r).b(s0Var.i(vVar));
            ?? obj = new Object();
            obj.f14364a = b10.f18905a;
            obj.f14365b = b10.f18906b;
            obj.f14366c = b10.f18907c;
            a10 = obj.a();
        }
        if (!a10.f18855a) {
            return 0;
        }
        if (a10.f18856b) {
            i3 = 1536;
        } else {
            i3 = 512;
        }
        if (a10.f18857c) {
            return i3 | 2048;
        }
        return i3;
    }

    public final int E0(t2.o oVar, d2.v vVar) {
        if ("OMX.google.raw.decoder".equals(oVar.f54852a) && Build.VERSION.SDK_INT == 23 && !g2.n0.P(this.f19011a1)) {
            return -1;
        }
        return vVar.f8490t;
    }

    public final void F0() {
        l();
        long h = ((s0) this.f19013c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.k1) {
                h = Math.max(this.f19020j1, h);
            }
            this.f19020j1 = h;
            this.k1 = false;
        }
    }

    @Override
    public final k2.e H(t2.o oVar, d2.v vVar, d2.v vVar2, boolean z10) {
        int i3;
        k2.e b10 = oVar.b(vVar, vVar2);
        int i10 = b10.f16482e;
        if (this.Y == null && y0(vVar2)) {
            i10 |= 32768;
        }
        if (E0(oVar, vVar2) > this.f19015e1) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = oVar.f54852a;
        if (i11 != 0) {
            i3 = 0;
        } else {
            i3 = b10.d;
        }
        return new k2.e(str, vVar, vVar2, i3, i11);
    }

    @Override
    public final float P(float f10, d2.v vVar, d2.v[] vVarArr) {
        int i3 = -1;
        for (d2.v vVar2 : vVarArr) {
            int i10 = vVar2.L;
            if (i10 != -1) {
                i3 = Math.max(i3, i10);
            }
        }
        if (i3 == -1) {
            return -1.0f;
        }
        return i3 * f10;
    }

    @Override
    public final ArrayList Q(t2.i iVar, d2.v vVar, boolean z10) {
        s1 g7;
        t2.o oVar;
        if (vVar.f8489s == null) {
            g7 = s1.f12146e;
        } else {
            if (((s0) this.f19013c1).j(vVar) != 0) {
                List e10 = t2.w.e("audio/raw", false, false);
                if (e10.isEmpty()) {
                    oVar = null;
                } else {
                    oVar = (t2.o) e10.get(0);
                }
                if (oVar != null) {
                    g7 = g9.i0.u(oVar);
                }
            }
            g7 = t2.w.g(iVar, vVar, z10, false);
        }
        HashMap hashMap = t2.w.f54899a;
        ArrayList arrayList = new ArrayList(g7);
        Collections.sort(arrayList, new y4(new na1(11, this.f19011a1, vVar), 4));
        return arrayList;
    }

    @Override
    public final long R(long j10, long j11, boolean z10) {
        boolean z11;
        float f10;
        s0 s0Var = (s0) this.f19013c1;
        if (s0Var.n() && this.f19025q1 != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f19024p1) {
            if (z11 || this.L0) {
                return 1000000L;
            }
        } else {
            long g7 = s0Var.g();
            if (this.f19022n1 && z11 && g7 != -9223372036854775807L) {
                float min = (float) Math.min(g7, this.f19025q1 - j10);
                if (g() != null) {
                    f10 = g().f8517a;
                } else {
                    f10 = 1.0f;
                }
                return Math.max(10000L, (min / f10) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override
    public final l2.e T(t2.o r17, d2.v r18, android.media.MediaCrypto r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: m2.v0.T(t2.o, d2.v, android.media.MediaCrypto, float):l2.e");
    }

    @Override
    public final void U(j2.h hVar) {
        d2.v vVar;
        p0 p0Var;
        if (Build.VERSION.SDK_INT >= 29 && (vVar = hVar.f16155a) != null && Objects.equals(vVar.f8489s, "audio/opus") && this.f54895z0) {
            ByteBuffer byteBuffer = hVar.f16159f;
            byteBuffer.getClass();
            d2.v vVar2 = hVar.f16155a;
            vVar2.getClass();
            int i3 = vVar2.N;
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                s0 s0Var = (s0) this.f19013c1;
                h0 h0Var = s0Var.f18999t;
                if (h0Var != null && h0Var.c() && (p0Var = s0Var.f18995p) != null && ((n) p0Var.f18962e).f18952k) {
                    s0Var.f18999t.d(i3, i10);
                }
            }
        }
    }

    @Override
    public final long a() {
        if (this.f16448n == 2) {
            F0();
        }
        return this.f19020j1;
    }

    @Override
    public final void a0(Exception exc) {
        g2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        t tVar = this.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new p(tVar, exc, 0));
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.m1;
        this.m1 = false;
        return z10;
    }

    @Override
    public final void b0(long j10, String str, long j11) {
        t tVar = this.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new c3.f0(tVar, str, j10, j11, 3));
        }
    }

    @Override
    public final void c(d2.y0 y0Var) {
        ((s0) this.f19013c1).C(y0Var);
    }

    @Override
    public final void c0(k2.c cVar) {
        t tVar = this.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new s(0, tVar, cVar));
        }
    }

    @Override
    public final void d(int i3, Object obj) {
        d2.y0 y0Var;
        t2.j jVar;
        z zVar = this.f19013c1;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 6) {
                    if (i3 != 12) {
                        if (i3 != 16) {
                            if (i3 != 9) {
                                if (i3 != 10) {
                                    if (i3 != 19) {
                                        if (i3 != 20) {
                                            super.d(i3, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        ((s0) zVar).y((o) obj);
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
                                if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f19014d1) != null) {
                                    jVar.d(intValue2);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            s0 s0Var2 = (s0) zVar;
                            s0Var2.f19003y = ((Boolean) obj).booleanValue();
                            if (s0Var2.D()) {
                                y0Var = d2.y0.d;
                            } else {
                                y0Var = s0Var2.f19002x;
                            }
                            q0 q0Var = new q0(y0Var, -9223372036854775807L, -9223372036854775807L);
                            if (s0Var2.p()) {
                                s0Var2.v = q0Var;
                                return;
                            } else {
                                s0Var2.f19001w = q0Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f19023o1 = ((Integer) obj).intValue();
                        t2.l lVar = this.f54875e0;
                        if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f19023o1));
                            lVar.setParameters(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    s0 s0Var3 = (s0) zVar;
                    s0Var3.T = audioDeviceInfo;
                    h0 h0Var = s0Var3.f18999t;
                    if (h0Var != null) {
                        h0Var.f18866a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                d2.g gVar = (d2.g) obj;
                gVar.getClass();
                ((s0) zVar).A(gVar);
                return;
            }
            d2.f fVar = (d2.f) obj;
            fVar.getClass();
            s0 s0Var4 = (s0) zVar;
            if (!s0Var4.f19000u.equals(fVar)) {
                s0Var4.f19000u = fVar;
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
                s0Var5.f18999t.f18866a.setVolume(s0Var5.H);
            }
        }
    }

    @Override
    public final void d0(String str) {
        t tVar = this.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new ii.e(29, tVar, str));
        }
    }

    @Override
    public final k2.e e0(tf.b bVar) {
        d2.v vVar = (d2.v) bVar.f55095b;
        vVar.getClass();
        this.f19018h1 = vVar;
        k2.e e02 = super.e0(bVar);
        t tVar = this.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new lg.y(tVar, vVar, e02, 5));
        }
        return e02;
    }

    @Override
    public final void f0(d2.v vVar, MediaFormat mediaFormat) {
        int i3;
        d2.v vVar2 = this.f19019i1;
        boolean z10 = true;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (this.f54875e0 != null) {
            mediaFormat.getClass();
            String str = vVar.f8489s;
            int i10 = vVar.K;
            if ("audio/raw".equals(str)) {
                i3 = vVar.M;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i3 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i3 = g2.n0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i3 = 2;
            }
            d2.u uVar = new d2.u();
            uVar.f8431r = d2.u0.n("audio/raw");
            uVar.L = i3;
            uVar.M = vVar.N;
            uVar.N = vVar.O;
            uVar.f8424k = vVar.f8482l;
            uVar.f8416a = vVar.f8473a;
            uVar.f8417b = vVar.f8474b;
            uVar.f8418c = g9.i0.q(vVar.f8475c);
            uVar.d = vVar.d;
            uVar.f8419e = vVar.f8476e;
            uVar.f8420f = vVar.f8477f;
            uVar.J = mediaFormat.getInteger("channel-count");
            uVar.K = mediaFormat.getInteger("sample-rate");
            vVar = new d2.v(uVar);
            boolean z11 = this.f19016f1;
            int i11 = vVar.K;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f19017g1) {
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
            z zVar = this.f19013c1;
            if (i13 >= 29) {
                if (this.f54895z0) {
                    q1 q1Var = this.d;
                    q1Var.getClass();
                    if (q1Var.f16684a != 0) {
                        q1 q1Var2 = this.d;
                        q1Var2.getClass();
                        int i14 = q1Var2.f16684a;
                        s0 s0Var = (s0) zVar;
                        s0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        zb.p(z10);
                        s0Var.f18988i = i14;
                    }
                }
                s0 s0Var2 = (s0) zVar;
                s0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                zb.p(z10);
                s0Var2.f18988i = 0;
            }
            ((s0) zVar).c(vVar, iArr);
        } catch (v e10) {
            throw e(e10, e10.f19010a, false, 5001);
        }
    }

    @Override
    public final d2.y0 g() {
        return ((s0) this.f19013c1).f19002x;
    }

    @Override
    public final void g0() {
        this.f19013c1.getClass();
    }

    @Override
    public final void i0() {
        ((s0) this.f19013c1).E = true;
    }

    @Override
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean l() {
        if (this.L0) {
            s0 s0Var = (s0) this.f19013c1;
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
    public final boolean l0(long j10, long j11, t2.l lVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j12, boolean z10, boolean z11, d2.v vVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.f19025q1 = -9223372036854775807L;
        if (this.f19019i1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.c(i3);
            return true;
        }
        z zVar = this.f19013c1;
        if (z10) {
            if (lVar != null) {
                lVar.c(i3);
            }
            this.P0.f16467f += i11;
            ((s0) zVar).E = true;
            return true;
        }
        try {
            if (((s0) zVar).m(j12, i11, byteBuffer)) {
                if (lVar != null) {
                    lVar.c(i3);
                }
                this.P0.f16466e += i11;
                return true;
            }
            this.f19025q1 = j12;
            return false;
        } catch (w e10) {
            d2.v vVar2 = this.f19018h1;
            if (this.f54895z0) {
                q1 q1Var = this.d;
                q1Var.getClass();
                if (q1Var.f16684a != 0) {
                    i13 = 5004;
                    throw e(e10, vVar2, e10.f19026a, i13);
                }
            }
            i13 = 5001;
            throw e(e10, vVar2, e10.f19026a, i13);
        } catch (y e11) {
            if (this.f54895z0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f16684a != 0) {
                    i12 = 5003;
                    throw e(e11, vVar, e11.f19046b, i12);
                }
            }
            i12 = 5002;
            throw e(e11, vVar, e11.f19046b, i12);
        }
    }

    @Override
    public final boolean m() {
        return ((s0) this.f19013c1).n();
    }

    @Override
    public final void n() {
        t tVar = this.f19012b1;
        this.f19021l1 = true;
        this.f19018h1 = null;
        this.f19025q1 = -9223372036854775807L;
        this.f19022n1 = false;
        try {
            ((s0) this.f19013c1).f();
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
        t tVar = this.f19012b1;
        Handler handler = (Handler) tVar.f19006b;
        if (handler != null) {
            handler.post(new q(tVar, obj, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.f16685b;
        z zVar = this.f19013c1;
        if (z12) {
            s0 s0Var = (s0) zVar;
            zb.p(s0Var.P);
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
        l2.k kVar = this.f16447f;
        kVar.getClass();
        s0 s0Var3 = (s0) zVar;
        s0Var3.f18992m = kVar;
        g2.h0 h0Var = this.h;
        h0Var.getClass();
        ((j0) s0Var3.f18997r).f18901g = h0Var;
        s0Var3.f18993n = new v5(this, 14);
    }

    @Override
    public final void o0() {
        int i3;
        try {
            ((s0) this.f19013c1).t();
            long j10 = this.Q0.f54870f;
            if (j10 != -9223372036854775807L) {
                this.f19025q1 = j10;
            }
        } catch (y e10) {
            if (this.f54895z0) {
                i3 = 5003;
            } else {
                i3 = 5002;
            }
            throw e(e10, e10.f19047c, e10.f19046b, i3);
        }
    }

    @Override
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((s0) this.f19013c1).f();
        this.f19020j1 = j10;
        this.f19025q1 = -9223372036854775807L;
        this.m1 = false;
        this.f19022n1 = false;
        this.k1 = true;
    }

    @Override
    public final void q() {
        t2.j jVar;
        ((j0) ((s0) this.f19013c1).f18997r).d();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = this.f19014d1) != null) {
            jVar.b();
        }
    }

    @Override
    public final void r() {
        z zVar = this.f19013c1;
        this.m1 = false;
        this.f19022n1 = false;
        this.f19025q1 = -9223372036854775807L;
        try {
            this.f54895z0 = false;
            p0();
            n0();
            f1.E(this.Y, null);
            this.Y = null;
        } finally {
            if (this.f19021l1) {
                this.f19021l1 = false;
                ((s0) zVar).w();
            }
        }
    }

    @Override
    public final void s() {
        ((s0) this.f19013c1).r();
        this.f19024p1 = true;
    }

    @Override
    public final void t() {
        F0();
        this.f19024p1 = false;
        ((s0) this.f19013c1).q();
        this.f19022n1 = false;
    }

    @Override
    public final boolean y0(d2.v vVar) {
        q1 q1Var = this.d;
        q1Var.getClass();
        if (q1Var.f16684a != 0) {
            int D0 = D0(vVar);
            if ((D0 & 512) != 0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.f16684a == 2 || (D0 & 1024) != 0 || (vVar.N == 0 && vVar.O == 0)) {
                    return true;
                }
            }
        }
        if (((s0) this.f19013c1).j(vVar) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int z0(t2.i r18, d2.v r19) {
        throw new UnsupportedOperationException("Method not decompiled: m2.v0.z0(t2.i, d2.v):int");
    }

    @Override
    public final k2.w0 i() {
        return this;
    }
}
