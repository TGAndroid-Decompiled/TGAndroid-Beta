package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
public final class n49 implements b36 {
    public final byte a;
    public final Object b;

    public n49(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                es9 es9Var = (es9) obj;
                if (u26Var == u26.ON_CREATE) {
                    e36Var.m().b(this);
                    Bundle c = es9Var.g().c("androidx.savedstate.Restarter");
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
                                    Class<? extends U> asSubclass = Class.forName(str2, false, n49.class.getClassLoader()).asSubclass(cs9.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            cs9 cs9Var = (cs9) newInstance;
                                            if (es9Var instanceof ufc) {
                                                tfc f = ((ufc) es9Var).f();
                                                op g = es9Var.g();
                                                f.getClass();
                                                LinkedHashMap linkedHashMap = f.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    str3.getClass();
                                                    pfc pfcVar = (pfc) linkedHashMap.get(str3);
                                                    pfcVar.getClass();
                                                    npe.a(pfcVar, g, es9Var.m());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    g.g();
                                                }
                                            } else {
                                                dq9.m("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            rjb.k(b10.h("Failed to instantiate ", str2), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    rjb.k(kt6.o("Class ", str2, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        dq9.m("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                bh7.j("Next event must be ON_CREATE");
                return;
            case 1:
                cu4[] cu4VarArr = (cu4[]) obj;
                if (cu4VarArr.length <= 0) {
                    if (cu4VarArr.length <= 0) {
                        return;
                    }
                    cu4 cu4Var = cu4VarArr[0];
                    throw null;
                }
                cu4 cu4Var2 = cu4VarArr[0];
                throw null;
            default:
                if (u26Var == u26.ON_CREATE) {
                    e36Var.m().b(this);
                    ((zr9) obj).a();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + u26Var).toString());
        }
    }
}
