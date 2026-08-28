package e5;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import d5.f0;
import h3.h0;
import h3.s0;
import h3.t0;
import h3.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o8.l0;
public final class j extends y3.q {
    public static final int[] f4893n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean f4894o1;
    public static boolean f4895p1;
    public final Context E0;
    public final s F0;
    public final we.b G0;
    public final long H0;
    public final int I0;
    public final boolean J0;
    public a8.b K0;
    public boolean L0;
    public boolean M0;
    public Surface N0;
    public l O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public long V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;
    public long f4896a1;
    public long f4897b1;
    public long f4898c1;
    public int f4899d1;
    public int f4900e1;
    public int f4901f1;
    public int f4902g1;
    public float f4903h1;
    public z f4904i1;
    public boolean f4905j1;
    public int f4906k1;
    public i l1;
    public n f4907m1;

    public j(Context context, y3.j jVar, Handler handler, h0 h0Var) {
        super(2, jVar, 30.0f);
        this.H0 = 5000L;
        this.I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new s(applicationContext);
        this.G0 = new we.b(handler, h0Var, false, 20);
        this.J0 = "NVIDIA".equals(f0.f4351c);
        this.V0 = -9223372036854775807L;
        this.f4900e1 = -1;
        this.f4901f1 = -1;
        this.f4903h1 = -1.0f;
        this.Q0 = 1;
        this.f4906k1 = 0;
        this.f4904i1 = null;
    }

    public static boolean R(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: e5.j.R(java.lang.String):boolean");
    }

    public static int S(y3.n r10, h3.t0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: e5.j.S(y3.n, h3.t0):int");
    }

    public static o8.z T(Context context, y3.r rVar, t0 t0Var, boolean z10, boolean z11) {
        String str = t0Var.B;
        if (str == null) {
            o8.x xVar = o8.z.f19105b;
            return l0.f19056e;
        }
        rVar.getClass();
        List e10 = y3.w.e(str, z10, z11);
        String b10 = y3.w.b(t0Var);
        if (b10 == null) {
            return o8.z.u(e10);
        }
        List e11 = y3.w.e(b10, z10, z11);
        if (f0.f4349a >= 26 && "video/dolby-vision".equals(t0Var.B) && !e11.isEmpty() && !h.a(context)) {
            return o8.z.u(e11);
        }
        o8.x xVar2 = o8.z.f19105b;
        o8.w wVar = new o8.w();
        wVar.b(e10);
        wVar.b(e11);
        return wVar.c();
    }

