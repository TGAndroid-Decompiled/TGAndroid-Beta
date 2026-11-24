package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class oh2 implements mh2, zu5, xu5 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List b2 = zk2.b(op4.class, qp4.class, eq4.class, gq4.class, hq4.class, iq4.class, jq4.class, kq4.class, lq4.class, mq4.class, pp4.class, rp4.class, sp4.class, tp4.class, up4.class, vp4.class, wp4.class, xp4.class, yp4.class, zp4.class, bq4.class, cq4.class, dq4.class);
        ArrayList arrayList = new ArrayList(al2.c(b2, 10));
        for (Object obj : b2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new ku7((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        b = qi6.e(arrayList);
    }

    public oh2(Class cls) {
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
                return f9b.j(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return f9b.j(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int g = f9b.g(simpleName, '$', 0, 6);
            if (g == -1) {
                return simpleName;
            }
            return simpleName.substring(g + 1, simpleName.length());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = drd.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String b3 = drd.b(cls.getName());
            if (b3 == null) {
                return cls.getSimpleName();
            }
            return b3;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof oh2) && qle.a(this).equals(qle.a((oh2) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return qle.a(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
