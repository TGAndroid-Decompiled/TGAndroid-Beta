package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
public abstract class xt9 {
    public static final List a = tl2.b(Application.class, ot9.class);
    public static final List b = tl2.a(ot9.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List h = ts.h(parameterTypes);
            if (list.equals(h)) {
                return constructor;
            }
            if (list.size() == h.size() && h.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final nhc b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (nhc) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            vr9.k("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            grb.j("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
