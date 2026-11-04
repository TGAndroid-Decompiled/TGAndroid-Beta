package o2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final long f20504a;
    public final int f20505b;
    public final List f20506c;
    public final List d;
    public final List f20507e;
    public final List f20508f;

    public a(long j10, int i3, ArrayList arrayList, List list, List list2, List list3) {
        this.f20504a = j10;
        this.f20505b = i3;
        this.f20506c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f20507e = DesugarCollections.unmodifiableList(list2);
        this.f20508f = DesugarCollections.unmodifiableList(list3);
    }
}
