package defpackage;

import android.location.Location;
import org.telegram.messenger.Utilities;
public final class bd6 implements pt2 {
    public final byte a;
    public final id6 b;

    public bd6(id6 id6Var, byte b) {
        this.a = b;
        this.b = id6Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                id6Var.m((Location) obj);
                return;
            default:
                Integer num = (Integer) obj;
                id6Var.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new zc6(id6Var, (byte) 3));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new cd6(id6Var, num, (byte) 0));
                    return;
                }
                Utilities.d.c(new xac((byte) 25, id6Var, true));
                return;
        }
    }
}
