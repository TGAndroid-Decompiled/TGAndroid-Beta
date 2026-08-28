package n4;

import d5.f0;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import o8.z;
public abstract class m {
    public final t0 f18430a;
    public final z f18431b;
    public final long f18432c;
    public final List d;
    public final List f18433e;
    public final List f18434f;
    public final j h;

    public m(t0 t0Var, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        d5.a.f(!list.isEmpty());
        this.f18430a = t0Var;
        this.f18431b = z.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f18433e = list3;
        this.f18434f = list4;
        this.h = sVar.a(this);
        this.f18432c = f0.O(sVar.f18448c, 1000000L, sVar.f18447b);
    }

    public abstract String b();

    public abstract m4.h c();

    public abstract j d();
}
