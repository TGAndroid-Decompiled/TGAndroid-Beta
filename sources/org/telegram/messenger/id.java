package org.telegram.messenger;

import java.util.function.IntFunction;
public final class id implements IntFunction {
    public final int f20596a;

    public id(int i9) {
        this.f20596a = i9;
    }

    @Override
    public final Object apply(int i9) {
        int[][] lambda$new$16;
        switch (this.f20596a) {
            case 0:
                return String.valueOf(i9);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i9);
                return lambda$new$16;
        }
    }
}
