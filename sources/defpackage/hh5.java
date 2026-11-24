package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class hh5 implements jg4 {
    public final String a;
    public final List b;
    public final boolean c;

    public hh5(String str, List list, boolean z) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z;
    }
}
