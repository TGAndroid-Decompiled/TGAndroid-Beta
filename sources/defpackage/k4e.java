package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Logger;
import sun.misc.Unsafe;
public abstract class k4e {
    public static final Logger a = Logger.getLogger(k4e.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final cac d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    static {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4e.<clinit>():void");
    }

    public static byte a(long j, byte[] bArr) {
        return d.B(g + j, bArr);
    }

    public static void b(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int j3 = j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        c(j2, obj, (j3 & (~(255 << i))) | ((b2 & 255) << i));
    }

    public static void c(long j, Object obj, int i) {
        d.a.putInt(obj, j, i);
    }

    public static void d(long j, Object obj, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static void e(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(j2, obj, (j(j2, obj) & (~(255 << i))) | ((b2 & 255) << i));
    }

    public static Field f() {
        Field field;
        Field field2;
        if (cfd.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                field2.setAccessible(true);
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static int g(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void h(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    public static boolean i(Class cls) {
        if (!cfd.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int j(long j, Object obj) {
        return d.a.getInt(obj, j);
    }

    public static long k(long j, Object obj) {
        return d.a.getLong(obj, j);
    }

    public static Object l(long j, Object obj) {
        return d.a.getObject(obj, j);
    }

    public static byte m(long j, Object obj) {
        return (byte) (j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte n(long j, Object obj) {
        return (byte) (j((-4) & j, obj) >>> ((int) ((j & 3) << 3)));
    }
}
