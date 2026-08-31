package c9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import org.telegram.ui.yh;
public final class d implements ba.b {
    public final int f2342a;
    public final Object f2343b;

    public d(Object obj, int i10) {
        this.f2342a = i10;
        this.f2343b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f2342a) {
            case 0:
                String str = (String) this.f2343b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(android.support.v4.media.a.o("Could not instantiate ", str, "."), e6);
                } catch (InstantiationException e10) {
                    throw new RuntimeException(android.support.v4.media.a.o("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(yh.k("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(yh.k("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f2343b;
            default:
                return new da.c((w8.g) this.f2343b);
        }
    }
}
