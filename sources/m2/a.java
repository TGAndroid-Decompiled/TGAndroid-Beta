package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15652a;
    public final int f15653b;
    public final List f15654c;
    public final List d;
    public final List f15655e;
    public final List f15656f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15652a = j3;
        this.f15653b = i10;
        this.f15654c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15655e = DesugarCollections.unmodifiableList(list2);
        this.f15656f = DesugarCollections.unmodifiableList(list3);
    }
}
