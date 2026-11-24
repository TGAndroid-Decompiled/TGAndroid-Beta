package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class vo7 implements Runnable {
    public final byte a;
    public final wo7 b;
    public final String c;

    public vo7(wo7 wo7Var, String str, byte b) {
        this.a = b;
        this.b = wo7Var;
        this.c = str;
    }

    @Override
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                wo7 wo7Var = this.b;
                String str = this.c;
                wo7Var.getClass();
                gm.c3(new vo7(wo7Var, str, (byte) 1));
                return;
            default:
                wo7 wo7Var2 = this.b;
                String str2 = this.c;
                bu9 bu9Var = wo7Var2.h;
                int i = wo7Var2.n.s;
                bu9Var.g(str2, true, (i == 1 || i == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.g.c(new ud7(wo7Var2, str2, new ArrayList(wo7Var2.n.x), (byte) 7));
                return;
        }
    }
}
