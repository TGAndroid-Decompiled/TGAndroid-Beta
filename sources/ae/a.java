package ae;

import com.google.firebase.messaging.t;
import java.util.Hashtable;
import java.util.StringTokenizer;

public final class a {

    public static final Hashtable f241b;

    public static final Object[] f242c;
    public static Class d;

    public final ClassLoader f243a;

    static {
        Hashtable hashtable = new Hashtable();
        f241b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f242c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f243a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f241b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = d;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    d = cls2;
                } catch (ClassNotFoundException e9) {
                    throw new NoClassDefFoundError(e9.getMessage());
                }
            }
            return cls2;
        }
    }

    public static t b(b bVar, Object obj, Object obj2) {
        return new t(bVar, obj, obj2, f242c);
    }

    public static t c(b bVar, Object obj, Object obj2, Object obj3) {
        return new t(bVar, obj, obj2, new Object[]{obj3});
    }

    public final aa.a d(String str, String str2, String str3, String str4, String str5) {
        int i10 = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f243a;
        Class clsA = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i12 = 0; i12 < iCountTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i13 = 0; i13 < iCountTokens3; i13++) {
            clsArr2[i13] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class clsA2 = a(classLoader, str5);
        aa.a aVar = new aa.a(1);
        aVar.f200b = i10;
        aVar.f201c = str;
        aVar.f202e = clsA;
        aVar.f204g = clsArr;
        aVar.h = clsA2;
        return aVar;
    }

    public final b e(aa.a aVar) {
        b bVar = new b(0);
        bVar.f245b = aVar;
        return bVar;
    }
}
