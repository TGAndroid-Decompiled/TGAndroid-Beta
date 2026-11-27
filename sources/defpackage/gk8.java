package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
public final class gk8 extends ju4 {
    private static final gk8 DEFAULT_INSTANCE;
    private static volatile gy7 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private or5 strings_ = pw8.d;

    static {
        gk8 gk8Var = new gk8();
        DEFAULT_INSTANCE = gk8Var;
        ju4.j(gk8.class, gk8Var);
    }

    public static gk8 m() {
        return DEFAULT_INSTANCE;
    }

    public static fk8 o() {
        return (fk8) ((hu4) DEFAULT_INSTANCE.c(5));
    }

    @Override
    public final Object c(int i) {
        gy7 gy7Var;
        switch (ik8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v29(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new gk8();
            case 4:
                return new hu4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                gy7 gy7Var2 = PARSER;
                if (gy7Var2 == null) {
                    synchronized (gk8.class) {
                        gy7 gy7Var3 = PARSER;
                        gy7Var = gy7Var3;
                        if (gy7Var3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            gy7Var = obj;
                        }
                    }
                    return gy7Var;
                }
                return gy7Var2;
            default:
                p3d.a();
                return null;
        }
    }

    public final void l(Set set) {
        int i;
        or5 or5Var = this.strings_;
        boolean z = ((t3) or5Var).a;
        pw8 pw8Var = or5Var;
        if (!z) {
            int size = or5Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            pw8 j = ((pw8) or5Var).j(i);
            this.strings_ = j;
            pw8Var = j;
        }
        Charset charset = pr5.a;
        if (pw8Var instanceof ArrayList) {
            ((ArrayList) pw8Var).ensureCapacity(set.size() + pw8Var.size());
        }
        int size2 = pw8Var.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (pw8Var.size() - size2) + " is null.";
                for (int size3 = pw8Var.size() - 1; size3 >= size2; size3--) {
                    pw8Var.remove(size3);
                }
                p3d.h(str);
                return;
            }
            pw8Var.add(obj);
        }
    }

    public final or5 n() {
        return this.strings_;
    }
}
