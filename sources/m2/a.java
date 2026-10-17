package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f16402a;
    public final int f16403b;
    public final List f16404c;
    public final List d;
    public final List e;
    public final List f16405f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f16402a = j10;
        this.f16403b = i10;
        this.f16404c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f16405f = DesugarCollections.unmodifiableList(list3);
    }
}
