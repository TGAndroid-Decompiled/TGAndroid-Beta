package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import td.t;
import td.u;
import td.v;
import td.w;
import w7.l7;
public final class d implements xd.c, c {
    public static final Map f15694b;
    public static final LinkedHashMap f15695c;
    public final Class f15696a;

    static {
        int i10 = 0;
        List c10 = jd.h.c(td.a.class, td.l.class, td.p.class, td.q.class, td.r.class, td.s.class, t.class, u.class, v.class, w.class, td.b.class, td.c.class, td.d.class, td.e.class, td.f.class, td.g.class, td.h.class, td.i.class, td.j.class, td.k.class, td.m.class, td.n.class, td.o.class);
        ArrayList arrayList = new ArrayList(jd.i.d(c10));
        for (Object obj : c10) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new id.d((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f15694b = jd.r.d(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb2.append(zd.j.j(str, str));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f15694b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(jd.r.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, zd.j.j(str2, str2));
        }
        f15695c = linkedHashMap;
    }

    public d(Class jClass) {
        i.e(jClass, "jClass");
        this.f15696a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15696a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && l7.a(this).equals(l7.a((xd.c) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return l7.a(this).hashCode();
    }

    public final String toString() {
        return this.f15696a + " (Kotlin reflection is not available)";
    }
}
