package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
public final class wt9 implements qhc {
    public final Application a;
    public final phc b;
    public final Bundle c;
    public final a36 d;
    public final po e;

    public wt9(Application application, vt9 vt9Var, Bundle bundle) {
        phc phcVar;
        this.e = vt9Var.g();
        this.d = vt9Var.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            phcVar = phc.H;
            if (phcVar == null) {
                phcVar = new phc(application);
                phc.H = phcVar;
            }
        } else {
            phcVar = new phc(null);
        }
        this.b = phcVar;
    }

    @Override
    public final nhc g(Class cls, e23 e23Var) {
        Constructor a;
        nhc b;
        AutoCloseable autoCloseable;
        Application application;
        Constructor a2;
        e23Var.getClass();
        String str = (String) e23Var.b(z3f.e);
        if (str != null) {
            if (e23Var.b(fhd.a) != null && e23Var.b(fhd.b) != null) {
                Application application2 = (Application) e23Var.b(phc.I);
                boolean isAssignableFrom = il.class.isAssignableFrom(cls);
                if (isAssignableFrom && application2 != null) {
                    a2 = xt9.a(cls, xt9.a);
                } else {
                    a2 = xt9.a(cls, xt9.b);
                }
                if (a2 == null) {
                    return this.b.g(cls, e23Var);
                }
                if (isAssignableFrom && application2 != null) {
                    return xt9.b(cls, a2, application2, fhd.a(e23Var));
                }
                return xt9.b(cls, a2, fhd.a(e23Var));
            } else if (this.d != null) {
                a36 a36Var = this.d;
                if (a36Var != null) {
                    boolean isAssignableFrom2 = il.class.isAssignableFrom(cls);
                    if (isAssignableFrom2 && this.a != null) {
                        a = xt9.a(cls, xt9.a);
                    } else {
                        a = xt9.a(cls, xt9.b);
                    }
                    if (a == null) {
                        if (this.a != null) {
                            return this.b.f(cls);
                        }
                        qf5 qf5Var = qf5.F;
                        if (qf5Var == null) {
                            qf5Var = new qf5((byte) 29);
                            qf5.F = qf5Var;
                        }
                        return qf5Var.f(cls);
                    }
                    po poVar = this.e;
                    poVar.getClass();
                    Bundle bundle = this.c;
                    Bundle c = poVar.c(str);
                    Class[] clsArr = ot9.f;
                    ot9 a3 = fye.a(c, bundle);
                    pt9 pt9Var = new pt9(str, a3);
                    pt9Var.a(poVar, a36Var);
                    z26 z26Var = ((k36) a36Var).b;
                    if (z26Var != z26.b && z26Var.compareTo(z26.d) < 0) {
                        a36Var.a(new bc3(a36Var, poVar, (byte) 1));
                    } else {
                        poVar.g();
                    }
                    if (isAssignableFrom2 && (application = this.a) != null) {
                        b = xt9.b(cls, a, application, a3);
                    } else {
                        b = xt9.b(cls, a, a3);
                    }
                    nhc nhcVar = b;
                    nhcVar.getClass();
                    ohc ohcVar = nhcVar.a;
                    if (ohcVar.d) {
                        ohc.a(pt9Var);
                        return nhcVar;
                    }
                    synchronized (ohcVar.a) {
                        autoCloseable = (AutoCloseable) ohcVar.b.put("androidx.lifecycle.savedstate.vm.tag", pt9Var);
                    }
                    ohc.a(autoCloseable);
                    return nhcVar;
                }
                qyc.c("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
                return null;
            } else {
                grb.i("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        grb.i("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override
    public final nhc j(ki2 ki2Var, e23 e23Var) {
        return xnb.a(this, ki2Var, e23Var);
    }
}
