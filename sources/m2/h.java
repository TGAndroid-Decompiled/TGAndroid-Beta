package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14660a;
    public final long f14661b;
    public final List f14662c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14660a = str;
        this.f14661b = j3;
        this.f14662c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
