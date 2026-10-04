package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f15999a;
    public final long f16000b;
    public final List f16001c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f15999a = str;
        this.f16000b = j3;
        this.f16001c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
