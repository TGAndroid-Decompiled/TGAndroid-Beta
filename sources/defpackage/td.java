package defpackage;

import java.util.function.ToLongFunction;
public final class td implements ToLongFunction {
    public final byte a;

    public td(byte b) {
        this.a = b;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((k27) obj).Z0();
            case 1:
                return Long.parseLong((String) obj);
            case 2:
                return ((hm7) obj).e;
            case 3:
                return ((hm7) obj).e;
            case 4:
                k27 k27Var = ((rxa) obj).b;
                if (k27Var == null) {
                    return 0L;
                }
                return k27Var.k.date;
            case 5:
                return ((joc) obj).I;
            default:
                return ((joc) obj).J;
        }
    }
}
