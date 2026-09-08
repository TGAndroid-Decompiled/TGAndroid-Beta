package a3;

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
import bi.l7;
import e9.a1;
import i2.m1;
import i2.o1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import ji.k5;
import u2.b1;
public final class n extends r2.r {
    public static final int[] N1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean O1;
    public static boolean P1;
    public int A1;
    public long B1;
    public x1 C1;
    public x1 D1;
    public int E1;
    public boolean F1;
    public int G1;
    public m H1;
    public y I1;
    public long J1;
    public long K1;
    public boolean L1;
    public int M1;
    public final Context X0;
    public final boolean Y0;
    public final pf.b Z0;
    public final int f159a1;
    public final boolean f160b1;
    public final a0 f161c1;
    public final z f162d1;
    public final long f163e1;
    public final PriorityQueue f164f1;
    public l f165g1;
    public boolean f166h1;
    public boolean f167i1;
    public o0 f168j1;
    public boolean f169k1;
    public int l1;
    public List f170m1;
    public Surface f171n1;
    public p f172o1;
    public e2.w f173p1;
    public boolean f174q1;
    public int f175r1;
    public int f176s1;
    public long f177t1;
    public int f178u1;
    public int f179v1;
    public int f180w1;
    public o1 f181x1;
    public boolean f182y1;
    public long f183z1;

    public n(k kVar) {
        super(2, kVar.f146c, 30.0f);
        boolean z10;
        Context applicationContext = kVar.f144a.getApplicationContext();
        this.X0 = applicationContext;
        this.f159a1 = kVar.f149g;
        this.f168j1 = null;
        this.Z0 = new pf.b(kVar.f147e, kVar.f148f);
        if (this.f168j1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y0 = z10;
        this.f161c1 = new a0(applicationContext, this, kVar.d);
        this.f162d1 = new z();
        this.f160b1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f173p1 = e2.w.f8820c;
        this.f175r1 = 1;
        this.f176s1 = 0;
        this.C1 = x1.d;
        this.G1 = 0;
        this.D1 = null;
        this.E1 = -1000;
        this.J1 = -9223372036854775807L;
        this.K1 = -9223372036854775807L;
        this.f164f1 = new PriorityQueue();
        this.f163e1 = -9223372036854775807L;
        this.f181x1 = null;
    }

    public static int A0(r2.o r11, b2.s r12) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.A0(r2.o, b2.s):int");
    }

