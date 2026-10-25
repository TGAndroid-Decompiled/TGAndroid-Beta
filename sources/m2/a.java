package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f17928a;
    public final int f17929b;
    public final List f17930c;
    public final List d;
    public final List e;
    public final List f17931f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f17928a = j10;
        this.f17929b = i10;
        this.f17930c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f17931f = DesugarCollections.unmodifiableList(list3);
    }
}
