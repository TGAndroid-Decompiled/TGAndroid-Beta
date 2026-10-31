package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f12655a;
    public final long f12656b;
    public final List f12657c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f12655a = str;
        this.f12656b = j10;
        this.f12657c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
