package eg;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.xa;
public final class a2 implements BiConsumer {
    public final int f5919a;
    public final xa f5920b;

    public a2(xa xaVar, int i10) {
        this.f5919a = i10;
        this.f5920b = xaVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.f5919a) {
            case 0:
                String str = (String) obj;
                ((g2) this.f5920b).f6009g0.addAll((List) obj2);
                return;
            default:
                String str2 = (String) obj;
                ((eh.f) this.f5920b).X.addAll((List) obj2);
                return;
        }
    }

    public BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f5919a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
