package fi;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class c6 implements Consumer {
    public final d6 f11816a;

    public c6(d6 d6Var) {
        this.f11816a = d6Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.g0.g3(new a6(1, this.f11816a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
