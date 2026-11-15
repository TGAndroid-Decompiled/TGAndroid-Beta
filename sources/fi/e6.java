package fi;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class e6 implements Consumer {
    public final g6 f11676a;

    public e6(g6 g6Var) {
        this.f11676a = g6Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.g0.h3(new di.s2(29, this.f11676a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
