package kotlin.jvm.internal;

import b8.ue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import od.v;
import od.w;
public final class e implements sd.c, d {
    public static final Map f17351b;
    public static final LinkedHashMap f17352c;
    public final Class f17353a;

    static {
        int i3 = 0;
        List c2 = ed.h.c(od.a.class, od.l.class, od.p.class, od.q.class, od.r.class, od.s.class, od.t.class, od.u.class, v.class, w.class, od.b.class, od.c.class, od.d.class, od.e.class, od.f.class, od.g.class, od.h.class, od.i.class, od.j.class, od.k.class, od.m.class, od.n.class, od.o.class);
        ArrayList arrayList = new ArrayList(ed.i.d(c2, 10));
        for (Object obj : c2) {
            int i10 = i3 + 1;
            if (i3 >= 0) {
                arrayList.add(new dd.e((Class) obj, Integer.valueOf(i3)));
                i3 = i10;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f17351b = ed.s.f(arrayList);
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
        j.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb2.append(ud.d.m(str, str));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f17351b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ed.s.b(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            j.b(str2);
            linkedHashMap.put(key, ud.d.m(str2, str2));
        }
        f17352c = linkedHashMap;
    }

    public e(Class jClass) {
        j.e(jClass, "jClass");
        this.f17353a = jClass;
    }

    @Override
    public final Class a() {
        return this.f17353a;
    }

    public final String b() {
        String str;
        Class jClass = this.f17353a;
        j.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return ud.d.l(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return ud.d.l(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int h = ud.d.h('$', 0, 6, simpleName);
            if (h == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(h + 1, simpleName.length());
            j.d(substring, "substring(...)");
            return substring;
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = f17352c;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && ue.a(this).equals(ue.a((sd.c) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ue.a(this).hashCode();
    }

    public final String toString() {
        return this.f17353a + " (Kotlin reflection is not available)";
    }
}
