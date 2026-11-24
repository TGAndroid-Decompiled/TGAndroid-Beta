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
public class vk6 extends lk6 {
    public static final int[] V1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean W1;
    public static boolean X1;
    public int A1;
    public long B1;
    public int C1;
    public int D1;
    public int E1;
    public mr9 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public int J1;
    public long K1;
    public icc L1;
    public icc M1;
    public int N1;
    public boolean O1;
    public int P1;
    public uk6 Q1;
    public sac R1;
    public long S1;
    public boolean T1;
    public int U1;
    public final Context a1;
    public final boolean b1;
    public final v8b c1;
    public final byte d1;
    public final boolean e1;
    public final uac f1;
    public final jy0 g1;
    public final vh4 h1;
    public final lv6 i1;
    public final long j1;
    public final vac k1;
    public final PriorityQueue l1;
    public pc0 m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public hcc r1;
    public boolean s1;
    public int t1;
    public List u1;
    public Surface v1;
    public ob8 w1;
    public wia x1;
    public boolean y1;
    public int z1;

    public vk6(defpackage.tk6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.<init>(tk6):void");
    }

    public static boolean J0(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.J0(java.lang.String):boolean");
    }

    public static int K0(defpackage.ik6 r11, defpackage.fm4 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.K0(ik6, fm4):int");
    }

    public static List L0(Context context, fm4 fm4Var, boolean z, boolean z2) {
        List e;
        String str = fm4Var.t;
        if (str == null) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !no5.b(context)) {
            String c = qk6.c(fm4Var);
            if (c == null) {
                km5 km5Var2 = mm5.b;
                e = w59.e;
            } else {
                e = qk6.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return qk6.g(fm4Var, z, z2);
    }

    public static int M0(ik6 ik6Var, fm4 fm4Var) {
        int i = fm4Var.u;
        List list = fm4Var.w;
        if (i != -1) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return fm4Var.u + i2;
        }
        return K0(ik6Var, fm4Var);
    }

    @Override
    public final boolean A0(defpackage.z83 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.A0(z83):boolean");
    }

    @Override
    public final void B(long j, long j2) {
        hcc hccVar = this.r1;
        if (hccVar != null) {
            try {
                hccVar.p(j, j2);
            } catch (gcc e) {
                throw e(e, e.a, false, 7001);
            }
        }
        super.B(j, j2);
    }

