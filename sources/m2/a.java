package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15968a;
    public final int f15969b;
    public final List f15970c;
    public final List d;
    public final List f15971e;
    public final List f15972f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15968a = j3;
        this.f15969b = i10;
        this.f15970c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15971e = DesugarCollections.unmodifiableList(list2);
        this.f15972f = DesugarCollections.unmodifiableList(list3);
    }
}
