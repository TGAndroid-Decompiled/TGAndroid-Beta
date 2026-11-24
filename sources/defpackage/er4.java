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
public final class er4 implements s84 {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final go4 Q;
    public long A;
    public long B;
    public dr4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public u84 I;
    public yzb[] J;
    public yzb[] K;
    public boolean L;
    public boolean M;
    public long N;
    public long O;
    public final tcb a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final yw7 i;
    public final vqb j;
    public final kp o;
    public final te8 p;
    public final sz4 q;
    public y79 r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public yw7 w;
    public long x;
    public int y;
    public long z;
    public final hi2 k = new hi2((byte) 27);
    public final yw7 l = new yw7(16);
    public final yw7 e = new yw7(add.a);
    public final yw7 f = new yw7(6);
    public final yw7 g = new yw7();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("application/x-emsg");
        Q = new go4(fo4Var);
    }

    public er4(tcb tcbVar, int i, vqb vqbVar, List list, te8 te8Var) {
        this.a = tcbVar;
        this.b = i;
        this.j = vqbVar;
        this.c = DesugarCollections.unmodifiableList(list);
        this.p = te8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new yw7(bArr);
        ko5 ko5Var = mo5.b;
        this.r = y79.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = u84.v;
        this.J = new yzb[0];
        this.K = new yzb[0];
        this.o = new kp(new yu3(this, (byte) 24));
        this.q = new sz4((byte) 19);
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

    public static as3 i(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            ph7 ph7Var = (ph7) arrayList.get(i);
            if (ph7Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = ph7Var.e.a;
                kw8 b = wte.b(bArr);
                if (b == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) b.c;
                }
                if (uuid == null) {
                    ncd.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new zr3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new as3(null, false, (zr3[]) arrayList2.toArray(new zr3[0]));
    }

    public static void k(yw7 yw7Var, int i, tzb tzbVar) {
        boolean z;
        yw7Var.N(i + 8);
        int m = yw7Var.m();
        byte[] bArr = yz0.a;
        if ((m & 1) == 0) {
            if ((m & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int E = yw7Var.E();
            if (E == 0) {
                Arrays.fill(tzbVar.l, 0, tzbVar.e, false);
                return;
            }
            int i2 = tzbVar.e;
            yw7 yw7Var2 = tzbVar.n;
            if (E == i2) {
                Arrays.fill(tzbVar.l, 0, E, z);
                yw7Var2.K(yw7Var.a());
                tzbVar.k = true;
                tzbVar.o = true;
                yw7Var.k(0, yw7Var2.c, yw7Var2.a);
                yw7Var2.N(0);
                tzbVar.o = false;
                return;
            }
            StringBuilder l = hg9.l(E, "Senc sample count ", " is different from fragment sample count");
            l.append(tzbVar.e);
            throw bx7.a(l.toString(), null);
        }
        throw bx7.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair l(long j, yw7 yw7Var) {
        long G;
        long G2;
        yw7 yw7Var2 = yw7Var;
        yw7Var2.N(8);
        int e = yz0.e(yw7Var2.m());
        yw7Var2.O(4);
        long C = yw7Var2.C();
        if (e == 0) {
            G = yw7Var2.C();
            G2 = yw7Var2.C();
        } else {
            G = yw7Var2.G();
            G2 = yw7Var2.G();
        }
        long j2 = G2 + j;
        String str = hac.a;
        long b0 = hac.b0(G, 1000000L, C, RoundingMode.DOWN);
        yw7Var2.O(2);
        int H = yw7Var2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j3 = j2;
        long j4 = b0;
        int i = 0;
        while (i < H) {
            int m = yw7Var2.m();
            if ((Integer.MIN_VALUE & m) == 0) {
                long C2 = yw7Var2.C();
                iArr[i] = m & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long b02 = hac.b0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i] = b02 - jArr5[i];
                yw7Var2.O(4);
                j3 += iArr[i];
                i++;
                H = H;
                yw7Var2 = yw7Var;
                j4 = b02;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw bx7.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(b0), new oi2(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final int b(defpackage.t84 r50, defpackage.u21 r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er4.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        y79 y79Var;
        bma a = zed.a(t84Var, true);
        if (a != null) {
            y79Var = mo5.u(a);
        } else {
            ko5 ko5Var = mo5.b;
            y79Var = y79.e;
        }
        this.r = y79Var;
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
            ((dr4) sparseArray.valueAt(i)).e();
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
    public final void f(u84 u84Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            u84Var = new yh4(u84Var, this.a);
        }
        this.I = u84Var;
        h();
        yzb[] yzbVarArr = new yzb[2];
        this.J = yzbVarArr;
        int i3 = 0;
        te8 te8Var = this.p;
        if (te8Var != null) {
            yzbVarArr[0] = te8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            yzbVarArr[i] = this.I.c0(100, 5);
            i4 = 101;
            i++;
        }
        yzb[] yzbVarArr2 = (yzb[]) hac.V(i, this.J);
        this.J = yzbVarArr2;
        for (yzb yzbVar : yzbVarArr2) {
            yzbVar.g(Q);
        }
        List list = this.c;
        this.K = new yzb[list.size()];
        while (i3 < this.K.length) {
            yzb c0 = this.I.c0(i4, 3);
            c0.g((go4) list.get(i3));
            this.K[i3] = c0;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = (byte) 0;
        this.v = 0;
    }

    public final void j(ix9 ix9Var, u21 u21Var) {
        this.I.f0(ix9Var);
        this.L = true;
        u21Var.a = this.O;
        h();
    }

    public final void m(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er4.m(long):void");
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
