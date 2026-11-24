package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
public final class ib3 {
    public final ma6 a;
    public final e7a b;
    public final int[] c;
    public final int d;
    public final a83 e;
    public final long f;
    public final te8 g;
    public final gb3[] h;
    public t74 i;
    public t63 j;
    public int k;
    public ji0 l;
    public boolean m;

    public ib3(m41 m41Var, ma6 ma6Var, t63 t63Var, e7a e7aVar, int i, int[] iArr, t74 t74Var, int i2, a83 a83Var, long j, boolean z, y79 y79Var, te8 te8Var) {
        int i3;
        ka9 ka9Var;
        gb3[] gb3VarArr;
        s84 er4Var;
        go4 go4Var;
        int i4;
        n41 n41Var;
        this.a = ma6Var;
        this.j = t63Var;
        this.b = e7aVar;
        this.c = iArr;
        this.i = t74Var;
        this.d = i2;
        this.e = a83Var;
        this.k = i;
        this.f = j;
        te8 te8Var2 = te8Var;
        this.g = te8Var2;
        long d = t63Var.d(i);
        ArrayList a = a();
        this.h = new gb3[t74Var.length()];
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h.length) {
            ka9 ka9Var2 = (ka9) a.get(t74Var.k(i6));
            wh0 G = e7aVar.G(ka9Var2.b);
            gb3[] gb3VarArr2 = this.h;
            wh0 wh0Var = G == null ? (wh0) ka9Var2.b.get(i5) : G;
            go4 go4Var2 = ka9Var2.a;
            String str = go4Var2.s;
            if (wf7.l(str)) {
                if (!m41Var.b) {
                    n41Var = null;
                    ka9Var = ka9Var2;
                    gb3VarArr = gb3VarArr2;
                    n41 n41Var2 = n41Var;
                    long j2 = d;
                    int i7 = i6;
                    gb3VarArr[i7] = new gb3(j2, ka9Var, wh0Var, n41Var2, 0L, ka9Var.b());
                    i6 = i7 + 1;
                    te8Var2 = te8Var;
                    d = j2;
                    i5 = 0;
                } else {
                    er4Var = new qcb(((fgf) m41Var.c).v(go4Var2), go4Var2);
                }
            } else {
                if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                    if (Objects.equals(str, "image/jpeg")) {
                        er4Var = new uf5(1, (byte) 1);
                    } else if (Objects.equals(str, "image/png")) {
                        er4Var = new ym0((byte) 1);
                    } else {
                        if (z) {
                            i3 = 4;
                        } else {
                            i3 = 0;
                        }
                        ka9Var = ka9Var2;
                        gb3VarArr = gb3VarArr2;
                        er4Var = new er4((fgf) m41Var.c, (m41Var.b ? i3 : i3 | 32) | er4.g(3), null, y79Var, te8Var2);
                        go4Var = go4Var2;
                    }
                } else {
                    ka9Var = ka9Var2;
                    go4Var = go4Var2;
                    gb3VarArr = gb3VarArr2;
                    if (!m41Var.b) {
                        i4 = 3;
                    } else {
                        i4 = 1;
                    }
                    er4Var = new tl6((fgf) m41Var.c, i4);
                }
                n41Var = new n41(er4Var, i2, go4Var);
                n41 n41Var22 = n41Var;
                long j22 = d;
                int i72 = i6;
                gb3VarArr[i72] = new gb3(j22, ka9Var, wh0Var, n41Var22, 0L, ka9Var.b());
                i6 = i72 + 1;
                te8Var2 = te8Var;
                d = j22;
                i5 = 0;
            }
            ka9Var = ka9Var2;
            go4Var = go4Var2;
            gb3VarArr = gb3VarArr2;
            n41Var = new n41(er4Var, i2, go4Var);
            n41 n41Var222 = n41Var;
            long j222 = d;
            int i722 = i6;
            gb3VarArr[i722] = new gb3(j222, ka9Var, wh0Var, n41Var222, 0L, ka9Var.b());
            i6 = i722 + 1;
            te8Var2 = te8Var;
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

    public final gb3 b(int i) {
        gb3[] gb3VarArr = this.h;
        gb3 gb3Var = gb3VarArr[i];
        wh0 G = this.b.G(gb3Var.b.b);
        if (G != null && !G.equals(gb3Var.c)) {
            gb3 gb3Var2 = new gb3(gb3Var.e, gb3Var.b, G, gb3Var.a, gb3Var.f, gb3Var.d);
            gb3VarArr[i] = gb3Var2;
            return gb3Var2;
        }
        return gb3Var;
    }
}
