package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.o41;
public final class ik implements ToLongFunction {
    public final int f23544a;

    public ik(int i3) {
        this.f23544a = i3;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f23544a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ts) obj).f25590e;
            case 2:
                return ((ts) obj).f25590e;
            case 3:
                return ((zi) obj).Z0();
            case 4:
                zi ziVar = ((o41) obj).f48186b;
                if (ziVar == null) {
                    return 0L;
                }
                return ziVar.f26868k.date;
            case 5:
                return ((org.telegram.ui.Wallet.a8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.a8) obj).J;
        }
    }
}
