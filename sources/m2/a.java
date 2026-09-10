package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f13224a;
    public final int f13225b;
    public final List f13226c;
    public final List d;
    public final List e;
    public final List f13227f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f13224a = j3;
        this.f13225b = i10;
        this.f13226c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f13227f = DesugarCollections.unmodifiableList(list3);
    }
}
