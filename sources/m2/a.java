package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15775a;
    public final int f15776b;
    public final List f15777c;
    public final List d;
    public final List f15778e;
    public final List f15779f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15775a = j3;
        this.f15776b = i10;
        this.f15777c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15778e = DesugarCollections.unmodifiableList(list2);
        this.f15779f = DesugarCollections.unmodifiableList(list3);
    }
}
