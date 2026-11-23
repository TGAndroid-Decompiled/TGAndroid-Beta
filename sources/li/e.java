package li;

import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.ui.ActionBar.t1;
public final class e implements pr {
    public final int f19945a;
    public final t1 f19946b;
    public final long f19947c;
    public final boolean d;
    public final gs f19948e;

    public e(gs gsVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.f19945a = i7;
        this.f19948e = gsVar;
        this.f19946b = t1Var;
        this.f19947c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f19945a) {
            case 0:
                g gVar = (g) this.f19948e;
                gVar.getClass();
                this.f19946b.dismiss();
                if (j3 != 0) {
                    gVar.f19960b = -j3;
                    gVar.f19961c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.f19947c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f19948e;
                d0Var.getClass();
                this.f19946b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(np.u1(d0Var.f30173a).O0(Long.valueOf(j3)), this.f19947c, this.d);
                    return;
                }
                return;
        }
    }
}
