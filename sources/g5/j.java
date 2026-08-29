package g5;

import a4.b0;
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
import f5.d0;
import j3.h0;
import j3.s0;
import j3.t0;
import j3.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import q8.l0;
import q8.z;
public final class j extends a4.t {
    public static final int[] f7048n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean f7049o1;
    public static boolean f7050p1;
    public final Context E0;
    public final s F0;
    public final ze.b G0;
    public final long H0;
    public final int I0;
    public final boolean J0;
    public c8.a K0;
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
    public long f7051a1;
    public long f7052b1;
    public long f7053c1;
    public int f7054d1;
    public int f7055e1;
    public int f7056f1;
    public int f7057g1;
    public float f7058h1;
    public y f7059i1;
    public boolean f7060j1;
    public int f7061k1;
    public i l1;
    public n f7062m1;

    public j(Context context, a4.m mVar, Handler handler, h0 h0Var) {
        super(2, mVar, 30.0f);
        this.H0 = 5000L;
        this.I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new s(applicationContext);
        this.G0 = new ze.b(handler, h0Var);
        this.J0 = "NVIDIA".equals(d0.f6581c);
        this.V0 = -9223372036854775807L;
        this.f7055e1 = -1;
        this.f7056f1 = -1;
        this.f7058h1 = -1.0f;
        this.Q0 = 1;
        this.f7061k1 = 0;
        this.f7059i1 = null;
    }

    public static boolean R(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: g5.j.R(java.lang.String):boolean");
    }

    public static int S(a4.q r10, j3.t0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: g5.j.S(a4.q, j3.t0):int");
    }

    public static z T(Context context, a4.u uVar, t0 t0Var, boolean z10, boolean z11) {
        String str = t0Var.B;
        if (str == null) {
            q8.x xVar = z.f46511b;
            return l0.f46462e;
        }
        uVar.getClass();
        List e10 = b0.e(str, z10, z11);
        String b10 = b0.b(t0Var);
        if (b10 == null) {
            return z.u(e10);
        }
        List e11 = b0.e(b10, z10, z11);
        if (d0.f6579a >= 26 && "video/dolby-vision".equals(t0Var.B) && !e11.isEmpty() && !h.a(context)) {
            return z.u(e11);
        }
        q8.x xVar2 = z.f46511b;
        q8.w wVar = new q8.w();
        wVar.b(e10);
        wVar.b(e11);
        return wVar.c();
    }

