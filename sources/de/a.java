package de;

import androidx.biometric.f0;
import java.util.Hashtable;
import java.util.StringTokenizer;
import sf.e;
public final class a {
    public static final Hashtable f4423b;
    public static final Object[] f4424c;
    public static Class d;
    public final ClassLoader f4425a;

    static {
        Hashtable hashtable = new Hashtable();
        f4423b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f4424c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f4425a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f4423b.get(str);
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
                } catch (ClassNotFoundException e6) {
                    throw new NoClassDefFoundError(e6.getMessage());
                }
            }
            return cls2;
        }
    }

    public static e b(f0 f0Var, Object obj, Object obj2) {
        return new e(f0Var, obj, obj2, f4424c);
    }

    public static e c(f0 f0Var, Object obj, Object obj2, Object obj3) {
        return new e(f0Var, obj, obj2, new Object[]{obj3});
    }

    public final da.a d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f4425a;
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
        da.a aVar = new da.a(1);
        aVar.f4382b = parseInt;
        aVar.f4383c = str;
        aVar.f4384e = a2;
        aVar.f4386g = clsArr;
        aVar.h = a10;
        return aVar;
    }

    public final f0 e(da.a aVar) {
        f0 f0Var = new f0(7);
        f0Var.f532b = aVar;
        return f0Var;
    }
}
