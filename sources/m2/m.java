package m2;

import e2.d0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final b2.s f16012a;
    public final i0 f16013b;
    public final long f16014c;
    public final List d;
    public final List f16015e;
    public final List f16016f;
    public final j h;

    public m(b2.s sVar, List list, s sVar2, List list2, List list3, List list4) {
        List unmodifiableList;
        e2.d.b(!list.isEmpty());
        this.f16012a = sVar;
        this.f16013b = i0.v(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f16015e = list3;
        this.f16016f = list4;
        this.h = sVar2.a(this);
        long j3 = sVar2.f16030c;
        long j10 = sVar2.f16029b;
        String str = d0.f8537a;
        this.f16014c = d0.Y(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.i c();

    public abstract j d();
}
