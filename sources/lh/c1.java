package lh;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class c1 implements Predicate {
    public final int f12642a;

    public c1(int i10) {
        this.f12642a = i10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f12642a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f12642a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f12642a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f12642a) {
            case 0:
                return !((TL_stars.StarGift) obj).auction;
            case 1:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            case 2:
                return !((MessageObject) obj).isEphemeral();
            default:
                return Objects.nonNull((TLObject) obj);
        }
    }
}
