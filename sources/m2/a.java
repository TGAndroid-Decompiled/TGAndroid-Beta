package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15964a;
    public final int f15965b;
    public final List f15966c;
    public final List d;
    public final List f15967e;
    public final List f15968f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15964a = j3;
        this.f15965b = i10;
        this.f15966c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15967e = DesugarCollections.unmodifiableList(list2);
        this.f15968f = DesugarCollections.unmodifiableList(list3);
    }
}
