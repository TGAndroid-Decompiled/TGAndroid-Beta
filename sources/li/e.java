package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.t1;
public final class e implements or {
    public final int f19942a;
    public final t1 f19943b;
    public final long f19944c;
    public final boolean d;
    public final fs f19945e;

    public e(fs fsVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.f19942a = i7;
        this.f19945e = fsVar;
        this.f19943b = t1Var;
        this.f19944c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f19942a) {
            case 0:
                g gVar = (g) this.f19945e;
                gVar.getClass();
                this.f19943b.dismiss();
                if (j3 != 0) {
                    gVar.f19957b = -j3;
                    gVar.f19958c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.f19944c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f19945e;
                d0Var.getClass();
                this.f19943b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(mp.u1(d0Var.f30170a).O0(Long.valueOf(j3)), this.f19944c, this.d);
                    return;
                }
                return;
        }
    }
}
