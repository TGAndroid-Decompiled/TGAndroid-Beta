package hg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
public final class z1 implements BiConsumer {
    public final int f7686a;
    public final sa f7687b;

    public z1(sa saVar, int i10) {
        this.f7686a = i10;
        this.f7687b = saVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f7686a) {
            case 0:
                String str = (String) obj;
                ((f2) this.f7687b).f7477h0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((hh.f) this.f7687b).Y.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f7686a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
