package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class qzd {
    public static final sw2 a(sw2 sw2Var, sw2 sw2Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) sw2Var.fold(bool, new dm2((byte) 2))).booleanValue();
        boolean booleanValue2 = ((Boolean) sw2Var2.fold(bool, new dm2((byte) 2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return sw2Var.plus(sw2Var2);
        }
        dm2 dm2Var = new dm2((byte) 3);
        z14 z14Var = z14.a;
        sw2 sw2Var3 = (sw2) sw2Var.fold(z14Var, dm2Var);
        sw2 sw2Var4 = sw2Var2;
        if (booleanValue2) {
            sw2Var4 = sw2Var2.fold(z14Var, new dm2((byte) 4));
        }
        return sw2Var3.plus(sw2Var4);
    }

    public static final sw2 b(ax2 ax2Var, sw2 sw2Var) {
        sw2 a = a(ax2Var.c(), sw2Var, true);
        xb3 xb3Var = ko3.a;
        if (a != xb3Var && a.get(vi2.b) == null) {
            return a.plus(xb3Var);
        }
        return a;
    }

    public static final y4c c(fw2 fw2Var, sw2 sw2Var, Object obj) {
        y4c y4cVar = null;
        if ((fw2Var instanceof cx2) && sw2Var.get(z4c.a) != null) {
            cx2 cx2Var = (cx2) fw2Var;
            while (true) {
                if (!(cx2Var instanceof io3) && (cx2Var = cx2Var.getCallerFrame()) != null) {
                    if (cx2Var instanceof y4c) {
                        y4cVar = (y4c) cx2Var;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (y4cVar != null) {
                y4cVar.T(sw2Var, obj);
            }
        }
        return y4cVar;
    }

    public static nxd d() {
        String str;
        ClassLoader classLoader = qzd.class.getClassLoader();
        if (!nxd.class.equals(nxd.class)) {
            if (!nxd.class.getPackage().equals(qzd.class.getPackage())) {
                w26.j(nxd.class.getName());
                return null;
            }
            str = nxd.class.getPackage().getName() + ".BlazeGenerated" + nxd.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    ir2.u(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
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
                for (Object obj : Arrays.asList(new qzd[0])) {
                    try {
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(cwd.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(nxd.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (nxd) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (nxd) nxd.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    ho9.n(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    ho9.n(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    ho9.n(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
