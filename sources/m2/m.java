package m2;

import e2.d0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final b2.s f15952a;
    public final i0 f15953b;
    public final long f15954c;
    public final List d;
    public final List f15955e;
    public final List f15956f;
    public final j h;

    public m(b2.s sVar, List list, s sVar2, List list2, List list3, List list4) {
        List unmodifiableList;
        e2.d.b(!list.isEmpty());
        this.f15952a = sVar;
        this.f15953b = i0.v(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f15955e = list3;
        this.f15956f = list4;
        this.h = sVar2.a(this);
        long j3 = sVar2.f15970c;
        long j10 = sVar2.f15969b;
        String str = d0.f8532a;
        this.f15954c = d0.X(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract l2.i c();

    public abstract j e();
}
