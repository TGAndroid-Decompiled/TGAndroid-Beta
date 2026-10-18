package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f16407a;
    public final int f16408b;
    public final List f16409c;
    public final List d;
    public final List e;
    public final List f16410f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f16407a = j10;
        this.f16408b = i10;
        this.f16409c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f16410f = DesugarCollections.unmodifiableList(list3);
    }
}
