package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16441a;
    public final long f16442b;
    public final List f16443c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f16441a = str;
        this.f16442b = j10;
        this.f16443c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
