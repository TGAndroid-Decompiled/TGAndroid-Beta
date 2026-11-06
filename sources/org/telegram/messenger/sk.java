package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;
public final class sk implements ToLongFunction {
    public final int f25472a;

    public sk(int i7) {
        this.f25472a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f25472a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ct) obj).f21899e;
            case 2:
                return ((ct) obj).f21899e;
            case 3:
                return ((ij) obj).Z0();
            case 4:
                ij ijVar = ((z41) obj).f52474b;
                if (ijVar == null) {
                    return 0L;
                }
                return ijVar.f23237k.date;
            case 5:
                return ((org.telegram.ui.Wallet.b8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.b8) obj).J;
        }
    }
}
