package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
public abstract class gs9 {
    public static final List a = lm2.b(Application.class, xr9.class);
    public static final List b = lm2.a(xr9.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List h = tt.h(parameterTypes);
            if (list.equals(h)) {
                return constructor;
            }
            if (list.size() == h.size() && h.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final pfc b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (pfc) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            dq9.n("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            rjb.k("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
