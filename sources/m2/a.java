package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f16410a;
    public final int f16411b;
    public final List f16412c;
    public final List d;
    public final List e;
    public final List f16413f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f16410a = j10;
        this.f16411b = i10;
        this.f16412c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f16413f = DesugarCollections.unmodifiableList(list3);
    }
}
