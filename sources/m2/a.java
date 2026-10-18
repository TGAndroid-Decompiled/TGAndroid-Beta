package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f16409a;
    public final int f16410b;
    public final List f16411c;
    public final List d;
    public final List e;
    public final List f16412f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f16409a = j10;
        this.f16410b = i10;
        this.f16411c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f16412f = DesugarCollections.unmodifiableList(list3);
    }
}
