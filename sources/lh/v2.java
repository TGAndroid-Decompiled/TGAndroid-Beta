package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
public final class v2 implements Runnable {
    public final int f13238a;
    public final g5 f13239b;
    public final String f13240c;

    public v2(g5 g5Var, String str, int i10) {
        this.f13238a = i10;
        this.f13239b = g5Var;
        this.f13240c = str;
    }

    @Override
    public final void run() {
        switch (this.f13238a) {
            case 0:
                g5.i1(this.f13239b, this.f13240c);
                return;
            case 1:
                g5.h1(this.f13239b, this.f13240c);
                return;
            case 2:
                g5.t0(this.f13239b, this.f13240c);
                return;
            case 3:
                g5.Q0(this.f13239b, this.f13240c);
                return;
            case 4:
                g5.C0(this.f13239b, this.f13240c);
                return;
            case 5:
                g5.Q(this.f13239b, this.f13240c);
                return;
            case 6:
                g5.w0(this.f13239b, this.f13240c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f13240c);
                ic k10 = this.f13239b.getBulletinFactory().k(false);
                k10.f25682t = true;
                k10.j();
                return;
            default:
                g5.o0(this.f13239b, this.f13240c);
                return;
        }
    }
}
