package org.telegram.messenger;

import java.util.function.IntFunction;
public final class dl implements IntFunction {
    public final int f15400a;

    @Override
    public final Object apply(int i10) {
        switch (this.f15400a) {
            case 0:
                return new int[i10];
            default:
                return String.valueOf(i10);
        }
    }
}
