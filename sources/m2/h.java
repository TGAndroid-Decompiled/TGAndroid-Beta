package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14406a;
    public final long f14407b;
    public final List f14408c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14406a = str;
        this.f14407b = j3;
        this.f14408c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
