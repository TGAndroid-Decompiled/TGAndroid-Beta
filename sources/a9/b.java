package a9;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public final class b {
    public final String f232a;
    public final Set f233b;
    public final Set f234c;
    public final int d;
    public final int f235e;
    public final e f236f;
    public final Set f237g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.f232a = str;
        this.f233b = DesugarCollections.unmodifiableSet(set);
        this.f234c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.f235e = i11;
        this.f236f = eVar;
        this.f237g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(v vVar) {
        return new a(vVar, new v[0]);
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v.a(cls));
        for (Class cls2 : clsArr) {
            h7.n.a(cls2, "Null interface");
            hashSet.add(v.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a1.c(obj, 2), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f233b.toArray()) + ">{" + this.d + ", type=" + this.f235e + ", deps=" + Arrays.toString(this.f234c.toArray()) + "}";
    }
}
