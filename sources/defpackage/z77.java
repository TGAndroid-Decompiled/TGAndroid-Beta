package defpackage;

import java.util.function.IntFunction;
public final class z77 implements IntFunction {
    public final byte a;

    @Override
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new int[i];
            default:
                return String.valueOf(i);
        }
    }
}
