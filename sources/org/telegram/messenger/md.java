package org.telegram.messenger;

import java.util.function.IntFunction;

public final class md implements IntFunction {

    public final int f20982a;

    public md(int i10) {
        this.f20982a = i10;
    }

    @Override
    public final Object apply(int i10) {
        switch (this.f20982a) {
            case 0:
                return String.valueOf(i10);
            default:
                return MessagesController.lambda$new$16(i10);
        }
    }
}
