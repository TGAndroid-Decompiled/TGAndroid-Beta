package a7;

import a8.q;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import q6.m;
public final class b extends q implements a {
    public final Object f299b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 9);
        this.f299b = obj;
    }

    public static a M0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 9);
    }

    public static Object N0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f299b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 == 1) {
            m.g(field);
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
        int length = declaredFields.length;
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 53);
        sb2.append("Unexpected number of IObjectWrapper declared fields: ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }
}