    public static List B0(Context context, r2.i iVar, b2.s sVar, boolean z10, boolean z11) {
        List a2;
        String str = sVar.f2397r;
        if (str == null) {
            return a1.f8948e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c2.d.d(context)) {
            String b10 = r2.w.b(sVar);
            if (b10 == null) {
                a2 = a1.f8948e;
            } else {
                a2 = iVar.a(b10, z10, z11);
            }
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return r2.w.f(iVar, sVar, z10, z11);
    }

    public static int C0(r2.o oVar, b2.s sVar) {
        int i10 = sVar.f2398s;
        List list = sVar.f2400u;
        if (i10 != -1) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += ((byte[]) list.get(i12)).length;
            }
            return sVar.f2398s + i11;
        }
        return A0(oVar, sVar);
    }

    public static boolean z0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.z0(java.lang.String):boolean");
    }

    @Override
    public final i2.i D(r2.o oVar, b2.s sVar, b2.s sVar2) {
        int i10;
        i2.i b10 = oVar.b(sVar, sVar2);
        int i11 = b10.f11613e;
        l lVar = this.f165g1;
        lVar.getClass();
        if (sVar2.f2403y > lVar.f153a || sVar2.f2404z > lVar.f154b) {
            i11 |= 256;
        }
        if (C0(oVar, sVar2) > lVar.f155c) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = oVar.f44859a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = b10.d;
        }
        return new i2.i(str, sVar, sVar2, i10, i12);
    }

    public final android.view.Surface D0(r2.o r6) {
        throw new UnsupportedOperationException("Method not decompiled: a3.n.D0(r2.o):android.view.Surface");
    }

    @Override
    public final r2.n E(IllegalStateException illegalStateException, r2.o oVar) {
        Surface surface = this.f171n1;
        r2.n nVar = new r2.n(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final boolean E0(r2.o oVar) {
        if (this.f168j1 == null) {
            Surface surface = this.f171n1;
            if (surface == null || !surface.isValid()) {
                if ((Build.VERSION.SDK_INT < 35 || !oVar.h) && !L0(oVar)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean F0(h2.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j3 = this.K1;
        if (j3 == -9223372036854775807L || j3 - (hVar.f10877e - this.P0.f44875c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void G0() {
        if (this.f178u1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f177t1;
            int i10 = this.f178u1;
            pf.b bVar = this.Z0;
            Handler handler = (Handler) bVar.f44073b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.f178u1 = 0;
            this.f177t1 = elapsedRealtime;
        }
    }

    public final void H0() {
        int i10;
        r2.l lVar;
        if (this.F1 && (i10 = Build.VERSION.SDK_INT) >= 23 && (lVar = this.f44877b0) != null) {
            this.H1 = new m(this, lVar);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.setParameters(bundle);
            }
        }
    }

    public final void I0(r2.l lVar, int i10, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.f(i10, j3);
        Trace.endSection();
        this.O0.f11601e++;
        boolean z10 = false;
        this.f179v1 = 0;
        if (this.f168j1 == null) {
            x1 x1Var = this.C1;
            boolean equals = x1Var.equals(x1.d);
            pf.b bVar = this.Z0;
            if (!equals && !x1Var.equals(this.D1)) {
                this.D1 = x1Var;
                bVar.l0(x1Var);
            }
            a0 a0Var = this.f161c1;
            if (a0Var.f64e != 3) {
                z10 = true;
            }
            a0Var.f64e = 3;
            a0Var.f70l.getClass();
            a0Var.f66g = e2.d0.Q(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f171n1) != null) {
                bVar.g0(surface);
                this.f174q1 = true;
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
        Surface surface2 = this.f171n1;
        pf.b bVar = this.Z0;
        if (surface2 != surface) {
            this.f171n1 = surface;
            o0 o0Var = this.f168j1;
            a0 a0Var = this.f161c1;
            if (o0Var == null) {
                a0Var.h(surface);
            }
            this.f174q1 = false;
            int i10 = this.f11525n;
            r2.l lVar = this.f44877b0;
            if (lVar != null && this.f168j1 == null) {
                r2.o oVar = this.f44884i0;
                oVar.getClass();
                boolean E0 = E0(oVar);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23 && E0 && !this.f166h1) {
                    Surface D0 = D0(oVar);
                    if (i11 >= 23 && D0 != null) {
                        try {
                            lVar.k(D0);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            throw new IllegalArgumentException(th2);
                        }
                    } else if (i11 >= 35) {
                        lVar.e();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j0();
                    U();
                }
            }
            if (surface != null) {
                x1 x1Var = this.D1;
                if (x1Var != null) {
                    bVar.l0(x1Var);
                }
            } else {
                this.D1 = null;
                o0 o0Var2 = this.f168j1;
                if (o0Var2 != null) {
                    o0Var2.k();
                }
            }
            if (i10 == 2) {
                o0 o0Var3 = this.f168j1;
                if (o0Var3 != null) {
                    o0Var3.q(true);
                } else {
                    a0Var.c(true);
                }
            }
            H0();
        } else if (surface != null) {
            x1 x1Var2 = this.D1;
            if (x1Var2 != null) {
                bVar.l0(x1Var2);
            }
            Surface surface3 = this.f171n1;
            if (surface3 != null && this.f174q1) {
                bVar.g0(surface3);
            }
        }
    }

    public final boolean K0(long j3, long j10, boolean z10, boolean z11) {
        if (this.f168j1 != null && this.Y0) {
            j10 -= -this.J1;
        }
        if (j3 < -500000 && !z10) {
            b1 b1Var = this.f11526r;
            b1Var.getClass();
            int m10 = b1Var.m(j10 - this.v);
            if (m10 != 0) {
                PriorityQueue priorityQueue = this.f164f1;
                if (z11) {
                    i2.h hVar = this.O0;
                    int i10 = hVar.d + m10;
                    hVar.d = i10;
                    hVar.f11602f += this.f180w1;
                    hVar.d = priorityQueue.size() + i10;
                } else {
                    this.O0.f11605j++;
                    N0(priorityQueue.size() + m10, this.f180w1);
                }
                if (J()) {
                    U();
                }
                o0 o0Var = this.f168j1;
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
            if ((this.f181x1 != null || this.F1) && hVar.f10877e < this.f11528w && !F0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean L0(r2.o oVar) {
        if (Build.VERSION.SDK_INT >= 23 && !this.F1 && !z0(oVar.f44859a)) {
            if (!oVar.f44863f || p.b(this.X0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean M() {
        if (this.F1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return false;
    }

    public final void M0(r2.l lVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        lVar.c(i10);
        Trace.endSection();
        this.O0.f11602f++;
    }

    @Override
    public final float N(float f7, b2.s sVar, b2.s[] sVarArr) {
        float f10;
        r2.o oVar;
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
        if (this.f181x1 != null && (oVar = this.f44884i0) != null) {
            int i10 = sVar.f2403y;
            int i11 = sVar.f2404z;
            float f13 = -3.4028235E38f;
            if (oVar.f44865i) {
                float f14 = oVar.f44868l;
                if (f14 != -3.4028235E38f && oVar.f44866j == i10 && oVar.f44867k == i11) {
                    f13 = f14;
                } else {
                    float f15 = 1024.0f;
                    if (oVar.g(i10, i11, 1024.0f)) {
                        f13 = 1024.0f;
                    } else {
                        f13 = 0.0f;
                        while (true) {
                            float f16 = f15 - f13;
                            if (Math.abs(f16) <= 5.0f) {
                                break;
                            }
                            float f17 = (f16 / 2.0f) + f13;
                            if (oVar.g(i10, i11, f17)) {
                                f13 = f17;
                            } else {
                                f15 = f17;
                            }
                        }
                    }
                    oVar.f44868l = f13;
                    oVar.f44866j = i10;
                    oVar.f44867k = i11;
                }
            }
            if (f10 != -1.0f) {
                return Math.max(f10, f13);
            }
            return f13;
        }
        return f10;
    }

    public final void N0(int i10, int i11) {
        i2.h hVar = this.O0;
        hVar.h += i10;
        int i12 = i10 + i11;
        hVar.f11603g += i12;
        this.f178u1 += i12;
        int i13 = this.f179v1 + i12;
        this.f179v1 = i13;
        hVar.f11604i = Math.max(i13, hVar.f11604i);
        int i14 = this.f159a1;
        if (i14 > 0 && this.f178u1 >= i14) {
            G0();
        }
    }

    @Override
    public final ArrayList O(r2.i iVar, b2.s sVar, boolean z10) {
        List B0 = B0(this.X0, iVar, sVar, z10, this.F1);
        HashMap hashMap = r2.w.f44904a;
        ArrayList arrayList = new ArrayList(B0);
        Collections.sort(arrayList, new l7(new k5(sVar, 18), 3));
        return arrayList;
    }

    public final void O0(long j3) {
        i2.h hVar = this.O0;
        hVar.f11606k += j3;
        hVar.f11607l++;
        this.f183z1 += j3;
        this.A1++;
    }

    @Override
    public final com.google.firebase.messaging.n Q(r2.o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
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
        boolean z11;
        int i15;
        boolean z12;
        int A0;
        String str = oVar.f44861c;
        b2.s[] sVarArr = this.f11527s;
        sVarArr.getClass();
        int i16 = sVar.f2403y;
        float f10 = sVar.C;
        b2.j jVar2 = sVar.H;
        int i17 = sVar.f2404z;
        int C0 = C0(oVar, sVar);
        if (sVarArr.length == 1) {
            if (C0 != -1 && (A0 = A0(oVar, sVar)) != -1) {
                C0 = Math.min((int) (C0 * 1.5f), A0);
            }
            lVar = new l(i16, i17, C0);
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
                i2.i b10 = oVar.b(sVar, sVar2);
                int i21 = length;
                int i22 = sVar2.f2404z;
                if (b10.d != 0) {
                    int i23 = sVar2.f2403y;
                    i14 = i20;
                    if (i23 != -1 && i22 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i18 = Math.max(i18, i23);
                    i19 = Math.max(i19, i22);
                    C0 = Math.max(C0, C0(oVar, sVar2));
                } else {
                    i14 = i20;
                }
                i20 = i14 + 1;
                sVarArr = sVarArr2;
                length = i21;
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
                    int i25 = N1[i24];
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
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
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
                        if (oVar.g(point.x, point.y, f10)) {
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
                    a10.f2345x = i18;
                    a10.f2346y = i19;
                    C0 = Math.max(C0, A0(oVar, new b2.s(a10)));
                    e2.a.n("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i19);
                }
            } else {
                jVar = jVar2;
                i10 = i17;
            }
            lVar = new l(i18, i19, C0);
        }
        this.f165g1 = lVar;
        if (this.F1) {
            i15 = this.G1;
        } else {
            i15 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i16);
        mediaFormat.setInteger("height", i10);
        e2.d.o(mediaFormat, sVar.f2400u);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        e2.d.n(mediaFormat, "rotation-degrees", sVar.D);
        if (jVar != null) {
            b2.j jVar3 = jVar;
            e2.d.n(mediaFormat, "color-transfer", jVar3.f2108c);
            e2.d.n(mediaFormat, "color-standard", jVar3.f2106a);
            e2.d.n(mediaFormat, "color-range", jVar3.f2107b);
            byte[] bArr = jVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(sVar.f2397r)) {
            HashMap hashMap = r2.w.f44904a;
            Pair b11 = e2.e.b(sVar);
            if (b11 != null) {
                e2.d.n(mediaFormat, "profile", ((Integer) b11.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", lVar.f153a);
        mediaFormat.setInteger("max-height", lVar.f154b);
        e2.d.n(mediaFormat, "max-input-size", lVar.f155c);
        int i29 = Build.VERSION.SDK_INT;
        if (i29 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (this.f160b1) {
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
            mediaFormat.setInteger("importance", Math.max(0, -this.E1));
        }
        Surface D0 = D0(oVar);
        if (this.f168j1 != null && !e2.d0.L(this.X0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.firebase.messaging.n(oVar, mediaFormat, sVar, D0, mediaCrypto, null);
    }

    @Override
    public final void R(h2.h hVar) {
        if (this.f167i1) {
            ByteBuffer byteBuffer = hVar.f10878f;
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
                        r2.l lVar = this.f44877b0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final boolean W(b2.s sVar) {
        o0 o0Var = this.f168j1;
        if (o0Var != null && !o0Var.v()) {
            try {
                return this.f168j1.d(sVar);
            } catch (n0 e7) {
                throw c(e7, sVar, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void X(Exception exc) {
        e2.a.f("MediaCodecVideoRenderer", "Video codec error", exc);
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.f44073b;
        if (handler != null) {
            handler.post(new a1.e(3, bVar, exc));
        }
    }

    @Override
    public final void Y(long j3, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.f44073b;
        if (handler != null) {
            str2 = str;
            handler.post(new g0(bVar, str2, j3, j10, 0));
        } else {
            str2 = str;
        }
        this.f166h1 = z0(str2);
        r2.o oVar = this.f44884i0;
        oVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f44860b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
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
        this.f167i1 = z10;
        H0();
    }

    @Override
    public final void Z(String str) {
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.f44073b;
        if (handler != null) {
            handler.post(new a1.e(4, bVar, str));
        }
    }

    @Override
    public final i2.i a0(n4.y yVar) {
        i2.i a02 = super.a0(yVar);
        b2.s sVar = (b2.s) yVar.f16524c;
        sVar.getClass();
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.f44073b;
        if (handler != null) {
            handler.post(new k0(bVar, sVar, a02, 0));
        }
        return a02;
    }

    @Override
    public final void b0(b2.s sVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i10;
        int i11;
        r2.l lVar = this.f44877b0;
        if (lVar != null) {
            lVar.i(this.f175r1);
        }
        if (this.F1) {
            i11 = sVar.f2403y;
            i10 = sVar.f2404z;
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
        this.C1 = new x1(f7, i11, i10);
        o0 o0Var = this.f168j1;
        if (o0Var != null && this.L1) {
            b2.r a2 = sVar.a();
            a2.f2345x = i11;
            a2.f2346y = i10;
            a2.D = f7;
            b2.s sVar2 = new b2.s(a2);
            int i15 = this.l1;
            List list = this.f170m1;
            if (list == null) {
                e9.g0 g0Var = e9.i0.f8985b;
                list = a1.f8948e;
            }
            o0Var.l(sVar2, this.P0.f44874b, i15, list);
            this.l1 = 2;
        } else {
            this.f161c1.g(sVar.C);
        }
        this.L1 = false;
    }

    @Override
    public final void d(int i10, Object obj) {
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
                                            this.E1 = ((Integer) obj).intValue();
                                            r2.l lVar = this.f44877b0;
                                            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.E1));
                                                lVar.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f171n1;
                                            J0(null);
                                            obj.getClass();
                                            ((n) obj).d(1, surface);
                                            return;
                                        case 18:
                                            if (this.f181x1 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            o1 o1Var = (o1) obj;
                                            this.f181x1 = o1Var;
                                            if (o1Var == null) {
                                                z11 = false;
                                            }
                                            if (z10 != z11) {
                                                w0(this.f44878c0);
                                                return;
                                            }
                                            return;
                                        default:
                                            if (i10 == 11) {
                                                i2.i0 i0Var = (i2.i0) obj;
                                                i0Var.getClass();
                                                this.W = i0Var;
                                                return;
                                            }
                                            return;
                                    }
                                }
                                obj.getClass();
                                e2.w wVar = (e2.w) obj;
                                if (wVar.f8821a != 0 && wVar.f8822b != 0) {
                                    this.f173p1 = wVar;
                                    o0 o0Var = this.f168j1;
                                    if (o0Var != null) {
                                        Surface surface2 = this.f171n1;
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
                            if (list.equals(v1.f2430a)) {
                                o0 o0Var2 = this.f168j1;
                                if (o0Var2 != null && o0Var2.v()) {
                                    this.f168j1.t();
                                    return;
                                }
                                return;
                            }
                            this.f170m1 = list;
                            o0 o0Var3 = this.f168j1;
                            if (o0Var3 != null) {
                                o0Var3.o(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f176s1 = intValue;
                        o0 o0Var4 = this.f168j1;
                        if (o0Var4 != null) {
                            o0Var4.j(intValue);
                            return;
                        }
                        e0 e0Var = this.f161c1.f62b;
                        if (e0Var.f94j != intValue) {
                            e0Var.f94j = intValue;
                            e0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f175r1 = intValue2;
                    r2.l lVar2 = this.f44877b0;
                    if (lVar2 != null) {
                        lVar2.i(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.G1 != intValue3) {
                    this.G1 = intValue3;
                    if (this.F1) {
                        j0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            y yVar = (y) obj;
            this.I1 = yVar;
            o0 o0Var5 = this.f168j1;
            if (o0Var5 != null) {
                o0Var5.u(yVar);
                return;
            }
            return;
        }
        J0(obj);
    }

    @Override
    public final void d0(long j3) {
        super.d0(j3);
        if (!this.F1) {
            this.f180w1--;
        }
    }

    @Override
    public final void e() {
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            int i10 = this.l1;
            if (i10 != 0 && i10 != 1) {
                o0Var.w();
                return;
            } else {
                this.l1 = 0;
                return;
            }
        }
        a0 a0Var = this.f161c1;
        if (a0Var.f64e == 0) {
            a0Var.f64e = 1;
        }
    }

    @Override
    public final void e0() {
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            o0Var.i();
            if (this.J1 == -9223372036854775807L) {
                this.J1 = this.P0.f44874b;
            }
            this.f168j1.h(-this.J1);
        } else {
            this.f161c1.f(2);
        }
        this.L1 = true;
        H0();
    }

    @Override
    public final void f0(h2.h hVar) {
        Surface surface;
        boolean z10 = false;
        this.M1 = 0;
        int L = L(hVar);
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 < 34 || (L & 32) == 0) && !this.F1) {
            this.f180w1++;
        }
        if (i10 < 23 && this.F1) {
            long j3 = hVar.f10877e;
            y0(j3);
            x1 x1Var = this.C1;
            boolean equals = x1Var.equals(x1.d);
            pf.b bVar = this.Z0;
            if (!equals && !x1Var.equals(this.D1)) {
                this.D1 = x1Var;
                bVar.l0(x1Var);
            }
            this.O0.f11601e++;
            a0 a0Var = this.f161c1;
            if (a0Var.f64e != 3) {
                z10 = true;
            }
            a0Var.f64e = 3;
            a0Var.f70l.getClass();
            a0Var.f66g = e2.d0.Q(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f171n1) != null) {
                bVar.g0(surface);
                this.f174q1 = true;
            }
            d0(j3);
        }
    }

    @Override
    public final boolean h0(long j3, long j10, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        lVar.getClass();
        long j12 = j11 - this.P0.f44875c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f164f1;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j11) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        N0(i14, 0);
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            if (z10 && !z11) {
                M0(lVar, i10);
                return true;
            }
            return o0Var.n(j11, new j(this, lVar, i10, j12));
        }
        int a2 = this.f161c1.a(j11, j3, j10, this.P0.f44874b, z10, z11, this.f162d1);
        z zVar = this.f162d1;
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 != 3) {
                        if (a2 == 4 || a2 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a2));
                    }
                    M0(lVar, i10);
                    O0(zVar.f218a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                lVar.c(i10);
                Trace.endSection();
                N0(0, 1);
                O0(zVar.f218a);
                return true;
            }
            long j13 = zVar.f219b;
            long j14 = zVar.f218a;
            if (j13 == this.B1) {
                M0(lVar, i10);
            } else {
                y yVar = this.I1;
                if (yVar != null) {
                    i13 = i10;
                    yVar.c(j12, j13, sVar, this.f44879d0);
                } else {
                    i13 = i10;
                }
                I0(lVar, i13, j13);
            }
            O0(j14);
            this.B1 = j13;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        y yVar2 = this.I1;
        if (yVar2 != null) {
            yVar2.c(j12, nanoTime, sVar, this.f44879d0);
        }
        I0(lVar, i10, nanoTime);
        O0(zVar.f218a);
        return true;
    }

    @Override
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void k0() {
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            o0Var.i();
        }
    }

    @Override
    public final boolean l() {
        if (this.K0) {
            o0 o0Var = this.f168j1;
            if (o0Var == null || o0Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean m() {
        boolean m10 = super.m();
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            return o0Var.r(m10);
        }
        if (m10 && (this.f44877b0 == null || this.F1)) {
            return true;
        }
        return this.f161c1.b(m10);
    }

    @Override
    public final void m0() {
        super.m0();
        this.f164f1.clear();
        this.f180w1 = 0;
        this.M1 = 0;
        this.f182y1 = false;
    }

    @Override
    public final void o() {
        pf.b bVar = this.Z0;
        this.D1 = null;
        this.K1 = -9223372036854775807L;
        H0();
        this.f174q1 = false;
        this.H1 = null;
        this.f182y1 = true;
        try {
            super.o();
        } finally {
            bVar.B(this.O0);
            bVar.l0(x1.d);
        }
    }

    @Override
    public final void p(boolean z10, boolean z11) {
        boolean z12;
        o0 o0Var;
        this.O0 = new Object();
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z13 = m1Var.f11670b;
        if (z13 && this.G1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.g(z12);
        if (this.F1 != z13) {
            this.F1 = z13;
            j0();
        }
        i2.h hVar = this.O0;
        pf.b bVar = this.Z0;
        Handler handler = (Handler) bVar.f44073b;
        if (handler != null) {
            handler.post(new j0(bVar, hVar, 0));
        }
        boolean z14 = this.f169k1;
        a0 a0Var = this.f161c1;
        if (!z14) {
            if (this.f170m1 != null && this.f168j1 == null) {
                q qVar = new q(this.X0, a0Var);
                qVar.f193a = true;
                e2.x xVar = this.h;
                xVar.getClass();
                qVar.f197f = xVar;
                e2.d.g(!qVar.f194b);
                if (((u) qVar.f196e) == null) {
                    qVar.f196e = new u();
                }
                w wVar = new w(qVar);
                qVar.f194b = true;
                wVar.f217n = 1;
                SparseArray sparseArray = wVar.f208c;
                if (e2.d0.j(sparseArray, 0)) {
                    o0Var = (o0) sparseArray.get(0);
                } else {
                    r rVar = new r(wVar, wVar.f206a);
                    wVar.f211g.add(rVar);
                    sparseArray.put(0, rVar);
                    o0Var = rVar;
                }
                this.f168j1 = o0Var;
            }
            this.f169k1 = true;
        }
        o0 o0Var2 = this.f168j1;
        if (o0Var2 != null) {
            o0Var2.g(new a6.i(this, 1));
            y yVar = this.I1;
            if (yVar != null) {
                this.f168j1.u(yVar);
            }
            if (this.f171n1 != null && !this.f173p1.equals(e2.w.f8820c)) {
                this.f168j1.s(this.f171n1, this.f173p1);
            }
            this.f168j1.j(this.f176s1);
            this.f168j1.a(this.Z);
            List list = this.f170m1;
            if (list != null) {
                this.f168j1.o(list);
            }
            this.l1 = !z11 ? 1 : 0;
            this.S0 = true;
            return;
        }
        e2.x xVar2 = this.h;
        xVar2.getClass();
        a0Var.f70l = xVar2;
        a0Var.f(!z11 ? 1 : 0);
    }

    @Override
    public final void q(long j3, boolean z10) {
        o0 o0Var = this.f168j1;
        if (o0Var != null && !z10) {
            o0Var.m(true);
        }
        super.q(j3, z10);
        o0 o0Var2 = this.f168j1;
        a0 a0Var = this.f161c1;
        if (o0Var2 == null) {
            e0 e0Var = a0Var.f62b;
            e0Var.f97m = 0L;
            e0Var.f100p = -1L;
            e0Var.f98n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f65f = -9223372036854775807L;
            a0Var.f64e = Math.min(a0Var.f64e, 1);
            a0Var.f67i = -9223372036854775807L;
        }
        if (z10) {
            o0 o0Var3 = this.f168j1;
            if (o0Var3 != null) {
                o0Var3.q(false);
            } else {
                a0Var.c(false);
            }
        }
        H0();
        this.f179v1 = 0;
    }

    @Override
    public final boolean q0(h2.h hVar) {
        boolean z10;
        boolean z11 = false;
        if (!F0(hVar)) {
            if (hVar.f10877e < this.f11528w) {
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
                        this.O0.d++;
                    } else {
                        this.f164f1.add(Long.valueOf(hVar.f10877e));
                        this.M1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void r() {
        o0 o0Var = this.f168j1;
        if (o0Var != null && this.Y0) {
            o0Var.release();
        }
    }

    @Override
    public final boolean r0() {
        b2.s sVar = this.f44878c0;
        if (this.f181x1 != null && !this.f182y1 && !this.F1) {
            if ((sVar == null || sVar.f2399t <= 0) && !this.T0 && this.I0 == -9223372036854775807L) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void s() {
        try {
            this.f44898x0 = false;
            l0();
            j0();
            i2.g.D(this.V, null);
            this.V = null;
        } finally {
            this.f169k1 = false;
            this.J1 = -9223372036854775807L;
            p pVar = this.f172o1;
            if (pVar != null) {
                pVar.release();
                this.f172o1 = null;
            }
        }
    }

    @Override
    public final boolean s0(r2.o oVar) {
        return E0(oVar);
    }

    @Override
    public final void t() {
        this.f178u1 = 0;
        this.h.getClass();
        this.f177t1 = SystemClock.elapsedRealtime();
        this.f183z1 = 0L;
        this.A1 = 0;
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            o0Var.f();
        } else {
            this.f161c1.d();
        }
    }

    @Override
    public final boolean t0() {
        r2.o oVar = this.f44884i0;
        if (this.f168j1 != null && oVar != null) {
            String str = oVar.f44859a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.t0();
    }

    @Override
    public final void u() {
        G0();
        int i10 = this.A1;
        if (i10 != 0) {
            long j3 = this.f183z1;
            pf.b bVar = this.Z0;
            Handler handler = (Handler) bVar.f44073b;
            if (handler != null) {
                handler.post(new i0(bVar, j3, i10));
            }
            this.f183z1 = 0L;
            this.A1 = 0;
        }
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            o0Var.e();
        } else {
            this.f161c1.e();
        }
    }

    @Override
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        super.v(sVarArr, j3, j10, f0Var);
        k1 k1Var = this.F;
        if (k1Var.p()) {
            this.K1 = -9223372036854775807L;
            return;
        }
        f0Var.getClass();
        this.K1 = k1Var.g(f0Var.f46695a, new h1()).d;
    }

    @Override
    public final int v0(r2.i iVar, b2.s sVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!r0.m(sVar.f2397r)) {
            return i2.g.b(0, 0, 0, 0);
        }
        if (sVar.v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.X0;
        List B0 = B0(context, iVar, sVar, z10, false);
        if (z10 && B0.isEmpty()) {
            B0 = B0(context, iVar, sVar, false, false);
        }
        if (B0.isEmpty()) {
            return i2.g.b(1, 0, 0, 0);
        }
        int i15 = sVar.S;
        if (i15 != 0 && i15 != 2) {
            return i2.g.b(2, 0, 0, 0);
        }
        r2.o oVar = (r2.o) B0.get(0);
        boolean e7 = oVar.e(sVar);
        if (!e7) {
            for (int i16 = 1; i16 < B0.size(); i16++) {
                r2.o oVar2 = (r2.o) B0.get(i16);
                if (oVar2.e(sVar)) {
                    oVar = oVar2;
                    z11 = false;
                    e7 = true;
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
        if (oVar.f(sVar)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (oVar.f44864g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(sVar.f2397r) && !c2.d.d(context)) {
            i13 = 256;
        }
        if (e7) {
            List B02 = B0(context, iVar, sVar, z10, true);
            if (!B02.isEmpty()) {
                HashMap hashMap = r2.w.f44904a;
                ArrayList arrayList = new ArrayList(B02);
                Collections.sort(arrayList, new l7(new k5(sVar, 18), 3));
                r2.o oVar3 = (r2.o) arrayList.get(0);
                if (oVar3.e(sVar) && oVar3.f(sVar)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override
    public final void x(long j3, long j10) {
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            try {
                o0Var.p(j3, j10);
            } catch (n0 e7) {
                throw c(e7, e7.f184a, false, 7001);
            }
        }
        super.x(j3, j10);
    }

    @Override
    public final void z(float f7, float f10) {
        super.z(f7, f10);
        o0 o0Var = this.f168j1;
        if (o0Var != null) {
            o0Var.a(f7);
        } else {
            this.f161c1.i(f7);
        }
    }
}
