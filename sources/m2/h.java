package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15688a;
    public final long f15689b;
    public final List f15690c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15688a = str;
        this.f15689b = j3;
        this.f15690c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
