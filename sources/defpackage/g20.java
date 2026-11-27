package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class g20 implements Runnable {
    public final byte a;
    public final i20 b;
    public final String c;

    public g20(i20 i20Var, String str, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                i20 i20Var = this.b;
                String str = this.c;
                i20Var.f = null;
                hl.c3(new g20(i20Var, str, (byte) 1));
                return;
            default:
                i20 i20Var2 = this.b;
                String str2 = this.c;
                i20Var2.getClass();
                Utilities.g.c(new h20(i20Var2, str2, new ArrayList(i20Var2.n.q2)));
                return;
        }
    }
}
