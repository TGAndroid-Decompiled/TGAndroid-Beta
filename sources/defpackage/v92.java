package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class v92 implements Runnable {
    public final byte a;
    public final w92 b;
    public final String c;

    public v92(w92 w92Var, String str, byte b) {
        this.a = b;
        this.b = w92Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                w92 w92Var = this.b;
                String str = this.c;
                w92Var.getClass();
                gl.c3(new v92(w92Var, str, (byte) 1));
                return;
            default:
                w92 w92Var2 = this.b;
                String str2 = this.c;
                w92Var2.f = null;
                Utilities.g.c(new jn1(w92Var2, str2, new ArrayList(w92Var2.h.w), (byte) 14));
                return;
        }
    }
}
