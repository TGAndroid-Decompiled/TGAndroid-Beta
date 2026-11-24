package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
public final class ui8 extends gu4 {
    private static final ui8 DEFAULT_INSTANCE;
    private static volatile ax7 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private lr5 strings_ = hv8.d;

    static {
        ui8 ui8Var = new ui8();
        DEFAULT_INSTANCE = ui8Var;
        gu4.j(ui8.class, ui8Var);
    }

    public static ui8 m() {
        return DEFAULT_INSTANCE;
    }

    public static ti8 o() {
        return (ti8) ((eu4) DEFAULT_INSTANCE.c(5));
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
                return new j19(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new ui8();
            case 4:
                return new eu4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ax7 ax7Var2 = PARSER;
                if (ax7Var2 == null) {
                    synchronized (ui8.class) {
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

    public final void l(Set set) {
        int i;
        lr5 lr5Var = this.strings_;
        boolean z = ((s3) lr5Var).a;
        hv8 hv8Var = lr5Var;
        if (!z) {
            int size = lr5Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            hv8 j = ((hv8) lr5Var).j(i);
            this.strings_ = j;
            hv8Var = j;
        }
        Charset charset = mr5.a;
        if (hv8Var instanceof ArrayList) {
            ((ArrayList) hv8Var).ensureCapacity(set.size() + hv8Var.size());
        }
        int size2 = hv8Var.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (hv8Var.size() - size2) + " is null.";
                for (int size3 = hv8Var.size() - 1; size3 >= size2; size3--) {
                    hv8Var.remove(size3);
                }
                gxc.d(str);
                return;
            }
            hv8Var.add(obj);
        }
    }

    public final lr5 n() {
        return this.strings_;
    }
}
