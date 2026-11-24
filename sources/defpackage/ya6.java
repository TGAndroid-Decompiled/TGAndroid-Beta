package defpackage;

import android.location.Location;
import org.telegram.messenger.Utilities;
public final class ya6 implements vs2 {
    public final byte a;
    public final eb6 b;

    public ya6(eb6 eb6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                eb6Var.m((Location) obj);
                return;
            default:
                Integer num = (Integer) obj;
                eb6Var.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new va6(eb6Var, (byte) 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new za6(eb6Var, num, (byte) 0));
                    return;
                }
                Utilities.d.c(new x6c((byte) 25, eb6Var, true));
                return;
        }
    }
}
