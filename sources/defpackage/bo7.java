package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
public final class bo7 extends dzc implements yi5 {
    public final Object b;

    public bo7(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 6);
        this.b = obj;
    }

    public static yi5 T(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof yi5) {
            return (yi5) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 4);
    }

    public static Object U(yi5 yi5Var) {
        if (yi5Var instanceof bo7) {
            return ((bo7) yi5Var).b;
        }
        IBinder asBinder = yi5Var.asBinder();
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
            fre.h(field);
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
            w26.j("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        haf.c(String.valueOf(length).length() + 53, length, "Unexpected number of IObjectWrapper declared fields: ");
        return null;
    }
}
