package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f16000a;
    public final long f16001b;
    public final List f16002c;
    public final List d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.f16000a = str;
        this.f16001b = j3;
        this.f16002c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
