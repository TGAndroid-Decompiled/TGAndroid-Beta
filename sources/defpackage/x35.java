package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class x35 implements Predicate {
    public final byte a;
    public final TL_wallet.tonConnectSession b;

    public x35(TL_wallet.tonConnectSession tonconnectsession, byte b) {
        this.a = b;
        this.b = tonconnectsession;
    }

    public final Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        byte b = this.a;
        return Predicate$CC.$default$negate(this);
    }

    public final Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.a) {
            case 0:
                if (tonconnectsession.id == this.b.id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.id == this.b.id) {
                    return true;
                }
                return false;
        }
    }
}
