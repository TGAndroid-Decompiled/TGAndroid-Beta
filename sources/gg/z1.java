package gg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
public final class z1 implements BiConsumer {
    public final int f6813a;
    public final sa f6814b;

    public z1(sa saVar, int i10) {
        this.f6813a = i10;
        this.f6814b = saVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f6813a) {
            case 0:
                String str = (String) obj;
                ((f2) this.f6814b).f6620h0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((gh.f) this.f6814b).Y.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f6813a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
