package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
public final class eq7 extends e1d implements xk5 {
    public final Object b;

    public eq7(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 6);
        this.b = obj;
    }

    public static xk5 T(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof xk5) {
            return (xk5) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 4);
    }

    public static Object U(xk5 xk5Var) {
        if (xk5Var instanceof eq7) {
            return ((eq7) xk5Var).b;
        }
        IBinder asBinder = xk5Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            ite.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            u36.j("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        i2d.c(String.valueOf(length).length() + 53, length, "Unexpected number of IObjectWrapper declared fields: ");
        return null;
    }
}
