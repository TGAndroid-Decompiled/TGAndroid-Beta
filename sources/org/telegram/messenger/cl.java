package org.telegram.messenger;

import java.util.function.IntFunction;
public final class cl implements IntFunction {
    public final int f15039a;

    @Override
    public final Object apply(int i10) {
        switch (this.f15039a) {
            case 0:
                return new int[i10];
            default:
                return String.valueOf(i10);
        }
    }
}
