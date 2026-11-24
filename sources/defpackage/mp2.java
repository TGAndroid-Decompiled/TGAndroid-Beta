package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public final class mp2 {
    public final String a;
    public final Set b;
    public final Set c;
    public final byte d;
    public final boolean e;
    public final aq2 f;
    public final Set g;

    public mp2(String str, Set set, Set set2, int i, int i2, aq2 aq2Var, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = aq2Var;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static lp2 a(xw8 xw8Var) {
        return new lp2(xw8Var, new xw8[0]);
    }

    public static lp2 b(Class cls) {
        return new lp2(cls, new Class[0]);
    }

    public static mp2 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(xw8.a(cls));
        for (Class cls2 : clsArr) {
            hre.a(cls2, "Null interface");
            hashSet.add(xw8.a(cls2));
        }
        return new mp2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new kp2(obj, (byte) 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + ((int) this.d) + ", type=" + (this.e ? 1 : 0) + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
