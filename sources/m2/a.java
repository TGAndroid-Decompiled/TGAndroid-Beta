package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15314a;
    public final int f15315b;
    public final List f15316c;
    public final List d;
    public final List e;
    public final List f15317f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15314a = j10;
        this.f15315b = i10;
        this.f15316c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f15317f = DesugarCollections.unmodifiableList(list3);
    }
}
