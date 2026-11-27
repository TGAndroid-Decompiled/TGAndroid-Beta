package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
public final class phc extends qf5 {
    public static phc H;
    public static final rj2 I = new rj2((byte) 29);
    public final Application G;

    public phc(Application application) {
        super((byte) 29);
        this.G = application;
    }

    @Override
    public final nhc f(Class cls) {
        Application application = this.G;
        if (application != null) {
            return k(cls, application);
        }
        qyc.c("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override
    public final nhc g(Class cls, e23 e23Var) {
        e23Var.getClass();
        if (this.G != null) {
            return f(cls);
        }
        Application application = (Application) e23Var.b(I);
        if (application != null) {
            return k(cls, application);
        }
        if (!il.class.isAssignableFrom(cls)) {
            return mqe.a(cls);
        }
        lq5.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final nhc k(Class cls, Application application) {
        if (il.class.isAssignableFrom(cls)) {
            try {
                nhc nhcVar = (nhc) cls.getConstructor(Application.class).newInstance(application);
                nhcVar.getClass();
                return nhcVar;
            } catch (IllegalAccessException e) {
                vr9.k("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                vr9.k("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                vr9.k("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                vr9.k("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return mqe.a(cls);
    }
}
