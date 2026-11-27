package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
public final class kod extends o5f {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 2));
            }
            try {
                c = unsafe.objectFieldOffset(rod.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(rod.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(rod.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(lod.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(lod.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                grb.m(e2);
            }
        } catch (PrivilegedActionException e3) {
            grb.j("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override
    public final dod a(jtd jtdVar) {
        dod dodVar;
        dod dodVar2 = dod.d;
        do {
            dodVar = jtdVar.b;
            if (dodVar2 == dodVar) {
                break;
            }
        } while (!e(jtdVar, dodVar, dodVar2));
        return dodVar;
    }

    @Override
    public final lod b(jtd jtdVar) {
        lod lodVar;
        lod lodVar2 = lod.c;
        do {
            lodVar = jtdVar.c;
            if (lodVar2 == lodVar) {
                break;
            }
        } while (!g(jtdVar, lodVar, lodVar2));
        return lodVar;
    }

    @Override
    public final void c(lod lodVar, lod lodVar2) {
        a.putObject(lodVar, f, lodVar2);
    }

    @Override
    public final void d(lod lodVar, Thread thread) {
        a.putObject(lodVar, e, thread);
    }

    @Override
    public final boolean e(jtd jtdVar, dod dodVar, dod dodVar2) {
        return r5f.a(a, jtdVar, b, dodVar, dodVar2);
    }

    @Override
    public final boolean f(rod rodVar, Object obj, Object obj2) {
        return r5f.a(a, rodVar, d, obj, obj2);
    }

    @Override
    public final boolean g(rod rodVar, lod lodVar, lod lodVar2) {
        return r5f.a(a, rodVar, c, lodVar, lodVar2);
    }
}
