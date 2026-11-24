package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class poe {
    public static final Logger a = Logger.getLogger(nle.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static tme a() {
        String str;
        String str2;
        ClassLoader classLoader = poe.class.getClassLoader();
        if (!tme.class.equals(tme.class)) {
            if (!tme.class.getPackage().equals(poe.class.getPackage())) {
                u36.j(tme.class.getName());
                return null;
            }
            str = tme.class.getPackage().getName() + ".BlazeGenerated" + tme.class.getSimpleName() + "Loader";
        } else {
            str = b;
        }
        try {
            try {
                try {
                    ts2.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
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
                for (Object obj : Arrays.asList(new poe[0])) {
                    try {
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e5) {
                        Level level = Level.SEVERE;
                        String simpleName = tme.class.getSimpleName();
                        if (simpleName.length() != 0) {
                            str2 = "Unable to load ".concat(simpleName);
                        } else {
                            str2 = new String("Unable to load ");
                        }
                        a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (tme) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (tme) tme.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    dq9.o(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    dq9.o(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    dq9.o(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
