package defpackage;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;
public final class zvc implements IntUnaryOperator {
    public final IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override
    public final int applyAsInt(int i) {
        if (i >= 16777215) {
            return 1;
        }
        return i + 1;
    }

    public final IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
