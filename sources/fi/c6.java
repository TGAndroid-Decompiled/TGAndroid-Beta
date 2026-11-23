package fi;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class c6 implements Consumer {
    public final d6 f11818a;

    public c6(d6 d6Var) {
        this.f11818a = d6Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.g0.g3(new l4(3, this.f11818a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
