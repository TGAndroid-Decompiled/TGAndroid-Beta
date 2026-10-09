package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15939a;
    public final long f15940b;
    public final List f15941c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15939a = str;
        this.f15940b = j3;
        this.f15941c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
