package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
public final class hr4 implements e84 {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ko4 Q;
    public long A;
    public long B;
    public gr4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public g84 I;
    public x1c[] J;
    public x1c[] K;
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public final peb a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final ey7 i;
    public final usb j;
    public final lo o;
    public final fg8 p;
    public final wz4 q;
    public j99 r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public ey7 w;
    public long x;
    public int y;
    public long z;
    public final qx6 k = new qx6((byte) 25);
    public final ey7 l = new ey7(16);
    public final ey7 e = new ey7(rfd.a);
    public final ey7 f = new ey7(6);
    public final ey7 g = new ey7();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        jo4 jo4Var = new jo4();
        jo4Var.s = dg7.n("application/x-emsg");
        Q = new ko4(jo4Var);
    }

    public hr4(peb pebVar, int i, usb usbVar, List list, fg8 fg8Var) {
        this.a = pebVar;
        this.b = i;
        this.j = usbVar;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = fg8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new ey7(bArr);
        no5 no5Var = po5.b;
        this.r = j99.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = g84.v;
        this.J = new x1c[0];
        this.K = new x1c[0];
        this.o = new lo(new lu3(this, (byte) 24));
        this.q = new wz4((byte) 19);
        this.N = -1L;
        this.O = -1L;
    }

    public static int g(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 64;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            return i2 | 128;
        }
        return i2;
    }

    public static hr3 i(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            vh7 vh7Var = (vh7) arrayList.get(i);
            if (vh7Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = vh7Var.e.a;
                sx8 b = lwe.b(bArr);
                if (b == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) b.c;
                }
                if (uuid == null) {
                    efd.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new gr3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new hr3(null, false, (gr3[]) arrayList2.toArray(new gr3[0]));
    }

    public static void k(ey7 ey7Var, int i, s1c s1cVar) {
        boolean z;
        ey7Var.N(i + 8);
        int m = ey7Var.m();
        byte[] bArr = zy0.a;
        if ((m & 1) == 0) {
            if ((m & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int E = ey7Var.E();
            if (E == 0) {
                Arrays.fill(s1cVar.l, 0, s1cVar.e, false);
                return;
            }
            int i2 = s1cVar.e;
            ey7 ey7Var2 = s1cVar.n;
            if (E == i2) {
                Arrays.fill(s1cVar.l, 0, E, z);
                ey7Var2.K(ey7Var.a());
                s1cVar.k = true;
                s1cVar.o = true;
                ey7Var.k(0, ey7Var2.c, ey7Var2.a);
                ey7Var2.N(0);
                s1cVar.o = false;
                return;
            }
            StringBuilder m2 = uh9.m(E, "Senc sample count ", " is different from fragment sample count");
            m2.append(s1cVar.e);
            throw hy7.a(m2.toString(), null);
        }
        throw hy7.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair l(long j, ey7 ey7Var) {
        long G;
        long G2;
        ey7 ey7Var2 = ey7Var;
        ey7Var2.N(8);
        int e = zy0.e(ey7Var2.m());
        ey7Var2.O(4);
        long C = ey7Var2.C();
        if (e == 0) {
            G = ey7Var2.C();
            G2 = ey7Var2.C();
        } else {
            G = ey7Var2.G();
            G2 = ey7Var2.G();
        }
        long j2 = G2 + j;
        String str = gcc.a;
        long b0 = gcc.b0(G, 1000000L, C, RoundingMode.DOWN);
        ey7Var2.O(2);
        int H = ey7Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = ey7Var2.m();
            if ((Integer.MIN_VALUE & m) == 0) {
                long C2 = ey7Var2.C();
                iArr[i] = m & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long b02 = gcc.b0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i] = b02 - jArr5[i];
                ey7Var2.O(4);
                j3 += iArr[i];
                i++;
                H = H;
                ey7Var2 = ey7Var;
                j4 = b02;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw hy7.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(b0), new sh2(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final int b(defpackage.f84 r50, defpackage.v11 r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr4.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        j99 j99Var;
        una a = qhd.a(f84Var, true);
        if (a != null) {
            j99Var = po5.u(a);
        } else {
            no5 no5Var = po5.b;
            j99Var = j99.e;
        }
        this.r = j99Var;
        if (a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((gr4) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        this.O = -1L;
        h();
    }

    @Override
    public final List e() {
        return this.r;
    }

    @Override
    public final void f(g84 g84Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            g84Var = new vh4(g84Var, this.a);
        }
        this.I = g84Var;
        h();
        x1c[] x1cVarArr = new x1c[2];
        this.J = x1cVarArr;
        int i3 = 0;
        fg8 fg8Var = this.p;
        if (fg8Var != null) {
            x1cVarArr[0] = fg8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            x1cVarArr[i] = this.I.e0(100, 5);
            i4 = 101;
            i++;
        }
        x1c[] x1cVarArr2 = (x1c[]) gcc.V(i, this.J);
        this.J = x1cVarArr2;
        for (x1c x1cVar : x1cVarArr2) {
            x1cVar.g(Q);
        }
        List list = this.c;
        this.K = new x1c[list.size()];
        while (i3 < this.K.length) {
            x1c e0 = this.I.e0(i4, 3);
            e0.g((ko4) list.get(i3));
            this.K[i3] = e0;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = (byte) 0;
        this.v = 0;
    }

    public final void j(zy9 zy9Var, v11 v11Var) {
        this.I.m0(zy9Var);
        this.L = true;
        v11Var.a = this.O;
        h();
    }

    public final void m(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr4.m(long):void");
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
