package j6;

import android.os.IBinder;
import android.os.IInterface;
import j7.l1;
import java.lang.reflect.Field;
import z5.l;
public final class b extends c7.a implements a {
    public final Object f10894b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 11);
        this.f10894b = obj;
    }

    public static a J0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 11);
    }

    public static Object K0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f10894b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
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
        throw new IllegalArgumentException(l1.k(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
