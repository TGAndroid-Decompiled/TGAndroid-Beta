package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class tb4 implements Runnable {
    public final byte a;
    public final bc4 b;
    public final String c;

    public tb4(bc4 bc4Var, String str, byte b) {
        this.a = b;
        this.b = bc4Var;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                bc4 bc4Var = this.b;
                lb4 lb4Var = (lb4) bc4Var.w.remove(this.c);
                if (lb4Var != null && ((ArrayList) lb4Var.e1.d).remove(lb4Var)) {
                    Utilities.d.c(new bb4(lb4Var, (byte) 7));
                    return;
                }
                return;
            default:
                bc4 bc4Var2 = this.b;
                lb4 lb4Var2 = (lb4) bc4Var2.w.remove(this.c);
                if (lb4Var2 != null && ((ArrayList) lb4Var2.e1.d).remove(lb4Var2)) {
                    Utilities.d.c(new bb4(lb4Var2, (byte) 7));
                    return;
                }
                return;
        }
    }
}
