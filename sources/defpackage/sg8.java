package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
public final class sg8 extends fs4 {
    private static final sg8 DEFAULT_INSTANCE;
    private static volatile zu7 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private lp5 strings_ = gt8.d;

    static {
        sg8 sg8Var = new sg8();
        DEFAULT_INSTANCE = sg8Var;
        fs4.j(sg8.class, sg8Var);
    }

    public static sg8 m() {
        return DEFAULT_INSTANCE;
    }

    public static rg8 o() {
        return (rg8) ((ds4) DEFAULT_INSTANCE.c(5));
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
                return new iz8(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new sg8();
            case 4:
                return new ds4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                zu7 zu7Var2 = PARSER;
                if (zu7Var2 == null) {
                    synchronized (sg8.class) {
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

    public final void l(Set set) {
        int i;
        lp5 lp5Var = this.strings_;
        boolean z = ((s3) lp5Var).a;
        gt8 gt8Var = lp5Var;
        if (!z) {
            int size = lp5Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            gt8 j = ((gt8) lp5Var).j(i);
            this.strings_ = j;
            gt8Var = j;
        }
        Charset charset = mp5.a;
        if (gt8Var instanceof ArrayList) {
            ((ArrayList) gt8Var).ensureCapacity(set.size() + gt8Var.size());
        }
        int size2 = gt8Var.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (gt8Var.size() - size2) + " is null.";
                for (int size3 = gt8Var.size() - 1; size3 >= size2; size3--) {
                    gt8Var.remove(size3);
                }
                fvc.f(str);
                return;
            }
            gt8Var.add(obj);
        }
    }

    public final lp5 n() {
        return this.strings_;
    }
}
