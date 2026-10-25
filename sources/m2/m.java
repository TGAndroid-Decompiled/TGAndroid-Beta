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
    public final x f17972a;
    public final i0 f17973b;
    public final long f17974c;
    public final List d;
    public final List e;
    public final List f17975f;
    public final j h;

    public m(x xVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        yb.g(!list.isEmpty());
        this.f17972a = xVar;
        this.f17973b = i0.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f17975f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.f17987c;
        long j11 = sVar.f17986b;
        String str = n0.f9692a;
        this.f17974c = n0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h c();

    public abstract j d();
}
