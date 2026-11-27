package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rp7 implements Runnable {
    public final byte a;
    public final sp7 b;
    public final String c;

    public rp7(sp7 sp7Var, String str, byte b) {
        this.a = b;
        this.b = sp7Var;
        this.c = str;
    }

    @Override
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                sp7 sp7Var = this.b;
                String str = this.c;
                sp7Var.getClass();
                hl.c3(new rp7(sp7Var, str, (byte) 1));
                return;
            default:
                sp7 sp7Var2 = this.b;
                String str2 = this.c;
                sv9 sv9Var = sp7Var2.h;
                int i = sp7Var2.n.s;
                sv9Var.g(str2, true, (i == 1 || i == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.g.c(new gd7((Object) sp7Var2, (Object) str2, new ArrayList(sp7Var2.n.x), (byte) 12));
                return;
        }
    }
}
