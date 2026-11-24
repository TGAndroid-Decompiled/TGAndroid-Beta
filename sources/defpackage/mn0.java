package defpackage;

import java.io.File;
import org.telegram.messenger.ShortcutResultReceiver;
import org.telegram.ui.LaunchActivity;
public final class mn0 implements Runnable {
    public final byte a;
    public final p8c b;

    public mn0(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new mn0(p8cVar, (byte) 2));
                return;
            case 1:
                p8cVar.a(null);
                return;
            case 2:
                p8cVar.a(null);
                return;
            case 3:
                r61.i0 = false;
                long m0 = r61.m0(ba4.j(4), 5);
                long m02 = r61.m0(ba4.j(4), 4);
                long m03 = r61.m0(ba4.j(100), 0) + r61.m0(ba4.j(0), 0);
                long m04 = r61.m0(ba4.j(101), 0) + r61.m0(ba4.j(2), 0);
                long m05 = r61.m0(ba4.j(5), 1) + r61.m0(ba4.j(3), 1);
                long m06 = r61.m0(ba4.j(5), 2) + r61.m0(ba4.j(3), 2);
                long m07 = r61.m0(ba4.j(4), 3) + r61.m0(new File(ba4.j(4), "acache"), 0);
                long m08 = r61.m0(ba4.j(1), 0);
                long m09 = r61.m0(ba4.j(6), 0);
                long m010 = r61.m0(gl.O0(), 1);
                boolean z = w01.a;
                long j = m0 + m02 + m04 + m08 + m03 + m05 + m06 + m07 + m09 + m010;
                r61.k0 = Long.valueOf(j);
                r61.j0 = System.currentTimeMillis();
                if (!r61.i0) {
                    gl.c3(new lf(p8cVar, j, (byte) 1));
                    return;
                }
                return;
            case 4:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 5:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 6:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 7:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 8:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 9:
                p8cVar.a(null);
                return;
            case 10:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 11:
                if (p8cVar != null) {
                    p8cVar.a(null);
                    return;
                }
                return;
            case 12:
                int i = ShortcutResultReceiver.a;
                p8cVar.a(Boolean.TRUE);
                return;
            case 13:
                p8cVar.a(LaunchActivity.S());
                return;
            case 14:
                p8cVar.a("Wallet engine is closed");
                return;
            case 15:
                p8cVar.a(null);
                return;
            default:
                p8cVar.a(null);
                return;
        }
    }
}
