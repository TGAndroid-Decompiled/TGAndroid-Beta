package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.p61;
public final class vk implements ToLongFunction {
    public final int f18749a;

    public vk(int i10) {
        this.f18749a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f18749a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ot) obj).e;
            case 2:
                return ((ot) obj).e;
            case 3:
                return ((kj) obj).Z0();
            case 4:
                kj kjVar = ((p61) obj).f40379b;
                if (kjVar == null) {
                    return 0L;
                }
                return kjVar.f16690k.date;
            case 5:
                return ((org.telegram.ui.Wallet.g8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.g8) obj).J;
        }
    }
}
