package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
public final class br7 extends u3d implements al5 {
    public final Object b;

    public br7(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 6);
        this.b = obj;
    }

    public static al5 T(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof al5) {
            return (al5) queryLocalInterface;
        }
        return new v3d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 4);
    }

    public static Object U(al5 al5Var) {
        if (al5Var instanceof br7) {
            return ((br7) al5Var).b;
        }
        IBinder asBinder = al5Var.asBinder();
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
            xve.h(field);
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
            lq5.j("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        p3d.c(String.valueOf(length).length() + 53, length, "Unexpected number of IObjectWrapper declared fields: ");
        return null;
    }
}
