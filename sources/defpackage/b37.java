package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class b37 extends ur2 {
    public static final bt6 s;
    public final rh0[] k;
    public final ArrayList l;
    public final bqb[] m;
    public final ArrayList n;
    public final kg7 o;
    public int p;
    public long[][] q;
    public ol2 r;

    static {
        ps6 ps6Var = new ps6();
        ps6Var.a = "MergingMediaSource";
        s = ps6Var.a();
    }

    public b37(rh0... rh0VarArr) {
        kg7 kg7Var = new kg7((byte) 17);
        this.k = rh0VarArr;
        this.o = kg7Var;
        this.n = new ArrayList(Arrays.asList(rh0VarArr));
        this.p = -1;
        this.l = new ArrayList(rh0VarArr.length);
        for (int i = 0; i < rh0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new bqb[rh0VarArr.length];
        this.q = new long[0];
        ntd.b(8, "expectedKeys");
        ntd.b(2, "expectedValuesPerKey");
        dq2 c = dq2.c(8);
        ?? obj = new Object();
        ntd.b(2, "expectedValuesPerKey");
        new zi7(c).h = obj;
    }

    @Override
    public final boolean a(bt6 bt6Var) {
        rh0[] rh0VarArr = this.k;
        if (rh0VarArr.length <= 0 || !rh0VarArr[0].a(bt6Var)) {
            return false;
        }
        return true;
    }

    @Override
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        rh0[] rh0VarArr = this.k;
        int length = rh0VarArr.length;
        tt6[] tt6VarArr = new tt6[length];
        bqb[] bqbVarArr = this.m;
        int b = bqbVarArr[0].b(rz6Var.a);
        for (int i = 0; i < length; i++) {
            rz6 a = rz6Var.a(bqbVarArr[i].l(b));
            tt6VarArr[i] = rh0VarArr[i].c(a, mx6Var, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new a37(a, tt6VarArr[i]));
        }
        return new z27(this.o, this.q[b], tt6VarArr);
    }

    @Override
    public final bt6 i() {
        rh0[] rh0VarArr = this.k;
        if (rh0VarArr.length > 0) {
            return rh0VarArr[0].i();
        }
        return s;
    }

    @Override
    public final void k() {
        ol2 ol2Var = this.r;
        if (ol2Var == null) {
            super.k();
            return;
        }
        throw ol2Var;
    }

    @Override
    public final void m(w0c w0cVar) {
        this.j = hac.q(null);
        int i = 0;
        while (true) {
            rh0[] rh0VarArr = this.k;
            if (i < rh0VarArr.length) {
                y(Integer.valueOf(i), rh0VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void o(tt6 tt6Var) {
        tt6 tt6Var2;
        tt6 tt6Var3;
        z27 z27Var = (z27) tt6Var;
        int i = 0;
        while (true) {
            rh0[] rh0VarArr = this.k;
            if (i < rh0VarArr.length) {
                List list = (List) this.l.get(i);
                boolean[] zArr = z27Var.b;
                tt6[] tt6VarArr = z27Var.a;
                if (zArr[i]) {
                    tt6Var2 = ((spb) tt6VarArr[i]).a;
                } else {
                    tt6Var2 = tt6VarArr[i];
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (((a37) list.get(i2)).b.equals(tt6Var2)) {
                        list.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                rh0 rh0Var = rh0VarArr[i];
                if (z27Var.b[i]) {
                    tt6Var3 = ((spb) tt6VarArr[i]).a;
                } else {
                    tt6Var3 = tt6VarArr[i];
                }
                rh0Var.o(tt6Var3);
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
    public final void t(bt6 bt6Var) {
        this.k[0].t(bt6Var);
    }

    @Override
    public final rz6 u(Integer num, rz6 rz6Var) {
        int intValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((a37) list.get(i)).a.equals(rz6Var)) {
                return ((a37) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override
    public final void x(Integer num, rh0 rh0Var, bqb bqbVar) {
        int i;
        if (this.r == null) {
            if (this.p == -1) {
                i = bqbVar.h();
                this.p = i;
            } else {
                int h = bqbVar.h();
                int i2 = this.p;
                if (h != i2) {
                    this.r = new IOException();
                    return;
                }
                i = i2;
            }
            int length = this.q.length;
            bqb[] bqbVarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance(Long.TYPE, i, bqbVarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(rh0Var);
            bqbVarArr[num.intValue()] = bqbVar;
            if (arrayList.isEmpty()) {
                n(bqbVarArr[0]);
            }
        }
    }
}