    public static int U(y3.n nVar, t0 t0Var) {
        int i9 = t0Var.C;
        List list = t0Var.D;
        if (i9 != -1) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return t0Var.C + i10;
        }
        return S(nVar, t0Var);
    }

    @Override
    public final void A() {
        Q();
    }

    @Override
    public final boolean C(long r31, long r33, y3.k r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, h3.t0 r44) {
        throw new UnsupportedOperationException("Method not decompiled: e5.j.C(long, long, y3.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, h3.t0):boolean");
    }

    @Override
    public final void G() {
        super.G();
        this.Z0 = 0;
    }

    @Override
    public final boolean K(y3.n nVar) {
        if (this.N0 == null && !a0(nVar)) {
            return false;
        }
        return true;
    }

    @Override
    public final int M(y3.r rVar, t0 t0Var) {
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!d5.q.j(t0Var.B)) {
            return e2.c.b(0, 0, 0);
        }
        if (t0Var.E != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.E0;
        o8.z T = T(context, rVar, t0Var, z10, false);
        if (z10 && T.isEmpty()) {
            T = T(context, rVar, t0Var, false, false);
        }
        if (T.isEmpty()) {
            return e2.c.b(1, 0, 0);
        }
        int i14 = t0Var.W;
        if (i14 != 0 && i14 != 2) {
            return e2.c.b(2, 0, 0);
        }
        y3.n nVar = (y3.n) T.get(0);
        boolean d = nVar.d(t0Var);
        if (!d) {
            for (int i15 = 1; i15 < T.size(); i15++) {
                y3.n nVar2 = (y3.n) T.get(i15);
                if (nVar2.d(t0Var)) {
                    nVar = nVar2;
                    z11 = false;
                    d = true;
                    break;
                }
            }
        }
        z11 = true;
        if (d) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        if (nVar.e(t0Var)) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (nVar.f49510g) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        if (f0.f4349a >= 26 && "video/dolby-vision".equals(t0Var.B) && !h.a(context)) {
            i12 = 256;
        }
        if (d) {
            o8.z T2 = T(context, rVar, t0Var, z10, true);
            if (!T2.isEmpty()) {
                Pattern pattern = y3.w.f49555a;
                ArrayList arrayList = new ArrayList(T2);
                Collections.sort(arrayList, new bg.l0(new t0.c(t0Var, 6), 5));
                y3.n nVar3 = (y3.n) arrayList.get(0);
                if (nVar3.d(t0Var) && nVar3.e(t0Var)) {
                    i13 = 32;
                }
            }
        }
        return i9 | i10 | i13 | i11 | i12;
    }

    public final void Q() {
        y3.k kVar;
        this.R0 = false;
        if (f0.f4349a >= 23 && this.f4905j1 && (kVar = this.I) != null) {
            this.l1 = new i(this, kVar);
        }
    }

    public final void V() {
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.W0;
            int i9 = this.X0;
            we.b bVar = this.G0;
            Handler handler = (Handler) bVar.f48793b;
            if (handler != null) {
                handler.post(new v(bVar, i9, j10));
            }
            this.X0 = 0;
            this.W0 = elapsedRealtime;
        }
    }

    public final void W() {
        this.T0 = true;
        if (!this.R0) {
            this.R0 = true;
            Surface surface = this.N0;
            we.b bVar = this.G0;
            Handler handler = (Handler) bVar.f48793b;
            if (handler != null) {
                handler.post(new w(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.P0 = true;
        }
    }

    public final void X() {
        int i9 = this.f4900e1;
        if (i9 != -1 || this.f4901f1 != -1) {
            z zVar = this.f4904i1;
            if (zVar == null || zVar.f4954a != i9 || zVar.f4955b != this.f4901f1 || zVar.f4956c != this.f4902g1 || zVar.d != this.f4903h1) {
                z zVar2 = new z(this.f4900e1, this.f4901f1, this.f4903h1, this.f4902g1);
                this.f4904i1 = zVar2;
                we.b bVar = this.G0;
                Handler handler = (Handler) bVar.f48793b;
                if (handler != null) {
                    handler.post(new u(0, bVar, zVar2));
                }
            }
        }
    }

    public final void Y(y3.k kVar, int i9) {
        X();
        d5.a.c("releaseOutputBuffer");
        kVar.releaseOutputBuffer(i9, true);
        d5.a.q();
        this.f4897b1 = SystemClock.elapsedRealtime() * 1000;
        this.f49549z0.f14600e++;
        this.Y0 = 0;
        W();
    }

    public final void Z(y3.k kVar, int i9, long j10) {
        X();
        d5.a.c("releaseOutputBuffer");
        kVar.b(i9, j10);
        d5.a.q();
        this.f4897b1 = SystemClock.elapsedRealtime() * 1000;
        this.f49549z0.f14600e++;
        this.Y0 = 0;
        W();
    }

    public final boolean a0(y3.n nVar) {
        if (f0.f4349a >= 23 && !this.f4905j1 && !R(nVar.f49505a)) {
            if (!nVar.f49509f || l.b(this.E0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k3.l b(y3.n nVar, t0 t0Var, t0 t0Var2) {
        int i9;
        k3.l b10 = nVar.b(t0Var, t0Var2);
        int i10 = b10.f14615e;
        int i11 = t0Var2.G;
        a8.b bVar = this.K0;
        if (i11 > bVar.f109a || t0Var2.H > bVar.f110b) {
            i10 |= 256;
        }
        if (U(nVar, t0Var2) > this.K0.f111c) {
            i10 |= 64;
        }
        int i12 = i10;
        String str = nVar.f49505a;
        if (i12 != 0) {
            i9 = 0;
        } else {
            i9 = b10.d;
        }
        return new k3.l(str, t0Var, t0Var2, i9, i12);
    }

    public final void b0(y3.k kVar, int i9) {
        d5.a.c("skipVideoBuffer");
        kVar.releaseOutputBuffer(i9, false);
        d5.a.q();
        this.f49549z0.f14601f++;
    }

    @Override
    public final y3.l c(IllegalStateException illegalStateException, y3.n nVar) {
        Surface surface = this.N0;
        y3.l lVar = new y3.l(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return lVar;
    }

    public final void c0(int i9, int i10) {
        k3.f fVar = this.f49549z0;
        fVar.h += i9;
        int i11 = i9 + i10;
        fVar.f14602g += i11;
        this.X0 += i11;
        int i12 = this.Y0 + i11;
        this.Y0 = i12;
        fVar.f14603i = Math.max(i12, fVar.f14603i);
        int i13 = this.I0;
        if (i13 > 0 && this.X0 >= i13) {
            V();
        }
    }

    public final void d0(long j10) {
        k3.f fVar = this.f49549z0;
        fVar.f14605k += j10;
        fVar.f14606l++;
        this.f4898c1 += j10;
        this.f4899d1++;
    }

    @Override
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void handleMessage(int i9, Object obj) {
        l lVar;
        Handler handler;
        l lVar2;
        long j10;
        Handler handler2;
        int intValue;
        s sVar = this.F0;
        if (i9 != 1) {
            if (i9 != 7) {
                if (i9 != 10) {
                    if (i9 != 4) {
                        if (i9 == 5 && sVar.f4929j != (intValue = ((Integer) obj).intValue())) {
                            sVar.f4929j = intValue;
                            sVar.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.Q0 = intValue2;
                    y3.k kVar = this.I;
                    if (kVar != null) {
                        kVar.f(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.f4906k1 != intValue3) {
                    this.f4906k1 = intValue3;
                    if (this.f4905j1) {
                        E();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f4907m1 = (n) obj;
            return;
        }
        if (obj instanceof Surface) {
            lVar = (Surface) obj;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            l lVar3 = this.O0;
            if (lVar3 != null) {
                lVar = lVar3;
            } else {
                y3.n nVar = this.P;
                if (nVar != null && a0(nVar)) {
                    lVar = l.c(this.E0, nVar.f49509f);
                    this.O0 = lVar;
                }
            }
        }
        Surface surface = this.N0;
        we.b bVar = this.G0;
        if (surface != lVar) {
            this.N0 = lVar;
            sVar.getClass();
            if (lVar instanceof l) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (sVar.f4925e != lVar2) {
                sVar.a();
                sVar.f4925e = lVar2;
                sVar.c(true);
            }
            this.P0 = false;
            int state = getState();
            y3.k kVar2 = this.I;
            if (kVar2 != null) {
                if (f0.f4349a >= 23 && lVar != null && !this.L0) {
                    try {
                        kVar2.g(lVar);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        throw new IllegalArgumentException(th);
                    }
                } else {
                    E();
                    r();
                }
            }
            if (lVar != null && lVar != this.O0) {
                z zVar = this.f4904i1;
                if (zVar != null && (handler2 = (Handler) bVar.f48793b) != null) {
                    handler2.post(new u(0, bVar, zVar));
                }
                Q();
                if (state == 2) {
                    long j11 = this.H0;
                    if (j11 > 0) {
                        j10 = SystemClock.elapsedRealtime() + j11;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    this.V0 = j10;
                    return;
                }
                return;
            }
            this.f4904i1 = null;
            Q();
        } else if (lVar != null && lVar != this.O0) {
            z zVar2 = this.f4904i1;
            if (zVar2 != null && (handler = (Handler) bVar.f48793b) != null) {
                handler.post(new u(0, bVar, zVar2));
            }
            if (this.P0) {
                Surface surface2 = this.N0;
                Handler handler3 = (Handler) bVar.f48793b;
                if (handler3 != null) {
                    handler3.post(new w(bVar, surface2, SystemClock.elapsedRealtime(), 0));
                }
            }
        }
    }

    @Override
    public final boolean isReady() {
        l lVar;
        if (super.isReady() && (this.R0 || (((lVar = this.O0) != null && this.N0 == lVar) || this.I == null || this.f4905j1))) {
            this.V0 = -9223372036854775807L;
            return true;
        } else if (this.V0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.V0) {
                return true;
            }
            this.V0 = -9223372036854775807L;
            return false;
        }
    }

    @Override
    public final boolean k() {
        if (this.f4905j1 && f0.f4349a < 23) {
            return true;
        }
        return false;
    }

    @Override
    public final float l(float f10, t0[] t0VarArr) {
        float f11 = -1.0f;
        for (t0 t0Var : t0VarArr) {
            float f12 = t0Var.I;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override
    public final ArrayList m(y3.r rVar, t0 t0Var, boolean z10) {
        o8.z T = T(this.E0, rVar, t0Var, z10, this.f4905j1);
        Pattern pattern = y3.w.f49555a;
        ArrayList arrayList = new ArrayList(T);
        Collections.sort(arrayList, new bg.l0(new t0.c(t0Var, 6), 5));
        return arrayList;
    }

    @Override
    public final y3.i o(y3.n nVar, t0 t0Var, MediaCrypto mediaCrypto, float f10) {
        int i9;
        b bVar;
        a8.b bVar2;
        boolean z10;
        int i10;
        int i11;
        Point point;
        Point point2;
        int i12;
        int i13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        Pair d;
        int S;
        l lVar = this.O0;
        if (lVar != null && lVar.f4913a != nVar.f49509f) {
            if (this.N0 == lVar) {
                this.N0 = null;
            }
            lVar.release();
            this.O0 = null;
        }
        String str = nVar.f49507c;
        t0[] streamFormats = getStreamFormats();
        int i16 = t0Var.G;
        float f11 = t0Var.I;
        int i17 = t0Var.H;
        b bVar3 = t0Var.N;
        int U = U(nVar, t0Var);
        if (streamFormats.length == 1) {
            if (U != -1 && (S = S(nVar, t0Var)) != -1) {
                U = Math.min((int) (U * 1.5f), S);
            }
            bVar2 = new a8.b(i16, i17, U);
            i9 = i17;
            bVar = bVar3;
        } else {
            int length = streamFormats.length;
            int i18 = i16;
            int i19 = i17;
            int i20 = 0;
            boolean z13 = false;
            while (i20 < length) {
                t0 t0Var2 = streamFormats[i20];
                int i21 = i20;
                if (bVar3 != null && t0Var2.N == null) {
                    s0 a2 = t0Var2.a();
                    a2.A = bVar3;
                    t0Var2 = new t0(a2);
                }
                k3.l b10 = nVar.b(t0Var, t0Var2);
                t0[] t0VarArr = streamFormats;
                int i22 = t0Var2.H;
                if (b10.d != 0) {
                    int i23 = t0Var2.G;
                    i14 = length;
                    if (i23 != -1 && i22 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i18 = Math.max(i18, i23);
                    i19 = Math.max(i19, i22);
                    U = Math.max(U, U(nVar, t0Var2));
                } else {
                    i14 = length;
                }
                i20 = i21 + 1;
                streamFormats = t0VarArr;
                length = i14;
            }
            if (z13) {
                d5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i18 + "x" + i19);
                if (i17 > i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = i17;
                } else {
                    i10 = i16;
                }
                boolean z14 = z10;
                if (z10) {
                    i11 = i16;
                } else {
                    i11 = i17;
                }
                float f12 = i11 / i10;
                bVar = bVar3;
                int i24 = 0;
                while (i24 < 9) {
                    int i25 = f4893n1[i24];
                    int i26 = i24;
                    int i27 = (int) (i25 * f12);
                    if (i25 <= i10 || i27 <= i11) {
                        break;
                    }
                    int i28 = i11;
                    int i29 = i10;
                    if (f0.f4349a >= 21) {
                        if (z14) {
                            i13 = i27;
                        } else {
                            i13 = i25;
                        }
                        if (!z14) {
                            i25 = i27;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(f0.f(i13, widthAlignment) * widthAlignment, f0.f(i25, heightAlignment) * heightAlignment);
                        }
                        i9 = i17;
                        if (nVar.f(point2.x, point2.y, f11)) {
                            point = point2;
                            break;
                        }
                        i24 = i26 + 1;
                        i17 = i9;
                        i11 = i28;
                        i10 = i29;
                    } else {
                        i9 = i17;
                        try {
                            int f13 = f0.f(i25, 16) * 16;
                            int f14 = f0.f(i27, 16) * 16;
                            if (f13 * f14 <= y3.w.j()) {
                                if (z14) {
                                    i12 = f14;
                                } else {
                                    i12 = f13;
                                }
                                if (!z14) {
                                    f13 = f14;
                                }
                                point2 = new Point(i12, f13);
                                point = point2;
                                break;
                            }
                            i24 = i26 + 1;
                            i17 = i9;
                            i11 = i28;
                            i10 = i29;
                        } catch (y3.t unused) {
                        }
                    }
                }
                i9 = i17;
                point = null;
                if (point != null) {
                    i18 = Math.max(i18, point.x);
                    i19 = Math.max(i19, point.y);
                    s0 a3 = t0Var.a();
                    a3.f9710t = i18;
                    a3.f9711u = i19;
                    U = Math.max(U, S(nVar, new t0(a3)));
                    d5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i19);
                }
            } else {
                i9 = i17;
                bVar = bVar3;
            }
            bVar2 = new a8.b(i18, i19, U);
        }
        this.K0 = bVar2;
        if (this.f4905j1) {
            i15 = this.f4906k1;
        } else {
            i15 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i16);
        mediaFormat.setInteger("height", i9);
        d5.a.I(mediaFormat, t0Var.D);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        d5.a.A(mediaFormat, "rotation-degrees", t0Var.J);
        if (bVar != null) {
            b bVar4 = bVar;
            d5.a.A(mediaFormat, "color-transfer", bVar4.f4874c);
            d5.a.A(mediaFormat, "color-standard", bVar4.f4872a);
            d5.a.A(mediaFormat, "color-range", bVar4.f4873b);
            byte[] bArr = bVar4.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(t0Var.B) && (d = y3.w.d(t0Var)) != null) {
            d5.a.A(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar2.f109a);
        mediaFormat.setInteger("max-height", bVar2.f110b);
        d5.a.A(mediaFormat, "max-input-size", bVar2.f111c);
        if (f0.f4349a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.J0) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (this.N0 == null) {
            if (a0(nVar)) {
                if (this.O0 == null) {
                    this.O0 = l.c(this.E0, nVar.f49509f);
                }
                this.N0 = this.O0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new y3.i(nVar, mediaFormat, t0Var, this.N0, mediaCrypto);
    }

    @Override
    public final void onDisabled() {
        we.b bVar = this.G0;
        this.f4904i1 = null;
        Q();
        this.P0 = false;
        this.l1 = null;
        try {
            super.onDisabled();
            k3.f fVar = this.f49549z0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.f48793b;
            if (handler != null) {
                handler.post(new x(bVar, fVar, 0));
            }
        } catch (Throwable th) {
            bVar.m(this.f49549z0);
            throw th;
        }
    }

    @Override
    public final void onEnabled(boolean z10, boolean z11) {
        boolean z12;
        this.f49549z0 = new Object();
        boolean z13 = getConfiguration().f9505a;
        if (z13 && this.f4906k1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        d5.a.i(z12);
        if (this.f4905j1 != z13) {
            this.f4905j1 = z13;
            E();
        }
        k3.f fVar = this.f49549z0;
        we.b bVar = this.G0;
        Handler handler = (Handler) bVar.f48793b;
        if (handler != null) {
            handler.post(new x(bVar, fVar, 1));
        }
        this.S0 = z11;
        this.T0 = false;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        Q();
        s sVar = this.F0;
        sVar.f4932m = 0L;
        sVar.f4935p = -1L;
        sVar.f4933n = -1L;
        long j11 = -9223372036854775807L;
        this.f4896a1 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.Y0 = 0;
        if (z10) {
            long j12 = this.H0;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.V0 = j11;
            return;
        }
        this.V0 = -9223372036854775807L;
    }

    @Override
    public final void onQueueInputBuffer(k3.i iVar) {
        boolean z10 = this.f4905j1;
        if (!z10) {
            this.Z0++;
        }
        if (f0.f4349a < 23 && z10) {
            long j10 = iVar.d;
            P(j10);
            X();
            this.f49549z0.f14600e++;
            W();
            z(j10);
        }
    }

    @Override
    public final void onReset() {
        try {
            super.onReset();
            l lVar = this.O0;
            if (lVar != null) {
                if (this.N0 == lVar) {
                    this.N0 = null;
                }
                lVar.release();
                this.O0 = null;
            }
        } catch (Throwable th) {
            if (this.O0 != null) {
                Surface surface = this.N0;
                l lVar2 = this.O0;
                if (surface == lVar2) {
                    this.N0 = null;
                }
                lVar2.release();
                this.O0 = null;
            }
            throw th;
        }
    }

    @Override
    public final void onStarted() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.f4897b1 = SystemClock.elapsedRealtime() * 1000;
        this.f4898c1 = 0L;
        this.f4899d1 = 0;
        s sVar = this.F0;
        sVar.d = true;
        sVar.f4932m = 0L;
        sVar.f4935p = -1L;
        sVar.f4933n = -1L;
        p pVar = sVar.f4923b;
        if (pVar != null) {
            r rVar = sVar.f4924c;
            rVar.getClass();
            rVar.f4920b.sendEmptyMessage(1);
            pVar.m(new a1.c(sVar, 21));
        }
        sVar.c(false);
    }

    @Override
    public final void onStopped() {
        this.V0 = -9223372036854775807L;
        V();
        int i9 = this.f4899d1;
        if (i9 != 0) {
            long j10 = this.f4898c1;
            we.b bVar = this.G0;
            Handler handler = (Handler) bVar.f48793b;
            if (handler != null) {
                handler.post(new v(bVar, j10, i9));
            }
            this.f4898c1 = 0L;
            this.f4899d1 = 0;
        }
        s sVar = this.F0;
        sVar.d = false;
        p pVar = sVar.f4923b;
        if (pVar != null) {
            pVar.s();
            r rVar = sVar.f4924c;
            rVar.getClass();
            rVar.f4920b.sendEmptyMessage(2);
        }
        sVar.a();
    }

    @Override
    public final void p(k3.i iVar) {
        if (this.M0) {
            ByteBuffer byteBuffer = iVar.f14610e;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        y3.k kVar = this.I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final void setPlaybackSpeed(float f10, float f11) {
        super.setPlaybackSpeed(f10, f11);
        s sVar = this.F0;
        sVar.f4928i = f10;
        sVar.f4932m = 0L;
        sVar.f4935p = -1L;
        sVar.f4933n = -1L;
        sVar.c(false);
    }

    @Override
    public final void t(Exception exc) {
        d5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        we.b bVar = this.G0;
        Handler handler = (Handler) bVar.f48793b;
        if (handler != null) {
            handler.post(new u(2, bVar, exc));
        }
    }

    @Override
    public final void u(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        we.b bVar = this.G0;
        Handler handler = (Handler) bVar.f48793b;
        if (handler != null) {
            str2 = str;
            handler.post(new y(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.L0 = R(str2);
        y3.n nVar = this.P;
        nVar.getClass();
        boolean z10 = false;
        if (f0.f4349a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f49506b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if (codecProfileLevelArr[i9].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.M0 = z10;
        if (f0.f4349a >= 23 && this.f4905j1) {
            y3.k kVar = this.I;
            kVar.getClass();
            this.l1 = new i(this, kVar);
        }
    }

    @Override
    public final void v(String str) {
        we.b bVar = this.G0;
        Handler handler = (Handler) bVar.f48793b;
        if (handler != null) {
            handler.post(new u(1, bVar, str));
        }
    }

    @Override
    public final k3.l w(u0 u0Var) {
        k3.l w8 = super.w(u0Var);
        t0 t0Var = u0Var.f9778b;
        we.b bVar = this.G0;
        Handler handler = (Handler) bVar.f48793b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar, t0Var, w8, 10));
        }
        return w8;
    }

    @Override
    public final void x(t0 t0Var, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        y3.k kVar = this.I;
        if (kVar != null) {
            kVar.f(this.Q0);
        }
        if (this.f4905j1) {
            this.f4900e1 = t0Var.G;
            this.f4901f1 = t0Var.H;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f4900e1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f4901f1 = integer2;
        }
        float f10 = t0Var.K;
        int i9 = t0Var.J;
        this.f4903h1 = f10;
        if (f0.f4349a >= 21) {
            if (i9 == 90 || i9 == 270) {
                int i10 = this.f4900e1;
                this.f4900e1 = this.f4901f1;
                this.f4901f1 = i10;
                this.f4903h1 = 1.0f / f10;
            }
        } else {
            this.f4902g1 = i9;
        }
        float f11 = t0Var.I;
        s sVar = this.F0;
        sVar.f4926f = f11;
        e eVar = sVar.f4922a;
        eVar.f4884a.c();
        eVar.f4885b.c();
        eVar.f4886c = false;
        eVar.d = -9223372036854775807L;
        eVar.f4887e = 0;
        sVar.b();
    }

    @Override
    public final void z(long j10) {
        super.z(j10);
        if (!this.f4905j1) {
            this.Z0--;
        }
    }
}
