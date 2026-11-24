package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class f38 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public f38(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
