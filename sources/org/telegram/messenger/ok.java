package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.z41;
public final class ok implements ToLongFunction {
    public final int f26065a;

    public ok(int i7) {
        this.f26065a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f26065a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ws) obj).f27759e;
            case 2:
                return ((ws) obj).f27759e;
            case 3:
                return ((fj) obj).Z0();
            case 4:
                fj fjVar = ((z41) obj).f54389b;
                if (fjVar == null) {
                    return 0L;
                }
                return fjVar.f23965k.date;
            case 5:
                return ((org.telegram.ui.Wallet.q8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.q8) obj).J;
        }
    }
}
