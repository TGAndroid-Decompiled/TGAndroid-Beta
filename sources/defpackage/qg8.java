package defpackage;

import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
public final class qg8 extends fs4 {
    private static final qg8 DEFAULT_INSTANCE;
    private static volatile zu7 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private ci6 preferences_ = ci6.b;

    static {
        qg8 qg8Var = new qg8();
        DEFAULT_INSTANCE = qg8Var;
        fs4.j(qg8.class, qg8Var);
    }

    public static og8 n() {
        return (og8) ((ds4) DEFAULT_INSTANCE.c(5));
    }

    public static qg8 o(FileInputStream fileInputStream) {
        qg8 qg8Var = DEFAULT_INSTANCE;
        zj2 zj2Var = new zj2(fileInputStream);
        b74 a = b74.a();
        fs4 i = qg8Var.i();
        try {
            ft8 ft8Var = ft8.c;
            ft8Var.getClass();
            nq9 a2 = ft8Var.a(i.getClass());
            af0 af0Var = zj2Var.b;
            if (af0Var == null) {
                af0Var = new af0(zj2Var);
            }
            a2.h(i, af0Var, a);
            a2.c(i);
            if (fs4.f(i, true)) {
                return (qg8) i;
            }
            throw new IOException(new f5c().getMessage());
        } catch (f5c e) {
            throw new IOException(e.getMessage());
        } catch (zp5 e2) {
            if (e2.a) {
                throw new IOException(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zp5) {
                throw ((zp5) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zp5) {
                throw ((zp5) e4.getCause());
            }
            throw e4;
        }
    }

    @Override
    public final Object c(int i) {
        zu7 zu7Var;
        switch (ug8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new iz8(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", pg8.a});
            case 3:
                return new qg8();
            case 4:
                return new ds4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                zu7 zu7Var2 = PARSER;
                if (zu7Var2 == null) {
                    synchronized (qg8.class) {
                        zu7 zu7Var3 = PARSER;
                        zu7Var = zu7Var3;
                        if (zu7Var3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            zu7Var = obj;
                        }
                    }
                    return zu7Var;
                }
                return zu7Var2;
            default:
                fvc.b();
                return null;
        }
    }

    public final Map l() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    public final ci6 m() {
        ci6 ci6Var = this.preferences_;
        if (!ci6Var.a) {
            ci6 c = ci6Var.c();
            this.preferences_ = c;
            return c;
        }
        return ci6Var;
    }
}
