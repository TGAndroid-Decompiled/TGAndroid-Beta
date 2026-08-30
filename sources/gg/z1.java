package gg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
public final class z1 implements BiConsumer {
    public final int f6826a;
    public final sa f6827b;

    public z1(sa saVar, int i10) {
        this.f6826a = i10;
        this.f6827b = saVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f6826a) {
            case 0:
                String str = (String) obj;
                ((f2) this.f6827b).f6633h0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((gh.f) this.f6827b).Y.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f6826a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
