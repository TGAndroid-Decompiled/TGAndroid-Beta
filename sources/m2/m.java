package m2;

import a8.yb;
import b2.x;
import e2.n0;
import f9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final x f17971a;
    public final i0 f17972b;
    public final long f17973c;
    public final List d;
    public final List e;
    public final List f17974f;
    public final j h;

    public m(x xVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        yb.g(!list.isEmpty());
        this.f17971a = xVar;
        this.f17972b = i0.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f17974f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.f17986c;
        long j11 = sVar.f17985b;
        String str = n0.f9691a;
        this.f17973c = n0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h c();

    public abstract j d();
}
