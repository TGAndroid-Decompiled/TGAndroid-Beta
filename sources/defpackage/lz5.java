package defpackage;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
public final class lz5 implements Predicate {
    public final byte a;
    public final String b;

    public lz5(String str, byte b) {
        this.a = b;
        this.b = str;
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
        String str = this.b;
        String str2 = (String) obj;
        switch (b) {
            case 0:
                if (str2 == null || !str2.equals(str)) {
                    return false;
                }
                return true;
            case 1:
                return PhoneNumberUtils.compare(str, str2);
            default:
                if (str2 == null || !str2.equals(str)) {
                    return false;
                }
                return true;
        }
    }
}
