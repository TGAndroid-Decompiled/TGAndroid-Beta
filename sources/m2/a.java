package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14612a;
    public final int f14613b;
    public final List f14614c;
    public final List d;
    public final List e;
    public final List f14615f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14612a = j3;
        this.f14613b = i10;
        this.f14614c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14615f = DesugarCollections.unmodifiableList(list3);
    }
}
