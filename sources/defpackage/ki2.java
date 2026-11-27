package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class ki2 implements ii2, ex5, cx5 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List b2 = tl2.b(sr4.class, ur4.class, is4.class, ks4.class, ls4.class, ms4.class, ns4.class, os4.class, ps4.class, qs4.class, tr4.class, vr4.class, wr4.class, xr4.class, yr4.class, zr4.class, as4.class, bs4.class, cs4.class, ds4.class, fs4.class, gs4.class, hs4.class);
        ArrayList arrayList = new ArrayList(ul2.c(b2, 10));
        for (Object obj : b2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new rx7((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        b = uk6.e(arrayList);
    }

    public ki2(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String b2;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return ddb.j(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return ddb.j(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int g = ddb.g(simpleName, '$', 0, 6);
            if (g == -1) {
                return simpleName;
            }
            return simpleName.substring(g + 1, simpleName.length());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = tvd.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String b3 = tvd.b(cls.getName());
            if (b3 == null) {
                return cls.getSimpleName();
            }
            return b3;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ki2) && iqe.a(this).equals(iqe.a((ki2) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return iqe.a(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
