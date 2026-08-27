package n4;

import d5.g0;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import p8.z;

public abstract class m {

    public final t0 f18257a;

    public final z f18258b;

    public final long f18259c;
    public final List d;

    public final List f18260e;

    public final List f18261f;
    public final j h;

    public m(t0 t0Var, List list, s sVar, List list2, List list3, List list4) {
        d5.a.f(!list.isEmpty());
        this.f18257a = t0Var;
        this.f18258b = z.u(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.f18260e = list3;
        this.f18261f = list4;
        this.h = sVar.a(this);
        this.f18259c = g0.O(sVar.f18275c, 1000000L, sVar.f18274b);
    }

    public abstract String b();

    public abstract m4.h c();

    public abstract j d();
}
