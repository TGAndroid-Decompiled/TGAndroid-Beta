package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
public final class fj2 {
    public static final fj2 c = new fj2();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, ej2 ej2Var, u26 u26Var, Class cls) {
        u26 u26Var2 = (u26) hashMap.get(ej2Var);
        if (u26Var2 != null) {
            if (u26Var == u26Var2) {
                return;
            }
            String name = ej2Var.b.getName();
            String name2 = cls.getName();
            throw new IllegalArgumentException("Method " + name + " in " + name2 + " already declared with different @OnLifecycleEvent value: previous value " + u26Var2 + ", new value " + u26Var);
        }
        hashMap.put(ej2Var, u26Var);
    }

    public final dj2 a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            dj2 dj2Var = (dj2) hashMap2.get(superclass);
            if (dj2Var == null) {
                dj2Var = a(superclass, null);
            }
            hashMap.putAll(dj2Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            dj2 dj2Var2 = (dj2) hashMap2.get(cls2);
            if (dj2Var2 == null) {
                dj2Var2 = a(cls2, null);
            }
            for (Map.Entry entry : dj2Var2.b.entrySet()) {
                b(hashMap, (ej2) entry.getKey(), (u26) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            hr7 hr7Var = (hr7) method.getAnnotation(hr7.class);
            if (hr7Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (e36.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        u36.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                u26 value = hr7Var.value();
                if (parameterTypes.length > 1) {
                    if (u26.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == u26.ON_ANY) {
                            i = 2;
                        } else {
                            u36.j("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        u36.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new ej2(i, method), value, cls);
                    z = true;
                } else {
                    u36.j("cannot have more than 2 params");
                    return null;
                }
            }
        }
        dj2 dj2Var3 = new dj2(hashMap);
        hashMap2.put(cls, dj2Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return dj2Var3;
    }
}
