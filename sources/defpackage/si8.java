package defpackage;

import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
public final class si8 extends gu4 {
    private static final si8 DEFAULT_INSTANCE;
    private static volatile ax7 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private ek6 preferences_ = ek6.b;

    static {
        si8 si8Var = new si8();
        DEFAULT_INSTANCE = si8Var;
        gu4.j(si8.class, si8Var);
    }

    public static qi8 n() {
        return (qi8) ((eu4) DEFAULT_INSTANCE.c(5));
    }

    public static si8 o(FileInputStream fileInputStream) {
        si8 si8Var = DEFAULT_INSTANCE;
        ml2 ml2Var = new ml2(fileInputStream);
        k84 a = k84.a();
        gu4 i = si8Var.i();
        try {
            gv8 gv8Var = gv8.c;
            gv8Var.getClass();
            os9 a2 = gv8Var.a(i.getClass());
            ag0 ag0Var = ml2Var.b;
            if (ag0Var == null) {
                ag0Var = new ag0(ml2Var);
            }
            a2.i(i, ag0Var, a);
            a2.c(i);
            if (gu4.f(i, true)) {
                return (si8) i;
            }
            throw new IOException(new f7c().getMessage());
        } catch (f7c e) {
            throw new IOException(e.getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof yr5) {
                throw ((yr5) e2.getCause());
            }
            throw new IOException(e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof yr5) {
                throw ((yr5) e3.getCause());
            }
            throw e3;
        } catch (yr5 e4) {
            if (e4.a) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    @Override
    public final Object c(int i) {
        ax7 ax7Var;
        switch (wi8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new j19(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ri8.a});
            case 3:
                return new si8();
            case 4:
                return new eu4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ax7 ax7Var2 = PARSER;
                if (ax7Var2 == null) {
                    synchronized (si8.class) {
                        ax7 ax7Var3 = PARSER;
                        ax7Var = ax7Var3;
                        if (ax7Var3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            ax7Var = obj;
                        }
                    }
                    return ax7Var;
                }
                return ax7Var2;
            default:
                gxc.b();
                return null;
        }
    }

    public final Map l() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    public final ek6 m() {
        ek6 ek6Var = this.preferences_;
        if (!ek6Var.a) {
            ek6 c = ek6Var.c();
            this.preferences_ = c;
            return c;
        }
        return ek6Var;
    }
}
