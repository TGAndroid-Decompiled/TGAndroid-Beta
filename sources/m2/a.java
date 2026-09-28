package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14627a;
    public final int f14628b;
    public final List f14629c;
    public final List d;
    public final List e;
    public final List f14630f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14627a = j3;
        this.f14628b = i10;
        this.f14629c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14630f = DesugarCollections.unmodifiableList(list3);
    }
}
