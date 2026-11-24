package defpackage;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
public final class v20 implements Runnable {
    public final byte a;
    public final h30 b;
    public final f30 c;

    public v20(h30 h30Var, f30 f30Var, int i) {
        this.a = (byte) 4;
        this.b = h30Var;
        this.c = f30Var;
    }

    @Override
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                h30 h30Var = this.b;
                f30 f30Var = this.c;
                h30Var.g.U(f30Var.a, f30Var.b);
                return;
            case 1:
                h30 h30Var2 = this.b;
                f30 f30Var2 = this.c;
                tg2 tg2Var = h30Var2.g;
                long j = f30Var2.a;
                tg2Var.getClass();
                return;
            case 2:
                h30 h30Var3 = this.b;
                f30 f30Var3 = this.c;
                h30Var3.g.U(f30Var3.a, f30Var3.b);
                return;
            case 3:
                h30 h30Var4 = this.b;
                f30 f30Var4 = this.c;
                tg2 tg2Var2 = h30Var4.g;
                long j2 = f30Var4.a;
                tg2Var2.getClass();
                return;
            default:
                h30 h30Var5 = this.b;
                f30 f30Var5 = this.c;
                tg2 tg2Var3 = h30Var5.g;
                long j3 = f30Var5.a;
                synchronized (((u20) tg2Var3.c).f) {
                    file = (File) ((HashMap) ((u20) tg2Var3.c).g).remove(Long.valueOf(j3));
                }
                if (file != null) {
                    ((Handler) ((u20) tg2Var3.c).d).post(new t20(tg2Var3, j3, (ml6) tg2Var3.b, file, (byte) 0));
                    return;
                }
                return;
        }
    }

    public v20(h30 h30Var, f30 f30Var, long j, long j2, byte b) {
        this.a = b;
        this.b = h30Var;
        this.c = f30Var;
    }

    public v20(h30 h30Var, f30 f30Var, Exception exc) {
        this.a = (byte) 3;
        this.b = h30Var;
        this.c = f30Var;
    }
}
