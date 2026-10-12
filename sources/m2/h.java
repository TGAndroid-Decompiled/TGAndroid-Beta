package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15689a;
    public final long f15690b;
    public final List f15691c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15689a = str;
        this.f15690b = j3;
        this.f15691c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
