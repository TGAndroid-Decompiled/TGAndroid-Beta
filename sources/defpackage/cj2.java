package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class cj2 implements aj2, zw5, xw5 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List b2 = lm2.b(pr4.class, rr4.class, fs4.class, hs4.class, is4.class, js4.class, ks4.class, ls4.class, ms4.class, ns4.class, qr4.class, sr4.class, tr4.class, ur4.class, vr4.class, wr4.class, xr4.class, yr4.class, zr4.class, as4.class, cs4.class, ds4.class, es4.class);
        ArrayList arrayList = new ArrayList(mm2.c(b2, 10));
        for (Object obj : b2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new lw7((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        b = sk6.e(arrayList);
    }

    public cj2(Class cls) {
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
                return hbb.j(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return hbb.j(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int g = hbb.g(simpleName, '$', 0, 6);
            if (g == -1) {
                return simpleName;
            }
            return simpleName.substring(g + 1, simpleName.length());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = gtd.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String b3 = gtd.b(cls.getName());
            if (b3 == null) {
                return cls.getSimpleName();
            }
            return b3;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cj2) && sne.a(this).equals(sne.a((cj2) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return sne.a(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
