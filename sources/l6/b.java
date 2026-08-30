package l6;

import android.os.IBinder;
import android.os.IInterface;
import b6.m;
import java.lang.reflect.Field;
import kh.a2;
public final class b extends a7.c implements a {
    public final Object f11357b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 0);
        this.f11357b = obj;
    }

    public static a J0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a7.a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 0);
    }

    public static Object K0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f11357b;
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
            m.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e6) {
                    throw new IllegalArgumentException("Binder object is null.", e6);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(a2.j(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
