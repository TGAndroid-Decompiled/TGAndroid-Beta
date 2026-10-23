package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f16471a;
    public final int f16472b;
    public final List f16473c;
    public final List d;
    public final List e;
    public final List f16474f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f16471a = j10;
        this.f16472b = i10;
        this.f16473c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f16474f = DesugarCollections.unmodifiableList(list3);
    }
}
