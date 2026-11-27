package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;
public abstract class wlf {
    public static final Unsafe a;
    public static final Class b;
    public static final cac c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlf.<clinit>():void");
    }

    public static void a(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = dif.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void c(Object obj, long j, byte b2) {
        cac cacVar = c;
        long j2 = (-4) & j;
        int i = cacVar.a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        cacVar.a.putInt(obj, j2, (i & (~(255 << i2))) | ((b2 & 255) << i2));
    }

    public static void d(Object obj, long j, byte b2) {
        cac cacVar = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        cacVar.a.putInt(obj, j2, (cacVar.a.getInt(obj, j2) & (~(255 << i))) | ((b2 & 255) << i));
    }

    public static int e(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static long f(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static Object g(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static void h(Object obj, long j, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void i(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static boolean j(Object obj, long j) {
        if (((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean k(Object obj, long j) {
        if (((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean l(Class cls) {
        int i = dif.a;
        try {
            Class cls2 = b;
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

    public static int m(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
