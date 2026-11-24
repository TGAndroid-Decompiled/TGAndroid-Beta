package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
public final class tx2 implements BiConsumer {
    public final byte a;
    public final fy0 b;

    public tx2(fy0 fy0Var, byte b) {
        this.a = b;
        this.b = fy0Var;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        fy0 fy0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                ((xx2) fy0Var).W1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((zy9) fy0Var).f2.addAll((List) obj2);
                return;
        }
    }

    public final BiConsumer andThen(BiConsumer biConsumer) {
        byte b = this.a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
