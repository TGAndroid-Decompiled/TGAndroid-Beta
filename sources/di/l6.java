package di;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class l6 implements Consumer {
    public final m6 f9336a;

    public l6(m6 m6Var) {
        this.f9336a = m6Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.g0.h3(new z0(8, this.f9336a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
