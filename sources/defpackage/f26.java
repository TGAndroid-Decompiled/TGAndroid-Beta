package defpackage;

import java.util.logging.Logger;
public final class f26 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public f26(Class cls, byte b) {
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
            this.c = ((nl8) this.a).b(this);
        }
        return (int[]) this.c;
    }

    public final Logger c() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((ra1) this.b)) {
            Logger logger2 = (Logger) this.c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger((String) this.a);
            this.c = logger3;
            return logger3;
        }
    }

    public f26(String str, ai4 ai4Var, rr4 rr4Var, ky2 ky2Var) {
        this.a = str;
        this.b = new Object();
    }

    public f26(int[] iArr, nl8 nl8Var) {
        this.b = iArr;
        this.a = nl8Var;
    }
}
