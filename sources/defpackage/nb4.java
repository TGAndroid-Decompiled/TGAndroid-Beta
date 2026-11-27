package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class nb4 implements Runnable {
    public final byte a;
    public final xb4 b;
    public final String c;

    public nb4(xb4 xb4Var, String str, byte b) {
        this.a = b;
        this.b = xb4Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                xb4 xb4Var = this.b;
                hb4 hb4Var = (hb4) xb4Var.w.remove(this.c);
                if (hb4Var != null && ((ArrayList) hb4Var.e1.d).remove(hb4Var)) {
                    Utilities.d.c(new xa4(hb4Var, (byte) 7));
                    return;
                }
                return;
            default:
                xb4 xb4Var2 = this.b;
                hb4 hb4Var2 = (hb4) xb4Var2.w.remove(this.c);
                if (hb4Var2 != null && ((ArrayList) hb4Var2.e1.d).remove(hb4Var2)) {
                    Utilities.d.c(new xa4(hb4Var2, (byte) 7));
                    return;
                }
                return;
        }
    }
}
