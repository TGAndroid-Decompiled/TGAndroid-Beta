package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15907a;
    public final int f15908b;
    public final List f15909c;
    public final List d;
    public final List f15910e;
    public final List f15911f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15907a = j3;
        this.f15908b = i10;
        this.f15909c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15910e = DesugarCollections.unmodifiableList(list2);
        this.f15911f = DesugarCollections.unmodifiableList(list3);
    }
}
