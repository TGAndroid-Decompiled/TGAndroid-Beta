package be;

import com.google.firebase.messaging.s;
import java.util.Hashtable;
import java.util.StringTokenizer;
import m5.i;
public final class a {
    public static final Hashtable f2070b;
    public static final Object[] f2071c;
    public static Class d;
    public final ClassLoader f2072a;

    static {
        Hashtable hashtable = new Hashtable();
        f2070b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f2071c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f2072a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f2070b.get(str);
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
                } catch (ClassNotFoundException e10) {
                    throw new NoClassDefFoundError(e10.getMessage());
                }
            }
            return cls2;
        }
    }

    public static s b(i iVar, Object obj, Object obj2) {
        return new s(iVar, obj, obj2, f2071c);
    }

    public static s c(i iVar, Object obj, Object obj2, Object obj3) {
        return new s(iVar, obj, obj2, new Object[]{obj3});
    }

    public final ba.a d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f2072a;
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
        ba.a aVar = new ba.a(1);
        aVar.f2027b = parseInt;
        aVar.f2028c = str;
        aVar.f2029e = a2;
        aVar.f2031g = clsArr;
        aVar.h = a10;
        return aVar;
    }

    public final i e(ba.a aVar) {
        i iVar = new i(5);
        iVar.f16880b = aVar;
        return iVar;
    }
}
