package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
public final class eq9 implements rdc {
    public final Application a;
    public final qdc b;
    public final Bundle c;
    public final w06 d;
    public final oo e;

    public eq9(Application application, dq9 dq9Var, Bundle bundle) {
        qdc qdcVar;
        this.e = dq9Var.g();
        this.d = dq9Var.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            qdcVar = qdc.H;
            if (qdcVar == null) {
                qdcVar = new qdc(application);
                qdc.H = qdcVar;
            }
        } else {
            qdcVar = new qdc(null);
        }
        this.b = qdcVar;
    }

    @Override
    public final odc e(Class cls, l13 l13Var) {
        Constructor a;
        odc b;
        AutoCloseable autoCloseable;
        Application application;
        Constructor a2;
        l13Var.getClass();
        String str = (String) l13Var.b(ize.e);
        if (str != null) {
            if (l13Var.b(mcd.a) != null && l13Var.b(mcd.b) != null) {
                Application application2 = (Application) l13Var.b(qdc.I);
                boolean isAssignableFrom = hl.class.isAssignableFrom(cls);
                if (isAssignableFrom && application2 != null) {
                    a2 = fq9.a(cls, fq9.a);
                } else {
                    a2 = fq9.a(cls, fq9.b);
                }
                if (a2 == null) {
                    return this.b.e(cls, l13Var);
                }
                if (isAssignableFrom && application2 != null) {
                    return fq9.b(cls, a2, application2, mcd.a(l13Var));
                }
                return fq9.b(cls, a2, mcd.a(l13Var));
            } else if (this.d != null) {
                w06 w06Var = this.d;
                if (w06Var != null) {
                    boolean isAssignableFrom2 = hl.class.isAssignableFrom(cls);
                    if (isAssignableFrom2 && this.a != null) {
                        a = fq9.a(cls, fq9.a);
                    } else {
                        a = fq9.a(cls, fq9.b);
                    }
                    if (a == null) {
                        if (this.a != null) {
                            return this.b.h(cls);
                        }
                        pd5 pd5Var = pd5.F;
                        if (pd5Var == null) {
                            pd5Var = new pd5((byte) 29);
                            pd5.F = pd5Var;
                        }
                        return pd5Var.h(cls);
                    }
                    oo ooVar = this.e;
                    ooVar.getClass();
                    Bundle bundle = this.c;
                    Bundle c = ooVar.c(str);
                    Class[] clsArr = wp9.f;
                    wp9 a3 = nte.a(c, bundle);
                    xp9 xp9Var = new xp9(str, a3);
                    xp9Var.a(ooVar, w06Var);
                    v06 v06Var = ((g16) w06Var).b;
                    if (v06Var != v06.b && v06Var.compareTo(v06.d) < 0) {
                        w06Var.a(new ib3(w06Var, ooVar, (byte) 1));
                    } else {
                        ooVar.g();
                    }
                    if (isAssignableFrom2 && (application = this.a) != null) {
                        b = fq9.b(cls, a, application, a3);
                    } else {
                        b = fq9.b(cls, a, a3);
                    }
                    odc odcVar = b;
                    odcVar.getClass();
                    pdc pdcVar = odcVar.a;
                    if (pdcVar.d) {
                        pdc.a(xp9Var);
                        return odcVar;
                    }
                    synchronized (pdcVar.a) {
                        autoCloseable = (AutoCloseable) pdcVar.b.put("androidx.lifecycle.savedstate.vm.tag", xp9Var);
                    }
                    pdc.a(autoCloseable);
                    return odcVar;
                }
                fyb.i("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
                return null;
            } else {
                sc8.j("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        sc8.j("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override
    public final odc f(oh2 oh2Var, l13 l13Var) {
        return yjb.a(this, oh2Var, l13Var);
    }
}
