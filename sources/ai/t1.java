package ai;

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.function.Predicate;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class t1 implements Predicate {
    public final int f977a;

    public t1(int i3) {
        this.f977a = i3;
    }

    public Predicate and(Predicate predicate) {
        int i3 = this.f977a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f977a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i3 = this.f977a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f977a) {
            case 0:
                return !((TL_stars.StarGift) obj).auction;
            case 1:
                return ((File) obj).exists();
            case 2:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            case 3:
                return !zi.d3(((zi) obj).f26868k);
            case 4:
                return Objects.nonNull((TLObject) obj);
            case 5:
                if (((Integer) obj).intValue() != 0) {
                    return true;
                }
                return false;
            case 6:
                if (((ApplicationExitInfo) obj).getReason() == 6) {
                    return true;
                }
                return false;
            default:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                if (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    return false;
                }
                return true;
        }
    }
}
