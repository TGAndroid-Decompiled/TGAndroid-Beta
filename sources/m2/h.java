package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14659a;
    public final long f14660b;
    public final List f14661c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14659a = str;
        this.f14660b = j3;
        this.f14661c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
