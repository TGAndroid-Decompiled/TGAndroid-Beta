package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class t94 implements Runnable {
    public final byte a;
    public final ba4 b;
    public final String c;

    public t94(ba4 ba4Var, String str, byte b) {
        this.a = b;
        this.b = ba4Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ba4 ba4Var = this.b;
                l94 l94Var = (l94) ba4Var.w.remove(this.c);
                if (l94Var != null && ((ArrayList) l94Var.e1.d).remove(l94Var)) {
                    Utilities.d.c(new b94(l94Var, (byte) 7));
                    return;
                }
                return;
            default:
                ba4 ba4Var2 = this.b;
                l94 l94Var2 = (l94) ba4Var2.w.remove(this.c);
                if (l94Var2 != null && ((ArrayList) l94Var2.e1.d).remove(l94Var2)) {
                    Utilities.d.c(new b94(l94Var2, (byte) 7));
                    return;
                }
                return;
        }
    }
}
