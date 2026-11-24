package defpackage;

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class sd implements Predicate {
    public final byte a;

    public sd(byte b) {
        this.a = b;
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
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                return !k27.c3(((k27) obj).k);
            case 1:
                return Objects.nonNull((TLObject) obj);
            case 2:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            case 3:
                if (((Integer) obj).intValue() == 0) {
                    return false;
                }
                return true;
            case 4:
                return ((File) obj).exists();
            case 5:
                return !((TL_stars.StarGift) obj).auction;
            case 6:
                if (((ApplicationExitInfo) obj).getReason() != 6) {
                    return false;
                }
                return true;
            default:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                if (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) {
                    z = true;
                } else {
                    z = false;
                }
                if (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    return false;
                }
                return true;
        }
    }
}
