package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f17960a;
    public final long f17961b;
    public final List f17962c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f17960a = str;
        this.f17961b = j10;
        this.f17962c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
