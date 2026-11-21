package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;
public final class ok implements ToLongFunction {
    public final int f26093a;

    public ok(int i7) {
        this.f26093a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f26093a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ws) obj).f27787e;
            case 2:
                return ((ws) obj).f27787e;
            case 3:
                return ((fj) obj).Z0();
            case 4:
                fj fjVar = ((z41) obj).f54433b;
                if (fjVar == null) {
                    return 0L;
                }
                return fjVar.f23993k.date;
            case 5:
                return ((org.telegram.ui.Wallet.q8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.q8) obj).J;
        }
    }
}
