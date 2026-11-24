package defpackage;

import android.location.Location;
import org.telegram.messenger.Utilities;
public final class xc6 implements gu2 {
    public final byte a;
    public final dd6 b;

    public xc6(dd6 dd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                dd6Var.m((Location) obj);
                return;
            default:
                Integer num = (Integer) obj;
                dd6Var.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new uc6(dd6Var, (byte) 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new yc6(dd6Var, num, (byte) 0));
                    return;
                }
                Utilities.d.c(new y8c((byte) 25, dd6Var, true));
                return;
        }
    }
}
