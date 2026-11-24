package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
public final class w93 {
    public final n86 a;
    public final c5a b;
    public final int[] c;
    public final int d;
    public final o63 e;
    public final long f;
    public final qc8 g;
    public final u93[] h;
    public k64 i;
    public h53 j;
    public int k;
    public jh0 l;
    public boolean m;

    public w93(e31 e31Var, n86 n86Var, h53 h53Var, c5a c5aVar, int i, int[] iArr, k64 k64Var, int i2, o63 o63Var, long j, boolean z, w59 w59Var, qc8 qc8Var) {
        int i3;
        i89 i89Var;
        u93[] u93VarArr;
        j74 dp4Var;
        fm4 fm4Var;
        int i4;
        f31 f31Var;
        this.a = n86Var;
        this.j = h53Var;
        this.b = c5aVar;
        this.c = iArr;
        this.i = k64Var;
        this.d = i2;
        this.e = o63Var;
        this.k = i;
        this.f = j;
        qc8 qc8Var2 = qc8Var;
        this.g = qc8Var2;
        long d = h53Var.d(i);
        ArrayList a = a();
        this.h = new u93[k64Var.length()];
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h.length) {
            i89 i89Var2 = (i89) a.get(k64Var.k(i6));
            wg0 N = c5aVar.N(i89Var2.b);
            u93[] u93VarArr2 = this.h;
            wg0 wg0Var = N == null ? (wg0) i89Var2.b.get(i5) : N;
            fm4 fm4Var2 = i89Var2.a;
            String str = fm4Var2.s;
            if (ud7.l(str)) {
                if (!e31Var.b) {
                    f31Var = null;
                    i89Var = i89Var2;
                    u93VarArr = u93VarArr2;
                    f31 f31Var2 = f31Var;
                    long j2 = d;
                    int i7 = i6;
                    u93VarArr[i7] = new u93(j2, i89Var, wg0Var, f31Var2, 0L, i89Var.b());
                    i6 = i7 + 1;
                    qc8Var2 = qc8Var;
                    d = j2;
                    i5 = 0;
                } else {
                    dp4Var = new pab(((eef) e31Var.c).r(fm4Var2), fm4Var2);
                }
            } else {
                if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                    if (Objects.equals(str, "image/jpeg")) {
                        dp4Var = new wd5(1, (byte) 1);
                    } else if (Objects.equals(str, "image/png")) {
                        dp4Var = new yl0((byte) 1);
                    } else {
                        if (z) {
                            i3 = 4;
                        } else {
                            i3 = 0;
                        }
                        i89Var = i89Var2;
                        u93VarArr = u93VarArr2;
                        dp4Var = new dp4((eef) e31Var.c, (e31Var.b ? i3 : i3 | 32) | dp4.g(3), null, w59Var, qc8Var2);
                        fm4Var = fm4Var2;
                    }
                } else {
                    i89Var = i89Var2;
                    fm4Var = fm4Var2;
                    u93VarArr = u93VarArr2;
                    if (!e31Var.b) {
                        i4 = 3;
                    } else {
                        i4 = 1;
                    }
                    dp4Var = new qj6((eef) e31Var.c, i4);
                }
                f31Var = new f31(dp4Var, i2, fm4Var);
                f31 f31Var22 = f31Var;
                long j22 = d;
                int i72 = i6;
                u93VarArr[i72] = new u93(j22, i89Var, wg0Var, f31Var22, 0L, i89Var.b());
                i6 = i72 + 1;
                qc8Var2 = qc8Var;
                d = j22;
                i5 = 0;
            }
            i89Var = i89Var2;
            fm4Var = fm4Var2;
            u93VarArr = u93VarArr2;
            f31Var = new f31(dp4Var, i2, fm4Var);
            f31 f31Var222 = f31Var;
            long j222 = d;
            int i722 = i6;
            u93VarArr[i722] = new u93(j222, i89Var, wg0Var, f31Var222, 0L, i89Var.b());
            i6 = i722 + 1;
            qc8Var2 = qc8Var;
            d = j222;
            i5 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((ea) list.get(i)).c);
        }
        return arrayList;
    }

    public final u93 b(int i) {
        u93[] u93VarArr = this.h;
        u93 u93Var = u93VarArr[i];
        wg0 N = this.b.N(u93Var.b.b);
        if (N != null && !N.equals(u93Var.c)) {
            u93 u93Var2 = new u93(u93Var.e, u93Var.b, N, u93Var.a, u93Var.f, u93Var.d);
            u93VarArr[i] = u93Var2;
            return u93Var2;
        }
        return u93Var;
    }
}
