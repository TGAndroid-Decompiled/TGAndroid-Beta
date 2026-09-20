package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14607a;
    public final int f14608b;
    public final List f14609c;
    public final List d;
    public final List e;
    public final List f14610f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14607a = j3;
        this.f14608b = i10;
        this.f14609c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14610f = DesugarCollections.unmodifiableList(list3);
    }
}
