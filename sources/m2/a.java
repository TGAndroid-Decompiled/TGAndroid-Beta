package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14386a;
    public final int f14387b;
    public final List f14388c;
    public final List d;
    public final List e;
    public final List f14389f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14386a = j3;
        this.f14387b = i10;
        this.f14388c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14389f = DesugarCollections.unmodifiableList(list3);
    }
}
