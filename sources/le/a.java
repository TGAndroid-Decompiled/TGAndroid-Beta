package le;

import java.util.Hashtable;
import java.util.StringTokenizer;
import ji.f;
import kg.s0;
import za.c;
public final class a {
    public static final Hashtable f11806b;
    public static final Object[] f11807c;
    public static Class d;
    public final ClassLoader f11808a;

    static {
        Hashtable hashtable = new Hashtable();
        f11806b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f11807c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f11808a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f11806b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (classLoader == null) {
                return Class.forName(str);
            }
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = d;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    d = cls2;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
            return cls2;
        }
    }

    public static f b(c cVar, Object obj, Object obj2) {
        return new f(cVar, obj, obj2, f11807c, false, 6);
    }

    public static f c(c cVar, Object obj, Object obj2, Object obj3) {
        return new f(cVar, obj, obj2, new Object[]{obj3}, false, 6);
    }

    public final s0 d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f11808a;
        Class a2 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i10 = 0; i10 < countTokens; i10++) {
            clsArr[i10] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i11 = 0; i11 < countTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i12 = 0; i12 < countTokens3; i12++) {
            clsArr2[i12] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a10 = a(classLoader, str5);
        s0 s0Var = new s0(1);
        s0Var.f11264b = parseInt;
        s0Var.f11265c = str;
        s0Var.e = a2;
        s0Var.f11267g = clsArr;
        s0Var.h = a10;
        return s0Var;
    }

    public final c e(s0 s0Var) {
        c cVar = new c(28, false);
        cVar.f55450b = s0Var;
        return cVar;
    }
}
