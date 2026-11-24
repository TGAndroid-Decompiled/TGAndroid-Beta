package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
public abstract class mcd {
    public static final ie7 a = new ie7((byte) 25);
    public static final c6e b = new Object();
    public static final pd5 c = new pd5((byte) 25);

    public static final wp9 a(l13 l13Var) {
        yp9 yp9Var;
        Bundle bundle;
        l13Var.getClass();
        dq9 dq9Var = (dq9) l13Var.b(a);
        if (dq9Var != null) {
            tdc tdcVar = (tdc) l13Var.b(b);
            if (tdcVar != null) {
                Bundle bundle2 = (Bundle) l13Var.b(c);
                String str = (String) l13Var.b(ize.e);
                if (str != null) {
                    cq9 d = dq9Var.g().d();
                    if (d instanceof yp9) {
                        yp9Var = (yp9) d;
                    } else {
                        yp9Var = null;
                    }
                    if (yp9Var != null) {
                        LinkedHashMap linkedHashMap = c(tdcVar).b;
                        wp9 wp9Var = (wp9) linkedHashMap.get(str);
                        if (wp9Var == null) {
                            Class[] clsArr = wp9.f;
                            yp9Var.a();
                            Bundle bundle3 = yp9Var.c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = yp9Var.c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = yp9Var.c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                yp9Var.c = null;
                            }
                            wp9 a2 = nte.a(bundle, bundle2);
                            linkedHashMap.put(str, a2);
                            return a2;
                        }
                        return wp9Var;
                    }
                    sc8.j("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                w26.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            w26.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        w26.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(dq9 dq9Var) {
        v06 v06Var = dq9Var.m().b;
        if (v06Var != v06.b && v06Var != v06.c) {
            w26.j("Failed requirement.");
        } else if (dq9Var.g().d() == null) {
            yp9 yp9Var = new yp9(dq9Var.g(), (tdc) dq9Var);
            dq9Var.g().f("androidx.lifecycle.internal.SavedStateHandlesProvider", yp9Var);
            dq9Var.m().a(new k29(yp9Var, (byte) 2));
        }
    }

    public static final zp9 c(tdc tdcVar) {
        l13 l13Var;
        ize izeVar = new ize((byte) 25);
        sdc f = tdcVar.f();
        if (tdcVar instanceof oc5) {
            l13Var = ((oc5) tdcVar).d();
        } else {
            l13Var = j13.b;
        }
        f.getClass();
        l13Var.getClass();
        return (zp9) new vk9(f, izeVar, l13Var).s(f59.a(zp9.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
