package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f14675a;
    public final long f14676b;
    public final List f14677c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f14675a = str;
        this.f14676b = j3;
        this.f14677c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
