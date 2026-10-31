package m2;

import b2.x;
import e2.l0;
import e9.n0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import v7.t6;
public abstract class m {
    public final x f12667a;
    public final n0 f12668b;
    public final long f12669c;
    public final List d;
    public final List e;
    public final List f12670f;
    public final j h;

    public m(x xVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        t6.f(!list.isEmpty());
        this.f12667a = xVar;
        this.f12668b = n0.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f12670f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.f12682c;
        long j11 = sVar.f12681b;
        String str = l0.f6165a;
        this.f12669c = l0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.i d();

    public abstract j h();
}
