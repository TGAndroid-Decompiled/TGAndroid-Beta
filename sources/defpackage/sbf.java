package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class sbf extends c4f {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 6));
            }
            try {
                c = unsafe.objectFieldOffset(vbf.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(vbf.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(vbf.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(tbf.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(tbf.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                sdb.b(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (PrivilegedActionException e4) {
            fyb.j("Could not initialize intrinsics", e4.getCause());
        }
    }

    @Override
    public final pbf a(vbf vbfVar) {
        pbf pbfVar;
        pbf pbfVar2 = pbf.d;
        do {
            pbfVar = vbfVar.b;
            if (pbfVar2 == pbfVar) {
                break;
            }
        } while (!e(vbfVar, pbfVar, pbfVar2));
        return pbfVar;
    }

    @Override
    public final tbf b(vbf vbfVar) {
        tbf tbfVar;
        tbf tbfVar2 = tbf.c;
        do {
            tbfVar = vbfVar.c;
            if (tbfVar2 == tbfVar) {
                break;
            }
        } while (!g(vbfVar, tbfVar, tbfVar2));
        return tbfVar;
    }

    @Override
    public final void c(tbf tbfVar, tbf tbfVar2) {
        a.putObject(tbfVar, f, tbfVar2);
    }

    @Override
    public final void d(tbf tbfVar, Thread thread) {
        a.putObject(tbfVar, e, thread);
    }

    @Override
    public final boolean e(vbf vbfVar, pbf pbfVar, pbf pbfVar2) {
        return g4f.a(a, vbfVar, b, pbfVar, pbfVar2);
    }

    @Override
    public final boolean f(vbf vbfVar, Object obj, Object obj2) {
        return g4f.a(a, vbfVar, d, obj, obj2);
    }

    @Override
    public final boolean g(vbf vbfVar, tbf tbfVar, tbf tbfVar2) {
        return g4f.a(a, vbfVar, c, tbfVar, tbfVar2);
    }
}
