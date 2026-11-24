package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class gb2 implements Runnable {
    public final byte a;
    public final hb2 b;
    public final String c;

    public gb2(hb2 hb2Var, String str, byte b) {
        this.a = b;
        this.b = hb2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hb2 hb2Var = this.b;
                String str = this.c;
                hb2Var.getClass();
                gm.c3(new gb2(hb2Var, str, (byte) 1));
                return;
            default:
                hb2 hb2Var2 = this.b;
                String str2 = this.c;
                hb2Var2.f = null;
                Utilities.g.c(new co1((byte) 16, hb2Var2, new ArrayList(hb2Var2.h.w), str2));
                return;
        }
    }
}
