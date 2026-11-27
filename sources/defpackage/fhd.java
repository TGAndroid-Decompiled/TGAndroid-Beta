package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
public abstract class fhd {
    public static final sg7 a = new sg7((byte) 25);
    public static final sae b = new Object();
    public static final qf5 c = new qf5((byte) 25);

    public static final ot9 a(e23 e23Var) {
        qt9 qt9Var;
        Bundle bundle;
        e23Var.getClass();
        vt9 vt9Var = (vt9) e23Var.b(a);
        if (vt9Var != null) {
            shc shcVar = (shc) e23Var.b(b);
            if (shcVar != null) {
                Bundle bundle2 = (Bundle) e23Var.b(c);
                String str = (String) e23Var.b(z3f.e);
                if (str != null) {
                    ut9 d = vt9Var.g().d();
                    if (d instanceof qt9) {
                        qt9Var = (qt9) d;
                    } else {
                        qt9Var = null;
                    }
                    if (qt9Var != null) {
                        LinkedHashMap linkedHashMap = c(shcVar).b;
                        ot9 ot9Var = (ot9) linkedHashMap.get(str);
                        if (ot9Var == null) {
                            Class[] clsArr = ot9.f;
                            qt9Var.a();
                            Bundle bundle3 = qt9Var.c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = qt9Var.c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = qt9Var.c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                qt9Var.c = null;
                            }
                            ot9 a2 = fye.a(bundle, bundle2);
                            linkedHashMap.put(str, a2);
                            return a2;
                        }
                        return ot9Var;
                    }
                    grb.i("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                lq5.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            lq5.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        lq5.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(vt9 vt9Var) {
        z26 z26Var = vt9Var.m().b;
        if (z26Var != z26.b && z26Var != z26.c) {
            lq5.j("Failed requirement.");
        } else if (vt9Var.g().d() == null) {
            qt9 qt9Var = new qt9(vt9Var.g(), (shc) vt9Var);
            vt9Var.g().f("androidx.lifecycle.internal.SavedStateHandlesProvider", qt9Var);
            vt9Var.m().a(new z59(qt9Var, (byte) 2));
        }
    }

    public static final rt9 c(shc shcVar) {
        e23 e23Var;
        z3f z3fVar = new z3f((byte) 25);
        rhc f = shcVar.f();
        if (shcVar instanceof pe5) {
            e23Var = ((pe5) shcVar).d();
        } else {
            e23Var = c23.b;
        }
        f.getClass();
        e23Var.getClass();
        return (rt9) new ko9(f, z3fVar, e23Var).t(s89.a(rt9.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
