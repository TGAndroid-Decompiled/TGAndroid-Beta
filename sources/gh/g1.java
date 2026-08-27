package gh;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

public final class g1 implements Predicate {

    public final int f7261a;

    public g1(int i10) {
        this.f7261a = i10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f7261a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f7261a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f7261a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f7261a) {
            case 0:
                return !((TL_stars.StarGift) obj).auction;
            case 1:
                return ((String) obj) != null;
            case 2:
                return !((MessageObject) obj).isEphemeral();
            default:
                return Objects.nonNull((TLObject) obj);
        }
    }
}
