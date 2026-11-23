package org.telegram.messenger;

import java.util.function.IntFunction;
public final class vk implements IntFunction {
    public final int f27397a;

    @Override
    public final Object apply(int i7) {
        switch (this.f27397a) {
            case 0:
                return new int[i7];
            default:
                return String.valueOf(i7);
        }
    }
}
