package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.w41;
public final class qk implements ToLongFunction {
    public final int f26104a;

    public qk(int i7) {
        this.f26104a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f26104a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((zs) obj).f28002e;
            case 2:
                return ((zs) obj).f28002e;
            case 3:
                return ((gj) obj).Z0();
            case 4:
                gj gjVar = ((w41) obj).f52431b;
                if (gjVar == null) {
                    return 0L;
                }
                return gjVar.f23817k.date;
            case 5:
                return ((org.telegram.ui.Wallet.b8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.b8) obj).J;
        }
    }
}
