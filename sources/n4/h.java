package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class h {

    public final String f18244a;

    public final long f18245b;

    public final List f18246c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f18244a = str;
        this.f18245b = j10;
        this.f18246c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
