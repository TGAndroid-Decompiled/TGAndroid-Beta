package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f17927a;
    public final int f17928b;
    public final List f17929c;
    public final List d;
    public final List e;
    public final List f17930f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f17927a = j10;
        this.f17928b = i10;
        this.f17929c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f17930f = DesugarCollections.unmodifiableList(list3);
    }
}
