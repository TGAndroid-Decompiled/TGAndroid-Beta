package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public final class li2 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public li2(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            y26 y26Var = (y26) entry.getValue();
            List list = (List) this.a.get(y26Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(y26Var, list);
            }
            list.add((mi2) entry.getKey());
        }
    }

    public static void a(List list, i36 i36Var, y26 y26Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                mi2 mi2Var = (mi2) list.get(size);
                Method method = mi2Var.b;
                try {
                    byte b = mi2Var.a;
                    if (b != 0) {
                        if (b != 1) {
                            if (b == 2) {
                                method.invoke(obj, i36Var, y26Var);
                            }
                        } else {
                            method.invoke(obj, i36Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    grb.m(e);
                    return;
                } catch (InvocationTargetException e2) {
                    grb.j("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
