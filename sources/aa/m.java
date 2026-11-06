package aa;

import android.app.ApplicationExitInfo;
import android.system.OsConstants;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.function.Predicate;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class m implements Predicate {
    public final int f823a;

    public m(int i7) {
        this.f823a = i7;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f823a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f823a) {
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
        int i7 = this.f823a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean z9;
        boolean z10;
        switch (this.f823a) {
            case 0:
                if (((Integer) obj).intValue() != 0) {
                    return true;
                }
                return false;
            case 1:
                if (((ApplicationExitInfo) obj).getReason() == 6) {
                    return true;
                }
                return false;
            case 2:
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                if (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z9 && !z10) {
                    return false;
                }
                return true;
            case 3:
                return ((File) obj).exists();
            case 4:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            case 5:
                return !ij.d3(((ij) obj).f23237k);
            case 6:
                return Objects.nonNull((TLObject) obj);
            default:
                return !((TL_stars.StarGift) obj).auction;
        }
    }
}
