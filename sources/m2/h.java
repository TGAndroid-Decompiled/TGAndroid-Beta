package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14639a;
    public final long f14640b;
    public final List f14641c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14639a = str;
        this.f14640b = j3;
        this.f14641c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
