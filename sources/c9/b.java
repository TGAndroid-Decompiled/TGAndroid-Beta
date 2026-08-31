package c9;

import j$.util.DesugarCollections;
import j7.k5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class b {
    public final String f2336a;
    public final Set f2337b;
    public final Set f2338c;
    public final int d;
    public final int f2339e;
    public final e f2340f;
    public final Set f2341g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.f2336a = str;
        this.f2337b = DesugarCollections.unmodifiableSet(set);
        this.f2338c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.f2339e = i11;
        this.f2340f = eVar;
        this.f2341g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(t tVar) {
        t[] tVarArr = new t[0];
        ?? obj = new Object();
        obj.f2330a = null;
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.f2333e = new HashSet();
        obj.f2331b = 0;
        obj.f2332c = 0;
        obj.f2334f = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            k5.a(tVar2, "Null interface");
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
            k5.a(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a1.c(obj, 3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2337b.toArray()) + ">{" + this.d + ", type=" + this.f2339e + ", deps=" + Arrays.toString(this.f2338c.toArray()) + "}";
    }
}
