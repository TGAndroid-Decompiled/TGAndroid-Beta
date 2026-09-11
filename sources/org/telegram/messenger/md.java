package org.telegram.messenger;

import java.util.function.IntFunction;
public final class md implements IntFunction {
    public final int f18395a;

    public md(int i10) {
        this.f18395a = i10;
    }

    @Override
    public final Object apply(int i10) {
        int[][] lambda$new$16;
        switch (this.f18395a) {
            case 0:
                return String.valueOf(i10);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i10);
                return lambda$new$16;
        }
    }
}
