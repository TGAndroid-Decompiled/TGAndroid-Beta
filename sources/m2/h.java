package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15943a;
    public final long f15944b;
    public final List f15945c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15943a = str;
        this.f15944b = j3;
        this.f15945c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
