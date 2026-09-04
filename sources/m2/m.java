package m2;

import e2.d0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final b2.s f15797a;
    public final i0 f15798b;
    public final long f15799c;
    public final List d;
    public final List f15800e;
    public final List f15801f;
    public final j h;

    public m(b2.s sVar, List list, s sVar2, List list2, List list3, List list4) {
        List unmodifiableList;
        e2.d.b(!list.isEmpty());
        this.f15797a = sVar;
        this.f15798b = i0.v(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f15800e = list3;
        this.f15801f = list4;
        this.h = sVar2.a(this);
        long j3 = sVar2.f15815c;
        long j10 = sVar2.f15814b;
        String str = d0.f8737a;
        this.f15799c = d0.Y(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h d();

    public abstract j h();
}
