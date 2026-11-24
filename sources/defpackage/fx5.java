package defpackage;

import java.util.Comparator;
import java.util.List;
public final class fx5 implements Comparator {
    public final byte a;
    public final i96 b;

    public fx5(i96 i96Var, byte b) {
        this.a = b;
        this.b = i96Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        i96 i96Var = this.b;
        i96 i96Var2 = (i96) obj;
        i96 i96Var3 = (i96) obj2;
        switch (b) {
            case 0:
                if (i96Var2 != i96Var) {
                    if (i96Var3 != i96Var) {
                        int i = i96Var2.k;
                        int i2 = i96Var3.k;
                        if (i == i2) {
                            return i96Var2.a.compareTo(i96Var3.a);
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
                if (i96Var2 != i96Var) {
                    if (i96Var3 != i96Var) {
                        List list = b1c.N;
                        int indexOf = list.indexOf(i96Var2.f);
                        int indexOf2 = list.indexOf(i96Var3.f);
                        if (indexOf >= 0) {
                            if (indexOf2 >= 0) {
                                return indexOf - indexOf2;
                            }
                        } else if (indexOf2 < 0) {
                            int i3 = i96Var2.k;
                            int i4 = i96Var3.k;
                            if (i3 == i4) {
                                return i96Var2.a.compareTo(i96Var3.a);
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
