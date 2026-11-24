package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rm7 implements Runnable {
    public final byte a;
    public final sm7 b;
    public final String c;

    public rm7(sm7 sm7Var, String str, byte b) {
        this.a = b;
        this.b = sm7Var;
        this.c = str;
    }

    @Override
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                sm7 sm7Var = this.b;
                String str = this.c;
                sm7Var.getClass();
                gl.d3(new rm7(sm7Var, str, (byte) 1));
                return;
            default:
                sm7 sm7Var2 = this.b;
                String str2 = this.c;
                zr9 zr9Var = sm7Var2.h;
                int i = sm7Var2.n.s;
                zr9Var.g(str2, true, (i == 1 || i == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.g.c(new pc7(sm7Var2, str2, new ArrayList(sm7Var2.n.x)));
                return;
        }
    }
}
