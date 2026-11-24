package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Logger;
import sun.misc.Unsafe;
public abstract class x1e {
    public static final Logger a = Logger.getLogger(x1e.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final c8c d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    static {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1e.<clinit>():void");
    }

    public static byte a(long j, byte[] bArr) {
        return d.B(bArr, g + j);
    }

    public static void b(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int j3 = j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        c(obj, (j3 & (~(255 << i))) | ((b2 & 255) << i), j2);
    }

    public static void c(Object obj, int i, long j) {
        d.a.putInt(obj, j, i);
    }

    public static void d(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    public static void e(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(obj, (j(obj, j2) & (~(255 << i))) | ((b2 & 255) << i), j2);
    }

    public static Field f() {
        Field field;
        Field field2;
        if (lcd.a()) {
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
        if (!lcd.a()) {
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

    public static int j(Object obj, long j) {
        return d.a.getInt(obj, j);
    }

    public static long k(Object obj, long j) {
        return d.a.getLong(obj, j);
    }

    public static Object l(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    public static byte m(Object obj, long j) {
        return (byte) (j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte n(Object obj, long j) {
        return (byte) (j(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
