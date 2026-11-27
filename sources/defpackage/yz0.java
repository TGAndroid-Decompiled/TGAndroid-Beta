package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;
public final class yz0 implements BiFunction {
    public final byte a;

    public final BiFunction andThen(Function function) {
        byte b = this.a;
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.valueOf(Math.max(((Long) obj).longValue(), ((Long) obj2).longValue()));
            default:
                return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
        }
    }
}
