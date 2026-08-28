package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f18417a;
    public final long f18418b;
    public final List f18419c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f18417a = str;
        this.f18418b = j10;
        this.f18419c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
