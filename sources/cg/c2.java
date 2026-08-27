package cg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.qa;

public final class c2 implements BiConsumer {

    public final int f2624a;

    public final qa f2625b;

    public c2(qa qaVar, int i10) {
        this.f2624a = i10;
        this.f2625b = qaVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f2624a) {
            case 0:
                ((i2) this.f2625b).f2715g0.addAll((List) obj2);
                break;
            default:
                ((ch.h) this.f2625b).X.addAll((List) obj2);
                break;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f2624a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
