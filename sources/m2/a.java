package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15973a;
    public final int f15974b;
    public final List f15975c;
    public final List d;
    public final List f15976e;
    public final List f15977f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15973a = j3;
        this.f15974b = i10;
        this.f15975c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15976e = DesugarCollections.unmodifiableList(list2);
        this.f15977f = DesugarCollections.unmodifiableList(list3);
    }
}
