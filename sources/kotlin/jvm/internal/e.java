package kotlin.jvm.internal;

import ad.u;
import ad.v;
import ad.w;
import h7.y8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e implements ed.c, d {

    public static final Map f15244b;

    public static final LinkedHashMap f15245c;

    public final Class f15246a;

    static {
        int i10 = 0;
        List listC = qc.h.c(ad.a.class, ad.l.class, ad.p.class, ad.q.class, ad.r.class, ad.s.class, ad.t.class, u.class, v.class, w.class, ad.b.class, ad.c.class, ad.d.class, ad.e.class, ad.f.class, ad.g.class, ad.h.class, ad.i.class, ad.j.class, ad.k.class, ad.m.class, ad.n.class, ad.o.class);
        ArrayList arrayList = new ArrayList(qc.i.d(listC));
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new pc.d((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f15244b = qc.r.d(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        j.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb2.append(gd.j.j(str, str));
            sb2.append("CompanionObject");
            map3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f15244b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qc.r.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            j.b(str2);
            linkedHashMap.put(key, gd.j.j(str2, str2));
        }
        f15245c = linkedHashMap;
    }

    public e(Class jClass) {
        j.e(jClass, "jClass");
        this.f15246a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15246a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && y8.a(this).equals(y8.a((ed.c) obj));
    }

    public final int hashCode() {
        return y8.a(this).hashCode();
    }

    public final String toString() {
        return this.f15246a + " (Kotlin reflection is not available)";
    }
}
