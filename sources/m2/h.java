package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f13256a;
    public final long f13257b;
    public final List f13258c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f13256a = str;
        this.f13257b = j3;
        this.f13258c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
