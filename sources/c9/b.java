package c9;

import j$.util.DesugarCollections;
import j7.j5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public final class b {
    public final String f2171a;
    public final Set f2172b;
    public final Set f2173c;
    public final int d;
    public final int e;
    public final f f2174f;
    public final Set f2175g;

    public b(String str, Set set, Set set2, int i10, int i11, f fVar, Set set3) {
        this.f2171a = str;
        this.f2172b = DesugarCollections.unmodifiableSet(set);
        this.f2173c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f2174f = fVar;
        this.f2175g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(u uVar) {
        u[] uVarArr = new u[0];
        ?? obj = new Object();
        obj.f2166a = null;
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.e = new HashSet();
        obj.f2167b = 0;
        obj.f2168c = 0;
        obj.f2169f = new HashSet();
        hashSet.add(uVar);
        for (u uVar2 : uVarArr) {
            j5.a(uVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.d, uVarArr);
        return obj;
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(u.a(cls));
        for (Class cls2 : clsArr) {
            j5.a(cls2, "Null interface");
            hashSet.add(u.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a1.c(obj, 3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2172b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f2173c.toArray()) + "}";
    }
}
