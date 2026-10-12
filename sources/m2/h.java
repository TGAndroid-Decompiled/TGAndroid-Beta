package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15346a;
    public final long f15347b;
    public final List f15348c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f15346a = str;
        this.f15347b = j10;
        this.f15348c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
