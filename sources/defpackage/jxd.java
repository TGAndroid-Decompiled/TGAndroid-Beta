package defpackage;

import java.util.Arrays;
public abstract class jxd {
    public static final Class a;
    public static final m0e b;
    public static final m0e c;
    public static final m0e d;

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

    public static void a(m0e m0eVar, xkd xkdVar, xkd xkdVar2) {
        m0eVar.getClass();
        g0e g0eVar = xkdVar.zzjp;
        g0e g0eVar2 = xkdVar2.zzjp;
        if (!g0eVar2.equals(g0e.e)) {
            int i = g0eVar.a + g0eVar2.a;
            int[] copyOf = Arrays.copyOf(g0eVar.b, i);
            System.arraycopy(g0eVar2.b, 0, copyOf, g0eVar.a, g0eVar2.a);
            Object[] copyOf2 = Arrays.copyOf(g0eVar.c, i);
            System.arraycopy(g0eVar2.c, 0, copyOf2, g0eVar.a, g0eVar2.a);
            g0eVar = new g0e(i, copyOf, copyOf2, true);
        }
        xkdVar.zzjp = g0eVar;
    }

    public static m0e b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (m0e) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
