package c9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import vh.w2;
public final class d implements ba.b {
    public final int f2176a;
    public final Object f2177b;

    public d(Object obj, int i10) {
        this.f2176a = i10;
        this.f2177b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f2176a) {
            case 0:
                String str = (String) this.f2177b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(android.support.v4.media.a.o("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e6) {
                    throw new RuntimeException(android.support.v4.media.a.o("Could not instantiate ", str, "."), e6);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(w2.e("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(w2.e("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f2177b;
            default:
                return new da.c((w8.g) this.f2177b);
        }
    }
}
