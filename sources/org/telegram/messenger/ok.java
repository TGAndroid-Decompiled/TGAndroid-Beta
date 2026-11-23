package org.telegram.messenger;

import java.util.function.ToLongFunction;
import org.telegram.ui.y41;
public final class ok implements ToLongFunction {
    public final int f26162a;

    public ok(int i7) {
        this.f26162a = i7;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f26162a) {
            case 0:
                return Long.parseLong((String) obj);
            case 1:
                return ((ws) obj).f27853e;
            case 2:
                return ((ws) obj).f27853e;
            case 3:
                return ((fj) obj).Z0();
            case 4:
                fj fjVar = ((y41) obj).f54223b;
                if (fjVar == null) {
                    return 0L;
                }
                return fjVar.f24073k.date;
            case 5:
                return ((org.telegram.ui.Wallet.r8) obj).I;
            default:
                return ((org.telegram.ui.Wallet.r8) obj).J;
        }
    }
}
