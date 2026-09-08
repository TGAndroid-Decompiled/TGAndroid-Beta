package m2;

import e2.d0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final b2.s f15824a;
    public final i0 f15825b;
    public final long f15826c;
    public final List d;
    public final List f15827e;
    public final List f15828f;
    public final j h;

    public m(b2.s sVar, List list, s sVar2, List list2, List list3, List list4) {
        List unmodifiableList;
        e2.d.b(!list.isEmpty());
        this.f15824a = sVar;
        this.f15825b = i0.v(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f15827e = list3;
        this.f15828f = list4;
        this.h = sVar2.a(this);
        long j3 = sVar2.f15842c;
        long j10 = sVar2.f15841b;
        String str = d0.f8765a;
        this.f15826c = d0.Y(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h d();

    public abstract j h();
}
