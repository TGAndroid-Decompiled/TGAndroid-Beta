package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
public final class ny2 implements BiConsumer {
    public final byte a;
    public final ny0 b;

    public ny2(ny0 ny0Var, byte b) {
        this.a = b;
        this.b = ny0Var;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        ny0 ny0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ((ry2) ny0Var).W1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((t2a) ny0Var).f2.addAll((List) obj2);
                return;
        }
    }

    public final BiConsumer andThen(BiConsumer biConsumer) {
        byte b = this.a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
