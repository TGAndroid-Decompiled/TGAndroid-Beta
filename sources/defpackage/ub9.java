package defpackage;

import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
public abstract class ub9 {
    public final ko4 a;
    public final po5 b;
    public final long c;
    public final List d;
    public final n29 e;

    public ub9(ko4 ko4Var, po5 po5Var, nz9 nz9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        yve.f(!po5Var.isEmpty());
        this.a = ko4Var;
        this.b = po5.q(po5Var);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = nz9Var.b(this);
        long j = nz9Var.c;
        long j2 = nz9Var.b;
        String str = gcc.a;
        this.c = gcc.b0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public String a() {
        return null;
    }

    public abstract j63 b();

    public n29 c() {
        return null;
    }
}
