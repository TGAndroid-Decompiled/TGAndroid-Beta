package defpackage;

import java.util.logging.Logger;
public final class f06 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public f06(Class cls, byte b) {
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
            this.c = ((kj8) this.a).b(this);
        }
        return (int[]) this.c;
    }

    public final Logger c() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((i91) this.b)) {
            Logger logger2 = (Logger) this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger((String) this.a);
            this.c = logger3;
            return logger3;
        }
    }

    public f06(String str, ln8 ln8Var, qp4 qp4Var, ax2 ax2Var) {
        this.a = str;
        this.b = new Object();
    }

    public f06(int[] iArr, kj8 kj8Var) {
        this.b = iArr;
        this.a = kj8Var;
    }
}
