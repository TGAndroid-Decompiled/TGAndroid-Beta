package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f17959a;
    public final long f17960b;
    public final List f17961c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f17959a = str;
        this.f17960b = j10;
        this.f17961c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
