package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
public abstract class oed {
    public static final kg7 a = new kg7((byte) 25);
    public static final f8e b = new Object();
    public static final nf5 c = new nf5((byte) 25);

    public static final xr9 a(x23 x23Var) {
        zr9 zr9Var;
        Bundle bundle;
        x23Var.getClass();
        es9 es9Var = (es9) x23Var.b(a);
        if (es9Var != null) {
            ufc ufcVar = (ufc) x23Var.b(b);
            if (ufcVar != null) {
                Bundle bundle2 = (Bundle) x23Var.b(c);
                String str = (String) x23Var.b(k1f.e);
                if (str != null) {
                    ds9 d = es9Var.g().d();
                    if (d instanceof zr9) {
                        zr9Var = (zr9) d;
                    } else {
                        zr9Var = null;
                    }
                    if (zr9Var != null) {
                        LinkedHashMap linkedHashMap = c(ufcVar).b;
                        xr9 xr9Var = (xr9) linkedHashMap.get(str);
                        if (xr9Var == null) {
                            Class[] clsArr = xr9.f;
                            zr9Var.a();
                            Bundle bundle3 = zr9Var.c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = zr9Var.c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = zr9Var.c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                zr9Var.c = null;
                            }
                            xr9 a2 = qve.a(bundle, bundle2);
                            linkedHashMap.put(str, a2);
                            return a2;
                        }
                        return xr9Var;
                    }
                    dq9.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                u36.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            u36.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        u36.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(es9 es9Var) {
        v26 v26Var = es9Var.m().b;
        if (v26Var != v26.b && v26Var != v26.c) {
            u36.j("Failed requirement.");
        } else if (es9Var.g().d() == null) {
            zr9 zr9Var = new zr9(es9Var.g(), (ufc) es9Var);
            es9Var.g().f("androidx.lifecycle.internal.SavedStateHandlesProvider", zr9Var);
            es9Var.m().a(new n49(zr9Var, (byte) 2));
        }
    }

    public static final as9 c(ufc ufcVar) {
        x23 x23Var;
        k1f k1fVar = new k1f((byte) 25);
        tfc f = ufcVar.f();
        if (ufcVar instanceof me5) {
            x23Var = ((me5) ufcVar).d();
        } else {
            x23Var = v23.b;
        }
        f.getClass();
        x23Var.getClass();
        return (as9) new wm9(f, k1fVar, x23Var).t(h79.a(as9.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
