package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14418a;
    public final long f14419b;
    public final List f14420c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14418a = str;
        this.f14419b = j3;
        this.f14420c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
