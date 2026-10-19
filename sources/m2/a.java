package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f16408a;
    public final int f16409b;
    public final List f16410c;
    public final List d;
    public final List e;
    public final List f16411f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f16408a = j10;
        this.f16409b = i10;
        this.f16410c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f16411f = DesugarCollections.unmodifiableList(list3);
    }
}
