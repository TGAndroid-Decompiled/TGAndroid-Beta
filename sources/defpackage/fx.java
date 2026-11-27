package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
public abstract class fx {
    public static final Unsafe a;

    static {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Field field2 = declaredFields[i];
                    if (Modifier.isStatic(field2.getModifiers()) && Unsafe.class.isAssignableFrom(field2.getType())) {
                        field = field2;
                        break;
                    }
                    i++;
                } else {
                    field = null;
                    break;
                }
            }
            if (field != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        field.setAccessible(true);
        try {
            a = (Unsafe) field.get(null);
        } catch (IllegalAccessException e2) {
            grb.m(e2);
        }
    }

    public static Object a(long j, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = a;
            Object objectVolatile = unsafe.getObjectVolatile(obj, j);
            long j2 = j;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(obj3, j2, objectVolatile, obj4)) {
                return objectVolatile;
            }
            obj = obj3;
            j = j2;
            obj2 = obj4;
        }
    }
}
