package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.r61;
public final class uk implements ToLongFunction {
    public final int f18367a;

    public uk(int i10) {
        this.f18367a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f18367a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((nt) obj).e;
            case 2:
                return ((nt) obj).e;
            case 3:
                return ((jj) obj).Z0();
            case 4:
                jj jjVar = ((r61) obj).f41150b;
                if (jjVar == null) {
                    return 0L;
                }
                return jjVar.f16337k.date;
            case 5:
                return ((org.telegram.ui.Wallet.g8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.g8) obj).J;
        }
    }
}
