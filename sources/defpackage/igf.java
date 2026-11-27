package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class igf extends v8f {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 6));
            }
            try {
                c = unsafe.objectFieldOffset(lgf.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(lgf.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(lgf.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(jgf.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(jgf.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                grb.m(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (PrivilegedActionException e4) {
            grb.j("Could not initialize intrinsics", e4.getCause());
        }
    }

    @Override
    public final fgf a(lgf lgfVar) {
        fgf fgfVar;
        fgf fgfVar2 = fgf.d;
        do {
            fgfVar = lgfVar.b;
            if (fgfVar2 == fgfVar) {
                break;
            }
        } while (!e(lgfVar, fgfVar, fgfVar2));
        return fgfVar;
    }

    @Override
    public final jgf b(lgf lgfVar) {
        jgf jgfVar;
        jgf jgfVar2 = jgf.c;
        do {
            jgfVar = lgfVar.c;
            if (jgfVar2 == jgfVar) {
                break;
            }
        } while (!g(lgfVar, jgfVar, jgfVar2));
        return jgfVar;
    }

    @Override
    public final void c(jgf jgfVar, jgf jgfVar2) {
        a.putObject(jgfVar, f, jgfVar2);
    }

    @Override
    public final void d(jgf jgfVar, Thread thread) {
        a.putObject(jgfVar, e, thread);
    }

    @Override
    public final boolean e(lgf lgfVar, fgf fgfVar, fgf fgfVar2) {
        return z8f.a(a, lgfVar, b, fgfVar, fgfVar2);
    }

    @Override
    public final boolean f(lgf lgfVar, Object obj, Object obj2) {
        return z8f.a(a, lgfVar, d, obj, obj2);
    }

    @Override
    public final boolean g(lgf lgfVar, jgf jgfVar, jgf jgfVar2) {
        return z8f.a(a, lgfVar, c, jgfVar, jgfVar2);
    }
}
