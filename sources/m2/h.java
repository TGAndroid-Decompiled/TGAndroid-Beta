package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15081a;
    public final long f15082b;
    public final List f15083c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f15081a = str;
        this.f15082b = j10;
        this.f15083c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
