package defpackage;

import java.util.Arrays;
public abstract class gvd {
    public static final Class a;
    public static final jyd b;
    public static final jyd c;
    public static final jyd d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = b(false);
        c = b(true);
        d = new Object();
    }

    public static void a(jyd jydVar, vid vidVar, vid vidVar2) {
        jydVar.getClass();
        dyd dydVar = vidVar.zzjp;
        dyd dydVar2 = vidVar2.zzjp;
        if (!dydVar2.equals(dyd.e)) {
            int i = dydVar.a + dydVar2.a;
            int[] copyOf = Arrays.copyOf(dydVar.b, i);
            System.arraycopy(dydVar2.b, 0, copyOf, dydVar.a, dydVar2.a);
            Object[] copyOf2 = Arrays.copyOf(dydVar.c, i);
            System.arraycopy(dydVar2.c, 0, copyOf2, dydVar.a, dydVar2.a);
            dydVar = new dyd(i, copyOf, copyOf2, true);
        }
        vidVar.zzjp = dydVar;
    }

    public static jyd b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (jyd) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
