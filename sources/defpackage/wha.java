package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class wha implements Runnable {
    public final byte a;
    public final xha b;
    public final String c;

    public wha(xha xhaVar, String str, byte b) {
        this.a = b;
        this.b = xhaVar;
        this.c = str;
    }

    @Override
    public final void run() {
        long j;
        switch (this.a) {
            case 0:
                xha xhaVar = this.b;
                String str = this.c;
                xhaVar.getClass();
                hl.c3(new wha(xhaVar, str, (byte) 1));
                return;
            default:
                xha xhaVar2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                xhaVar2.f = null;
                if (!xc2.T(xhaVar2.n) && xhaVar2.s.g1 != null) {
                    arrayList = new ArrayList(xhaVar2.s.g1.participants.participants);
                }
                xhaVar2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new jr9(xhaVar2, str2, arrayList, (byte) 16));
                } else {
                    xhaVar2.r = 1;
                }
                sv9 sv9Var = xhaVar2.e;
                if (xc2.T(xhaVar2.n)) {
                    j = xhaVar2.n.id;
                } else {
                    j = 0;
                }
                sv9Var.g(str2, false, false, true, false, j, false, 2, 1);
                return;
        }
    }
}
