package org.telegram.messenger;

import java.util.function.IntFunction;
public final class ce implements IntFunction {
    public final int f18096a;

    public ce(int i10) {
        this.f18096a = i10;
    }

    @Override
    public final Object apply(int i10) {
        int[][] lambda$new$16;
        switch (this.f18096a) {
            case 0:
                return String.valueOf(i10);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i10);
                return lambda$new$16;
        }
    }
}
