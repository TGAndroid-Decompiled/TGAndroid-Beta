package o2;

import b8.zb;
import d2.v;
import g2.n0;
import g9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final v f20553a;
    public final i0 f20554b;
    public final long f20555c;
    public final List d;
    public final List f20556e;
    public final List f20557f;
    public final j h;

    public m(v vVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        zb.f(!list.isEmpty());
        this.f20553a = vVar;
        this.f20554b = i0.q(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f20556e = list3;
        this.f20557f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.f20571c;
        long j11 = sVar.f20570b;
        String str = n0.f11873a;
        this.f20555c = n0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract n2.i c();

    public abstract j d();
}
