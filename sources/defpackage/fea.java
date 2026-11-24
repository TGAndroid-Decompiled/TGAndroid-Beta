package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class fea implements Runnable {
    public final byte a;
    public final gea b;
    public final String c;

    public fea(gea geaVar, String str, byte b) {
        this.a = b;
        this.b = geaVar;
        this.c = str;
    }

    @Override
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                gea geaVar = this.b;
                String str = this.c;
                geaVar.getClass();
                gl.d3(new fea(geaVar, str, (byte) 1));
                return;
            default:
                gea geaVar2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                geaVar2.f = null;
                if (!hc2.T(geaVar2.n) && geaVar2.s.g1 != null) {
                    arrayList = new ArrayList(geaVar2.s.g1.participants.participants);
                }
                geaVar2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new q3a(geaVar2, str2, arrayList, (byte) 7));
                } else {
                    geaVar2.r = 1;
                }
                zr9 zr9Var = geaVar2.e;
                if (hc2.T(geaVar2.n)) {
                    j = geaVar2.n.id;
                } else {
                    j = 0;
                }
                zr9Var.g(str2, false, false, true, false, j, false, 2, 1);
                return;
        }
    }
}
