package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15784a;
    public final long f15785b;
    public final List f15786c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15784a = str;
        this.f15785b = j3;
        this.f15786c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
