package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16440a;
    public final long f16441b;
    public final List f16442c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f16440a = str;
        this.f16441b = j10;
        this.f16442c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
