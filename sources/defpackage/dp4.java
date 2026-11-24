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
public final class dp4 implements j74 {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final fm4 Q;
    public long A;
    public long B;
    public cp4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public l74 I;
    public wxb[] J;
    public wxb[] K;
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public final sab a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final xu7 i;
    public final uob j;
    public final ko o;
    public final qc8 p;
    public final lj9 q;
    public w59 r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public xu7 w;
    public long x;
    public int y;
    public long z;
    public final lv6 k = new lv6((byte) 25);
    public final xu7 l = new xu7(16);
    public final xu7 e = new xu7(yad.a);
    public final xu7 f = new xu7(6);
    public final xu7 g = new xu7();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        em4 em4Var = new em4();
        em4Var.s = ud7.n("application/x-emsg");
        Q = new fm4(em4Var);
    }

    public dp4(sab sabVar, int i, uob uobVar, List list, qc8 qc8Var) {
        this.a = sabVar;
        this.b = i;
        this.j = uobVar;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = qc8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new xu7(bArr);
        km5 km5Var = mm5.b;
        this.r = w59.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = l74.v;
        this.J = new wxb[0];
        this.K = new wxb[0];
        this.o = new ko(new kx3(this, (byte) 21));
        this.q = new lj9((byte) 21);
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

    public static qq3 i(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            mf7 mf7Var = (mf7) arrayList.get(i);
            if (mf7Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = mf7Var.e.a;
                ju8 b = tre.b(bArr);
                if (b == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) b.c;
                }
                if (uuid == null) {
                    lad.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new pq3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new qq3(null, false, (pq3[]) arrayList2.toArray(new pq3[0]));
    }

    public static void k(xu7 xu7Var, int i, rxb rxbVar) {
        boolean z;
        xu7Var.N(i + 8);
        int m = xu7Var.m();
        byte[] bArr = ry0.a;
        if ((m & 1) == 0) {
            if ((m & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int E = xu7Var.E();
            if (E == 0) {
                Arrays.fill(rxbVar.l, 0, rxbVar.e, false);
                return;
            }
            int i2 = rxbVar.e;
            xu7 xu7Var2 = rxbVar.n;
            if (E == i2) {
                Arrays.fill(rxbVar.l, 0, E, z);
                xu7Var2.K(xu7Var.a());
                rxbVar.k = true;
                rxbVar.o = true;
                xu7Var.k(0, xu7Var2.c, xu7Var2.a);
                xu7Var2.N(0);
                rxbVar.o = false;
                return;
            }
            StringBuilder m2 = de9.m(E, "Senc sample count ", " is different from fragment sample count");
            m2.append(rxbVar.e);
            throw av7.a(m2.toString(), null);
        }
        throw av7.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair l(long j, xu7 xu7Var) {
        long G;
        long G2;
        xu7 xu7Var2 = xu7Var;
        xu7Var2.N(8);
        int e = ry0.e(xu7Var2.m());
        xu7Var2.O(4);
        long C = xu7Var2.C();
        if (e == 0) {
            G = xu7Var2.C();
            G2 = xu7Var2.C();
        } else {
            G = xu7Var2.G();
            G2 = xu7Var2.G();
        }
        long j2 = G2 + j;
        String str = g8c.a;
        long b0 = g8c.b0(G, 1000000L, C, RoundingMode.DOWN);
        xu7Var2.O(2);
        int H = xu7Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = xu7Var2.m();
            if ((Integer.MIN_VALUE & m) == 0) {
                long C2 = xu7Var2.C();
                iArr[i] = m & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long b02 = g8c.b0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i] = b02 - jArr5[i];
                xu7Var2.O(4);
                j3 += iArr[i];
                i++;
                H = H;
                xu7Var2 = xu7Var;
                j4 = b02;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw av7.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(b0), new ah2(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final int b(defpackage.k74 r50, defpackage.m11 r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp4.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        w59 w59Var;
        aka a = xcd.a(k74Var, true);
        if (a != null) {
            w59Var = mm5.u(a);
        } else {
            km5 km5Var = mm5.b;
            w59Var = w59.e;
        }
        this.r = w59Var;
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
            ((cp4) sparseArray.valueAt(i)).e();
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
    public final void f(l74 l74Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            l74Var = new xf4(l74Var, this.a);
        }
        this.I = l74Var;
        h();
        wxb[] wxbVarArr = new wxb[2];
        this.J = wxbVarArr;
        int i3 = 0;
        qc8 qc8Var = this.p;
        if (qc8Var != null) {
            wxbVarArr[0] = qc8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            wxbVarArr[i] = this.I.T(100, 5);
            i4 = 101;
            i++;
        }
        wxb[] wxbVarArr2 = (wxb[]) g8c.V(i, this.J);
        this.J = wxbVarArr2;
        for (wxb wxbVar : wxbVarArr2) {
            wxbVar.g(Q);
        }
        List list = this.c;
        this.K = new wxb[list.size()];
        while (i3 < this.K.length) {
            wxb T = this.I.T(i4, 3);
            T.g((fm4) list.get(i3));
            this.K[i3] = T;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = (byte) 0;
        this.v = 0;
    }

    public final void j(fv9 fv9Var, m11 m11Var) {
        this.I.f0(fv9Var);
        this.L = true;
        m11Var.a = this.O;
        h();
    }

    public final void m(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp4.m(long):void");
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
