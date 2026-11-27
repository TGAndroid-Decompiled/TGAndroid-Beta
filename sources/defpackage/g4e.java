package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class g4e {
    public static final mx2 a(mx2 mx2Var, mx2 mx2Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) mx2Var.fold(bool, new xm2((byte) 2))).booleanValue();
        boolean booleanValue2 = ((Boolean) mx2Var2.fold(bool, new xm2((byte) 2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return mx2Var.plus(mx2Var2);
        }
        xm2 xm2Var = new xm2((byte) 3);
        u24 u24Var = u24.a;
        mx2 mx2Var3 = (mx2) mx2Var.fold(u24Var, xm2Var);
        mx2 mx2Var4 = mx2Var2;
        if (booleanValue2) {
            mx2Var4 = mx2Var2.fold(u24Var, new xm2((byte) 4));
        }
        return mx2Var3.plus(mx2Var4);
    }

    public static final mx2 b(ux2 ux2Var, mx2 mx2Var) {
        mx2 a = a(ux2Var.c(), mx2Var, true);
        qc3 qc3Var = bp3.a;
        if (a != qc3Var && a.get(rj2.b) == null) {
            return a.plus(qc3Var);
        }
        return a;
    }

    public static final x8c c(zw2 zw2Var, mx2 mx2Var, Object obj) {
        x8c x8cVar = null;
        if ((zw2Var instanceof wx2) && mx2Var.get(y8c.a) != null) {
            wx2 wx2Var = (wx2) zw2Var;
            while (true) {
                if (!(wx2Var instanceof zo3) && (wx2Var = wx2Var.getCallerFrame()) != null) {
                    if (wx2Var instanceof x8c) {
                        x8cVar = (x8c) wx2Var;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (x8cVar != null) {
                x8cVar.T(mx2Var, obj);
            }
        }
        return x8cVar;
    }

    public static d2e d() {
        String str;
        ClassLoader classLoader = g4e.class.getClassLoader();
        if (!d2e.class.equals(d2e.class)) {
            if (!d2e.class.getPackage().equals(g4e.class.getPackage())) {
                lq5.j(d2e.class.getName());
                return null;
            }
            str = d2e.class.getPackage().getName() + ".BlazeGenerated" + d2e.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    bs2.u(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : Arrays.asList(new g4e[0])) {
                    try {
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(s0e.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(d2e.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (d2e) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (d2e) d2e.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    vr9.l(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    vr9.l(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    vr9.l(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
