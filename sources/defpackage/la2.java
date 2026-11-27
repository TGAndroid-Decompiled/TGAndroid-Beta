package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class la2 implements Runnable {
    public final byte a;
    public final ma2 b;
    public final String c;

    public la2(ma2 ma2Var, String str, byte b) {
        this.a = b;
        this.b = ma2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ma2 ma2Var = this.b;
                String str = this.c;
                ma2Var.getClass();
                hl.c3(new la2(ma2Var, str, (byte) 1));
                return;
            default:
                ma2 ma2Var2 = this.b;
                String str2 = this.c;
                ma2Var2.f = null;
                Utilities.g.c(new on1(ma2Var2, str2, new ArrayList(ma2Var2.h.w), (byte) 18));
                return;
        }
    }
}