    public static int U(a4.q qVar, t0 t0Var) {
        int i10 = t0Var.C;
        List list = t0Var.D;
        if (i10 != -1) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return t0Var.C + i11;
        }
        return S(qVar, t0Var);
    }

    @Override
    public final void A() {
        Q();
    }

    @Override
    public final boolean C(long r31, long r33, a4.n r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, j3.t0 r44) {
        throw new UnsupportedOperationException("Method not decompiled: g5.j.C(long, long, a4.n, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, j3.t0):boolean");
    }

    @Override
    public final void G() {
        super.G();
        this.Z0 = 0;
    }

    @Override
    public final boolean K(a4.q qVar) {
        if (this.N0 == null && !a0(qVar)) {
            return false;
        }
        return true;
    }

    @Override
    public final int M(a4.u uVar, t0 t0Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!f5.o.j(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        if (t0Var.E != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.E0;
        z T = T(context, uVar, t0Var, z10, false);
        if (z10 && T.isEmpty()) {
            T = T(context, uVar, t0Var, false, false);
        }
        if (T.isEmpty()) {
            return com.google.android.recaptcha.internal.a.b(1, 0, 0);
        }
        int i15 = t0Var.W;
        if (i15 != 0 && i15 != 2) {
            return com.google.android.recaptcha.internal.a.b(2, 0, 0);
        }
        a4.q qVar = (a4.q) T.get(0);
        boolean d = qVar.d(t0Var);
        if (!d) {
            for (int i16 = 1; i16 < T.size(); i16++) {
                a4.q qVar2 = (a4.q) T.get(i16);
                if (qVar2.d(t0Var)) {
                    qVar = qVar2;
                    z11 = false;
                    d = true;
                    break;
                }
            }
        }
        z11 = true;
        if (d) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (qVar.e(t0Var)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (qVar.f109g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (d0.f6579a >= 26 && "video/dolby-vision".equals(t0Var.B) && !h.a(context)) {
            i13 = 256;
        }
        if (d) {
            z T2 = T(context, uVar, t0Var, z10, true);
            if (!T2.isEmpty()) {
                Pattern pattern = b0.f54a;
                ArrayList arrayList = new ArrayList(T2);
                Collections.sort(arrayList, new a4.v(new a1.c(t0Var, 1), 0));
                a4.q qVar3 = (a4.q) arrayList.get(0);
                if (qVar3.d(t0Var) && qVar3.e(t0Var)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    public final void Q() {
        a4.n nVar;
        this.R0 = false;
        if (d0.f6579a >= 23 && this.f7060j1 && (nVar = this.I) != null) {
            this.l1 = new i(this, nVar);
        }
    }

    public final void V() {
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.W0;
            int i10 = this.X0;
            ze.b bVar = this.G0;
            Handler handler = (Handler) bVar.f50824a;
            if (handler != null) {
                handler.post(new u(bVar, i10, j10));
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
            ze.b bVar = this.G0;
            Handler handler = (Handler) bVar.f50824a;
            if (handler != null) {
                handler.post(new v(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.P0 = true;
        }
    }

    public final void X() {
        int i10 = this.f7055e1;
        if (i10 != -1 || this.f7056f1 != -1) {
            y yVar = this.f7059i1;
            if (yVar == null || yVar.f7106a != i10 || yVar.f7107b != this.f7056f1 || yVar.f7108c != this.f7057g1 || yVar.d != this.f7058h1) {
                y yVar2 = new y(this.f7055e1, this.f7056f1, this.f7058h1, this.f7057g1);
                this.f7059i1 = yVar2;
                ze.b bVar = this.G0;
                Handler handler = (Handler) bVar.f50824a;
                if (handler != null) {
                    handler.post(new ef.c(12, bVar, yVar2));
                }
            }
        }
    }

    public final void Y(a4.n nVar, int i10) {
        X();
        f5.a.c("releaseOutputBuffer");
        nVar.releaseOutputBuffer(i10, true);
        f5.a.q();
        this.f7052b1 = SystemClock.elapsedRealtime() * 1000;
        this.f148z0.f16820e++;
        this.Y0 = 0;
        W();
    }

    public final void Z(a4.n nVar, int i10, long j10) {
        X();
        f5.a.c("releaseOutputBuffer");
        nVar.d(i10, j10);
        f5.a.q();
        this.f7052b1 = SystemClock.elapsedRealtime() * 1000;
        this.f148z0.f16820e++;
        this.Y0 = 0;
        W();
    }

    public final boolean a0(a4.q qVar) {
        if (d0.f6579a >= 23 && !this.f7060j1 && !R(qVar.f104a)) {
            if (!qVar.f108f || l.b(this.E0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final m3.l b(a4.q qVar, t0 t0Var, t0 t0Var2) {
        int i10;
        m3.l b10 = qVar.b(t0Var, t0Var2);
        int i11 = b10.f16835e;
        int i12 = t0Var2.G;
        c8.a aVar = this.K0;
        if (i12 > aVar.f3002a || t0Var2.H > aVar.f3003b) {
            i11 |= 256;
        }
        if (U(qVar, t0Var2) > this.K0.f3004c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = qVar.f104a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new m3.l(str, t0Var, t0Var2, i10, i13);
    }

    public final void b0(a4.n nVar, int i10) {
        f5.a.c("skipVideoBuffer");
        nVar.releaseOutputBuffer(i10, false);
        f5.a.q();
        this.f148z0.f16821f++;
    }

    @Override
    public final a4.o c(IllegalStateException illegalStateException, a4.q qVar) {
        Surface surface = this.N0;
        a4.o oVar = new a4.o(illegalStateException, qVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return oVar;
    }

    public final void c0(int i10, int i11) {
        m3.f fVar = this.f148z0;
        fVar.h += i10;
        int i12 = i10 + i11;
        fVar.f16822g += i12;
        this.X0 += i12;
        int i13 = this.Y0 + i12;
        this.Y0 = i13;
        fVar.f16823i = Math.max(i13, fVar.f16823i);
        int i14 = this.I0;
        if (i14 > 0 && this.X0 >= i14) {
            V();
        }
    }

    public final void d0(long j10) {
        m3.f fVar = this.f148z0;
        fVar.f16825k += j10;
        fVar.f16826l++;
        this.f7053c1 += j10;
        this.f7054d1++;
    }

    @Override
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        l lVar;
        Handler handler;
        l lVar2;
        long j10;
        Handler handler2;
        int intValue;
        s sVar = this.F0;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 == 5 && sVar.f7084j != (intValue = ((Integer) obj).intValue())) {
                            sVar.f7084j = intValue;
                            sVar.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.Q0 = intValue2;
                    a4.n nVar = this.I;
                    if (nVar != null) {
                        nVar.g(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.f7061k1 != intValue3) {
                    this.f7061k1 = intValue3;
                    if (this.f7060j1) {
                        E();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f7062m1 = (n) obj;
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
                a4.q qVar = this.P;
                if (qVar != null && a0(qVar)) {
                    lVar = l.c(this.E0, qVar.f108f);
                    this.O0 = lVar;
                }
            }
        }
        Surface surface = this.N0;
        ze.b bVar = this.G0;
        if (surface != lVar) {
            this.N0 = lVar;
            sVar.getClass();
            if (lVar instanceof l) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (sVar.f7080e != lVar2) {
                sVar.a();
                sVar.f7080e = lVar2;
                sVar.c(true);
            }
            this.P0 = false;
            int state = getState();
            a4.n nVar2 = this.I;
            if (nVar2 != null) {
                if (d0.f6579a >= 23 && lVar != null && !this.L0) {
                    try {
                        nVar2.h(lVar);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        throw new IllegalArgumentException(th2);
                    }
                } else {
                    E();
                    r();
                }
            }
            if (lVar != null && lVar != this.O0) {
                y yVar = this.f7059i1;
                if (yVar != null && (handler2 = (Handler) bVar.f50824a) != null) {
                    handler2.post(new ef.c(12, bVar, yVar));
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
            this.f7059i1 = null;
            Q();
        } else if (lVar != null && lVar != this.O0) {
            y yVar2 = this.f7059i1;
            if (yVar2 != null && (handler = (Handler) bVar.f50824a) != null) {
                handler.post(new ef.c(12, bVar, yVar2));
            }
            if (this.P0) {
                Surface surface2 = this.N0;
                Handler handler3 = (Handler) bVar.f50824a;
                if (handler3 != null) {
                    handler3.post(new v(bVar, surface2, SystemClock.elapsedRealtime(), 0));
                }
            }
        }
    }

    @Override
    public final boolean isReady() {
        l lVar;
        if (super.isReady() && (this.R0 || (((lVar = this.O0) != null && this.N0 == lVar) || this.I == null || this.f7060j1))) {
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
        if (this.f7060j1 && d0.f6579a < 23) {
            return true;
        }
        return false;
    }

    @Override
    public final float l(float f9, t0[] t0VarArr) {
        float f10 = -1.0f;
        for (t0 t0Var : t0VarArr) {
            float f11 = t0Var.I;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f9;
    }

    @Override
    public final ArrayList m(a4.u uVar, t0 t0Var, boolean z10) {
        z T = T(this.E0, uVar, t0Var, z10, this.f7060j1);
        Pattern pattern = b0.f54a;
        ArrayList arrayList = new ArrayList(T);
        Collections.sort(arrayList, new a4.v(new a1.c(t0Var, 1), 0));
        return arrayList;
    }

    @Override
    public final a4.l o(a4.q qVar, t0 t0Var, MediaCrypto mediaCrypto, float f9) {
        int i10;
        b bVar;
        c8.a aVar;
        boolean z10;
        int i11;
        int i12;
        Point point;
        Point point2;
        int i13;
        int i14;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i15;
        boolean z11;
        int i16;
        boolean z12;
        Pair d;
        int S;
        l lVar = this.O0;
        if (lVar != null && lVar.f7068a != qVar.f108f) {
            if (this.N0 == lVar) {
                this.N0 = null;
            }
            lVar.release();
            this.O0 = null;
        }
        String str = qVar.f106c;
        t0[] streamFormats = getStreamFormats();
        int i17 = t0Var.G;
        float f10 = t0Var.I;
        int i18 = t0Var.H;
        b bVar2 = t0Var.N;
        int U = U(qVar, t0Var);
        if (streamFormats.length == 1) {
            if (U != -1 && (S = S(qVar, t0Var)) != -1) {
                U = Math.min((int) (U * 1.5f), S);
            }
            aVar = new c8.a(i17, i18, U);
            i10 = i18;
            bVar = bVar2;
        } else {
            int length = streamFormats.length;
            int i19 = i17;
            int i20 = i18;
            int i21 = 0;
            boolean z13 = false;
            while (i21 < length) {
                t0 t0Var2 = streamFormats[i21];
                int i22 = i21;
                if (bVar2 != null && t0Var2.N == null) {
                    s0 a2 = t0Var2.a();
                    a2.A = bVar2;
                    t0Var2 = new t0(a2);
                }
                m3.l b10 = qVar.b(t0Var, t0Var2);
                t0[] t0VarArr = streamFormats;
                int i23 = t0Var2.H;
                if (b10.d != 0) {
                    int i24 = t0Var2.G;
                    i15 = length;
                    if (i24 != -1 && i23 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i19 = Math.max(i19, i24);
                    i20 = Math.max(i20, i23);
                    U = Math.max(U, U(qVar, t0Var2));
                } else {
                    i15 = length;
                }
                i21 = i22 + 1;
                streamFormats = t0VarArr;
                length = i15;
            }
            if (z13) {
                f5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i19 + "x" + i20);
                if (i18 > i17) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = i18;
                } else {
                    i11 = i17;
                }
                boolean z14 = z10;
                if (z10) {
                    i12 = i17;
                } else {
                    i12 = i18;
                }
                float f11 = i12 / i11;
                bVar = bVar2;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = f7048n1[i25];
                    int i27 = i25;
                    int i28 = (int) (i26 * f11);
                    if (i26 <= i11 || i28 <= i12) {
                        break;
                    }
                    int i29 = i12;
                    int i30 = i11;
                    if (d0.f6579a >= 21) {
                        if (z14) {
                            i14 = i28;
                        } else {
                            i14 = i26;
                        }
                        if (!z14) {
                            i26 = i28;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = qVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(d0.f(i14, widthAlignment) * widthAlignment, d0.f(i26, heightAlignment) * heightAlignment);
                        }
                        i10 = i18;
                        if (qVar.f(point2.x, point2.y, f10)) {
                            point = point2;
                            break;
                        }
                        i25 = i27 + 1;
                        i18 = i10;
                        i12 = i29;
                        i11 = i30;
                    } else {
                        i10 = i18;
                        try {
                            int f12 = d0.f(i26, 16) * 16;
                            int f13 = d0.f(i28, 16) * 16;
                            if (f12 * f13 <= b0.j()) {
                                if (z14) {
                                    i13 = f13;
                                } else {
                                    i13 = f12;
                                }
                                if (!z14) {
                                    f12 = f13;
                                }
                                point2 = new Point(i13, f12);
                                point = point2;
                                break;
                            }
                            i25 = i27 + 1;
                            i18 = i10;
                            i12 = i29;
                            i11 = i30;
                        } catch (a4.y unused) {
                        }
                    }
                }
                i10 = i18;
                point = null;
                if (point != null) {
                    i19 = Math.max(i19, point.x);
                    i20 = Math.max(i20, point.y);
                    s0 a10 = t0Var.a();
                    a10.f10747t = i19;
                    a10.f10748u = i20;
                    U = Math.max(U, S(qVar, new t0(a10)));
                    f5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i19 + "x" + i20);
                }
            } else {
                i10 = i18;
                bVar = bVar2;
            }
            aVar = new c8.a(i19, i20, U);
        }
        this.K0 = aVar;
        if (this.f7060j1) {
            i16 = this.f7061k1;
        } else {
            i16 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i17);
        mediaFormat.setInteger("height", i10);
        f5.a.I(mediaFormat, t0Var.D);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        f5.a.A(mediaFormat, "rotation-degrees", t0Var.J);
        if (bVar != null) {
            b bVar3 = bVar;
            f5.a.A(mediaFormat, "color-transfer", bVar3.f7030c);
            f5.a.A(mediaFormat, "color-standard", bVar3.f7028a);
            f5.a.A(mediaFormat, "color-range", bVar3.f7029b);
            byte[] bArr = bVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(t0Var.B) && (d = b0.d(t0Var)) != null) {
            f5.a.A(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f3002a);
        mediaFormat.setInteger("max-height", aVar.f3003b);
        f5.a.A(mediaFormat, "max-input-size", aVar.f3004c);
        if (d0.f6579a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f9 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (this.J0) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.N0 == null) {
            if (a0(qVar)) {
                if (this.O0 == null) {
                    this.O0 = l.c(this.E0, qVar.f108f);
                }
                this.N0 = this.O0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new a4.l(qVar, mediaFormat, t0Var, this.N0, mediaCrypto);
    }

    @Override
    public final void onDisabled() {
        ze.b bVar = this.G0;
        this.f7059i1 = null;
        Q();
        this.P0 = false;
        this.l1 = null;
        try {
            super.onDisabled();
            m3.f fVar = this.f148z0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.f50824a;
            if (handler != null) {
                handler.post(new w(bVar, fVar, 0));
            }
        } catch (Throwable th2) {
            bVar.n(this.f148z0);
            throw th2;
        }
    }

    @Override
    public final void onEnabled(boolean z10, boolean z11) {
        boolean z12;
        this.f148z0 = new Object();
        boolean z13 = getConfiguration().f10542a;
        if (z13 && this.f7061k1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        f5.a.i(z12);
        if (this.f7060j1 != z13) {
            this.f7060j1 = z13;
            E();
        }
        m3.f fVar = this.f148z0;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.f50824a;
        if (handler != null) {
            handler.post(new w(bVar, fVar, 1));
        }
        this.S0 = z11;
        this.T0 = false;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        Q();
        s sVar = this.F0;
        sVar.f7087m = 0L;
        sVar.f7090p = -1L;
        sVar.f7088n = -1L;
        long j11 = -9223372036854775807L;
        this.f7051a1 = -9223372036854775807L;
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
    public final void onQueueInputBuffer(m3.i iVar) {
        boolean z10 = this.f7060j1;
        if (!z10) {
            this.Z0++;
        }
        if (d0.f6579a < 23 && z10) {
            long j10 = iVar.d;
            P(j10);
            X();
            this.f148z0.f16820e++;
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
        } catch (Throwable th2) {
            if (this.O0 != null) {
                Surface surface = this.N0;
                l lVar2 = this.O0;
                if (surface == lVar2) {
                    this.N0 = null;
                }
                lVar2.release();
                this.O0 = null;
            }
            throw th2;
        }
    }

    @Override
    public final void onStarted() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.f7052b1 = SystemClock.elapsedRealtime() * 1000;
        this.f7053c1 = 0L;
        this.f7054d1 = 0;
        s sVar = this.F0;
        sVar.d = true;
        sVar.f7087m = 0L;
        sVar.f7090p = -1L;
        sVar.f7088n = -1L;
        p pVar = sVar.f7078b;
        if (pVar != null) {
            r rVar = sVar.f7079c;
            rVar.getClass();
            rVar.f7075b.sendEmptyMessage(1);
            pVar.c(new eg.n(sVar, 4));
        }
        sVar.c(false);
    }

    @Override
    public final void onStopped() {
        this.V0 = -9223372036854775807L;
        V();
        int i10 = this.f7054d1;
        if (i10 != 0) {
            long j10 = this.f7053c1;
            ze.b bVar = this.G0;
            Handler handler = (Handler) bVar.f50824a;
            if (handler != null) {
                handler.post(new u(bVar, j10, i10));
            }
            this.f7053c1 = 0L;
            this.f7054d1 = 0;
        }
        s sVar = this.F0;
        sVar.d = false;
        p pVar = sVar.f7078b;
        if (pVar != null) {
            pVar.x();
            r rVar = sVar.f7079c;
            rVar.getClass();
            rVar.f7075b.sendEmptyMessage(2);
        }
        sVar.a();
    }

    @Override
    public final void p(m3.i iVar) {
        if (this.M0) {
            ByteBuffer byteBuffer = iVar.f16830e;
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
                        a4.n nVar = this.I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        nVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final void setPlaybackSpeed(float f9, float f10) {
        super.setPlaybackSpeed(f9, f10);
        s sVar = this.F0;
        sVar.f7083i = f9;
        sVar.f7087m = 0L;
        sVar.f7090p = -1L;
        sVar.f7088n = -1L;
        sVar.c(false);
    }

    @Override
    public final void t(Exception exc) {
        f5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.f50824a;
        if (handler != null) {
            handler.post(new ef.c(14, bVar, exc));
        }
    }

    @Override
    public final void u(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.f50824a;
        if (handler != null) {
            str2 = str;
            handler.post(new x(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.L0 = R(str2);
        a4.q qVar = this.P;
        qVar.getClass();
        boolean z10 = false;
        if (d0.f6579a >= 29 && "video/x-vnd.on2.vp9".equals(qVar.f105b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = qVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.M0 = z10;
        if (d0.f6579a >= 23 && this.f7060j1) {
            a4.n nVar = this.I;
            nVar.getClass();
            this.l1 = new i(this, nVar);
        }
    }

    @Override
    public final void v(String str) {
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.f50824a;
        if (handler != null) {
            handler.post(new ef.c(13, bVar, str));
        }
    }

    @Override
    public final m3.l w(u0 u0Var) {
        m3.l w10 = super.w(u0Var);
        t0 t0Var = u0Var.f10815b;
        ze.b bVar = this.G0;
        Handler handler = (Handler) bVar.f50824a;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar, t0Var, w10, 9));
        }
        return w10;
    }

    @Override
    public final void x(t0 t0Var, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        a4.n nVar = this.I;
        if (nVar != null) {
            nVar.g(this.Q0);
        }
        if (this.f7060j1) {
            this.f7055e1 = t0Var.G;
            this.f7056f1 = t0Var.H;
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
            this.f7055e1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f7056f1 = integer2;
        }
        float f9 = t0Var.K;
        int i10 = t0Var.J;
        this.f7058h1 = f9;
        if (d0.f6579a >= 21) {
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f7055e1;
                this.f7055e1 = this.f7056f1;
                this.f7056f1 = i11;
                this.f7058h1 = 1.0f / f9;
            }
        } else {
            this.f7057g1 = i10;
        }
        float f10 = t0Var.I;
        s sVar = this.F0;
        sVar.f7081f = f10;
        e eVar = sVar.f7077a;
        eVar.f7039a.c();
        eVar.f7040b.c();
        eVar.f7041c = false;
        eVar.d = -9223372036854775807L;
        eVar.f7042e = 0;
        sVar.b();
    }

    @Override
    public final void z(long j10) {
        super.z(j10);
        if (!this.f7060j1) {
            this.Z0--;
        }
    }
}
