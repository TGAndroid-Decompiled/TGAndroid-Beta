package a3;

import ai.f8;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import b2.h1;
import b2.k1;
import b2.r0;
import b2.v1;
import b2.x1;
import e9.a1;
import i2.n1;
import i2.p1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import u2.b1;
public final class n extends r2.s {
    public static final int[] M1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean N1;
    public static boolean O1;
    public long A1;
    public x1 B1;
    public x1 C1;
    public int D1;
    public boolean E1;
    public int F1;
    public m G1;
    public y H1;
    public long I1;
    public long J1;
    public boolean K1;
    public int L1;
    public final Context W0;
    public final boolean X0;
    public final pf.b Y0;
    public final int Z0;
    public final boolean f161a1;
    public final a0 f162b1;
    public final z f163c1;
    public final long f164d1;
    public final PriorityQueue f165e1;
    public l f166f1;
    public boolean f167g1;
    public boolean f168h1;
    public o0 f169i1;
    public boolean f170j1;
    public int f171k1;
    public List l1;
    public Surface f172m1;
    public p f173n1;
    public e2.w f174o1;
    public boolean f175p1;
    public int f176q1;
    public int f177r1;
    public long f178s1;
    public int f179t1;
    public int f180u1;
    public int f181v1;
    public p1 f182w1;
    public boolean f183x1;
    public long f184y1;
    public int f185z1;

    public n(k kVar) {
        super(2, kVar.f148c, 30.0f);
        boolean z10;
        Context applicationContext = kVar.f146a.getApplicationContext();
        this.W0 = applicationContext;
        this.Z0 = kVar.f151g;
        this.f169i1 = null;
        this.Y0 = new pf.b(kVar.f149e, kVar.f150f);
        if (this.f169i1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0 = z10;
        this.f162b1 = new a0(applicationContext, this, kVar.d);
        this.f163c1 = new z();
        this.f161a1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f174o1 = e2.w.f8587c;
        this.f176q1 = 1;
        this.f177r1 = 0;
        this.B1 = x1.d;
        this.F1 = 0;
        this.C1 = null;
        this.D1 = -1000;
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        this.f165e1 = new PriorityQueue();
        this.f164d1 = -9223372036854775807L;
        this.f182w1 = null;
    }

    public static List A0(Context context, r2.j jVar, b2.s sVar, boolean z10, boolean z11) {
        List a2;
        String str = sVar.f3643r;
        if (str == null) {
            return a1.f8715e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c2.d.d(context)) {
            String b10 = r2.x.b(sVar);
            if (b10 == null) {
                a2 = a1.f8715e;
            } else {
                a2 = jVar.a(b10, z10, z11);
            }
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return r2.x.f(jVar, sVar, z10, z11);
    }

    public static int B0(r2.p pVar, b2.s sVar) {
        int i10 = sVar.f3644s;
        List list = sVar.f3646u;
        if (i10 != -1) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return sVar.f3644s + i11;
        }
        return z0(pVar, sVar);
    }

    public static boolean y0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.y0(java.lang.String):boolean");
    }

