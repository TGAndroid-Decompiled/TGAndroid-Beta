package org.telegram.messenger;

import java.util.function.IntFunction;
public final class qk implements IntFunction {
    public final int f24902a;

    @Override
    public final Object apply(int i3) {
        switch (this.f24902a) {
            case 0:
                return new int[i3];
            default:
                return String.valueOf(i3);
        }
    }
}
