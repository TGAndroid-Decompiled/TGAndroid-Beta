package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15963a;
    public final int f15964b;
    public final List f15965c;
    public final List d;
    public final List f15966e;
    public final List f15967f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15963a = j3;
        this.f15964b = i10;
        this.f15965c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15966e = DesugarCollections.unmodifiableList(list2);
        this.f15967f = DesugarCollections.unmodifiableList(list3);
    }
}
