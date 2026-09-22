package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14384a;
    public final int f14385b;
    public final List f14386c;
    public final List d;
    public final List e;
    public final List f14387f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14384a = j3;
        this.f14385b = i10;
        this.f14386c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14387f = DesugarCollections.unmodifiableList(list3);
    }
}
