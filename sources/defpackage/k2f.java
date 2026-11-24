package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;
public abstract class k2f {
    public static final Unsafe a;
    public static final Class b;
    public static final c8c c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2f.<clinit>():void");
    }

    public static byte a(long j, byte[] bArr) {
        return c.j(bArr, f + j);
    }

    public static int b(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static void c(Object obj, int i, long j) {
        c.a.putInt(obj, j, i);
    }

    public static void d(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static void e(byte[] bArr, long j, byte b2) {
        c.l(f + j, bArr, b2);
    }

    public static int f(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static long g(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static void h(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int b3 = b(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        c(obj, (b3 & (~(255 << i))) | ((b2 & 255) << i), j2);
    }

    public static void i(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void j(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        c(obj, (b(obj, j2) & (~(255 << i))) | ((b2 & 255) << i), j2);
    }

    public static boolean k(Class cls) {
        if (!kge.a()) {
            return false;
        }
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

    public static Object l(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static Field m() {
        Field field;
        Field field2;
        if (kge.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static byte n(Object obj, long j) {
        return (byte) (b(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static byte o(Object obj, long j) {
        return (byte) (b(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
