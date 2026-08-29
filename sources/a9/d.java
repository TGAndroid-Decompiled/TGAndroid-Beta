package a9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class d implements z9.b {
    public final int f238a;
    public final Object f239b;

    public d(Object obj, int i10) {
        this.f238a = i10;
        this.f239b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f238a) {
            case 0:
                String str = (String) this.f239b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(a4.w.n("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(a4.w.n("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(u3.c.e("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(u3.c.e("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f239b;
            default:
                return new ba.c((u8.g) this.f239b);
        }
    }
}
