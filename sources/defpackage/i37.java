package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class i37 extends cr2 {
    public static final ft6 s;
    public final rg0[] k;
    public final ArrayList l;
    public final asb[] m;
    public final ArrayList n;
    public final sg7 o;
    public int p;
    public long[][] q;
    public wk2 r;

    static {
        ts6 ts6Var = new ts6();
        ts6Var.a = "MergingMediaSource";
        s = ts6Var.a();
    }

    public i37(rg0... rg0VarArr) {
        sg7 sg7Var = new sg7((byte) 17);
        this.k = rg0VarArr;
        this.o = sg7Var;
        this.n = new ArrayList(Arrays.asList(rg0VarArr));
        this.p = -1;
        this.l = new ArrayList(rg0VarArr.length);
        for (int i = 0; i < rg0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new asb[rg0VarArr.length];
        this.q = new long[0];
        awd.b(8, "expectedKeys");
        awd.b(2, "expectedValuesPerKey");
        lp2 c = lp2.c(8);
        ?? obj = new Object();
        awd.b(2, "expectedValuesPerKey");
        new gj7(c).h = obj;
    }

    @Override
    public final boolean a(ft6 ft6Var) {
        rg0[] rg0VarArr = this.k;
        if (rg0VarArr.length <= 0 || !rg0VarArr[0].a(ft6Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        rg0[] rg0VarArr = this.k;
        int length = rg0VarArr.length;
        xt6[] xt6VarArr = new xt6[length];
        asb[] asbVarArr = this.m;
        int b = asbVarArr[0].b(vz6Var.a);
        for (int i = 0; i < length; i++) {
            vz6 a = vz6Var.a(asbVarArr[i].l(b));
            xt6VarArr[i] = rg0VarArr[i].c(a, rx6Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new h37(a, xt6VarArr[i]));
        }
        return new g37(this.o, this.q[b], xt6VarArr);
    }

    @Override
    public final ft6 i() {
        rg0[] rg0VarArr = this.k;
        if (rg0VarArr.length > 0) {
            return rg0VarArr[0].i();
        }
        return s;
    }

    @Override
    public final void k() {
        wk2 wk2Var = this.r;
        if (wk2Var == null) {
            super.k();
            return;
        }
        throw wk2Var;
    }

    @Override
    public final void m(v2c v2cVar) {
        this.j = gcc.q(null);
        int i = 0;
        while (true) {
            rg0[] rg0VarArr = this.k;
            if (i < rg0VarArr.length) {
                y(Integer.valueOf(i), rg0VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void o(xt6 xt6Var) {
        xt6 xt6Var2;
        xt6 xt6Var3;
        g37 g37Var = (g37) xt6Var;
        int i = 0;
        while (true) {
            rg0[] rg0VarArr = this.k;
            if (i < rg0VarArr.length) {
                List list = (List) this.l.get(i);
                boolean[] zArr = g37Var.b;
                xt6[] xt6VarArr = g37Var.a;
                if (zArr[i]) {
                    xt6Var2 = ((rrb) xt6VarArr[i]).a;
                } else {
                    xt6Var2 = xt6VarArr[i];
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (((h37) list.get(i2)).b.equals(xt6Var2)) {
                        list.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                rg0 rg0Var = rg0VarArr[i];
                if (g37Var.b[i]) {
                    xt6Var3 = ((rrb) xt6VarArr[i]).a;
                } else {
                    xt6Var3 = xt6VarArr[i];
                }
                rg0Var.o(xt6Var3);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override
    public final void t(ft6 ft6Var) {
        this.k[0].t(ft6Var);
    }

    @Override
    public final vz6 u(Integer num, vz6 vz6Var) {
        int intValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((h37) list.get(i)).a.equals(vz6Var)) {
                return ((h37) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override
    public final void x(Integer num, rg0 rg0Var, asb asbVar) {
        int i;
        if (this.r == null) {
            if (this.p == -1) {
                i = asbVar.h();
                this.p = i;
            } else {
                int h = asbVar.h();
                int i2 = this.p;
                if (h != i2) {
                    this.r = new IOException();
                    return;
                }
                i = i2;
            }
            int length = this.q.length;
            asb[] asbVarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance(Long.TYPE, i, asbVarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(rg0Var);
            asbVarArr[num.intValue()] = asbVar;
            if (arrayList.isEmpty()) {
                n(asbVarArr[0]);
            }
        }
    }
}
