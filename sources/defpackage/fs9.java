package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
public final class fs9 implements sfc {
    public final Application a;
    public final rfc b;
    public final Bundle c;
    public final w26 d;
    public final op e;

    public fs9(Application application, es9 es9Var, Bundle bundle) {
        rfc rfcVar;
        this.e = es9Var.g();
        this.d = es9Var.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            rfcVar = rfc.H;
            if (rfcVar == null) {
                rfcVar = new rfc(application);
                rfc.H = rfcVar;
            }
        } else {
            rfcVar = new rfc(null);
        }
        this.b = rfcVar;
    }

    @Override
    public final pfc d(Class cls, x23 x23Var) {
        Constructor a;
        pfc b;
        AutoCloseable autoCloseable;
        Application application;
        Constructor a2;
        x23Var.getClass();
        String str = (String) x23Var.b(k1f.e);
        if (str != null) {
            if (x23Var.b(oed.a) != null && x23Var.b(oed.b) != null) {
                Application application2 = (Application) x23Var.b(rfc.I);
                boolean isAssignableFrom = hm.class.isAssignableFrom(cls);
                if (isAssignableFrom && application2 != null) {
                    a2 = gs9.a(cls, gs9.a);
                } else {
                    a2 = gs9.a(cls, gs9.b);
                }
                if (a2 == null) {
                    return this.b.d(cls, x23Var);
                }
                if (isAssignableFrom && application2 != null) {
                    return gs9.b(cls, a2, application2, oed.a(x23Var));
                }
                return gs9.b(cls, a2, oed.a(x23Var));
            } else if (this.d != null) {
                w26 w26Var = this.d;
                if (w26Var != null) {
                    boolean isAssignableFrom2 = hm.class.isAssignableFrom(cls);
                    if (isAssignableFrom2 && this.a != null) {
                        a = gs9.a(cls, gs9.a);
                    } else {
                        a = gs9.a(cls, gs9.b);
                    }
                    if (a == null) {
                        if (this.a != null) {
                            return this.b.j(cls);
                        }
                        nf5 nf5Var = nf5.F;
                        if (nf5Var == null) {
                            nf5Var = new nf5((byte) 29);
                            nf5.F = nf5Var;
                        }
                        return nf5Var.j(cls);
                    }
                    op opVar = this.e;
                    opVar.getClass();
                    Bundle bundle = this.c;
                    Bundle c = opVar.c(str);
                    Class[] clsArr = xr9.f;
                    xr9 a3 = qve.a(c, bundle);
                    yr9 yr9Var = new yr9(str, a3);
                    yr9Var.a(opVar, w26Var);
                    v26 v26Var = ((g36) w26Var).b;
                    if (v26Var != v26.b && v26Var.compareTo(v26.d) < 0) {
                        w26Var.a(new uc3(w26Var, opVar, (byte) 1));
                    } else {
                        opVar.g();
                    }
                    if (isAssignableFrom2 && (application = this.a) != null) {
                        b = gs9.b(cls, a, application, a3);
                    } else {
                        b = gs9.b(cls, a, a3);
                    }
                    pfc pfcVar = b;
                    pfcVar.getClass();
                    qfc qfcVar = pfcVar.a;
                    if (qfcVar.d) {
                        qfc.a(yr9Var);
                        return pfcVar;
                    }
                    synchronized (qfcVar.a) {
                        autoCloseable = (AutoCloseable) qfcVar.b.put("androidx.lifecycle.savedstate.vm.tag", yr9Var);
                    }
                    qfc.a(autoCloseable);
                    return pfcVar;
                }
                rjb.j("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
                return null;
            } else {
                dq9.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        dq9.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override
    public final pfc g(cj2 cj2Var, x23 x23Var) {
        return mlb.a(this, cj2Var, x23Var);
    }
}
