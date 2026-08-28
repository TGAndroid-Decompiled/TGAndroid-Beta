package bg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;
public final class j2 implements BiConsumer {
    public final int f1850a;
    public final sa f1851b;

    public j2(sa saVar, int i9) {
        this.f1850a = i9;
        this.f1851b = saVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f1850a) {
            case 0:
                String str = (String) obj;
                ((q2) this.f1851b).f1929g0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((bh.j) this.f1851b).X.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i9 = this.f1850a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
