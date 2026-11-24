package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f20 implements Runnable {
    public final byte a;
    public final h20 b;
    public final String c;

    public f20(h20 h20Var, String str, byte b) {
        this.a = b;
        this.b = h20Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                h20 h20Var = this.b;
                String str = this.c;
                h20Var.f = null;
                gl.c3(new f20(h20Var, str, (byte) 1));
                return;
            default:
                h20 h20Var2 = this.b;
                String str2 = this.c;
                h20Var2.getClass();
                Utilities.g.c(new g20(h20Var2, str2, new ArrayList(h20Var2.n.q2)));
                return;
        }
    }
}
