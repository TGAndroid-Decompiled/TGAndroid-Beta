package defpackage;

import java.util.function.ToLongFunction;
public final class fh implements ToLongFunction {
    public final byte a;

    public fh(byte b) {
        this.a = b;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((r47) obj).Z0();
            case 1:
                return Long.parseLong((String) obj);
            case 2:
                return ((hp7) obj).e;
            case 3:
                return ((hp7) obj).e;
            case 4:
                r47 r47Var = ((t1b) obj).b;
                if (r47Var == null) {
                    return 0L;
                }
                return r47Var.k.date;
            case 5:
                return ((vsc) obj).I;
            default:
                return ((vsc) obj).J;
        }
    }
}
