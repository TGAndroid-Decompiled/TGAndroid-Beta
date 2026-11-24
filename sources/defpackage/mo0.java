package defpackage;

import java.io.File;
import org.telegram.messenger.ShortcutResultReceiver;
import org.telegram.ui.LaunchActivity;
public final class mo0 implements Runnable {
    public final byte a;
    public final qac b;

    public mo0(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new mo0(qacVar, (byte) 2));
                return;
            case 1:
                qacVar.a(null);
                return;
            case 2:
                qacVar.a(null);
                return;
            case 3:
                y71.i0 = false;
                long n0 = y71.n0(bc4.j(4), 5);
                long n02 = y71.n0(bc4.j(4), 4);
                long n03 = y71.n0(bc4.j(100), 0) + y71.n0(bc4.j(0), 0);
                long n04 = y71.n0(bc4.j(101), 0) + y71.n0(bc4.j(2), 0);
                long n05 = y71.n0(bc4.j(5), 1) + y71.n0(bc4.j(3), 1);
                long n06 = y71.n0(bc4.j(5), 2) + y71.n0(bc4.j(3), 2);
                long n07 = y71.n0(bc4.j(4), 3) + y71.n0(new File(bc4.j(4), "acache"), 0);
                long n08 = y71.n0(bc4.j(1), 0);
                long n09 = y71.n0(bc4.j(6), 0);
                long n010 = y71.n0(gm.O0(), 1);
                boolean z = e21.a;
                long j = n0 + n02 + n04 + n08 + n03 + n05 + n06 + n07 + n09 + n010;
                y71.k0 = Long.valueOf(j);
                y71.j0 = System.currentTimeMillis();
                if (!y71.i0) {
                    gm.c3(new lg(qacVar, j, (byte) 1));
                    return;
                }
                return;
            case 4:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 5:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 6:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 7:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 8:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 9:
                qacVar.a(null);
                return;
            case 10:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 11:
                if (qacVar != null) {
                    qacVar.a(null);
                    return;
                }
                return;
            case 12:
                int i = ShortcutResultReceiver.a;
                qacVar.a(Boolean.TRUE);
                return;
            case 13:
                qacVar.a(LaunchActivity.S());
                return;
            case 14:
                qacVar.a("Wallet engine is closed");
                return;
            case 15:
                qacVar.a(null);
                return;
            default:
                qacVar.a(null);
                return;
        }
    }
}
