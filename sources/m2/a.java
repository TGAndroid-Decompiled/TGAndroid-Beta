package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14622a;
    public final int f14623b;
    public final List f14624c;
    public final List d;
    public final List e;
    public final List f14625f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14622a = j3;
        this.f14623b = i10;
        this.f14624c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14625f = DesugarCollections.unmodifiableList(list3);
    }
}
