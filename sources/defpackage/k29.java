package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
public final class k29 implements b16 {
    public final byte a;
    public final Object b;

    public k29(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(e16 e16Var, u06 u06Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dq9 dq9Var = (dq9) obj;
                if (u06Var == u06.ON_CREATE) {
                    e16Var.m().b(this);
                    Bundle c = dq9Var.g().c("androidx.savedstate.Restarter");
                    if (c != null) {
                        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i = 0;
                            while (i < size) {
                                String str = stringArrayList.get(i);
                                i++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, k29.class.getClassLoader()).asSubclass(bq9.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            bq9 bq9Var = (bq9) newInstance;
                                            if (dq9Var instanceof tdc) {
                                                sdc f = ((tdc) dq9Var).f();
                                                oo g = dq9Var.g();
                                                f.getClass();
                                                LinkedHashMap linkedHashMap = f.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    str3.getClass();
                                                    odc odcVar = (odc) linkedHashMap.get(str3);
                                                    odcVar.getClass();
                                                    kne.a(odcVar, g, dq9Var.m());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    g.g();
                                                }
                                            } else {
                                                sc8.j("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            fyb.j(b00.h("Failed to instantiate ", str2), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    fyb.j(tb4.y("Class ", str2, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        sc8.j("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                fi7.g("Next event must be ON_CREATE");
                return;
            case 1:
                bs4[] bs4VarArr = (bs4[]) obj;
                if (bs4VarArr.length <= 0) {
                    if (bs4VarArr.length <= 0) {
                        return;
                    }
                    bs4 bs4Var = bs4VarArr[0];
                    throw null;
                }
                bs4 bs4Var2 = bs4VarArr[0];
                throw null;
            default:
                if (u06Var == u06.ON_CREATE) {
                    e16Var.m().b(this);
                    ((yp9) obj).a();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + u06Var).toString());
        }
    }
}
