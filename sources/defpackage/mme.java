package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class mme {
    public static final Logger a = Logger.getLogger(lje.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static rke a() {
        String str;
        String str2;
        ClassLoader classLoader = mme.class.getClassLoader();
        if (!rke.class.equals(rke.class)) {
            if (!rke.class.getPackage().equals(mme.class.getPackage())) {
                w26.j(rke.class.getName());
                return null;
            }
            str = rke.class.getPackage().getName() + ".BlazeGenerated" + rke.class.getSimpleName() + "Loader";
        } else {
            str = b;
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
                for (Object obj : Arrays.asList(new mme[0])) {
                    try {
                        if (obj == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e5) {
                        Level level = Level.SEVERE;
                        String simpleName = rke.class.getSimpleName();
                        if (simpleName.length() != 0) {
                            str2 = "Unable to load ".concat(simpleName);
                        } else {
                            str2 = new String("Unable to load ");
                        }
                        a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (rke) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (rke) rke.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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
