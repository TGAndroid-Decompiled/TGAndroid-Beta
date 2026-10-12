package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15653a;
    public final int f15654b;
    public final List f15655c;
    public final List d;
    public final List f15656e;
    public final List f15657f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15653a = j3;
        this.f15654b = i10;
        this.f15655c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15656e = DesugarCollections.unmodifiableList(list2);
        this.f15657f = DesugarCollections.unmodifiableList(list3);
    }
}