    public static int z0(r2.p r11, b2.s r12) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.z0(r2.p, b2.s):int");
    }

    public final android.view.Surface C0(r2.p r6) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.C0(r2.p):android.view.Surface");
    }

    @Override
    public final i2.h D(r2.p pVar, b2.s sVar, b2.s sVar2) {
        int i10;
        i2.h b10 = pVar.b(sVar, sVar2);
        int i11 = b10.f11720e;
        l lVar = this.f166f1;
        lVar.getClass();
        if (sVar2.f3649y > lVar.f155a || sVar2.f3650z > lVar.f156b) {
            i11 |= 256;
        }
        if (B0(pVar, sVar2) > lVar.f157c) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = pVar.f46894a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.h(str, sVar, sVar2, i10, i12);
    }

    public final boolean D0(r2.p pVar) {
        if (this.f169i1 == null) {
            Surface surface = this.f172m1;
            if (surface == null || !surface.isValid()) {
                if ((Build.VERSION.SDK_INT < 35 || !pVar.h) && !L0(pVar)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final r2.o E(IllegalStateException illegalStateException, r2.p pVar) {
        Surface surface = this.f172m1;
        r2.o oVar = new r2.o(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return oVar;
    }

    public final boolean E0(h2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j3 = this.J1;
        if (j3 == -9223372036854775807L || j3 - (hVar.f10986e - this.O0.f46910c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void F0() {
        if (this.f179t1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f178s1;
            int i10 = this.f179t1;
            pf.b bVar = this.Y0;
            Handler handler = (Handler) bVar.f45556b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.f179t1 = 0;
            this.f178s1 = elapsedRealtime;
        }
    }

    public final void G0() {
        if (this.E1) {
            int i10 = Build.VERSION.SDK_INT;
            r2.m mVar = this.f46912b0;
            if (mVar != null) {
                this.G1 = new m(this, mVar);
                if (i10 >= 33) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("tunnel-peek", 1);
                    mVar.setParameters(bundle);
                }
            }
        }
    }

    public final void H0(long j3) {
        boolean z10;
        Surface surface;
        x0(j3);
        x1 x1Var = this.B1;
        boolean equals = x1Var.equals(x1.d);
        pf.b bVar = this.Y0;
        if (!equals && !x1Var.equals(this.C1)) {
            this.C1 = x1Var;
            bVar.V(x1Var);
        }
        this.N0.f11697e++;
        a0 a0Var = this.f162b1;
        if (a0Var.f66e != 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        a0Var.f66e = 3;
        a0Var.f72l.getClass();
        a0Var.f68g = e2.d0.P(SystemClock.elapsedRealtime());
        if (z10 && (surface = this.f172m1) != null) {
            bVar.R(surface);
            this.f175p1 = true;
        }
        c0(j3);
    }

    public final void I0(r2.m mVar, int i10, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mVar.f(i10, j3);
        Trace.endSection();
        this.N0.f11697e++;
        boolean z10 = false;
        this.f180u1 = 0;
        if (this.f169i1 == null) {
            x1 x1Var = this.B1;
            boolean equals = x1Var.equals(x1.d);
            pf.b bVar = this.Y0;
            if (!equals && !x1Var.equals(this.C1)) {
                this.C1 = x1Var;
                bVar.V(x1Var);
            }
            a0 a0Var = this.f162b1;
            if (a0Var.f66e != 3) {
                z10 = true;
            }
            a0Var.f66e = 3;
            a0Var.f72l.getClass();
            a0Var.f68g = e2.d0.P(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f172m1) != null) {
                bVar.R(surface);
                this.f175p1 = true;
            }
        }
    }

    public final void J0(Object obj) {
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.f172m1;
        pf.b bVar = this.Y0;
        if (surface2 != surface) {
            this.f172m1 = surface;
            o0 o0Var = this.f169i1;
            a0 a0Var = this.f162b1;
            if (o0Var == null) {
                a0Var.h(surface);
            }
            this.f175p1 = false;
            int i10 = this.f11649n;
            r2.m mVar = this.f46912b0;
            if (mVar != null && this.f169i1 == null) {
                r2.p pVar = this.f46919i0;
                pVar.getClass();
                boolean D0 = D0(pVar);
                int i11 = Build.VERSION.SDK_INT;
                if (D0 && !this.f167g1) {
                    Surface C0 = C0(pVar);
                    if (C0 != null) {
                        try {
                            mVar.j(C0);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            throw new IllegalArgumentException(th2);
                        }
                    } else if (i11 >= 35) {
                        mVar.e();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i0();
                    T();
                }
            }
            if (surface != null) {
                x1 x1Var = this.C1;
                if (x1Var != null) {
                    bVar.V(x1Var);
                }
            } else {
                this.C1 = null;
                o0 o0Var2 = this.f169i1;
                if (o0Var2 != null) {
                    o0Var2.k();
                }
            }
            if (i10 == 2) {
                o0 o0Var3 = this.f169i1;
                if (o0Var3 != null) {
                    o0Var3.q(true);
                } else {
                    a0Var.c(true);
                }
            }
            G0();
        } else if (surface != null) {
            x1 x1Var2 = this.C1;
            if (x1Var2 != null) {
                bVar.V(x1Var2);
            }
            Surface surface3 = this.f172m1;
            if (surface3 != null && this.f175p1) {
                bVar.R(surface3);
            }
        }
    }

    public final boolean K0(long j3, long j10, boolean z10, boolean z11) {
        if (this.f169i1 != null && this.X0) {
            j10 -= -this.I1;
        }
        if (j3 < -500000 && !z10) {
            b1 b1Var = this.f11650r;
            b1Var.getClass();
            int j11 = b1Var.j(j10 - this.v);
            if (j11 != 0) {
                PriorityQueue priorityQueue = this.f165e1;
                if (z11) {
                    i2.g gVar = this.N0;
                    int i10 = gVar.d + j11;
                    gVar.d = i10;
                    gVar.f11698f += this.f181v1;
                    gVar.d = priorityQueue.size() + i10;
                } else {
                    this.N0.f11701j++;
                    N0(priorityQueue.size() + j11, this.f181v1);
                }
                if (J()) {
                    T();
                }
                o0 o0Var = this.f169i1;
                if (o0Var != null) {
                    o0Var.m(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int L(h2.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.f182w1 != null || this.E1) && hVar.f10986e < this.f11652w && !E0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean L0(r2.p pVar) {
        if (!this.E1 && !y0(pVar.f46894a)) {
            if (!pVar.f46898f || p.b(this.W0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final float M(float f7, b2.s sVar, b2.s[] sVarArr) {
        float f10;
        r2.p pVar;
        float f11 = -1.0f;
        for (b2.s sVar2 : sVarArr) {
            float f12 = sVar2.C;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            f10 = -1.0f;
        } else {
            f10 = f11 * f7;
        }
        if (this.f182w1 != null && (pVar = this.f46919i0) != null) {
            int i10 = sVar.f3649y;
            int i11 = sVar.f3650z;
            float f13 = -3.4028235E38f;
            if (pVar.f46900i) {
                float f14 = pVar.f46903l;
                if (f14 != -3.4028235E38f && pVar.f46901j == i10 && pVar.f46902k == i11) {
                    f13 = f14;
                } else {
                    float f15 = 1024.0f;
                    if (pVar.g(i10, i11, 1024.0f)) {
                        f13 = 1024.0f;
                    } else {
                        f13 = 0.0f;
                        while (true) {
                            float f16 = f15 - f13;
                            if (Math.abs(f16) <= 5.0f) {
                                break;
                            }
                            float f17 = (f16 / 2.0f) + f13;
                            if (pVar.g(i10, i11, f17)) {
                                f13 = f17;
                            } else {
                                f15 = f17;
                            }
                        }
                    }
                    pVar.f46903l = f13;
                    pVar.f46901j = i10;
                    pVar.f46902k = i11;
                }
            }
            if (f10 != -1.0f) {
                return Math.max(f10, f13);
            }
            return f13;
        }
        return f10;
    }

    public final void M0(r2.m mVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        mVar.c(i10);
        Trace.endSection();
        this.N0.f11698f++;
    }

    @Override
    public final ArrayList N(r2.j jVar, b2.s sVar, boolean z10) {
        List A0 = A0(this.W0, jVar, sVar, z10, this.E1);
        HashMap hashMap = r2.x.f46939a;
        ArrayList arrayList = new ArrayList(A0);
        Collections.sort(arrayList, new f8(new m4.w(sVar, 28), 3));
        return arrayList;
    }

    public final void N0(int i10, int i11) {
        i2.g gVar = this.N0;
        gVar.h += i10;
        int i12 = i10 + i11;
        gVar.f11699g += i12;
        this.f179t1 += i12;
        int i13 = this.f180u1 + i12;
        this.f180u1 = i13;
        gVar.f11700i = Math.max(i13, gVar.f11700i);
        int i14 = this.Z0;
        if (i14 > 0 && this.f179t1 >= i14) {
            F0();
        }
    }

    public final void O0(long j3) {
        i2.g gVar = this.N0;
        gVar.f11702k += j3;
        gVar.f11703l++;
        this.f184y1 += j3;
        this.f185z1++;
    }

    @Override
    public final com.google.firebase.messaging.n P(r2.p pVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
        b2.j jVar;
        int i10;
        l lVar;
        boolean z10;
        int i11;
        int i12;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i13;
        int i14;
        char c10;
        boolean z11;
        int i15;
        boolean z12;
        int z02;
        String str = pVar.f46896c;
        b2.s[] sVarArr = this.f11651s;
        sVarArr.getClass();
        int i16 = sVar.f3649y;
        float f10 = sVar.C;
        b2.j jVar2 = sVar.H;
        int i17 = sVar.f3650z;
        int B0 = B0(pVar, sVar);
        if (sVarArr.length == 1) {
            if (B0 != -1 && (z02 = z0(pVar, sVar)) != -1) {
                B0 = Math.min((int) (B0 * 1.5f), z02);
            }
            lVar = new l(i16, i17, B0);
            jVar = jVar2;
            i10 = i17;
        } else {
            int length = sVarArr.length;
            int i18 = i16;
            int i19 = i17;
            int i20 = 0;
            boolean z13 = false;
            while (i20 < length) {
                b2.s sVar2 = sVarArr[i20];
                b2.s[] sVarArr2 = sVarArr;
                if (jVar2 != null && sVar2.H == null) {
                    b2.r a2 = sVar2.a();
                    a2.G = jVar2;
                    sVar2 = new b2.s(a2);
                }
                i2.h b10 = pVar.b(sVar, sVar2);
                int i21 = length;
                int i22 = sVar2.f3650z;
                if (b10.d != 0) {
                    int i23 = sVar2.f3649y;
                    i14 = i20;
                    c10 = 65535;
                    if (i23 != -1 && i22 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i18 = Math.max(i18, i23);
                    i19 = Math.max(i19, i22);
                    B0 = Math.max(B0, B0(pVar, sVar2));
                } else {
                    i14 = i20;
                    c10 = 65535;
                }
                length = i21;
                i20 = i14 + 1;
                sVarArr = sVarArr2;
            }
            if (z13) {
                e2.a.n("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i18 + "x" + i19);
                if (i17 > i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = i17;
                } else {
                    i11 = i16;
                }
                boolean z14 = z10;
                if (z10) {
                    i12 = i16;
                } else {
                    i12 = i17;
                }
                float f11 = i12 / i11;
                int i24 = 0;
                while (true) {
                    jVar = jVar2;
                    if (i24 >= 9) {
                        break;
                    }
                    int i25 = M1[i24];
                    int i26 = i24;
                    int i27 = (int) (i25 * f11);
                    if (i25 <= i11 || i27 <= i12) {
                        break;
                    }
                    if (!z14) {
                        i27 = i25;
                    }
                    if (!z14) {
                        i25 = i27;
                    }
                    int i28 = i12;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i13 = i11;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i13 = i11;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(e2.d0.f(i27, widthAlignment) * widthAlignment, e2.d0.f(i25, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i10 = i17;
                        if (pVar.g(point.x, point.y, f10)) {
                            break;
                        }
                    } else {
                        i10 = i17;
                    }
                    i24 = i26 + 1;
                    i17 = i10;
                    jVar2 = jVar;
                    i12 = i28;
                    i11 = i13;
                }
                i10 = i17;
                point = null;
                if (point != null) {
                    i18 = Math.max(i18, point.x);
                    i19 = Math.max(i19, point.y);
                    b2.r a10 = sVar.a();
                    a10.f3591x = i18;
                    a10.f3592y = i19;
                    B0 = Math.max(B0, z0(pVar, new b2.s(a10)));
                    e2.a.n("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i19);
                }
            } else {
                jVar = jVar2;
                i10 = i17;
            }
            lVar = new l(i18, i19, B0);
        }
        this.f166f1 = lVar;
        if (this.E1) {
            i15 = this.F1;
        } else {
            i15 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i16);
        mediaFormat.setInteger("height", i10);
        e2.d.o(mediaFormat, sVar.f3646u);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        e2.d.n(mediaFormat, "rotation-degrees", sVar.D);
        if (jVar != null) {
            b2.j jVar3 = jVar;
            e2.d.n(mediaFormat, "color-transfer", jVar3.f3354c);
            e2.d.n(mediaFormat, "color-standard", jVar3.f3352a);
            e2.d.n(mediaFormat, "color-range", jVar3.f3353b);
            byte[] bArr = jVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(sVar.f3643r)) {
            HashMap hashMap = r2.x.f46939a;
            Pair b11 = e2.e.b(sVar);
            if (b11 != null) {
                e2.d.n(mediaFormat, "profile", ((Integer) b11.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", lVar.f155a);
        mediaFormat.setInteger("max-height", lVar.f156b);
        e2.d.n(mediaFormat, "max-input-size", lVar.f157c);
        int i29 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (this.f161a1) {
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
        if (i29 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.D1));
        }
        Surface C0 = C0(pVar);
        if (this.f169i1 != null && !e2.d0.K(this.W0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.firebase.messaging.n(pVar, mediaFormat, sVar, C0, mediaCrypto, null);
    }

    @Override
    public final void Q(h2.h hVar) {
        if (this.f168h1) {
            ByteBuffer byteBuffer = hVar.f10987f;
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
                        r2.m mVar = this.f46912b0;
                        mVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final boolean V(b2.s sVar) {
        o0 o0Var = this.f169i1;
        if (o0Var != null && !o0Var.v()) {
            try {
                return this.f169i1.d(sVar);
            } catch (n0 e7) {
                throw d(e7, sVar, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void W(Exception exc) {
        e2.a.f("MediaCodecVideoRenderer", "Video codec error", exc);
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f45556b;
        if (handler != null) {
            handler.post(new a1.f(3, bVar, exc));
        }
    }

    @Override
    public final void X(long j3, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f45556b;
        if (handler != null) {
            str2 = str;
            handler.post(new g0(bVar, str2, j3, j10, 0));
        } else {
            str2 = str;
        }
        this.f167g1 = y0(str2);
        r2.p pVar = this.f46919i0;
        pVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(pVar.f46895b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.d;
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
        this.f168h1 = z10;
        G0();
    }

    @Override
    public final void Y(String str) {
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f45556b;
        if (handler != null) {
            handler.post(new a1.f(4, bVar, str));
        }
    }

    @Override
    public final i2.h Z(n4.x xVar) {
        i2.h Z = super.Z(xVar);
        b2.s sVar = (b2.s) xVar.f16613c;
        sVar.getClass();
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f45556b;
        if (handler != null) {
            handler.post(new k0(bVar, sVar, Z, 0));
        }
        return Z;
    }

    @Override
    public final void a0(b2.s sVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i10;
        int i11;
        r2.m mVar = this.f46912b0;
        if (mVar != null) {
            mVar.i(this.f176q1);
        }
        if (this.E1) {
            i11 = sVar.f3649y;
            i10 = sVar.f3650z;
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
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f7 = sVar.E;
        int i13 = sVar.D;
        if (i13 == 90 || i13 == 270) {
            f7 = 1.0f / f7;
            int i14 = i10;
            i10 = i11;
            i11 = i14;
        }
        this.B1 = new x1(f7, i11, i10);
        o0 o0Var = this.f169i1;
        if (o0Var != null && this.K1) {
            b2.r a2 = sVar.a();
            a2.f3591x = i11;
            a2.f3592y = i10;
            a2.D = f7;
            b2.s sVar2 = new b2.s(a2);
            int i15 = this.f171k1;
            List list = this.l1;
            if (list == null) {
                e9.g0 g0Var = e9.i0.f8752b;
                list = a1.f8715e;
            }
            o0Var.l(sVar2, this.O0.f46909b, i15, list);
            this.f171k1 = 2;
        } else {
            this.f162b1.g(sVar.C);
        }
        this.K1 = false;
    }

    @Override
    public final void c(int i10, Object obj) {
        boolean z10;
        boolean z11 = true;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 != 14) {
                                    switch (i10) {
                                        case 16:
                                            obj.getClass();
                                            this.D1 = ((Integer) obj).intValue();
                                            r2.m mVar = this.f46912b0;
                                            if (mVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.D1));
                                                mVar.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f172m1;
                                            J0(null);
                                            obj.getClass();
                                            ((n) obj).c(1, surface);
                                            return;
                                        case 18:
                                            if (this.f182w1 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            p1 p1Var = (p1) obj;
                                            this.f182w1 = p1Var;
                                            if (p1Var == null) {
                                                z11 = false;
                                            }
                                            if (z10 != z11) {
                                                v0(this.f46913c0);
                                                return;
                                            }
                                            return;
                                        default:
                                            if (i10 == 11) {
                                                i2.j0 j0Var = (i2.j0) obj;
                                                j0Var.getClass();
                                                this.W = j0Var;
                                                return;
                                            }
                                            return;
                                    }
                                }
                                obj.getClass();
                                e2.w wVar = (e2.w) obj;
                                if (wVar.f8588a != 0 && wVar.f8589b != 0) {
                                    this.f174o1 = wVar;
                                    o0 o0Var = this.f169i1;
                                    if (o0Var != null) {
                                        Surface surface2 = this.f172m1;
                                        e2.d.h(surface2);
                                        o0Var.s(surface2, wVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(v1.f3676a)) {
                                o0 o0Var2 = this.f169i1;
                                if (o0Var2 != null && o0Var2.v()) {
                                    this.f169i1.t();
                                    return;
                                }
                                return;
                            }
                            this.l1 = list;
                            o0 o0Var3 = this.f169i1;
                            if (o0Var3 != null) {
                                o0Var3.o(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f177r1 = intValue;
                        o0 o0Var4 = this.f169i1;
                        if (o0Var4 != null) {
                            o0Var4.j(intValue);
                            return;
                        }
                        e0 e0Var = this.f162b1.f64b;
                        if (e0Var.f96j != intValue) {
                            e0Var.f96j = intValue;
                            e0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f176q1 = intValue2;
                    r2.m mVar2 = this.f46912b0;
                    if (mVar2 != null) {
                        mVar2.i(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.F1 != intValue3) {
                    this.F1 = intValue3;
                    if (this.E1) {
                        i0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            y yVar = (y) obj;
            this.H1 = yVar;
            o0 o0Var5 = this.f169i1;
            if (o0Var5 != null) {
                o0Var5.u(yVar);
                return;
            }
            return;
        }
        J0(obj);
    }

    @Override
    public final void c0(long j3) {
        super.c0(j3);
        if (!this.E1) {
            this.f181v1--;
        }
    }

    @Override
    public final void d0() {
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            o0Var.i();
            if (this.I1 == -9223372036854775807L) {
                this.I1 = this.O0.f46909b;
            }
            this.f169i1.h(-this.I1);
        } else {
            this.f162b1.f(2);
        }
        this.K1 = true;
        G0();
    }

    @Override
    public final void e() {
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            int i10 = this.f171k1;
            if (i10 != 0 && i10 != 1) {
                o0Var.w();
                return;
            } else {
                this.f171k1 = 0;
                return;
            }
        }
        a0 a0Var = this.f162b1;
        if (a0Var.f66e == 0) {
            a0Var.f66e = 1;
        }
    }

    @Override
    public final void e0(h2.h hVar) {
        this.L1 = 0;
        int L = L(hVar);
        if ((Build.VERSION.SDK_INT < 34 || (L & 32) == 0) && !this.E1) {
            this.f181v1++;
        }
    }

    @Override
    public final boolean g0(long j3, long j10, r2.m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        mVar.getClass();
        long j12 = j11 - this.O0.f46910c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f165e1;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j11) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        N0(i14, 0);
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            if (z10 && !z11) {
                M0(mVar, i10);
                return true;
            }
            return o0Var.n(j11, new j(this, mVar, i10, j12));
        }
        int a2 = this.f162b1.a(j11, j3, j10, this.O0.f46909b, z10, z11, this.f163c1);
        z zVar = this.f163c1;
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 != 3) {
                        if (a2 == 4 || a2 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a2));
                    }
                    M0(mVar, i10);
                    O0(zVar.f220a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                mVar.c(i10);
                Trace.endSection();
                N0(0, 1);
                O0(zVar.f220a);
                return true;
            }
            long j13 = zVar.f221b;
            long j14 = zVar.f220a;
            if (j13 == this.A1) {
                M0(mVar, i10);
            } else {
                y yVar = this.H1;
                if (yVar != null) {
                    i13 = i10;
                    yVar.a(j12, j13, sVar, this.f46914d0);
                } else {
                    i13 = i10;
                }
                I0(mVar, i13, j13);
            }
            O0(j14);
            this.A1 = j13;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        y yVar2 = this.H1;
        if (yVar2 != null) {
            yVar2.a(j12, nanoTime, sVar, this.f46914d0);
        }
        I0(mVar, i10, nanoTime);
        O0(zVar.f220a);
        return true;
    }

    @Override
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void j0() {
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            o0Var.i();
        }
    }

    @Override
    public final boolean l() {
        if (this.J0) {
            o0 o0Var = this.f169i1;
            if (o0Var == null || o0Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l0() {
        super.l0();
        this.f165e1.clear();
        this.f181v1 = 0;
        this.L1 = 0;
        this.f183x1 = false;
    }

    @Override
    public final boolean m() {
        boolean m10 = super.m();
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            return o0Var.r(m10);
        }
        if (m10 && (this.f46912b0 == null || this.E1)) {
            return true;
        }
        return this.f162b1.b(m10);
    }

    @Override
    public final void o() {
        pf.b bVar = this.Y0;
        this.C1 = null;
        this.J1 = -9223372036854775807L;
        G0();
        this.f175p1 = false;
        this.G1 = null;
        this.f183x1 = true;
        try {
            super.o();
        } finally {
            bVar.F(this.N0);
            bVar.V(x1.d);
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        boolean z12;
        o0 o0Var;
        this.N0 = new Object();
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z13 = n1Var.f11804b;
        if (z13 && this.F1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.g(z12);
        if (this.E1 != z13) {
            this.E1 = z13;
            i0();
        }
        i2.g gVar = this.N0;
        pf.b bVar = this.Y0;
        Handler handler = (Handler) bVar.f45556b;
        if (handler != null) {
            handler.post(new j0(bVar, gVar, 0));
        }
        boolean z14 = this.f170j1;
        a0 a0Var = this.f162b1;
        if (!z14) {
            if (this.l1 != null && this.f169i1 == null) {
                q qVar = new q(this.W0, a0Var);
                qVar.f195a = true;
                e2.x xVar = this.h;
                xVar.getClass();
                qVar.f199f = xVar;
                e2.d.g(!qVar.f196b);
                if (((u) qVar.f198e) == null) {
                    qVar.f198e = new u();
                }
                w wVar = new w(qVar);
                qVar.f196b = true;
                wVar.f219n = 1;
                SparseArray sparseArray = wVar.f210c;
                if (e2.d0.j(sparseArray, 0)) {
                    o0Var = (o0) sparseArray.get(0);
                } else {
                    r rVar = new r(wVar, wVar.f208a);
                    wVar.f213g.add(rVar);
                    sparseArray.put(0, rVar);
                    o0Var = rVar;
                }
                this.f169i1 = o0Var;
            }
            this.f170j1 = true;
        }
        o0 o0Var2 = this.f169i1;
        if (o0Var2 != null) {
            o0Var2.g(new a6.i(this, 1));
            y yVar = this.H1;
            if (yVar != null) {
                this.f169i1.u(yVar);
            }
            if (this.f172m1 != null && !this.f174o1.equals(e2.w.f8587c)) {
                this.f169i1.s(this.f172m1, this.f174o1);
            }
            this.f169i1.j(this.f177r1);
            this.f169i1.a(this.Z);
            List list = this.l1;
            if (list != null) {
                this.f169i1.o(list);
            }
            this.f171k1 = !z11 ? 1 : 0;
            this.R0 = true;
            return;
        }
        e2.x xVar2 = this.h;
        xVar2.getClass();
        a0Var.f72l = xVar2;
        a0Var.f(!z11 ? 1 : 0);
    }

    @Override
    public final boolean p0(h2.h hVar) {
        boolean z10;
        boolean z11 = false;
        if (!E0(hVar)) {
            if (hVar.f10986e < this.f11652w) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !hVar.hasSupplementalData()) {
                if (hVar.notDependedOn()) {
                    hVar.clear();
                    z11 = true;
                }
                if (z11) {
                    if (z10) {
                        this.N0.d++;
                    } else {
                        this.f165e1.add(Long.valueOf(hVar.f10986e));
                        this.L1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void q(long j3, boolean z10) {
        o0 o0Var = this.f169i1;
        if (o0Var != null && !z10) {
            o0Var.m(true);
        }
        super.q(j3, z10);
        o0 o0Var2 = this.f169i1;
        a0 a0Var = this.f162b1;
        if (o0Var2 == null) {
            e0 e0Var = a0Var.f64b;
            e0Var.f99m = 0L;
            e0Var.f102p = -1L;
            e0Var.f100n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f67f = -9223372036854775807L;
            a0Var.f66e = Math.min(a0Var.f66e, 1);
            a0Var.f69i = -9223372036854775807L;
        }
        if (z10) {
            o0 o0Var3 = this.f169i1;
            if (o0Var3 != null) {
                o0Var3.q(false);
            } else {
                a0Var.c(false);
            }
        }
        G0();
        this.f180u1 = 0;
    }

    @Override
    public final boolean q0() {
        b2.s sVar = this.f46913c0;
        if (this.f182w1 != null && !this.f183x1 && !this.E1) {
            if ((sVar == null || sVar.f3645t <= 0) && !this.S0 && this.H0 == -9223372036854775807L) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void r() {
        o0 o0Var = this.f169i1;
        if (o0Var != null && this.X0) {
            o0Var.release();
        }
    }

    @Override
    public final boolean r0(r2.p pVar) {
        return D0(pVar);
    }

    @Override
    public final void s() {
        try {
            this.f46932w0 = false;
            k0();
            i0();
            hg.c.A(this.V, null);
            this.V = null;
        } finally {
            this.f170j1 = false;
            this.I1 = -9223372036854775807L;
            p pVar = this.f173n1;
            if (pVar != null) {
                pVar.release();
                this.f173n1 = null;
            }
        }
    }

    @Override
    public final boolean s0() {
        r2.p pVar = this.f46919i0;
        if (this.f169i1 != null && pVar != null) {
            String str = pVar.f46894a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.s0();
    }

    @Override
    public final void t() {
        this.f179t1 = 0;
        this.h.getClass();
        this.f178s1 = SystemClock.elapsedRealtime();
        this.f184y1 = 0L;
        this.f185z1 = 0;
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            o0Var.f();
        } else {
            this.f162b1.d();
        }
    }

    @Override
    public final void u() {
        F0();
        int i10 = this.f185z1;
        if (i10 != 0) {
            long j3 = this.f184y1;
            pf.b bVar = this.Y0;
            Handler handler = (Handler) bVar.f45556b;
            if (handler != null) {
                handler.post(new i0(bVar, j3, i10));
            }
            this.f184y1 = 0L;
            this.f185z1 = 0;
        }
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            o0Var.e();
        } else {
            this.f162b1.e();
        }
    }

    @Override
    public final int u0(r2.j jVar, b2.s sVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!r0.m(sVar.f3643r)) {
            return hg.c.b(0, 0, 0, 0);
        }
        if (sVar.v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.W0;
        List A0 = A0(context, jVar, sVar, z10, false);
        if (z10 && A0.isEmpty()) {
            A0 = A0(context, jVar, sVar, false, false);
        }
        if (A0.isEmpty()) {
            return hg.c.b(1, 0, 0, 0);
        }
        int i15 = sVar.S;
        if (i15 != 0 && i15 != 2) {
            return hg.c.b(2, 0, 0, 0);
        }
        r2.p pVar = (r2.p) A0.get(0);
        boolean e7 = pVar.e(sVar);
        if (!e7) {
            for (int i16 = 1; i16 < A0.size(); i16++) {
                r2.p pVar2 = (r2.p) A0.get(i16);
                if (pVar2.e(sVar)) {
                    z11 = false;
                    e7 = true;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (e7) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (pVar.f(sVar)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (pVar.f46899g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(sVar.f3643r) && !c2.d.d(context)) {
            i13 = 256;
        }
        if (e7) {
            List A02 = A0(context, jVar, sVar, z10, true);
            if (!A02.isEmpty()) {
                HashMap hashMap = r2.x.f46939a;
                ArrayList arrayList = new ArrayList(A02);
                Collections.sort(arrayList, new f8(new m4.w(sVar, 28), 3));
                r2.p pVar3 = (r2.p) arrayList.get(0);
                if (pVar3.e(sVar) && pVar3.f(sVar)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        super.v(sVarArr, j3, j10, f0Var);
        k1 k1Var = this.F;
        if (k1Var.p()) {
            this.J1 = -9223372036854775807L;
            return;
        }
        f0Var.getClass();
        this.J1 = k1Var.g(f0Var.f48570a, new h1()).d;
    }

    @Override
    public final void x(long j3, long j10) {
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            try {
                o0Var.p(j3, j10);
            } catch (n0 e7) {
                throw d(e7, e7.f186a, false, 7001);
            }
        }
        super.x(j3, j10);
    }

    @Override
    public final void z(float f7, float f10) {
        super.z(f7, f10);
        o0 o0Var = this.f169i1;
        if (o0Var != null) {
            o0Var.a(f7);
        } else {
            this.f162b1.i(f7);
        }
    }
}
