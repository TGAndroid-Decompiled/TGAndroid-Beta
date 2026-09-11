package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15748a;
    public final int f15749b;
    public final List f15750c;
    public final List d;
    public final List f15751e;
    public final List f15752f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15748a = j3;
        this.f15749b = i10;
        this.f15750c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15751e = DesugarCollections.unmodifiableList(list2);
        this.f15752f = DesugarCollections.unmodifiableList(list3);
    }
}
