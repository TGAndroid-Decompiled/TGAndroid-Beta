package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public final class dj2 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public dj2(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            u26 u26Var = (u26) entry.getValue();
            List list = (List) this.a.get(u26Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(u26Var, list);
            }
            list.add((ej2) entry.getKey());
        }
    }

    public static void a(List list, e36 e36Var, u26 u26Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ej2 ej2Var = (ej2) list.get(size);
                Method method = ej2Var.b;
                try {
                    byte b = ej2Var.a;
                    if (b != 0) {
                        if (b != 1) {
                            if (b == 2) {
                                method.invoke(obj, e36Var, u26Var);
                            }
                        } else {
                            method.invoke(obj, e36Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    rjb.m(e);
                    return;
                } catch (InvocationTargetException e2) {
                    rjb.k("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
