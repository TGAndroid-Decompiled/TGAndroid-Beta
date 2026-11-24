package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
public final class rfc extends nf5 {
    public static rfc H;
    public static final jk2 I = new jk2((byte) 29);
    public final Application G;

    public rfc(Application application) {
        super((byte) 29);
        this.G = application;
    }

    @Override
    public final pfc d(Class cls, x23 x23Var) {
        x23Var.getClass();
        if (this.G != null) {
            return j(cls);
        }
        Application application = (Application) x23Var.b(I);
        if (application != null) {
            return l(cls, application);
        }
        if (!hm.class.isAssignableFrom(cls)) {
            return tne.a(cls);
        }
        u36.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override
    public final pfc j(Class cls) {
        Application application = this.G;
        if (application != null) {
            return l(cls, application);
        }
        rjb.j("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final pfc l(Class cls, Application application) {
        if (hm.class.isAssignableFrom(cls)) {
            try {
                pfc pfcVar = (pfc) cls.getConstructor(Application.class).newInstance(application);
                pfcVar.getClass();
                return pfcVar;
            } catch (IllegalAccessException e) {
                dq9.n("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                dq9.n("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                dq9.n("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                dq9.n("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return tne.a(cls);
    }
}
