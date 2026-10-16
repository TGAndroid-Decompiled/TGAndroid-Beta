package m2;

import b2.x;
import e2.m0;
import e9.n0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import v7.u6;
public abstract class m {
    public final x f15093a;
    public final n0 f15094b;
    public final long f15095c;
    public final List d;
    public final List e;
    public final List f15096f;
    public final j h;

    public m(x xVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        u6.g(!list.isEmpty());
        this.f15093a = xVar;
        this.f15094b = n0.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f15096f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.f15108c;
        long j11 = sVar.f15107b;
        String str = m0.f8375a;
        this.f15095c = m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h d();

    public abstract j g();
}
