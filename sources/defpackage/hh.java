package defpackage;

import android.view.View;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements Predicate {
    public final byte a;
    public final long b;

    public hh(byte b, long j) {
        this.a = b;
        this.b = j;
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
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).id != j) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ xc2.N((TLRPC.Chat) tLObject);
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).id == j) {
                    return true;
                }
                return false;
            case 2:
                if (((TLRPC.User) obj).id == j) {
                    return true;
                }
                return false;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (!((View) entry.getKey()).isAttachedToWindow() || !((View) entry.getKey()).isShown() || ((View) entry.getKey()).getWindowVisibility() != 0 || j - ((Long) entry.getValue()).longValue() > 300) {
                    return true;
                }
                return false;
        }
    }
}
