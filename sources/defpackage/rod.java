package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class rod implements prd {
    public static final Object d = new Object();
    public static final j26 e = new j26(jtd.class, (byte) 3);
    public static final boolean f;
    public static final o5f h;
    public volatile Object a;
    public volatile dod b;
    public volatile lod c;

    static {
        boolean z;
        Object obj;
        Throwable th;
        Throwable th2;
        ?? r0;
        Object obj2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property != null && !property.contains("Android")) {
            try {
                obj2 = new Object();
            } catch (NoClassDefFoundError unused2) {
                obj2 = new Object();
            }
        } else {
            try {
                obj2 = new Object();
            } catch (Error | Exception e2) {
                try {
                    obj = new Object();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    obj = new Object();
                }
                th = th3;
                th2 = e2;
                r0 = obj;
            }
        }
        th = null;
        th2 = null;
        r0 = obj2;
        h = r0;
        if (th != null) {
            j26 j26Var = e;
            Logger c = j26Var.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            j26Var.c().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(lod lodVar) {
        lodVar.a = null;
        while (true) {
            lod lodVar2 = this.c;
            if (lodVar2 != lod.c) {
                lod lodVar3 = null;
                while (lodVar2 != null) {
                    lod lodVar4 = lodVar2.b;
                    if (lodVar2.a != null) {
                        lodVar3 = lodVar2;
                    } else if (lodVar3 != null) {
                        lodVar3.b = lodVar4;
                        if (lodVar3.a == null) {
                            break;
                        }
                    } else if (h.g(this, lodVar2, lodVar4)) {
                    }
                    lodVar2 = lodVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
