package org.telegram.messenger;

import java.util.function.IntFunction;
public final class ae implements IntFunction {
    public final int f17367a;

    public ae(int i10) {
        this.f17367a = i10;
    }

    @Override
    public final Object apply(int i10) {
        int[][] lambda$new$16;
        switch (this.f17367a) {
            case 0:
                return String.valueOf(i10);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i10);
                return lambda$new$16;
        }
    }
}
