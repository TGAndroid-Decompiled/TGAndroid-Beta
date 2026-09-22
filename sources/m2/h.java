package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14654a;
    public final long f14655b;
    public final List f14656c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14654a = str;
        this.f14655b = j3;
        this.f14656c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
