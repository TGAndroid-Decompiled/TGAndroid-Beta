package li;

import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.qr;
import org.telegram.ui.ActionBar.t1;
public final class c implements qr {
    public final int f19531a;
    public final t1 f19532b;
    public final long f19533c;
    public final boolean d;
    public final is f19534e;

    public c(is isVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.f19531a = i7;
        this.f19534e = isVar;
        this.f19532b = t1Var;
        this.f19533c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f19531a) {
            case 0:
                e eVar = (e) this.f19534e;
                eVar.getClass();
                this.f19532b.dismiss();
                if (j3 != 0) {
                    eVar.f19554b = -j3;
                    eVar.f19555c = eVar.getMessagesController().M0(Long.valueOf(j3));
                    eVar.b0(this.f19533c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f19534e;
                d0Var.getClass();
                this.f19532b.dismiss();
                if (j3 != 0) {
                    d0Var.K0(np.s1(d0Var.f29679a).M0(Long.valueOf(j3)), this.f19533c, this.d);
                    return;
                }
                return;
        }
    }
}
