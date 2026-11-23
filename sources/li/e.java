package li;

import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.ui.ActionBar.t1;
public final class e implements pr {
    public final int f19911a;
    public final t1 f19912b;
    public final long f19913c;
    public final boolean d;
    public final gs f19914e;

    public e(gs gsVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.f19911a = i7;
        this.f19914e = gsVar;
        this.f19912b = t1Var;
        this.f19913c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f19911a) {
            case 0:
                g gVar = (g) this.f19914e;
                gVar.getClass();
                this.f19912b.dismiss();
                if (j3 != 0) {
                    gVar.f19926b = -j3;
                    gVar.f19927c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.f19913c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f19914e;
                d0Var.getClass();
                this.f19912b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(np.u1(d0Var.f30139a).O0(Long.valueOf(j3)), this.f19913c, this.d);
                    return;
                }
                return;
        }
    }
}
