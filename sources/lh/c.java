package lh;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import mg.v1;
import org.telegram.ui.Components.ha;
public final class c implements BiConsumer {
    public final int f12007a;
    public final ha f12008b;

    public c(ha haVar, int i10) {
        this.f12007a = i10;
        this.f12008b = haVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f12007a) {
            case 0:
                String str = (String) obj;
                ((g) this.f12008b).T1.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((v1) this.f12008b).f13250c2.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f12007a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
