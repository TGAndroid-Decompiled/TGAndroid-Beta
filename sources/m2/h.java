package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16009a;
    public final long f16010b;
    public final List f16011c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f16009a = str;
        this.f16010b = j3;
        this.f16011c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