    @Override
    public final boolean B0() {
        boolean z;
        if (this.E0) {
            fm4 fm4Var = this.d0;
            long j = this.I;
            if (j != -9223372036854775807L) {
                if (this.U0 + 1 + j <= Long.MAX_VALUE - (this.P0.c + j)) {
                    z = false;
                    if (this.F1 != null || this.H1 || this.O1 || ((fm4Var != null && fm4Var.v > 0) || z || this.P0.h != -9223372036854775807L)) {
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
    public final boolean C0(ik6 ik6Var) {
        return O0(ik6Var);
    }

    @Override
    public final boolean D0() {
        ik6 ik6Var = this.j0;
        if (this.r1 != null && ik6Var != null) {
            String str = ik6Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.D0();
    }

    @Override
    public final void E(float f, float f2) {
        super.E(f, f2);
        hcc hccVar = this.r1;
        if (hccVar != null) {
            hccVar.c(f);
        } else {
            this.f1.g(f);
        }
        vac vacVar = this.k1;
        if (vacVar != null) {
            vacVar.c(f);
        }
    }

    @Override
    public final int F0(fm4 fm4Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!ud7.m(fm4Var.t)) {
            return ls6.a(0, 0, 0, 0);
        }
        if (fm4Var.x != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.a1;
        List L0 = L0(context, fm4Var, z, false);
        if (z && L0.isEmpty()) {
            L0 = L0(context, fm4Var, false, false);
        }
        if (L0.isEmpty()) {
            return ls6.a(1, 0, 0, 0);
        }
        int i6 = fm4Var.X;
        if (i6 != 0 && i6 != 2) {
            return ls6.a(2, 0, 0, 0);
        }
        ik6 ik6Var = (ik6) L0.get(0);
        boolean e = ik6Var.e(context, fm4Var);
        if (!e) {
            for (int i7 = 1; i7 < L0.size(); i7++) {
                ik6 ik6Var2 = (ik6) L0.get(i7);
                if (ik6Var2.e(context, fm4Var)) {
                    z2 = false;
                    e = true;
                    ik6Var = ik6Var2;
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
        if (ik6Var.f(fm4Var)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (ik6Var.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(fm4Var.t) && !no5.b(context)) {
            i4 = 256;
        }
        if (e) {
            List L02 = L0(context, fm4Var, z, true);
            if (!L02.isEmpty()) {
                HashMap hashMap = qk6.a;
                ArrayList arrayList = new ArrayList(L02);
                Collections.sort(arrayList, new bz0(new h45(context, fm4Var, (byte) 25), (byte) 3));
                ik6 ik6Var3 = (ik6) arrayList.get(0);
                if (ik6Var3.e(context, fm4Var) && ik6Var3.f(fm4Var)) {
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
    public final d93 M(ik6 ik6Var, fm4 fm4Var, fm4 fm4Var2, boolean z) {
        byte b;
        int i;
        d93 b2 = ik6Var.b(fm4Var, fm4Var2);
        float f = fm4Var.F;
        float f2 = fm4Var2.F;
        int i2 = b2.e;
        pc0 pc0Var = this.m1;
        pc0Var.getClass();
        if (fm4Var2.A > pc0Var.a || fm4Var2.B > pc0Var.b) {
            i2 |= 256;
        }
        if (M0(ik6Var, fm4Var2) > pc0Var.c) {
            i2 |= 64;
        }
        if (this.A1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!ik6Var.f || !z))) {
            float max = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(max - Math.round(max)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        String str = ik6Var.a;
        if (i3 != 0) {
            b = 0;
        } else {
            b = b2.d;
        }
        return new d93(str, fm4Var, fm4Var2, b, i3);
    }

    @Override
    public final hk6 N(IllegalStateException illegalStateException, ik6 ik6Var) {
        Surface surface = this.v1;
        hk6 hk6Var = new hk6(illegalStateException, ik6Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hk6Var;
    }

    public final android.view.Surface N0(defpackage.ik6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.N0(ik6):android.view.Surface");
    }

    public final boolean O0(ik6 ik6Var) {
        if (this.r1 == null) {
            Surface surface = this.v1;
            if ((surface == null || !surface.isValid()) && !V0(ik6Var) && !W0(ik6Var)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean P0(z83 z83Var) {
        if (!m() && !z83Var.isLastSample()) {
            long j = this.I;
            if (j != -9223372036854775807L && j - (z83Var.e - this.P0.c) > 100000) {
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
            v8b v8bVar = this.c1;
            Handler handler = (Handler) v8bVar.b;
            if (handler != null) {
                handler.post(new ubc(v8bVar, i, j));
            }
            this.C1 = 0;
            this.B1 = elapsedRealtime;
        }
    }

    public final void R0() {
        ek6 ek6Var;
        if (this.O1 && (ek6Var = this.c0) != null) {
            this.Q1 = new uk6(this, ek6Var);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                ek6Var.setParameters(bundle);
            }
        }
    }

    public final void S0(ek6 ek6Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        ek6Var.f(i, j);
        Trace.endSection();
        this.O0.e++;
        boolean z = false;
        this.D1 = 0;
        if (this.r1 == null) {
            icc iccVar = this.L1;
            boolean equals = iccVar.equals(icc.d);
            v8b v8bVar = this.c1;
            if (!equals && !iccVar.equals(this.M1)) {
                this.M1 = iccVar;
                v8bVar.q(iccVar);
            }
            uac uacVar = this.f1;
            if (uacVar.e != 3) {
                z = true;
            }
            uacVar.e = 3;
            uacVar.k.getClass();
            uacVar.g = g8c.T(SystemClock.elapsedRealtime());
            if (z && (surface = this.v1) != null) {
                v8bVar.p(surface);
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
        v8b v8bVar = this.c1;
        if (surface2 != surface) {
            this.v1 = surface;
            hcc hccVar = this.r1;
            uac uacVar = this.f1;
            if (hccVar == null) {
                uacVar.f(surface);
            }
            boolean z = false;
            this.y1 = false;
            byte b = this.n;
            ek6 ek6Var = this.c0;
            if (ek6Var != null) {
                if (this.r1 == null) {
                    ik6 ik6Var = this.j0;
                    ik6Var.getClass();
                    if (O0(ik6Var) && !this.n1) {
                        Surface N0 = N0(ik6Var);
                        if (N0 != null) {
                            try {
                                ek6Var.k(N0);
                            } catch (Throwable th) {
                                th.printStackTrace();
                                throw new IllegalArgumentException(th);
                            }
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            ek6Var.e();
                        } else {
                            sdb.a();
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
                icc iccVar = this.M1;
                if (iccVar != null) {
                    v8bVar.q(iccVar);
                }
            } else {
                this.M1 = null;
                hcc hccVar2 = this.r1;
                if (hccVar2 != null) {
                    hccVar2.k();
                }
            }
            if (b == 2) {
                hcc hccVar3 = this.r1;
                if (hccVar3 != null) {
                    hccVar3.q(z);
                } else {
                    uacVar.c(z);
                }
            }
            R0();
        } else if (surface != null) {
            icc iccVar2 = this.M1;
            if (iccVar2 != null) {
                v8bVar.q(iccVar2);
            }
            Surface surface3 = this.v1;
            if (surface3 != null && this.y1) {
                v8bVar.p(surface3);
            }
        }
    }

    @Override
    public final int U(z83 z83Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.F1 != null || this.O1) && z83Var.e < this.x && !P0(z83Var)) {
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
        w83 w83Var = this.O0;
        if (z2) {
            int i3 = w83Var.d + F;
            w83Var.f += this.E1;
            w83Var.d = i3 + i + i2;
        } else {
            w83Var.j++;
            Y0(F + i, this.E1);
            this.O0.d += i2;
        }
        if (S()) {
            d0();
        }
        hcc hccVar = this.r1;
        if (hccVar != null) {
            hccVar.n(false);
        }
        return true;
    }

    @Override
    public final float V(float f, fm4 fm4Var, fm4[] fm4VarArr) {
        float f2;
        ik6 ik6Var;
        float f3 = -1.0f;
        for (fm4 fm4Var2 : fm4VarArr) {
            float f4 = fm4Var2.F;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f && this.c0 != null) {
            vh4 vh4Var = this.h1;
            if (vh4Var.a() != -9223372036854775807L) {
                f3 = 1.0E9f / ((float) vh4Var.a());
            }
        }
        if (f3 == -1.0f) {
            f2 = -1.0f;
        } else {
            f2 = f3 * f;
        }
        if (this.F1 != null && (ik6Var = this.j0) != null) {
            int i = fm4Var.A;
            int i2 = fm4Var.B;
            float f5 = -3.4028235E38f;
            if (ik6Var.i) {
                float f6 = ik6Var.l;
                if (f6 != -3.4028235E38f && ik6Var.j == i && ik6Var.k == i2) {
                    f5 = f6;
                } else {
                    f5 = 1024.0f;
                    if (!ik6Var.g(i, i2, 1024.0d)) {
                        float f7 = 0.0f;
                        while (true) {
                            float f8 = f5 - f7;
                            if (Math.abs(f8) <= 5.0f) {
                                break;
                            }
                            float f9 = (f8 / 2.0f) + f7;
                            if (ik6Var.g(i, i2, f9)) {
                                f7 = f9;
                            } else {
                                f5 = f9;
                            }
                        }
                        f5 = f7;
                    }
                    ik6Var.l = f5;
                    ik6Var.j = i;
                    ik6Var.k = i2;
                }
            }
            if (f2 != -1.0f) {
                return Math.max(f2, f5);
            }
            return f5;
        }
        return f2;
    }

    public boolean V0(ik6 ik6Var) {
        if (Build.VERSION.SDK_INT >= 35 && ik6Var.h) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList W(fm4 fm4Var, boolean z) {
        boolean z2 = this.O1;
        Context context = this.a1;
        List L0 = L0(context, fm4Var, z, z2);
        HashMap hashMap = qk6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new bz0(new h45(context, fm4Var, (byte) 25), (byte) 3));
        return arrayList;
    }

    public boolean W0(ik6 ik6Var) {
        if (!this.O1 && !J0(ik6Var.a)) {
            if (!ik6Var.f || ob8.b(this.a1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void X0(ek6 ek6Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        ek6Var.c(i);
        Trace.endSection();
        this.O0.f++;
    }

    public final void Y0(int i, int i2) {
        w83 w83Var = this.O0;
        w83Var.h += i;
        int i3 = i + i2;
        w83Var.g += i3;
        this.C1 += i3;
        int i4 = this.D1 + i3;
        this.D1 = i4;
        w83Var.i = Math.max(i4, w83Var.i);
        byte b = this.d1;
        if (b > 0 && this.C1 >= b) {
            Q0();
        }
    }

    @Override
    public final defpackage.ep Z(defpackage.ik6 r25, defpackage.fm4 r26, android.media.MediaCrypto r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.Z(ik6, fm4, android.media.MediaCrypto, float):ep");
    }

    public final void Z0(long j) {
        w83 w83Var = this.O0;
        w83Var.k += j;
        w83Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override
    public final void a0(z83 z83Var) {
        ByteBuffer byteBuffer = z83Var.f;
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
                    ek6 ek6Var = this.c0;
                    ek6Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    ek6Var.setParameters(bundle);
                }
            } else if (Build.VERSION.SDK_INT >= 37) {
                byte[] bArr2 = wj2.a;
                int remaining = byteBuffer.remaining();
                byte[] bArr3 = wj2.d;
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
                        ek6 ek6Var2 = this.c0;
                        ek6Var2.getClass();
                        ek6Var2.setParameters(bundle2);
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
                                            ek6 ek6Var = this.c0;
                                            if (ek6Var != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.N1));
                                                ek6Var.setParameters(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.v1;
                                            T0(null);
                                            obj.getClass();
                                            ((vk6) obj).d(1, surface);
                                            return;
                                        case 18:
                                            if (this.F1 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            mr9 mr9Var = (mr9) obj;
                                            this.F1 = mr9Var;
                                            if (mr9Var == null) {
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
                                wia wiaVar = (wia) obj;
                                if (wiaVar.a != 0 && wiaVar.b != 0) {
                                    this.x1 = wiaVar;
                                    hcc hccVar = this.r1;
                                    if (hccVar != null) {
                                        Surface surface2 = this.v1;
                                        surface2.getClass();
                                        hccVar.d(surface2, wiaVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(tac.a)) {
                                hcc hccVar2 = this.r1;
                                if (hccVar2 != null && hccVar2.u()) {
                                    this.r1.t();
                                    return;
                                }
                                return;
                            }
                            this.u1 = list;
                            hcc hccVar3 = this.r1;
                            if (hccVar3 != null) {
                                hccVar3.o(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.A1 = intValue;
                        hcc hccVar4 = this.r1;
                        if (hccVar4 != null) {
                            hccVar4.j(intValue);
                            return;
                        }
                        zac zacVar = this.f1.b;
                        if (zacVar.i != intValue) {
                            zacVar.i = intValue;
                            zacVar.c(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.z1 = intValue2;
                    ek6 ek6Var2 = this.c0;
                    if (ek6Var2 != null) {
                        ek6Var2.j(intValue2);
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
            sac sacVar = (sac) obj;
            this.R1 = sacVar;
            hcc hccVar5 = this.r1;
            if (hccVar5 != null) {
                hccVar5.s(sacVar);
                return;
            }
            return;
        }
        T0(obj);
    }

    @Override
    public final void f() {
        hcc hccVar = this.r1;
        if (hccVar != null) {
            int i = this.t1;
            if (i != 0 && i != 1) {
                hccVar.v();
                return;
            } else {
                this.t1 = 0;
                return;
            }
        }
        uac uacVar = this.f1;
        if (uacVar.e == 0) {
            uacVar.e = 1;
        }
    }

    @Override
    public final boolean f0(fm4 fm4Var) {
        hcc hccVar = this.r1;
        if (hccVar != null && !hccVar.u()) {
            try {
                return this.r1.m(fm4Var);
            } catch (gcc e) {
                throw this.e(e, fm4Var, false, 7000);
            }
        }
        return true;
    }

    @Override
    public final void g0(Exception exc) {
        lad.d("MediaCodecVideoRenderer", "Video codec error", exc);
        v8b v8bVar = this.c1;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new l3c(v8bVar, exc, (byte) 22));
        }
    }

    @Override
    public final void h0(long j, String str, long j2) {
        String str2;
        boolean z;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        v8b v8bVar = this.c1;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new n30(v8bVar, str2, j, j2, (byte) 17));
        } else {
            str2 = str;
        }
        this.n1 = J0(str2);
        ik6 ik6Var = this.j0;
        ik6Var.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(ik6Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = ik6Var.d;
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
            ik6 ik6Var2 = this.j0;
            ik6Var2.getClass();
            if (ik6Var2.b.equals("video/av01")) {
                z2 = true;
            }
        }
        this.o1 = z2;
        R0();
    }

    @Override
    public final void i0(uj2 uj2Var) {
        v8b v8bVar = this.c1;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new l3c(v8bVar, uj2Var, (byte) 20));
        }
    }

    @Override
    public final void j0(String str) {
        v8b v8bVar = this.c1;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new l3c(v8bVar, str, (byte) 23));
        }
    }

    @Override
    public final d93 k0(sk4 sk4Var) {
        d93 k0 = super.k0(sk4Var);
        this.q1 = false;
        fm4 fm4Var = (fm4) sk4Var.c;
        fm4Var.getClass();
        v8b v8bVar = this.c1;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new wbc(v8bVar, fm4Var, k0, (byte) 0));
        }
        vac vacVar = this.k1;
        if (vacVar != null) {
            vacVar.b();
        }
        return k0;
    }

    @Override
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void l0(fm4 fm4Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        ek6 ek6Var = this.c0;
        if (ek6Var != null) {
            ek6Var.j(this.z1);
        }
        if (this.O1) {
            i = fm4Var.A;
            integer = fm4Var.B;
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
        float f = fm4Var.I;
        int i2 = fm4Var.G;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.L1 = new icc(f, i, integer);
        hcc hccVar = this.r1;
        if (hccVar != null && this.T1) {
            if (i > 0 && integer > 0) {
                em4 a = fm4Var.a();
                a.z = i;
                a.A = integer;
                a.H = f;
                fm4 fm4Var2 = new fm4(a);
                int i4 = this.t1;
                List list = this.u1;
                if (list == null) {
                    km5 km5Var = mm5.b;
                    list = w59.e;
                }
                hccVar.g(fm4Var2, this.P0.b, i4, list);
                this.t1 = 2;
            } else {
                return;
            }
        } else {
            float f2 = fm4Var.F;
            vh4 vh4Var = this.h1;
            vh4Var.f = f2;
            vh4Var.a.c();
            vh4Var.b.c();
            vh4Var.c = false;
            vh4Var.d = -9223372036854775807L;
            vh4Var.e = 0;
            vh4Var.c();
        }
        this.T1 = false;
    }

    @Override
    public final boolean n() {
        if (this.K0) {
            hcc hccVar = this.r1;
            if (hccVar == null || hccVar.a()) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk6.o():boolean");
    }

    @Override
    public final void o0() {
        hcc hccVar = this.r1;
        if (hccVar != null) {
            hccVar.i();
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
    public final void p0(z83 z83Var) {
        ByteBuffer byteBuffer;
        int i;
        int i2;
        ByteBuffer byteBuffer2;
        boolean z;
        hl2 hl2Var;
        ik6 ik6Var = this.j0;
        ik6Var.getClass();
        String str = ik6Var.b;
        if (str.equals("video/av01") && (byteBuffer2 = z83Var.c) != null) {
            fm4 fm4Var = this.d0;
            if (fm4Var != null && (hl2Var = fm4Var.L) != null && hl2Var.e > 8) {
                z = true;
            } else {
                z = false;
            }
            if (this.q1 && !byteBuffer2.isReadOnly()) {
                hy0.b(byteBuffer2, false);
            } else if (z && this.o1 && !byteBuffer2.isReadOnly()) {
                hy0.b(byteBuffer2, true);
            }
            lv6 lv6Var = this.i1;
            if (lv6Var != null && z83Var.isKeyFrame()) {
                int position = byteBuffer2.position();
                int limit = byteBuffer2.limit();
                byteBuffer2.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) lv6Var.b;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer2);
                byteBuffer3.flip();
                byteBuffer2.position(position);
                byteBuffer2.limit(limit);
            }
        } else if (str.equals("video/hevc") && (byteBuffer = z83Var.c) != null && this.q1 && !byteBuffer.isReadOnly()) {
            ByteBuffer byteBuffer4 = z83Var.c;
            int position2 = byteBuffer4.position();
            int limit2 = byteBuffer4.limit();
            if (limit2 - position2 >= 4) {
                while (position2 < limit2) {
                    int a = kje.a(byteBuffer4, position2, limit2);
                    if (a == limit2 || (i = a + 3) >= limit2 || ((i2 = (byteBuffer4.get(i) & 126) >> 1) >= 0 && i2 <= 31)) {
                        break;
                    }
                    if (i2 == 39) {
                        int i3 = a + 5;
                        i = kje.a(byteBuffer4, i3, limit2);
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
        int U = U(z83Var);
        if ((Build.VERSION.SDK_INT < 34 || (U & 32) == 0) && !this.O1) {
            this.E1++;
        }
    }

    @Override
    public final void q() {
        v8b v8bVar = this.c1;
        this.M1 = null;
        R0();
        this.y1 = false;
        this.Q1 = null;
        this.H1 = B0();
        try {
            super.q();
        } finally {
            v8bVar.i(this.O0);
            v8bVar.q(icc.d);
        }
    }

    @Override
    public final void r(boolean z, boolean z2) {
        boolean z3;
        hcc hccVar;
        this.O0 = new Object();
        d79 d79Var = this.d;
        d79Var.getClass();
        boolean z4 = d79Var.b;
        if (z4 && this.P1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        gre.p(z3);
        if (this.O1 != z4) {
            this.O1 = z4;
            t0();
        }
        w83 w83Var = this.O0;
        v8b v8bVar = this.c1;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new vbc(v8bVar, w83Var, (byte) 0));
        }
        boolean z5 = this.s1;
        uac uacVar = this.f1;
        if (!z5) {
            if (this.u1 != null && this.r1 == null) {
                zl3 zl3Var = new zl3(this.a1, uacVar);
                zl3Var.a = true;
                long j = this.j1;
                long j2 = -9223372036854775807L;
                if (j != -9223372036854775807L) {
                    j2 = -j;
                }
                zl3Var.c = j2;
                adb adbVar = this.h;
                adbVar.getClass();
                zl3Var.g = adbVar;
                gre.p(!zl3Var.b);
                if (((gc8) zl3Var.f) == null) {
                    zl3Var.f = new gc8();
                }
                ic8 ic8Var = new ic8(zl3Var);
                zl3Var.b = true;
                if (1 >= ic8Var.p) {
                    ic8Var.p = 1;
                }
                SparseArray sparseArray = ic8Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    hccVar = (hcc) sparseArray.get(0);
                } else {
                    ec8 ec8Var = new ec8(ic8Var, ic8Var.a);
                    ic8Var.g.add(ec8Var);
                    sparseArray.put(0, ec8Var);
                    hccVar = ec8Var;
                }
                this.r1 = hccVar;
            }
            this.s1 = true;
        }
        hcc hccVar2 = this.r1;
        if (hccVar2 != null) {
            hccVar2.w(new pj4(this, (byte) 14));
            sac sacVar = this.R1;
            if (sacVar != null) {
                this.r1.s(sacVar);
            }
            if (this.v1 != null && !this.x1.equals(wia.c)) {
                this.r1.d(this.v1, this.x1);
            }
            this.r1.j(this.A1);
            this.r1.c(this.a0);
            List list = this.u1;
            if (list != null) {
                this.r1.o(list);
            }
            this.t1 = !z2 ? 1 : 0;
            this.S0 = true;
            return;
        }
        adb adbVar2 = this.h;
        adbVar2.getClass();
        uacVar.k = adbVar2;
        uacVar.e(!z2 ? 1 : 0);
    }

    @Override
    public final boolean r0(long j, long j2, ek6 ek6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, fm4 fm4Var) {
        boolean z3;
        vh4 vh4Var;
        ek6Var.getClass();
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
            vh4Var = this.h1;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            vh4Var.b(1000 * l.longValue());
            if (l.longValue() >= this.x && !z3) {
                i4++;
            } else {
                i5++;
            }
        }
        Y0(i4, 0);
        this.O0.d += i5;
        vh4Var.b(j3 * 1000);
        hcc hccVar = this.r1;
        if (hccVar != null) {
            if (z && !z2) {
                X0(ek6Var, i);
                return true;
            }
            return hccVar.l(j3, new sk6(this, ek6Var, i, j4));
        }
        int a = this.f1.a(j3, j, j2, this.P0.b, z, z2, vh4Var.a(), vh4Var.h, this.g1);
        jy0 jy0Var = this.g1;
        vac vacVar = this.k1;
        if (vacVar != null && a != 5 && a != 4) {
            vacVar.a(j3, jy0Var.a);
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4 && a != 5) {
                            sc8.j(String.valueOf(a));
                            return false;
                        }
                        return false;
                    }
                    X0(ek6Var, i);
                    Z0(jy0Var.a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                ek6Var.c(i);
                Trace.endSection();
                Y0(0, 1);
                Z0(jy0Var.a);
                return true;
            }
            long j5 = jy0Var.b;
            long j6 = jy0Var.a;
            if (j5 == this.K1) {
                X0(ek6Var, i);
            } else {
                sac sacVar = this.R1;
                if (sacVar != null) {
                    sacVar.c(j4, j5, fm4Var, this.e0);
                }
                S0(ek6Var, i, j5);
            }
            Z0(j6);
            this.K1 = j5;
            return true;
        }
        this.h.getClass();
        long nanoTime = System.nanoTime();
        sac sacVar2 = this.R1;
        if (sacVar2 != null) {
            sacVar2.c(j4, nanoTime, fm4Var, this.e0);
        }
        S0(ek6Var, i, nanoTime);
        Z0(jy0Var.a);
        return true;
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        hcc hccVar = this.r1;
        if (hccVar != null && !z) {
            hccVar.n(true);
        }
        if (z2) {
            this.G1 = j;
        }
        super.s(j, z, z2);
        hcc hccVar2 = this.r1;
        uac uacVar = this.f1;
        if (hccVar2 == null) {
            uacVar.b.b();
            uacVar.f = -9223372036854775807L;
            uacVar.e = Math.min(uacVar.e, 1);
            uacVar.h = -9223372036854775807L;
            uacVar.m = false;
        }
        vac vacVar = this.k1;
        if (vacVar != null) {
            vacVar.b();
        }
        if (z) {
            hcc hccVar3 = this.r1;
            if (hccVar3 != null) {
                hccVar3.q(false);
            } else {
                uacVar.c(false);
            }
        }
        R0();
        this.D1 = 0;
    }

    @Override
    public final void t() {
        hcc hccVar = this.r1;
        if (hccVar != null && this.b1) {
            hccVar.release();
        }
    }

    @Override
    public final void u0() {
        hcc hccVar = this.r1;
        if (hccVar != null) {
            hccVar.i();
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
            ir2.C(this.X, null);
            this.X = null;
        } finally {
            this.s1 = false;
            this.S1 = -9223372036854775807L;
            this.q1 = false;
            ob8 ob8Var = this.w1;
            if (ob8Var != null) {
                ob8Var.release();
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
        hcc hccVar = this.r1;
        if (hccVar != null) {
            hccVar.f();
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
        lv6 lv6Var = this.i1;
        if (lv6Var != null) {
            lv6Var.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) lv6Var.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override
    public final void x() {
        Q0();
        int i = this.J1;
        if (i != 0) {
            long j = this.I1;
            v8b v8bVar = this.c1;
            Handler handler = (Handler) v8bVar.b;
            if (handler != null) {
                handler.post(new ubc(v8bVar, j, i));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        hcc hccVar = this.r1;
        if (hccVar != null) {
            hccVar.e();
        } else {
            uac uacVar = this.f1;
            uacVar.d = false;
            uacVar.h = -9223372036854775807L;
            zac zacVar = uacVar.b;
            zacVar.d = false;
            wac wacVar = zacVar.c;
            if (wacVar != null) {
                wacVar.b();
            }
            zacVar.a();
        }
        vac vacVar = this.k1;
        if (vacVar != null) {
            vacVar.b();
        }
    }

    @Override
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        super.y(fm4VarArr, j, j2, rx6Var);
        vac vacVar = this.k1;
        if (vacVar != null) {
            vacVar.b();
        }
    }
}
