package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14428a;
    public final long f14429b;
    public final List f14430c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14428a = str;
        this.f14429b = j3;
        this.f14430c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
