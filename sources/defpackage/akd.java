package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class akd implements ymd {
    public static final Object d = new Object();
    public static final f06 e = new f06(tod.class, (byte) 3);
    public static final boolean f;
    public static final v0f h;
    public volatile Object a;
    public volatile mjd b;
    public volatile ujd c;

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
            f06 f06Var = e;
            Logger c = f06Var.c();
            Level level = Level.SEVERE;
            c.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            f06Var.c().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(ujd ujdVar) {
        ujdVar.a = null;
        while (true) {
            ujd ujdVar2 = this.c;
            if (ujdVar2 != ujd.c) {
                ujd ujdVar3 = null;
                while (ujdVar2 != null) {
                    ujd ujdVar4 = ujdVar2.b;
                    if (ujdVar2.a != null) {
                        ujdVar3 = ujdVar2;
                    } else if (ujdVar3 != null) {
                        ujdVar3.b = ujdVar4;
                        if (ujdVar3.a == null) {
                            break;
                        }
                    } else if (h.g(this, ujdVar2, ujdVar4)) {
                    }
                    ujdVar2 = ujdVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
