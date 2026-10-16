package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15049a;
    public final int f15050b;
    public final List f15051c;
    public final List d;
    public final List e;
    public final List f15052f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15049a = j10;
        this.f15050b = i10;
        this.f15051c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f15052f = DesugarCollections.unmodifiableList(list3);
    }
}
