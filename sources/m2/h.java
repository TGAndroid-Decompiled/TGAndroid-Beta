package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15811a;
    public final long f15812b;
    public final List f15813c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15811a = str;
        this.f15812b = j3;
        this.f15813c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
