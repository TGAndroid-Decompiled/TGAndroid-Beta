package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class fga implements Runnable {
    public final byte a;
    public final gga b;
    public final String c;

    public fga(gga ggaVar, String str, byte b) {
        this.a = b;
        this.b = ggaVar;
        this.c = str;
    }

    @Override
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                gga ggaVar = this.b;
                String str = this.c;
                ggaVar.getClass();
                gm.c3(new fga(ggaVar, str, (byte) 1));
                return;
            default:
                gga ggaVar2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ggaVar2.f = null;
                if (!sd2.T(ggaVar2.n) && ggaVar2.s.g1 != null) {
                    arrayList = new ArrayList(ggaVar2.s.g1.participants.participants);
                }
                ggaVar2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new hw9(ggaVar2, str2, arrayList, (byte) 10));
                } else {
                    ggaVar2.r = 1;
                }
                bu9 bu9Var = ggaVar2.e;
                if (sd2.T(ggaVar2.n)) {
                    j = ggaVar2.n.id;
                } else {
                    j = 0;
                }
                bu9Var.g(str2, false, false, true, false, j, false, 2, 1);
                return;
        }
    }
}
