package di;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class m6 implements Consumer {
    public final n6 f9361a;

    public m6(n6 n6Var) {
        this.f9361a = n6Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.g0.h3(new z0(8, this.f9361a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
