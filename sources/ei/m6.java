package ei;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
public final class m6 implements Consumer {
    public final n6 f10642a;

    public m6(n6 n6Var) {
        this.f10642a = n6Var;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.messenger.g0.h3(new b0(11, this.f10642a, (List) obj));
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
