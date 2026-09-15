package m2;

import e2.d0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final b2.s f14430a;
    public final i0 f14431b;
    public final long f14432c;
    public final List d;
    public final List e;
    public final List f14433f;
    public final j h;

    public m(b2.s sVar, List list, s sVar2, List list2, List list3, List list4) {
        List unmodifiableList;
        e2.d.b(!list.isEmpty());
        this.f14430a = sVar;
        this.f14431b = i0.v(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f14433f = list4;
        this.h = sVar2.a(this);
        long j3 = sVar2.f14445c;
        long j10 = sVar2.f14444b;
        String str = d0.f7883a;
        this.f14432c = d0.Y(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract l2.h d();

    public abstract j e();
}
