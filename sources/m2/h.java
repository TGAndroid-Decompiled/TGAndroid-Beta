package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16434a;
    public final long f16435b;
    public final List f16436c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f16434a = str;
        this.f16435b = j10;
        this.f16436c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
