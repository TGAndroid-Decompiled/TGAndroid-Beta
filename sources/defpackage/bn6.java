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
public class bn6 extends qm6 {
    public static final int[] V1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean W1;
    public static boolean X1;
    public int A1;
    public long B1;
    public int C1;
    public int D1;
    public int E1;
    public fv9 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public int J1;
    public long K1;
    public ggc L1;
    public ggc M1;
    public int N1;
    public boolean O1;
    public int P1;
    public an6 Q1;
    public sec R1;
    public long S1;
    public boolean T1;
    public int U1;
    public final Context a1;
    public final boolean b1;
    public final k7b c1;
    public final byte d1;
    public final boolean e1;
    public final uec f1;
    public final ry0 g1;
    public final zj4 h1;
    public final qx6 i1;
    public final long j1;
    public final vec k1;
    public final PriorityQueue l1;
    public rc0 m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public fgc r1;
    public boolean s1;
    public int t1;
    public List u1;
    public Surface v1;
    public df8 w1;
    public rma x1;
    public boolean y1;
    public int z1;

    public bn6(defpackage.zm6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.<init>(zm6):void");
    }

    public static boolean J0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.J0(java.lang.String):boolean");
    }

    public static int K0(defpackage.nm6 r11, defpackage.ko4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.K0(nm6, ko4):int");
    }

    public static List L0(Context context, ko4 ko4Var, boolean z, boolean z2) {
        List e;
        String str = ko4Var.t;
        if (str == null) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !qq5.b(context)) {
            String c = wm6.c(ko4Var);
            if (c == null) {
                no5 no5Var2 = po5.b;
                e = j99.e;
            } else {
                e = wm6.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return wm6.g(ko4Var, z, z2);
    }

    public static int M0(nm6 nm6Var, ko4 ko4Var) {
        int i = ko4Var.u;
        List list = ko4Var.w;
        if (i != -1) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return ko4Var.u + i2;
        }
        return K0(nm6Var, ko4Var);
    }

    @Override
    public final boolean A0(defpackage.s93 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.A0(s93):boolean");
    }

    @Override
    public final void B(long j, long j2) {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            try {
                fgcVar.q(j, j2);
            } catch (egc e) {
                throw e(e, e.a, false, 7001);
            }
        }
        super.B(j, j2);
    }

    @Override
    public final boolean B0() {
        boolean z;
        if (this.E0) {
            ko4 ko4Var = this.d0;
            long j = this.I;
            if (j != -9223372036854775807L) {
                if (this.U0 + 1 + j <= Long.MAX_VALUE - (this.P0.c + j)) {
                    z = false;
                    if (this.F1 != null || this.H1 || this.O1 || ((ko4Var != null && ko4Var.v > 0) || z || this.P0.h != -9223372036854775807L)) {
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
    public final boolean C0(nm6 nm6Var) {
        return O0(nm6Var);
    }

    @Override
    public final boolean D0() {
        nm6 nm6Var = this.j0;
        if (this.r1 != null && nm6Var != null) {
            String str = nm6Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.D0();
    }

    @Override
    public final void E(float f, float f2) {
        super.E(f, f2);
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.d(f);
        } else {
            this.f1.g(f);
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.c(f);
        }
    }

    @Override
    public final int F0(ko4 ko4Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!eg7.m(ko4Var.t)) {
            return qu6.a(0, 0, 0, 0);
        }
        if (ko4Var.x != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.a1;
        List L0 = L0(context, ko4Var, z, false);
        if (z && L0.isEmpty()) {
            L0 = L0(context, ko4Var, false, false);
        }
        if (L0.isEmpty()) {
            return qu6.a(1, 0, 0, 0);
        }
        int i6 = ko4Var.X;
        if (i6 != 0 && i6 != 2) {
            return qu6.a(2, 0, 0, 0);
        }
        nm6 nm6Var = (nm6) L0.get(0);
        boolean e = nm6Var.e(context, ko4Var);
        if (!e) {
            for (int i7 = 1; i7 < L0.size(); i7++) {
                nm6 nm6Var2 = (nm6) L0.get(i7);
                if (nm6Var2.e(context, ko4Var)) {
                    z2 = false;
                    e = true;
                    nm6Var = nm6Var2;
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
        if (nm6Var.f(ko4Var)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (nm6Var.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(ko4Var.t) && !qq5.b(context)) {
            i4 = 256;
        }
        if (e) {
            List L02 = L0(context, ko4Var, z, true);
            if (!L02.isEmpty()) {
                HashMap hashMap = wm6.a;
                ArrayList arrayList = new ArrayList(L02);
                Collections.sort(arrayList, new jz0(new rm6(context, ko4Var, (byte) 0), (byte) 4));
                nm6 nm6Var3 = (nm6) arrayList.get(0);
                if (nm6Var3.e(context, ko4Var) && nm6Var3.f(ko4Var)) {
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
    public final w93 M(nm6 nm6Var, ko4 ko4Var, ko4 ko4Var2, boolean z) {
        byte b;
        int i;
        w93 b2 = nm6Var.b(ko4Var, ko4Var2);
        float f = ko4Var.F;
        float f2 = ko4Var2.F;
        int i2 = b2.e;
        rc0 rc0Var = this.m1;
        rc0Var.getClass();
        if (ko4Var2.A > rc0Var.a || ko4Var2.B > rc0Var.b) {
            i2 |= 256;
        }
        if (M0(nm6Var, ko4Var2) > rc0Var.c) {
            i2 |= 64;
        }
        if (this.A1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!nm6Var.f || !z))) {
            float max = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        String str = nm6Var.a;
        if (i3 != 0) {
            b = 0;
        } else {
            b = b2.d;
        }
        return new w93(str, ko4Var, ko4Var2, b, i3);
    }

    @Override
    public final mm6 N(IllegalStateException illegalStateException, nm6 nm6Var) {
        Surface surface = this.v1;
        mm6 mm6Var = new mm6(illegalStateException, nm6Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mm6Var;
    }

    public final android.view.Surface N0(defpackage.nm6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.N0(nm6):android.view.Surface");
    }

    public final boolean O0(nm6 nm6Var) {
        if (this.r1 == null) {
            Surface surface = this.v1;
            if ((surface == null || !surface.isValid()) && !V0(nm6Var) && !W0(nm6Var)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean P0(s93 s93Var) {
        if (!m() && !s93Var.isLastSample()) {
            long j = this.I;
            if (j != -9223372036854775807L && j - (s93Var.e - this.P0.c) > 100000) {
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
            k7b k7bVar = this.c1;
            Handler handler = (Handler) k7bVar.b;
            if (handler != null) {
                handler.post(new tfc(k7bVar, i, j));
            }
            this.C1 = 0;
            this.B1 = elapsedRealtime;
        }
    }

    public final void R0() {
        jm6 jm6Var;
        if (this.O1 && (jm6Var = this.c0) != null) {
            this.Q1 = new an6(this, jm6Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                jm6Var.setParameters(bundle);
            }
        }
    }

    public final void S0(jm6 jm6Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jm6Var.f(i, j);
        Trace.endSection();
        this.O0.e++;
        boolean z = false;
        this.D1 = 0;
        if (this.r1 == null) {
            ggc ggcVar = this.L1;
            boolean equals = ggcVar.equals(ggc.d);
            k7b k7bVar = this.c1;
            if (!equals && !ggcVar.equals(this.M1)) {
                this.M1 = ggcVar;
                k7bVar.t(ggcVar);
            }
            uec uecVar = this.f1;
            if (uecVar.e != 3) {
                z = true;
            }
            uecVar.e = 3;
            uecVar.k.getClass();
            uecVar.g = gcc.T(SystemClock.elapsedRealtime());
            if (z && (surface = this.v1) != null) {
                k7bVar.s(surface);
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
        k7b k7bVar = this.c1;
        if (surface2 != surface) {
            this.v1 = surface;
            fgc fgcVar = this.r1;
            uec uecVar = this.f1;
            if (fgcVar == null) {
                uecVar.f(surface);
            }
            boolean z = false;
            this.y1 = false;
            byte b = this.n;
            jm6 jm6Var = this.c0;
            if (jm6Var != null) {
                if (this.r1 == null) {
                    nm6 nm6Var = this.j0;
                    nm6Var.getClass();
                    if (O0(nm6Var) && !this.n1) {
                        Surface N0 = N0(nm6Var);
                        if (N0 != null) {
                            try {
                                jm6Var.k(N0);
                            } catch (Throwable th) {
                                th.printStackTrace();
                                throw new IllegalArgumentException(th);
                            }
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            jm6Var.e();
                        } else {
                            grb.g();
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
                ggc ggcVar = this.M1;
                if (ggcVar != null) {
                    k7bVar.t(ggcVar);
                }
            } else {
                this.M1 = null;
                fgc fgcVar2 = this.r1;
                if (fgcVar2 != null) {
                    fgcVar2.l();
                }
            }
            if (b == 2) {
                fgc fgcVar3 = this.r1;
                if (fgcVar3 != null) {
                    fgcVar3.r(z);
                } else {
                    uecVar.c(z);
                }
            }
            R0();
        } else if (surface != null) {
            ggc ggcVar2 = this.M1;
            if (ggcVar2 != null) {
                k7bVar.t(ggcVar2);
            }
            Surface surface3 = this.v1;
            if (surface3 != null && this.y1) {
                k7bVar.s(surface3);
            }
        }
    }

    @Override
    public final int U(s93 s93Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.F1 != null || this.O1) && s93Var.e < this.x && !P0(s93Var)) {
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
        p93 p93Var = this.O0;
        if (z2) {
            int i3 = p93Var.d + F;
            p93Var.f += this.E1;
            p93Var.d = i3 + i + i2;
        } else {
            p93Var.j++;
            Y0(F + i, this.E1);
            this.O0.d += i2;
        }
        if (S()) {
            d0();
        }
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.o(false);
        }
        return true;
    }

    @Override
    public final float V(float f, ko4 ko4Var, ko4[] ko4VarArr) {
        float f2;
        nm6 nm6Var;
        float f3 = -1.0f;
        for (ko4 ko4Var2 : ko4VarArr) {
            float f4 = ko4Var2.F;
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
        if (this.F1 != null && (nm6Var = this.j0) != null) {
            int i = ko4Var.A;
            int i2 = ko4Var.B;
            float f5 = -3.4028235E38f;
            if (nm6Var.i) {
                float f6 = nm6Var.l;
                if (f6 != -3.4028235E38f && nm6Var.j == i && nm6Var.k == i2) {
                    f5 = f6;
                } else {
                    f5 = 1024.0f;
                    if (!nm6Var.g(i, i2, 1024.0d)) {
                        float f7 = 0.0f;
                        while (true) {
                            float f8 = f5 - f7;
                            if (Math.abs(f8) <= 5.0f) {
                                break;
                            }
                            float f9 = (f8 / 2.0f) + f7;
                            if (nm6Var.g(i, i2, f9)) {
                                f7 = f9;
                            } else {
                                f5 = f9;
                            }
                        }
                        f5 = f7;
                    }
                    nm6Var.l = f5;
                    nm6Var.j = i;
                    nm6Var.k = i2;
                }
            }
            if (f2 != -1.0f) {
                return Math.max(f2, f5);
            }
            return f5;
        }
        return f2;
    }

    public boolean V0(nm6 nm6Var) {
        if (Build.VERSION.SDK_INT >= 35 && nm6Var.h) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList W(ko4 ko4Var, boolean z) {
        boolean z2 = this.O1;
        Context context = this.a1;
        List L0 = L0(context, ko4Var, z, z2);
        HashMap hashMap = wm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new jz0(new rm6(context, ko4Var, (byte) 0), (byte) 4));
        return arrayList;
    }

    public boolean W0(nm6 nm6Var) {
        if (!this.O1 && !J0(nm6Var.a)) {
            if (!nm6Var.f || df8.b(this.a1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X0(jm6 jm6Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        jm6Var.c(i);
        Trace.endSection();
        this.O0.f++;
    }

    public final void Y0(int i, int i2) {
        p93 p93Var = this.O0;
        p93Var.h += i;
        int i3 = i + i2;
        p93Var.g += i3;
        this.C1 += i3;
        int i4 = this.D1 + i3;
        this.D1 = i4;
        p93Var.i = Math.max(i4, p93Var.i);
        byte b = this.d1;
        if (b > 0 && this.C1 >= b) {
            Q0();
        }
    }

    @Override
    public final defpackage.fp Z(defpackage.nm6 r25, defpackage.ko4 r26, android.media.MediaCrypto r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.Z(nm6, ko4, android.media.MediaCrypto, float):fp");
    }

    public final void Z0(long j) {
        p93 p93Var = this.O0;
        p93Var.k += j;
        p93Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override
    public final void a0(s93 s93Var) {
        ByteBuffer byteBuffer = s93Var.f;
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
                    jm6 jm6Var = this.c0;
                    jm6Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    jm6Var.setParameters(bundle);
                }
            } else if (Build.VERSION.SDK_INT >= 37) {
                byte[] bArr2 = rk2.a;
                int remaining = byteBuffer.remaining();
                byte[] bArr3 = rk2.d;
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
                        jm6 jm6Var2 = this.c0;
                        jm6Var2.getClass();
                        jm6Var2.setParameters(bundle2);
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
                                            jm6 jm6Var = this.c0;
                                            if (jm6Var != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.N1));
                                                jm6Var.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.v1;
                                            T0(null);
                                            obj.getClass();
                                            ((bn6) obj).d(1, surface);
                                            return;
                                        case 18:
                                            if (this.F1 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            fv9 fv9Var = (fv9) obj;
                                            this.F1 = fv9Var;
                                            if (fv9Var == null) {
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
                                rma rmaVar = (rma) obj;
                                if (rmaVar.a != 0 && rmaVar.b != 0) {
                                    this.x1 = rmaVar;
                                    fgc fgcVar = this.r1;
                                    if (fgcVar != null) {
                                        Surface surface2 = this.v1;
                                        surface2.getClass();
                                        fgcVar.c(surface2, rmaVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(tec.a)) {
                                fgc fgcVar2 = this.r1;
                                if (fgcVar2 != null && fgcVar2.v()) {
                                    this.r1.u();
                                    return;
                                }
                                return;
                            }
                            this.u1 = list;
                            fgc fgcVar3 = this.r1;
                            if (fgcVar3 != null) {
                                fgcVar3.p(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.A1 = intValue;
                        fgc fgcVar4 = this.r1;
                        if (fgcVar4 != null) {
                            fgcVar4.k(intValue);
                            return;
                        }
                        zec zecVar = this.f1.b;
                        if (zecVar.i != intValue) {
                            zecVar.i = intValue;
                            zecVar.c(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.z1 = intValue2;
                    jm6 jm6Var2 = this.c0;
                    if (jm6Var2 != null) {
                        jm6Var2.j(intValue2);
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
            sec secVar = (sec) obj;
            this.R1 = secVar;
            fgc fgcVar5 = this.r1;
            if (fgcVar5 != null) {
                fgcVar5.t(secVar);
                return;
            }
            return;
        }
        T0(obj);
    }

    @Override
    public final boolean f0(ko4 ko4Var) {
        fgc fgcVar = this.r1;
        if (fgcVar != null && !fgcVar.v()) {
            try {
                return this.r1.n(ko4Var);
            } catch (egc e) {
                throw this.e(e, ko4Var, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void g0(Exception exc) {
        efd.d("MediaCodecVideoRenderer", "Video codec error", exc);
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new c9c(k7bVar, exc, (byte) 19));
        }
    }

    @Override
    public final void h0(long j, long j2, String str) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new o30(k7bVar, str2, j, j2, (byte) 17));
        } else {
            str2 = str;
        }
        this.n1 = J0(str2);
        nm6 nm6Var = this.j0;
        nm6Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(nm6Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nm6Var.d;
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
            nm6 nm6Var2 = this.j0;
            nm6Var2.getClass();
            if (nm6Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.o1 = z2;
        R0();
    }

    @Override
    public final void i() {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            int i = this.t1;
            if (i != 0 && i != 1) {
                fgcVar.w();
                return;
            } else {
                this.t1 = 0;
                return;
            }
        }
        uec uecVar = this.f1;
        if (uecVar.e == 0) {
            uecVar.e = 1;
        }
    }

    @Override
    public final void i0(pk2 pk2Var) {
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new c9c(k7bVar, pk2Var, (byte) 17));
        }
    }

    @Override
    public final void j0(String str) {
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new c9c(k7bVar, str, (byte) 20));
        }
    }

    @Override
    public final w93 k0(ym4 ym4Var) {
        w93 k0 = super.k0(ym4Var);
        this.q1 = false;
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new b6c(k7bVar, ko4Var, k0, (byte) 9));
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
        return k0;
    }

    @Override
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void l0(ko4 ko4Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        jm6 jm6Var = this.c0;
        if (jm6Var != null) {
            jm6Var.j(this.z1);
        }
        if (this.O1) {
            i = ko4Var.A;
            integer = ko4Var.B;
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
        float f = ko4Var.I;
        int i2 = ko4Var.G;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.L1 = new ggc(f, i, integer);
        fgc fgcVar = this.r1;
        if (fgcVar != null && this.T1) {
            if (i > 0 && integer > 0) {
                jo4 a = ko4Var.a();
                a.z = i;
                a.A = integer;
                a.H = f;
                ko4 ko4Var2 = new ko4(a);
                int i4 = this.t1;
                List list = this.u1;
                if (list == null) {
                    no5 no5Var = po5.b;
                    list = j99.e;
                }
                fgcVar.g(ko4Var2, this.P0.b, i4, list);
                this.t1 = 2;
            } else {
                return;
            }
        } else {
            float f2 = ko4Var.F;
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
            fgc fgcVar = this.r1;
            if (fgcVar == null || fgcVar.a()) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn6.o():boolean");
    }

    @Override
    public final void o0() {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.j();
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
    public final void p0(s93 s93Var) {
        ByteBuffer byteBuffer;
        int i;
        int i2;
        ByteBuffer byteBuffer2;
        boolean z;
        bm2 bm2Var;
        nm6 nm6Var = this.j0;
        nm6Var.getClass();
        String str = nm6Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = s93Var.c) != null) {
            ko4 ko4Var = this.d0;
            if (ko4Var != null && (bm2Var = ko4Var.L) != null && bm2Var.e > 8) {
                z = true;
            } else {
                z = false;
            }
            if (this.q1 && !byteBuffer2.isReadOnly()) {
                py0.b(byteBuffer2, false);
            } else if (z && this.o1 && !byteBuffer2.isReadOnly()) {
                py0.b(byteBuffer2, true);
            }
            qx6 qx6Var = this.i1;
            if (qx6Var != null && s93Var.isKeyFrame()) {
                int position = byteBuffer2.position();
                int limit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) qx6Var.b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(position);
                byteBuffer2.limit(limit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = s93Var.c) != null && this.q1 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = s93Var.c;
            int position2 = byteBuffer4.position();
            int limit2 = byteBuffer4.limit();
            if (limit2 - position2 >= 4) {
                while (position2 < limit2) {
                    int a = hoe.a(byteBuffer4, position2, limit2);
                    if (a == limit2 || (i = a + 3) >= limit2 || ((i2 = (byteBuffer4.get(i) & 126) >> 1) >= 0 && i2 <= 31)) {
                        break;
                    }
                    if (i2 == 39) {
                        int i3 = a + 5;
                        i = hoe.a(byteBuffer4, i3, limit2);
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
        int U = U(s93Var);
        if ((Build.VERSION.SDK_INT < 34 || (U & 32) == 0) && !this.O1) {
            this.E1++;
        }
    }

    @Override
    public final void q() {
        k7b k7bVar = this.c1;
        this.M1 = null;
        R0();
        this.y1 = false;
        this.Q1 = null;
        this.H1 = B0();
        try {
            super.q();
        } finally {
            k7bVar.l(this.O0);
            k7bVar.t(ggc.d);
        }
    }

    @Override
    public final void r(boolean z, boolean z2) {
        boolean z3;
        fgc fgcVar;
        this.O0 = new Object();
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        boolean z4 = qa9Var.b;
        if (z4 && this.P1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        yve.p(z3);
        if (this.O1 != z4) {
            this.O1 = z4;
            t0();
        }
        p93 p93Var = this.O0;
        k7b k7bVar = this.c1;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new ufc(k7bVar, p93Var, (byte) 0));
        }
        boolean z5 = this.s1;
        uec uecVar = this.f1;
        if (!z5) {
            if (this.u1 != null && this.r1 == null) {
                rm3 rm3Var = new rm3(this.a1, uecVar);
                rm3Var.a = true;
                long j = this.j1;
                long j2 = -9223372036854775807L;
                if (j != -9223372036854775807L) {
                    j2 = -j;
                }
                rm3Var.c = j2;
                vgb vgbVar = this.h;
                vgbVar.getClass();
                rm3Var.g = vgbVar;
                yve.p(!rm3Var.b);
                if (((vf8) rm3Var.f) == null) {
                    rm3Var.f = new vf8();
                }
                xf8 xf8Var = new xf8(rm3Var);
                rm3Var.b = true;
                if (1 >= xf8Var.p) {
                    xf8Var.p = 1;
                }
                SparseArray sparseArray = xf8Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    fgcVar = (fgc) sparseArray.get(0);
                } else {
                    tf8 tf8Var = new tf8(xf8Var, xf8Var.a);
                    xf8Var.g.add(tf8Var);
                    sparseArray.put(0, tf8Var);
                    fgcVar = tf8Var;
                }
                this.r1 = fgcVar;
            }
            this.s1 = true;
        }
        fgc fgcVar2 = this.r1;
        if (fgcVar2 != null) {
            fgcVar2.i(new v34(this, (byte) 15));
            sec secVar = this.R1;
            if (secVar != null) {
                this.r1.t(secVar);
            }
            if (this.v1 != null && !this.x1.equals(rma.c)) {
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
        vgb vgbVar2 = this.h;
        vgbVar2.getClass();
        uecVar.k = vgbVar2;
        uecVar.e(!z2 ? 1 : 0);
    }

    @Override
    public final boolean r0(long j, long j2, jm6 jm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ko4 ko4Var) {
        boolean z3;
        zj4 zj4Var;
        jm6Var.getClass();
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
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            if (z && !z2) {
                X0(jm6Var, i);
                return true;
            }
            return fgcVar.m(j3, new ym6(this, jm6Var, i, j4));
        }
        int a = this.f1.a(j3, j, j2, this.P0.b, z, z2, zj4Var.a(), zj4Var.h, this.g1);
        ry0 ry0Var = this.g1;
        vec vecVar = this.k1;
        if (vecVar != null && a != 5 && a != 4) {
            vecVar.a(j3, ry0Var.a);
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4 && a != 5) {
                            grb.i(String.valueOf(a));
                            return false;
                        }
                        return false;
                    }
                    X0(jm6Var, i);
                    Z0(ry0Var.a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                jm6Var.c(i);
                Trace.endSection();
                Y0(0, 1);
                Z0(ry0Var.a);
                return true;
            }
            long j5 = ry0Var.b;
            long j6 = ry0Var.a;
            if (j5 == this.K1) {
                X0(jm6Var, i);
            } else {
                sec secVar = this.R1;
                if (secVar != null) {
                    secVar.b(j4, j5, ko4Var, this.e0);
                }
                S0(jm6Var, i, j5);
            }
            Z0(j6);
            this.K1 = j5;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        sec secVar2 = this.R1;
        if (secVar2 != null) {
            secVar2.b(j4, nanoTime, ko4Var, this.e0);
        }
        S0(jm6Var, i, nanoTime);
        Z0(ry0Var.a);
        return true;
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        fgc fgcVar = this.r1;
        if (fgcVar != null && !z) {
            fgcVar.o(true);
        }
        if (z2) {
            this.G1 = j;
        }
        super.s(j, z, z2);
        fgc fgcVar2 = this.r1;
        uec uecVar = this.f1;
        if (fgcVar2 == null) {
            uecVar.b.b();
            uecVar.f = -9223372036854775807L;
            uecVar.e = Math.min(uecVar.e, 1);
            uecVar.h = -9223372036854775807L;
            uecVar.m = false;
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
        if (z) {
            fgc fgcVar3 = this.r1;
            if (fgcVar3 != null) {
                fgcVar3.r(false);
            } else {
                uecVar.c(false);
            }
        }
        R0();
        this.D1 = 0;
    }

    @Override
    public final void t() {
        fgc fgcVar = this.r1;
        if (fgcVar != null && this.b1) {
            fgcVar.release();
        }
    }

    @Override
    public final void u0() {
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.j();
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
            bs2.C(this.X, null);
            this.X = null;
        } finally {
            this.s1 = false;
            this.S1 = -9223372036854775807L;
            this.q1 = false;
            df8 df8Var = this.w1;
            if (df8Var != null) {
                df8Var.release();
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
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.f();
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
        qx6 qx6Var = this.i1;
        if (qx6Var != null) {
            qx6Var.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) qx6Var.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void x() {
        Q0();
        int i = this.J1;
        if (i != 0) {
            long j = this.I1;
            k7b k7bVar = this.c1;
            Handler handler = (Handler) k7bVar.b;
            if (handler != null) {
                handler.post(new tfc(k7bVar, j, i));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        fgc fgcVar = this.r1;
        if (fgcVar != null) {
            fgcVar.e();
        } else {
            uec uecVar = this.f1;
            uecVar.d = false;
            uecVar.h = -9223372036854775807L;
            zec zecVar = uecVar.b;
            zecVar.d = false;
            wec wecVar = zecVar.c;
            if (wecVar != null) {
                wecVar.b();
            }
            zecVar.a();
        }
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
    }

    @Override
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        super.y(ko4VarArr, j, j2, vz6Var);
        vec vecVar = this.k1;
        if (vecVar != null) {
            vecVar.b();
        }
    }
}
