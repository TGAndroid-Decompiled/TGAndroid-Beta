package defpackage;

import java.io.File;
import org.telegram.messenger.ShortcutResultReceiver;
import org.telegram.ui.LaunchActivity;
public final class jn0 implements Runnable {
    public final byte a;
    public final pcc b;

    public jn0(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(null);
                return;
            case 1:
                pccVar.a(null);
                return;
            case 2:
                hl.c3(new jn0(pccVar, (byte) 1));
                return;
            case 3:
                z61.i0 = false;
                long m0 = z61.m0(xb4.j(4), 5);
                long m02 = z61.m0(xb4.j(4), 4);
                long m03 = z61.m0(xb4.j(100), 0) + z61.m0(xb4.j(0), 0);
                long m04 = z61.m0(xb4.j(101), 0) + z61.m0(xb4.j(2), 0);
                long m05 = z61.m0(xb4.j(5), 1) + z61.m0(xb4.j(3), 1);
                long m06 = z61.m0(xb4.j(3), 2);
                long m07 = z61.m0(xb4.j(4), 3) + z61.m0(new File(xb4.j(4), "acache"), 0);
                long m08 = z61.m0(xb4.j(1), 0);
                long m09 = z61.m0(xb4.j(6), 0);
                long m010 = z61.m0(hl.O0(), 1);
                boolean z = f11.a;
                long m011 = m0 + m02 + m04 + m08 + m03 + m05 + z61.m0(xb4.j(5), 2) + m06 + m07 + m09 + m010;
                z61.k0 = Long.valueOf(m011);
                z61.j0 = System.currentTimeMillis();
                if (!z61.i0) {
                    hl.c3(new ve(pccVar, m011, (byte) 1));
                    return;
                }
                return;
            case 4:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 5:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 6:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 7:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 8:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 9:
                pccVar.a(null);
                return;
            case 10:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 11:
                if (pccVar != null) {
                    pccVar.a(null);
                    return;
                }
                return;
            case 12:
                pccVar.a(new nza());
                return;
            case 13:
                int i = ShortcutResultReceiver.a;
                pccVar.a(Boolean.TRUE);
                return;
            case 14:
                pccVar.a(LaunchActivity.S());
                return;
            case 15:
                pccVar.a("Wallet engine is closed");
                return;
            case 16:
                pccVar.a(null);
                return;
            default:
                pccVar.a(null);
                return;
        }
    }
}
