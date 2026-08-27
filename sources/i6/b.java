package i6;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import y5.l;

public final class b extends b7.a implements a {

    public final Object f10567b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 11);
        this.f10567b = obj;
    }

    public static a J0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 11);
    }

    public static Object K0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f10567b;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(i0.a.k(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        l.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e9) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e9);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}
