package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f14628a;
    public final int f14629b;
    public final List f14630c;
    public final List d;
    public final List e;
    public final List f14631f;

    public a(long j3, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f14628a = j3;
        this.f14629b = i10;
        this.f14630c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f14631f = DesugarCollections.unmodifiableList(list3);
    }
}
