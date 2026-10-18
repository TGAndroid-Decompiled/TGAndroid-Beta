package m2;

import b2.w;
import e2.m0;
import e9.n0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import v7.u6;
public abstract class m {
    public final w f16453a;
    public final n0 f16454b;
    public final long f16455c;
    public final List d;
    public final List e;
    public final List f16456f;
    public final j h;

    public m(w wVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        u6.g(!list.isEmpty());
        this.f16453a = wVar;
        this.f16454b = n0.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f16456f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.f16468c;
        long j11 = sVar.f16467b;
        String str = m0.f8255a;
        this.f16455c = m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.i c();

    public abstract j h();
}
