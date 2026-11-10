package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.b51;
public final class sk implements ToLongFunction {
    public final int f25490a;

    public sk(int i7) {
        this.f25490a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f25490a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ct) obj).f21938e;
            case 2:
                return ((ct) obj).f21938e;
            case 3:
                return ((ij) obj).Z0();
            case 4:
                ij ijVar = ((b51) obj).f43931b;
                if (ijVar == null) {
                    return 0L;
                }
                return ijVar.f23266k.date;
            case 5:
                return ((org.telegram.ui.Wallet.c8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.c8) obj).J;
        }
    }
}
