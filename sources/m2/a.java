package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14643a;
    public final int f14644b;
    public final List f14645c;
    public final List d;
    public final List e;
    public final List f14646f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14643a = j3;
        this.f14644b = i10;
        this.f14645c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14646f = DesugarCollections.unmodifiableList(list3);
    }
}
