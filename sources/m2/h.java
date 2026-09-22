package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14416a;
    public final long f14417b;
    public final List f14418c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14416a = str;
        this.f14417b = j3;
        this.f14418c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
