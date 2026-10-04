package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16004a;
    public final long f16005b;
    public final List f16006c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f16004a = str;
        this.f16005b = j3;
        this.f16006c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
