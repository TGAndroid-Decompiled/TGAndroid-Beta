package defpackage;

import java.util.Comparator;
import java.util.List;
public final class fz5 implements Comparator {
    public final byte a;
    public final hb6 b;

    public fz5(hb6 hb6Var, byte b) {
        this.a = b;
        this.b = hb6Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        hb6 hb6Var = this.b;
        hb6 hb6Var2 = (hb6) obj;
        hb6 hb6Var3 = (hb6) obj2;
        switch (b) {
            case 0:
                if (hb6Var2 != hb6Var) {
                    if (hb6Var3 != hb6Var) {
                        int i = hb6Var2.k;
                        int i2 = hb6Var3.k;
                        if (i == i2) {
                            return hb6Var2.a.compareTo(hb6Var3.a);
                        }
                        if (i <= i2) {
                            if (i >= i2) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (hb6Var2 != hb6Var) {
                    if (hb6Var3 != hb6Var) {
                        List list = b3c.N;
                        int indexOf = list.indexOf(hb6Var2.f);
                        int indexOf2 = list.indexOf(hb6Var3.f);
                        if (indexOf >= 0) {
                            if (indexOf2 >= 0) {
                                return indexOf - indexOf2;
                            }
                        } else if (indexOf2 < 0) {
                            int i3 = hb6Var2.k;
                            int i4 = hb6Var3.k;
                            if (i3 == i4) {
                                return hb6Var2.a.compareTo(hb6Var3.a);
                            }
                            if (i3 <= i4) {
                                if (i3 >= i4) {
                                    return 0;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
