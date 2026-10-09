package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15903a;
    public final int f15904b;
    public final List f15905c;
    public final List d;
    public final List f15906e;
    public final List f15907f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15903a = j3;
        this.f15904b = i10;
        this.f15905c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15906e = DesugarCollections.unmodifiableList(list2);
        this.f15907f = DesugarCollections.unmodifiableList(list3);
    }
}
