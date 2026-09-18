package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14571a;
    public final int f14572b;
    public final List f14573c;
    public final List d;
    public final List e;
    public final List f14574f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14571a = j3;
        this.f14572b = i10;
        this.f14573c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14574f = DesugarCollections.unmodifiableList(list3);
    }
}
