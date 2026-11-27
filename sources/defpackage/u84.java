package defpackage;

import java.util.Hashtable;
import java.util.StringTokenizer;
public final class u84 {
    public static final Hashtable b;
    public static final Object[] c;
    public static Class d;
    public final ClassLoader a;

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        c = new Object[0];
    }

    public u84(Class cls, String str) {
        this.a = cls.getClassLoader();
    }

    public static java.lang.Class a(java.lang.ClassLoader r1, java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u84.a(java.lang.ClassLoader, java.lang.String):java.lang.Class");
    }

    public static lyc b(xh4 xh4Var, Object obj, Object obj2) {
        return new lyc(xh4Var, obj, obj2, c, false, (byte) 6);
    }

    public static lyc c(xh4 xh4Var, Object obj, Object obj2, Object obj3) {
        return new lyc(xh4Var, obj, obj2, new Object[]{obj3}, false, (byte) 6);
    }

    public final ia d(String str, String str2, String str3, String str4, String str5) {
        ClassLoader classLoader = this.a;
        Class a = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i2 = 0; i2 < countTokens2; i2++) {
            strArr[i2] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i3 = 0; i3 < countTokens3; i3++) {
            clsArr2[i3] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a2 = a(classLoader, str5);
        ia iaVar = new ia((byte) 2);
        iaVar.b = 1;
        iaVar.c = str;
        iaVar.e = a;
        iaVar.g = clsArr;
        iaVar.h = a2;
        return iaVar;
    }

    public final xh4 e(ia iaVar) {
        xh4 xh4Var = new xh4((byte) 8, false);
        xh4Var.b = iaVar;
        return xh4Var;
    }
}
