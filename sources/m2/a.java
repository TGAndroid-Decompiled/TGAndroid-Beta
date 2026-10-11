package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f15928a;
    public final int f15929b;
    public final List f15930c;
    public final List d;
    public final List f15931e;
    public final List f15932f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f15928a = j3;
        this.f15929b = i10;
        this.f15930c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f15931e = DesugarCollections.unmodifiableList(list2);
        this.f15932f = DesugarCollections.unmodifiableList(list3);
    }
}
