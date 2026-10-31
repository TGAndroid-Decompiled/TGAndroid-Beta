package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f12623a;
    public final int f12624b;
    public final List f12625c;
    public final List d;
    public final List e;
    public final List f12626f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f12623a = j10;
        this.f12624b = i10;
        this.f12625c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f12626f = DesugarCollections.unmodifiableList(list3);
    }
}
