package defpackage;

import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
public abstract class ka9 {
    public final go4 a;
    public final mo5 b;
    public final long c;
    public final List d;
    public final b19 e;

    public ka9(go4 go4Var, mo5 mo5Var, wx9 wx9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        jte.f(!mo5Var.isEmpty());
        this.a = go4Var;
        this.b = mo5.q(mo5Var);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = wx9Var.b(this);
        long j = wx9Var.c;
        long j2 = wx9Var.b;
        String str = hac.a;
        this.c = hac.b0(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public String a() {
        return null;
    }

    public abstract d73 b();

    public b19 c() {
        return null;
    }
}
