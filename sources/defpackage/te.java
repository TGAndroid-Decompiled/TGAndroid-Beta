package defpackage;

import java.util.function.ToLongFunction;
public final class te implements ToLongFunction {
    public final byte a;

    public te(byte b) {
        this.a = b;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((k47) obj).Z0();
            case 1:
                return Long.parseLong((String) obj);
            case 2:
                return ((ko7) obj).e;
            case 3:
                return ((ko7) obj).e;
            case 4:
                k47 k47Var = ((uza) obj).b;
                if (k47Var == null) {
                    return 0L;
                }
                return k47Var.k.date;
            case 5:
                return ((lqc) obj).I;
            default:
                return ((lqc) obj).J;
        }
    }
}
