package defpackage;

import java.util.logging.Logger;
public final class j26 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public j26(Class cls, byte b) {
        switch (b) {
            case 3:
                this.b = new Object();
                this.a = cls.getName();
                return;
            default:
                this.b = new Object();
                this.a = cls.getName();
                return;
        }
    }

    public final Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.b) {
            Logger logger2 = (Logger) this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger((String) this.a);
            this.c = logger3;
            return logger3;
        }
    }

    public final synchronized int[] b() {
        if (((int[]) this.c) == null) {
            this.c = ((xm8) this.a).b(this);
        }
        return (int[]) this.c;
    }

    public final Logger c() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((r91) this.b)) {
            Logger logger2 = (Logger) this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger((String) this.a);
            this.c = logger3;
            return logger3;
        }
    }

    public j26(String str, j09 j09Var, ur4 ur4Var, ux2 ux2Var) {
        this.a = str;
        this.b = new Object();
    }

    public j26(int[] iArr, xm8 xm8Var) {
        this.b = iArr;
        this.a = xm8Var;
    }
}
