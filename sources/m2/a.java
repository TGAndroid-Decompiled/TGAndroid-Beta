package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14396a;
    public final int f14397b;
    public final List f14398c;
    public final List d;
    public final List e;
    public final List f14399f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14396a = j3;
        this.f14397b = i10;
        this.f14398c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14399f = DesugarCollections.unmodifiableList(list3);
    }
}
