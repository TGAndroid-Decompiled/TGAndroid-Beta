package h6;

import android.os.IBinder;
import android.os.IInterface;
import j3.r0;
import java.lang.reflect.Field;
import x5.l;
public final class b extends a7.a implements a {
    public final Object f9858b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 11);
        this.f9858b = obj;
    }

    public static a J0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new b7.a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 11);
    }

    public static Object K0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f9858b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i9 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i9++;
                field = field2;
            }
        }
        if (i9 == 1) {
            l.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(r0.l(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
