package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;
public final class pk implements ToLongFunction {
    public final int f26275a;

    public pk(int i7) {
        this.f26275a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f26275a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((xs) obj).f27923e;
            case 2:
                return ((xs) obj).f27923e;
            case 3:
                return ((gj) obj).Z0();
            case 4:
                gj gjVar = ((z41) obj).f54400b;
                if (gjVar == null) {
                    return 0L;
                }
                return gjVar.f24177k.date;
            case 5:
                return ((org.telegram.ui.Wallet.q8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.q8) obj).J;
        }
    }
}
