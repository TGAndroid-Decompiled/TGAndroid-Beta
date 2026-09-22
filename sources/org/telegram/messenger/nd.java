package org.telegram.messenger;

import java.util.function.IntFunction;
public final class nd implements IntFunction {
    public final int f16847a;

    public nd(int i10) {
        this.f16847a = i10;
    }

    @Override
    public final Object apply(int i10) {
        int[][] lambda$new$16;
        switch (this.f16847a) {
            case 0:
                return String.valueOf(i10);
            default:
                lambda$new$16 = MessagesController.lambda$new$16(i10);
                return lambda$new$16;
        }
    }
}
