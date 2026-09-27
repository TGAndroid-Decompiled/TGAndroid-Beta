package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14686a;
    public final long f14687b;
    public final List f14688c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14686a = str;
        this.f14687b = j3;
        this.f14688c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
