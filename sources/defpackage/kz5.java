package defpackage;

import java.util.Comparator;
import java.util.List;
public final class kz5 implements Comparator {
    public final byte a;
    public final mb6 b;

    public kz5(mb6 mb6Var, byte b) {
        this.a = b;
        this.b = mb6Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        mb6 mb6Var = this.b;
        mb6 mb6Var2 = (mb6) obj;
        mb6 mb6Var3 = (mb6) obj2;
        switch (b) {
            case 0:
                if (mb6Var2 != mb6Var) {
                    if (mb6Var3 != mb6Var) {
                        int i = mb6Var2.k;
                        int i2 = mb6Var3.k;
                        if (i == i2) {
                            return mb6Var2.a.compareTo(mb6Var3.a);
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
                if (mb6Var2 != mb6Var) {
                    if (mb6Var3 != mb6Var) {
                        List list = a5c.N;
                        int indexOf = list.indexOf(mb6Var2.f);
                        int indexOf2 = list.indexOf(mb6Var3.f);
                        if (indexOf >= 0) {
                            if (indexOf2 >= 0) {
                                return indexOf - indexOf2;
                            }
                        } else if (indexOf2 < 0) {
                            int i3 = mb6Var2.k;
                            int i4 = mb6Var3.k;
                            if (i3 == i4) {
                                return mb6Var2.a.compareTo(mb6Var3.a);
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
