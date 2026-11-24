package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f30 implements Runnable {
    public final byte a;
    public final h30 b;
    public final String c;

    public f30(h30 h30Var, String str, byte b) {
        this.a = b;
        this.b = h30Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                h30 h30Var = this.b;
                String str = this.c;
                h30Var.f = null;
                gm.c3(new f30(h30Var, str, (byte) 1));
                return;
            default:
                h30 h30Var2 = this.b;
                String str2 = this.c;
                h30Var2.getClass();
                Utilities.g.c(new g30(h30Var2, str2, new ArrayList(h30Var2.n.q2)));
                return;
        }
    }
}
