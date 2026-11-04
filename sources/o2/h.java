package o2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f20540a;
    public final long f20541b;
    public final List f20542c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f20540a = str;
        this.f20541b = j10;
        this.f20542c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
