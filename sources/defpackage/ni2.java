package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
public final class ni2 {
    public static final ni2 c = new ni2();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, mi2 mi2Var, y26 y26Var, Class cls) {
        y26 y26Var2 = (y26) hashMap.get(mi2Var);
        if (y26Var2 != null) {
            if (y26Var == y26Var2) {
                return;
            }
            String name = mi2Var.b.getName();
            String name2 = cls.getName();
            throw new IllegalArgumentException("Method " + name + " in " + name2 + " already declared with different @OnLifecycleEvent value: previous value " + y26Var2 + ", new value " + y26Var);
        }
        hashMap.put(mi2Var, y26Var);
    }

    public final li2 a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            li2 li2Var = (li2) hashMap2.get(superclass);
            if (li2Var == null) {
                li2Var = a(superclass, null);
            }
            hashMap.putAll(li2Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            li2 li2Var2 = (li2) hashMap2.get(cls2);
            if (li2Var2 == null) {
                li2Var2 = a(cls2, null);
            }
            for (Map.Entry entry : li2Var2.b.entrySet()) {
                b(hashMap, (mi2) entry.getKey(), (y26) entry.getValue(), cls);
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
            es7 es7Var = (es7) method.getAnnotation(es7.class);
            if (es7Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (i36.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        lq5.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                y26 value = es7Var.value();
                if (parameterTypes.length > 1) {
                    if (y26.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == y26.ON_ANY) {
                            i = 2;
                        } else {
                            lq5.j("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        lq5.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new mi2(i, method), value, cls);
                    z = true;
                } else {
                    lq5.j("cannot have more than 2 params");
                    return null;
                }
            }
        }
        li2 li2Var3 = new li2(hashMap);
        hashMap2.put(cls, li2Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return li2Var3;
    }
}
