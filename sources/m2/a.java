package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14654a;
    public final int f14655b;
    public final List f14656c;
    public final List d;
    public final List e;
    public final List f14657f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14654a = j3;
        this.f14655b = i10;
        this.f14656c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14657f = DesugarCollections.unmodifiableList(list3);
    }
}
