package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
public class ym6 extends om6 {
    public static final int[] V1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean W1;
    public static boolean X1;
    public int A1;
    public long B1;
    public int C1;
    public int D1;
    public int E1;
    public ot9 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public int J1;
    public long K1;
    public jec L1;
    public jec M1;
    public int N1;
    public boolean O1;
    public int P1;
    public xm6 Q1;
    public vcc R1;
    public long S1;
    public boolean T1;
    public int U1;
    public final Context a1;
    public final boolean b1;
    public final xab c1;
    public final byte d1;
    public final boolean e1;
    public final xcc f1;
    public final qz0 g1;
    public final zj4 h1;
    public final hi2 i1;
    public final long j1;
    public final ycc k1;
    public final PriorityQueue l1;
    public pd0 m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public iec r1;
    public boolean s1;
    public int t1;
    public List u1;
    public Surface v1;
    public rd8 w1;
    public yka x1;
    public boolean y1;
    public int z1;

    public ym6(defpackage.wm6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.<init>(wm6):void");
    }

    public static boolean J0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.J0(java.lang.String):boolean");
    }

    public static int K0(defpackage.lm6 r11, defpackage.go4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.K0(lm6, go4):int");
    }

    public static List L0(Context context, go4 go4Var, boolean z, boolean z2) {
        List e;
        String str = go4Var.t;
        if (str == null) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !nq5.b(context)) {
            String c = tm6.c(go4Var);
            if (c == null) {
                ko5 ko5Var2 = mo5.b;
                e = y79.e;
            } else {
                e = tm6.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return tm6.g(go4Var, z, z2);
    }

    public static int M0(lm6 lm6Var, go4 go4Var) {
        int i = go4Var.u;
        List list = go4Var.w;
        if (i != -1) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return go4Var.u + i2;
        }
        return K0(lm6Var, go4Var);
    }

    @Override
    public final boolean A0(defpackage.la3 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.A0(la3):boolean");
    }

    @Override
    public final void B(long j, long j2) {
        iec iecVar = this.r1;
        if (iecVar != null) {
            try {
                iecVar.q(j, j2);
            } catch (hec e) {
                throw e(e, e.a, false, 7001);
            }
        }
        super.B(j, j2);
    }

    @Override
    public final boolean B0() {
        boolean z;
        if (this.E0) {
            go4 go4Var = this.d0;
            long j = this.I;
            if (j != -9223372036854775807L) {
                if (this.U0 + 1 + j <= Long.MAX_VALUE - (this.P0.c + j)) {
                    z = false;
                    if (this.F1 != null || this.H1 || this.O1 || ((go4Var != null && go4Var.v > 0) || z || this.P0.h != -9223372036854775807L)) {
                        return true;
                    }
                }
            }
            z = true;
            if (this.F1 != null) {
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean C0(lm6 lm6Var) {
        return O0(lm6Var);
    }

    @Override
    public final boolean D0() {
        lm6 lm6Var = this.j0;
        if (this.r1 != null && lm6Var != null) {
            String str = lm6Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.D0();
    }

    @Override
    public final void E(float f, float f2) {
        super.E(f, f2);
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.d(f);
        } else {
            this.f1.g(f);
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.c(f);
        }
    }

    @Override
    public final int F0(go4 go4Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!wf7.m(go4Var.t)) {
            return kt6.a(0, 0, 0, 0);
        }
        if (go4Var.x != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.a1;
        List L0 = L0(context, go4Var, z, false);
        if (z && L0.isEmpty()) {
            L0 = L0(context, go4Var, false, false);
        }
        if (L0.isEmpty()) {
            return kt6.a(1, 0, 0, 0);
        }
        int i6 = go4Var.X;
        if (i6 != 0 && i6 != 2) {
            return kt6.a(2, 0, 0, 0);
        }
        lm6 lm6Var = (lm6) L0.get(0);
        boolean e = lm6Var.e(context, go4Var);
        if (!e) {
            for (int i7 = 1; i7 < L0.size(); i7++) {
                lm6 lm6Var2 = (lm6) L0.get(i7);
                if (lm6Var2.e(context, go4Var)) {
                    z2 = false;
                    e = true;
                    lm6Var = lm6Var2;
                    break;
                }
            }
        }
        z2 = true;
        if (e) {
            i = 4;
        } else {
            i = 3;
        }
        if (lm6Var.f(go4Var)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (lm6Var.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(go4Var.t) && !nq5.b(context)) {
            i4 = 256;
        }
        if (e) {
            List L02 = L0(context, go4Var, z, true);
            if (!L02.isEmpty()) {
                HashMap hashMap = tm6.a;
                ArrayList arrayList = new ArrayList(L02);
                Collections.sort(arrayList, new i01(new nv4(context, go4Var, (byte) 26), (byte) 4));
                lm6 lm6Var3 = (lm6) arrayList.get(0);
                if (lm6Var3.e(context, go4Var) && lm6Var3.f(go4Var)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    @Override
    public final boolean I(long j) {
        if (this.H0 == -9223372036854775807L || j < this.G1) {
            return false;
        }
        long j2 = this.Q0;
        if (j2 != -9223372036854775807L && j <= j2) {
            return false;
        }
        return true;
    }

    @Override
    public final pa3 M(lm6 lm6Var, go4 go4Var, go4 go4Var2, boolean z) {
        byte b;
        int i;
        pa3 b2 = lm6Var.b(go4Var, go4Var2);
        float f = go4Var.F;
        float f2 = go4Var2.F;
        int i2 = b2.e;
        pd0 pd0Var = this.m1;
        pd0Var.getClass();
        if (go4Var2.A > pd0Var.a || go4Var2.B > pd0Var.b) {
            i2 |= 256;
        }
        if (M0(lm6Var, go4Var2) > pd0Var.c) {
            i2 |= 64;
        }
        if (this.A1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!lm6Var.f || !z))) {
            float max = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        String str = lm6Var.a;
        if (i3 != 0) {
            b = 0;
        } else {
            b = b2.d;
        }
        return new pa3(str, go4Var, go4Var2, b, i3);
    }

    @Override
    public final km6 N(IllegalStateException illegalStateException, lm6 lm6Var) {
        Surface surface = this.v1;
        km6 km6Var = new km6(illegalStateException, lm6Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return km6Var;
    }

    public final android.view.Surface N0(defpackage.lm6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.N0(lm6):android.view.Surface");
    }

    public final boolean O0(lm6 lm6Var) {
        if (this.r1 == null) {
            Surface surface = this.v1;
            if ((surface == null || !surface.isValid()) && !V0(lm6Var) && !W0(lm6Var)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean P0(la3 la3Var) {
        if (!m() && !la3Var.isLastSample()) {
            long j = this.I;
            if (j != -9223372036854775807L && j - (la3Var.e - this.P0.c) > 100000) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void Q0() {
        if (this.C1 > 0) {
            this.h.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.B1;
            int i = this.C1;
            xab xabVar = this.c1;
            Handler handler = (Handler) xabVar.b;
            if (handler != null) {
                handler.post(new wdc(xabVar, i, j));
            }
            this.C1 = 0;
            this.B1 = elapsedRealtime;
        }
    }

    public final void R0() {
        hm6 hm6Var;
        if (this.O1 && (hm6Var = this.c0) != null) {
            this.Q1 = new xm6(this, hm6Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                hm6Var.setParameters(bundle);
            }
        }
    }

    public final void S0(hm6 hm6Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        hm6Var.e(i, j);
        Trace.endSection();
        this.O0.e++;
        boolean z = false;
        this.D1 = 0;
        if (this.r1 == null) {
            jec jecVar = this.L1;
            boolean equals = jecVar.equals(jec.d);
            xab xabVar = this.c1;
            if (!equals && !jecVar.equals(this.M1)) {
                this.M1 = jecVar;
                xabVar.q(jecVar);
            }
            xcc xccVar = this.f1;
            if (xccVar.e != 3) {
                z = true;
            }
            xccVar.e = 3;
            xccVar.k.getClass();
            xccVar.g = hac.T(SystemClock.elapsedRealtime());
            if (z && (surface = this.v1) != null) {
                xabVar.p(surface);
                this.y1 = true;
            }
        }
    }

    public final void T0(Object obj) {
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.v1;
        xab xabVar = this.c1;
        if (surface2 != surface) {
            this.v1 = surface;
            iec iecVar = this.r1;
            xcc xccVar = this.f1;
            if (iecVar == null) {
                xccVar.f(surface);
            }
            boolean z = false;
            this.y1 = false;
            byte b = this.n;
            hm6 hm6Var = this.c0;
            if (hm6Var != null) {
                if (this.r1 == null) {
                    lm6 lm6Var = this.j0;
                    lm6Var.getClass();
                    if (O0(lm6Var) && !this.n1) {
                        Surface N0 = N0(lm6Var);
                        if (N0 != null) {
                            try {
                                hm6Var.k(N0);
                            } catch (Throwable th) {
                                th.printStackTrace();
                                throw new IllegalArgumentException(th);
                            }
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            hm6Var.d();
                        } else {
                            rjb.h();
                            return;
                        }
                    } else {
                        t0();
                        d0();
                    }
                }
                z = true;
            }
            if (surface != null) {
                jec jecVar = this.M1;
                if (jecVar != null) {
                    xabVar.q(jecVar);
                }
            } else {
                this.M1 = null;
                iec iecVar2 = this.r1;
                if (iecVar2 != null) {
                    iecVar2.l();
                }
            }
            if (b == 2) {
                iec iecVar3 = this.r1;
                if (iecVar3 != null) {
                    iecVar3.r(z);
                } else {
                    xccVar.c(z);
                }
            }
            R0();
        } else if (surface != null) {
            jec jecVar2 = this.M1;
            if (jecVar2 != null) {
                xabVar.q(jecVar2);
            }
            Surface surface3 = this.v1;
            if (surface3 != null && this.y1) {
                xabVar.p(surface3);
            }
        }
    }

    @Override
    public final int U(la3 la3Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.F1 != null || this.O1) && la3Var.e < this.x && !P0(la3Var)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean U0(long j, long j2, boolean z, boolean z2) {
        int F;
        boolean z3;
        if (this.r1 != null && this.b1) {
            j2 -= -this.S1;
        }
        if (j >= -500000 || z || (F = F(j2)) == 0) {
            return false;
        }
        this.G1 = j2;
        if (this.f1.h != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        PriorityQueue priorityQueue = this.l1;
        Iterator it = priorityQueue.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() >= this.x && !z3) {
                i++;
            } else {
                i2++;
            }
        }
        priorityQueue.clear();
        ia3 ia3Var = this.O0;
        if (z2) {
            int i3 = ia3Var.d + F;
            ia3Var.f += this.E1;
            ia3Var.d = i3 + i + i2;
        } else {
            ia3Var.j++;
            Y0(F + i, this.E1);
            this.O0.d += i2;
        }
        if (S()) {
            d0();
        }
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.o(false);
        }
        return true;
    }

    @Override
    public final float V(float f, go4 go4Var, go4[] go4VarArr) {
        float f2;
        lm6 lm6Var;
        float f3 = -1.0f;
        for (go4 go4Var2 : go4VarArr) {
            float f4 = go4Var2.F;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f && this.c0 != null) {
            zj4 zj4Var = this.h1;
            if (zj4Var.a() != -9223372036854775807L) {
                f3 = 1.0E9f / ((float) zj4Var.a());
            }
        }
        if (f3 == -1.0f) {
            f2 = -1.0f;
        } else {
            f2 = f3 * f;
        }
        if (this.F1 != null && (lm6Var = this.j0) != null) {
            int i = go4Var.A;
            int i2 = go4Var.B;
            float f5 = -3.4028235E38f;
            if (lm6Var.i) {
                float f6 = lm6Var.l;
                if (f6 != -3.4028235E38f && lm6Var.j == i && lm6Var.k == i2) {
                    f5 = f6;
                } else {
                    f5 = 1024.0f;
                    if (!lm6Var.g(i, i2, 1024.0d)) {
                        float f7 = 0.0f;
                        while (true) {
                            float f8 = f5 - f7;
                            if (Math.abs(f8) <= 5.0f) {
                                break;
                            }
                            float f9 = (f8 / 2.0f) + f7;
                            if (lm6Var.g(i, i2, f9)) {
                                f7 = f9;
                            } else {
                                f5 = f9;
                            }
                        }
                        f5 = f7;
                    }
                    lm6Var.l = f5;
                    lm6Var.j = i;
                    lm6Var.k = i2;
                }
            }
            if (f2 != -1.0f) {
                return Math.max(f2, f5);
            }
            return f5;
        }
        return f2;
    }

    public boolean V0(lm6 lm6Var) {
        if (Build.VERSION.SDK_INT >= 35 && lm6Var.h) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList W(go4 go4Var, boolean z) {
        boolean z2 = this.O1;
        Context context = this.a1;
        List L0 = L0(context, go4Var, z, z2);
        HashMap hashMap = tm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new i01(new nv4(context, go4Var, (byte) 26), (byte) 4));
        return arrayList;
    }

    public boolean W0(lm6 lm6Var) {
        if (!this.O1 && !J0(lm6Var.a)) {
            if (!lm6Var.f || rd8.b(this.a1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X0(hm6 hm6Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        hm6Var.c(i);
        Trace.endSection();
        this.O0.f++;
    }

    public final void Y0(int i, int i2) {
        ia3 ia3Var = this.O0;
        ia3Var.h += i;
        int i3 = i + i2;
        ia3Var.g += i3;
        this.C1 += i3;
        int i4 = this.D1 + i3;
        this.D1 = i4;
        ia3Var.i = Math.max(i4, ia3Var.i);
        byte b = this.d1;
        if (b > 0 && this.C1 >= b) {
            Q0();
        }
    }

    @Override
    public final defpackage.eq Z(defpackage.lm6 r25, defpackage.go4 r26, android.media.MediaCrypto r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.Z(lm6, go4, android.media.MediaCrypto, float):eq");
    }

    public final void Z0(long j) {
        ia3 ia3Var = this.O0;
        ia3Var.k += j;
        ia3Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override
    public final void a0(la3 la3Var) {
        ByteBuffer byteBuffer = la3Var.f;
        if (byteBuffer != null && byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            boolean z = false;
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
                if (this.p1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    hm6 hm6Var = this.c0;
                    hm6Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    hm6Var.setParameters(bundle);
                }
            } else if (Build.VERSION.SDK_INT >= 37) {
                byte[] bArr2 = jl2.a;
                int remaining = byteBuffer.remaining();
                byte[] bArr3 = jl2.d;
                if (remaining >= bArr3.length) {
                    int position = byteBuffer.position();
                    for (int i = 0; i < bArr3.length; i++) {
                        if (byteBuffer.get(position + i) != bArr3[i]) {
                            return;
                        }
                    }
                    byteBuffer.position(5);
                    int remaining2 = byteBuffer.remaining();
                    byte[] bArr4 = new byte[remaining2];
                    byteBuffer.get(bArr4);
                    byteBuffer.position(0);
                    if (remaining2 > 0) {
                        z = true;
                    }
                    this.q1 = z;
                    if (z) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray("hdr-st2094-50-info", bArr4);
                        hm6 hm6Var2 = this.c0;
                        hm6Var2.getClass();
                        hm6Var2.setParameters(bundle2);
                    }
                }
            }
        }
    }

    @Override
    public final void d(int i, Object obj) {
        boolean z;
        boolean z2 = true;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i != 14) {
                                    switch (i) {
                                        case 16:
                                            obj.getClass();
                                            this.N1 = ((Integer) obj).intValue();
                                            hm6 hm6Var = this.c0;
                                            if (hm6Var != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.N1));
                                                hm6Var.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.v1;
                                            T0(null);
                                            obj.getClass();
                                            ((ym6) obj).d(1, surface);
                                            return;
                                        case 18:
                                            if (this.F1 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            ot9 ot9Var = (ot9) obj;
                                            this.F1 = ot9Var;
                                            if (ot9Var == null) {
                                                z2 = false;
                                            }
                                            if (z != z2) {
                                                G0(this.d0);
                                                return;
                                            }
                                            return;
                                        default:
                                            super.d(i, obj);
                                            return;
                                    }
                                }
                                obj.getClass();
                                yka ykaVar = (yka) obj;
                                if (ykaVar.a != 0 && ykaVar.b != 0) {
                                    this.x1 = ykaVar;
                                    iec iecVar = this.r1;
                                    if (iecVar != null) {
                                        Surface surface2 = this.v1;
                                        surface2.getClass();
                                        iecVar.c(surface2, ykaVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(wcc.a)) {
                                iec iecVar2 = this.r1;
                                if (iecVar2 != null && iecVar2.v()) {
                                    this.r1.u();
                                    return;
                                }
                                return;
                            }
                            this.u1 = list;
                            iec iecVar3 = this.r1;
                            if (iecVar3 != null) {
                                iecVar3.p(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.A1 = intValue;
                        iec iecVar4 = this.r1;
                        if (iecVar4 != null) {
                            iecVar4.k(intValue);
                            return;
                        }
                        cdc cdcVar = this.f1.b;
                        if (cdcVar.i != intValue) {
                            cdcVar.i = intValue;
                            cdcVar.c(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.z1 = intValue2;
                    hm6 hm6Var2 = this.c0;
                    if (hm6Var2 != null) {
                        hm6Var2.j(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.P1 != intValue3) {
                    this.P1 = intValue3;
                    if (this.O1) {
                        t0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            vcc vccVar = (vcc) obj;
            this.R1 = vccVar;
            iec iecVar5 = this.r1;
            if (iecVar5 != null) {
                iecVar5.t(vccVar);
                return;
            }
            return;
        }
        T0(obj);
    }

    @Override
    public final void f() {
        iec iecVar = this.r1;
        if (iecVar != null) {
            int i = this.t1;
            if (i != 0 && i != 1) {
                iecVar.w();
                return;
            } else {
                this.t1 = 0;
                return;
            }
        }
        xcc xccVar = this.f1;
        if (xccVar.e == 0) {
            xccVar.e = 1;
        }
    }

    @Override
    public final boolean f0(go4 go4Var) {
        iec iecVar = this.r1;
        if (iecVar != null && !iecVar.v()) {
            try {
                return this.r1.n(go4Var);
            } catch (hec e) {
                throw this.e(e, go4Var, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void g0(Exception exc) {
        ncd.d("MediaCodecVideoRenderer", "Video codec error", exc);
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new x4c(xabVar, exc, (byte) 24));
        }
    }

    @Override
    public final void h0(long j, String str, long j2) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new n40(xabVar, str2, j, j2, (byte) 17));
        } else {
            str2 = str;
        }
        this.n1 = J0(str2);
        lm6 lm6Var = this.j0;
        lm6Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(lm6Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = lm6Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.p1 = z;
        if (Build.VERSION.SDK_INT < 37) {
            lm6 lm6Var2 = this.j0;
            lm6Var2.getClass();
            if (lm6Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.o1 = z2;
        R0();
    }

    @Override
    public final void i0(hl2 hl2Var) {
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new x4c(xabVar, hl2Var, (byte) 22));
        }
    }

    @Override
    public final void j0(String str) {
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new x4c(xabVar, str, (byte) 25));
        }
    }

    @Override
    public final pa3 k0(mj4 mj4Var) {
        pa3 k0 = super.k0(mj4Var);
        this.q1 = false;
        go4 go4Var = (go4) mj4Var.c;
        go4Var.getClass();
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new gcc(xabVar, go4Var, k0, (byte) 3));
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
        return k0;
    }

    @Override
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void l0(go4 go4Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        hm6 hm6Var = this.c0;
        if (hm6Var != null) {
            hm6Var.j(this.z1);
        }
        if (this.O1) {
            i = go4Var.A;
            integer = go4Var.B;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                integer = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                int integer2 = mediaFormat.getInteger("width");
                integer = mediaFormat.getInteger("height");
                i = integer2;
            }
        }
        float f = go4Var.I;
        int i2 = go4Var.G;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.L1 = new jec(f, i, integer);
        iec iecVar = this.r1;
        if (iecVar != null && this.T1) {
            if (i > 0 && integer > 0) {
                fo4 a = go4Var.a();
                a.z = i;
                a.A = integer;
                a.H = f;
                go4 go4Var2 = new go4(a);
                int i4 = this.t1;
                List list = this.u1;
                if (list == null) {
                    ko5 ko5Var = mo5.b;
                    list = y79.e;
                }
                iecVar.g(go4Var2, this.P0.b, i4, list);
                this.t1 = 2;
            } else {
                return;
            }
        } else {
            float f2 = go4Var.F;
            zj4 zj4Var = this.h1;
            zj4Var.f = f2;
            zj4Var.a.c();
            zj4Var.b.c();
            zj4Var.c = false;
            zj4Var.d = -9223372036854775807L;
            zj4Var.e = 0;
            zj4Var.c();
        }
        this.T1 = false;
    }

    @Override
    public final boolean n() {
        if (this.K0) {
            iec iecVar = this.r1;
            if (iecVar == null || iecVar.a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n0(long j) {
        super.n0(j);
        if (!this.O1) {
            this.E1--;
        }
    }

    @Override
    public final boolean o() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.o():boolean");
    }

    @Override
    public final void o0() {
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.j();
            long j = this.S1;
            if (j == -9223372036854775807L) {
                j = this.P0.b;
                this.S1 = j;
            }
            this.r1.h(-j);
        } else {
            this.f1.e(2);
        }
        this.T1 = true;
        R0();
    }

    @Override
    public final void p0(la3 la3Var) {
        ByteBuffer byteBuffer;
        int i;
        int i2;
        ByteBuffer byteBuffer2;
        boolean z;
        tm2 tm2Var;
        lm6 lm6Var = this.j0;
        lm6Var.getClass();
        String str = lm6Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = la3Var.c) != null) {
            go4 go4Var = this.d0;
            if (go4Var != null && (tm2Var = go4Var.L) != null && tm2Var.e > 8) {
                z = true;
            } else {
                z = false;
            }
            if (this.q1 && !byteBuffer2.isReadOnly()) {
                oz0.b(byteBuffer2, false);
            } else if (z && this.o1 && !byteBuffer2.isReadOnly()) {
                oz0.b(byteBuffer2, true);
            }
            hi2 hi2Var = this.i1;
            if (hi2Var != null && la3Var.isKeyFrame()) {
                int position = byteBuffer2.position();
                int limit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) hi2Var.b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(position);
                byteBuffer2.limit(limit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = la3Var.c) != null && this.q1 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = la3Var.c;
            int position2 = byteBuffer4.position();
            int limit2 = byteBuffer4.limit();
            if (limit2 - position2 >= 4) {
                while (position2 < limit2) {
                    int a = lle.a(byteBuffer4, position2, limit2);
                    if (a == limit2 || (i = a + 3) >= limit2 || ((i2 = (byteBuffer4.get(i) & 126) >> 1) >= 0 && i2 <= 31)) {
                        break;
                    }
                    if (i2 == 39) {
                        int i3 = a + 5;
                        i = lle.a(byteBuffer4, i3, limit2);
                        int i4 = 0;
                        while (i3 < i) {
                            int i5 = 0;
                            while (true) {
                                if (i3 >= i) {
                                    break;
                                }
                                int i6 = byteBuffer4.get(i3) & 255;
                                if (i6 == 3 && i4 >= 2) {
                                    i3++;
                                    i4 = 0;
                                } else {
                                    if (i6 == 0) {
                                        i4++;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i7 = i3 + 1;
                                    i5 += i6;
                                    if (i6 != 255) {
                                        if (i5 == 4) {
                                            byteBuffer4.put(i3, (byte) -2);
                                        }
                                        i3 = i7;
                                    } else {
                                        i3 = i7;
                                    }
                                }
                            }
                            if (i3 < i) {
                                int i8 = 0;
                                while (i3 < i) {
                                    int i9 = byteBuffer4.get(i3) & 255;
                                    if (i9 == 3 && i4 >= 2) {
                                        i3++;
                                        i4 = 0;
                                    } else {
                                        if (i9 == 0) {
                                            i4++;
                                        } else {
                                            i4 = 0;
                                        }
                                        i3++;
                                        i8 += i9;
                                        if (i9 != 255) {
                                            break;
                                        }
                                    }
                                }
                                int i10 = 0;
                                while (i10 < i8 && i3 < i) {
                                    int i11 = i3 + 1;
                                    int i12 = byteBuffer4.get(i3) & 255;
                                    if (i12 == 3 && i4 >= 2) {
                                        i10--;
                                    } else if (i12 == 0) {
                                        i4++;
                                        i10++;
                                        i3 = i11;
                                    }
                                    i4 = 0;
                                    i10++;
                                    i3 = i11;
                                }
                            }
                        }
                    }
                    position2 = i;
                }
            }
        }
        this.U1 = 0;
        int U = U(la3Var);
        if ((Build.VERSION.SDK_INT < 34 || (U & 32) == 0) && !this.O1) {
            this.E1++;
        }
    }

    @Override
    public final void q() {
        xab xabVar = this.c1;
        this.M1 = null;
        R0();
        this.y1 = false;
        this.Q1 = null;
        this.H1 = B0();
        try {
            super.q();
        } finally {
            xabVar.i(this.O0);
            xabVar.q(jec.d);
        }
    }

    @Override
    public final void r(boolean z, boolean z2) {
        boolean z3;
        iec iecVar;
        this.O0 = new Object();
        f99 f99Var = this.d;
        f99Var.getClass();
        boolean z4 = f99Var.b;
        if (z4 && this.P1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        jte.p(z3);
        if (this.O1 != z4) {
            this.O1 = z4;
            t0();
        }
        ia3 ia3Var = this.O0;
        xab xabVar = this.c1;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new xdc(xabVar, ia3Var, (byte) 0));
        }
        boolean z5 = this.s1;
        xcc xccVar = this.f1;
        if (!z5) {
            if (this.u1 != null && this.r1 == null) {
                kn3 kn3Var = new kn3(this.a1, xccVar);
                kn3Var.a = true;
                long j = this.j1;
                long j2 = -9223372036854775807L;
                if (j != -9223372036854775807L) {
                    j2 = -j;
                }
                kn3Var.c = j2;
                bfb bfbVar = this.h;
                bfbVar.getClass();
                kn3Var.g = bfbVar;
                jte.p(!kn3Var.b);
                if (((je8) kn3Var.f) == null) {
                    kn3Var.f = new je8();
                }
                le8 le8Var = new le8(kn3Var);
                kn3Var.b = true;
                if (1 >= le8Var.p) {
                    le8Var.p = 1;
                }
                SparseArray sparseArray = le8Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    iecVar = (iec) sparseArray.get(0);
                } else {
                    he8 he8Var = new he8(le8Var, le8Var.a);
                    le8Var.g.add(he8Var);
                    sparseArray.put(0, he8Var);
                    iecVar = he8Var;
                }
                this.r1 = iecVar;
            }
            this.s1 = true;
        }
        iec iecVar2 = this.r1;
        if (iecVar2 != null) {
            iecVar2.i(new k44(this, (byte) 16));
            vcc vccVar = this.R1;
            if (vccVar != null) {
                this.r1.t(vccVar);
            }
            if (this.v1 != null && !this.x1.equals(yka.c)) {
                this.r1.c(this.v1, this.x1);
            }
            this.r1.k(this.A1);
            this.r1.d(this.a0);
            List list = this.u1;
            if (list != null) {
                this.r1.p(list);
            }
            this.t1 = !z2 ? 1 : 0;
            this.S0 = true;
            return;
        }
        bfb bfbVar2 = this.h;
        bfbVar2.getClass();
        xccVar.k = bfbVar2;
        xccVar.e(!z2 ? 1 : 0);
    }

    @Override
    public final boolean r0(long j, long j2, hm6 hm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, go4 go4Var) {
        boolean z3;
        zj4 zj4Var;
        hm6Var.getClass();
        long j4 = j3 - this.P0.c;
        if (this.f1.h != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.l1;
            Long l = (Long) priorityQueue.peek();
            zj4Var = this.h1;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            zj4Var.b(1000 * l.longValue());
            if (l.longValue() >= this.x && !z3) {
                i4++;
            } else {
                i5++;
            }
        }
        Y0(i4, 0);
        this.O0.d += i5;
        zj4Var.b(j3 * 1000);
        iec iecVar = this.r1;
        if (iecVar != null) {
            if (z && !z2) {
                X0(hm6Var, i);
                return true;
            }
            return iecVar.m(j3, new vm6(this, hm6Var, i, j4));
        }
        int a = this.f1.a(j3, j, j2, this.P0.b, z, z2, zj4Var.a(), zj4Var.h, this.g1);
        qz0 qz0Var = this.g1;
        ycc yccVar = this.k1;
        if (yccVar != null && a != 5 && a != 4) {
            yccVar.a(j3, qz0Var.a);
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4 && a != 5) {
                            dq9.m(String.valueOf(a));
                            return false;
                        }
                        return false;
                    }
                    X0(hm6Var, i);
                    Z0(qz0Var.a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                hm6Var.c(i);
                Trace.endSection();
                Y0(0, 1);
                Z0(qz0Var.a);
                return true;
            }
            long j5 = qz0Var.b;
            long j6 = qz0Var.a;
            if (j5 == this.K1) {
                X0(hm6Var, i);
            } else {
                vcc vccVar = this.R1;
                if (vccVar != null) {
                    vccVar.c(j4, j5, go4Var, this.e0);
                }
                S0(hm6Var, i, j5);
            }
            Z0(j6);
            this.K1 = j5;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        vcc vccVar2 = this.R1;
        if (vccVar2 != null) {
            vccVar2.c(j4, nanoTime, go4Var, this.e0);
        }
        S0(hm6Var, i, nanoTime);
        Z0(qz0Var.a);
        return true;
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        iec iecVar = this.r1;
        if (iecVar != null && !z) {
            iecVar.o(true);
        }
        if (z2) {
            this.G1 = j;
        }
        super.s(j, z, z2);
        iec iecVar2 = this.r1;
        xcc xccVar = this.f1;
        if (iecVar2 == null) {
            xccVar.b.b();
            xccVar.f = -9223372036854775807L;
            xccVar.e = Math.min(xccVar.e, 1);
            xccVar.h = -9223372036854775807L;
            xccVar.m = false;
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
        if (z) {
            iec iecVar3 = this.r1;
            if (iecVar3 != null) {
                iecVar3.r(false);
            } else {
                xccVar.c(false);
            }
        }
        R0();
        this.D1 = 0;
    }

    @Override
    public final void t() {
        iec iecVar = this.r1;
        if (iecVar != null && this.b1) {
            iecVar.release();
        }
    }

    @Override
    public final void u0() {
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.j();
        } else {
            long j = this.P0.h;
        }
    }

    @Override
    public final void v() {
        try {
            this.x0 = false;
            v0();
            t0();
            ts2.B(this.X, null);
            this.X = null;
        } finally {
            this.s1 = false;
            this.S1 = -9223372036854775807L;
            this.q1 = false;
            rd8 rd8Var = this.w1;
            if (rd8Var != null) {
                rd8Var.release();
                this.w1 = null;
            }
        }
    }

    @Override
    public final void w() {
        this.C1 = 0;
        this.h.getClass();
        this.B1 = SystemClock.elapsedRealtime();
        this.I1 = 0L;
        this.J1 = 0;
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.f();
        } else {
            this.f1.d();
        }
    }

    @Override
    public final void w0() {
        super.w0();
        this.l1.clear();
        this.E1 = 0;
        this.U1 = 0;
        this.H1 = false;
        hi2 hi2Var = this.i1;
        if (hi2Var != null) {
            hi2Var.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) hi2Var.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void x() {
        Q0();
        int i = this.J1;
        if (i != 0) {
            long j = this.I1;
            xab xabVar = this.c1;
            Handler handler = (Handler) xabVar.b;
            if (handler != null) {
                handler.post(new wdc(xabVar, j, i));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        iec iecVar = this.r1;
        if (iecVar != null) {
            iecVar.e();
        } else {
            xcc xccVar = this.f1;
            xccVar.d = false;
            xccVar.h = -9223372036854775807L;
            cdc cdcVar = xccVar.b;
            cdcVar.d = false;
            zcc zccVar = cdcVar.c;
            if (zccVar != null) {
                zccVar.b();
            }
            cdcVar.a();
        }
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
    }

    @Override
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        super.y(go4VarArr, j, j2, rz6Var);
        ycc yccVar = this.k1;
        if (yccVar != null) {
            yccVar.b();
        }
    }
}
