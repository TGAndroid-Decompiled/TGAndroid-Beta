package c9;

import j$.util.DesugarCollections;
import j7.j5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class b {
    public final String f2148a;
    public final Set f2149b;
    public final Set f2150c;
    public final int d;
    public final int e;
    public final e f2151f;
    public final Set f2152g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.f2148a = str;
        this.f2149b = DesugarCollections.unmodifiableSet(set);
        this.f2150c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f2151f = eVar;
        this.f2152g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(t tVar) {
        t[] tVarArr = new t[0];
        ?? obj = new Object();
        obj.f2143a = null;
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.e = new HashSet();
        obj.f2144b = 0;
        obj.f2145c = 0;
        obj.f2146f = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            j5.a(tVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.d, tVarArr);
        return obj;
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            j5.a(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a1.c(obj, 3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2149b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f2150c.toArray()) + "}";
    }
}
