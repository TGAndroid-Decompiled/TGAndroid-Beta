package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
public final class dz2 implements BiConsumer {
    public final byte a;
    public final mz0 b;

    public dz2(mz0 mz0Var, byte b) {
        this.a = b;
        this.b = mz0Var;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        mz0 mz0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ((hz2) mz0Var).W1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((b1a) mz0Var).f2.addAll((List) obj2);
                return;
        }
    }

    public final BiConsumer andThen(BiConsumer biConsumer) {
        byte b = this.a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
