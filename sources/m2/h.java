package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14644a;
    public final long f14645b;
    public final List f14646c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14644a = str;
        this.f14645b = j3;
        this.f14646c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
