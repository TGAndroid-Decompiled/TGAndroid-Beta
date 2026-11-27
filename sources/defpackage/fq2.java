package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public final class fq2 {
    public final String a;
    public final Set b;
    public final Set c;
    public final byte d;
    public final boolean e;
    public final tq2 f;
    public final Set g;

    public fq2(String str, Set set, Set set2, int i, int i2, tq2 tq2Var, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = tq2Var;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static eq2 a(i09 i09Var) {
        return new eq2(i09Var, new i09[0]);
    }

    public static eq2 b(Class cls) {
        return new eq2(cls, new Class[0]);
    }

    public static fq2 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(i09.a(cls));
        for (Class cls2 : clsArr) {
            bwe.a(cls2, "Null interface");
            hashSet.add(i09.a(cls2));
        }
        return new fq2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new dq2(obj, (byte) 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + ((int) this.d) + ", type=" + (this.e ? 1 : 0) + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
