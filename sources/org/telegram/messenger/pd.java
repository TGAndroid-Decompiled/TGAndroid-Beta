package org.telegram.messenger;

import java.util.function.IntFunction;
public final class pd implements IntFunction {
    public final int f21256a;

    public pd(int i10) {
        this.f21256a = i10;
    }

    @Override
    public final Object apply(int i10) {
        int[][] lambda$new$16;
        switch (this.f21256a) {
            case 0:
                return String.valueOf(i10);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i10);
                return lambda$new$16;
        }
    }
}
