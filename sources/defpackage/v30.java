package defpackage;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
public final class v30 implements Runnable {
    public final byte a;
    public final h40 b;
    public final f40 c;

    public v30(h40 h40Var, f40 f40Var, int i) {
        this.a = (byte) 4;
        this.b = h40Var;
        this.c = f40Var;
    }

    @Override
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                h40 h40Var = this.b;
                f40 f40Var = this.c;
                h40Var.g.G(f40Var.a, f40Var.b);
                return;
            case 1:
                h40 h40Var2 = this.b;
                f40 f40Var2 = this.c;
                lx6 lx6Var = h40Var2.g;
                long j = f40Var2.a;
                lx6Var.getClass();
                return;
            case 2:
                h40 h40Var3 = this.b;
                f40 f40Var3 = this.c;
                h40Var3.g.G(f40Var3.a, f40Var3.b);
                return;
            case 3:
                h40 h40Var4 = this.b;
                f40 f40Var4 = this.c;
                lx6 lx6Var2 = h40Var4.g;
                long j2 = f40Var4.a;
                lx6Var2.getClass();
                return;
            default:
                h40 h40Var5 = this.b;
                f40 f40Var5 = this.c;
                lx6 lx6Var3 = h40Var5.g;
                long j3 = f40Var5.a;
                synchronized (((u30) lx6Var3.c).f) {
                    file = (File) ((HashMap) ((u30) lx6Var3.c).g).remove(Long.valueOf(j3));
                }
                if (file != null) {
                    ((Handler) ((u30) lx6Var3.c).d).post(new t30(lx6Var3, j3, (on6) lx6Var3.b, file, (byte) 0));
                    return;
                }
                return;
        }
    }

    public v30(h40 h40Var, f40 f40Var, long j, long j2, byte b) {
        this.a = b;
        this.b = h40Var;
        this.c = f40Var;
    }

    public v30(h40 h40Var, f40 f40Var, Exception exc) {
        this.a = (byte) 3;
        this.b = h40Var;
        this.c = f40Var;
    }
}
