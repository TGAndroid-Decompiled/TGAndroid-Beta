package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14374a;
    public final int f14375b;
    public final List f14376c;
    public final List d;
    public final List e;
    public final List f14377f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14374a = j3;
        this.f14375b = i10;
        this.f14376c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14377f = DesugarCollections.unmodifiableList(list3);
    }
}
