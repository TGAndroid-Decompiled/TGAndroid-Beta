package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f12656a;
    public final long f12657b;
    public final List f12658c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f12656a = str;
        this.f12657b = j10;
        this.f12658c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
