package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class sq2 implements vw8 {
    public final byte a;
    public final Object b;

    public sq2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
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
                    throw new RuntimeException(qd4.y("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(qd4.y("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(c00.i("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(c00.i("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new dm5((ji4) obj);
        }
    }
}
