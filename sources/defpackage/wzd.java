package defpackage;

import java.util.Arrays;
public abstract class wzd {
    public static final Class a;
    public static final z2e b;
    public static final z2e c;
    public static final z2e d;

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

    public static void a(z2e z2eVar, mnd mndVar, mnd mndVar2) {
        z2eVar.getClass();
        t2e t2eVar = mndVar.zzjp;
        t2e t2eVar2 = mndVar2.zzjp;
        if (!t2eVar2.equals(t2e.e)) {
            int i = t2eVar.a + t2eVar2.a;
            int[] copyOf = Arrays.copyOf(t2eVar.b, i);
            System.arraycopy(t2eVar2.b, 0, copyOf, t2eVar.a, t2eVar2.a);
            Object[] copyOf2 = Arrays.copyOf(t2eVar.c, i);
            System.arraycopy(t2eVar2.c, 0, copyOf2, t2eVar.a, t2eVar2.a);
            t2eVar = new t2e(i, copyOf, copyOf2, true);
        }
        mndVar.zzjp = t2eVar;
    }

    public static z2e b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (z2e) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
