package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16503a;
    public final long f16504b;
    public final List f16505c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f16503a = str;
        this.f16504b = j10;
        this.f16505c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
