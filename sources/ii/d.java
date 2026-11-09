package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.u1;
public final class d implements tr {
    public final int f15499a;
    public final u1 f15500b;
    public final long f15501c;
    public final boolean d;
    public final ls f15502e;

    public d(ls lsVar, u1 u1Var, long j3, boolean z9, int i7) {
        this.f15499a = i7;
        this.f15502e = lsVar;
        this.f15500b = u1Var;
        this.f15501c = j3;
        this.d = z9;
    }

    @Override
    public final void run(long j3) {
        switch (this.f15499a) {
            case 0:
                f fVar = (f) this.f15502e;
                fVar.getClass();
                this.f15500b.dismiss();
                if (j3 != 0) {
                    fVar.f15526b = -j3;
                    fVar.f15527c = fVar.getMessagesController().M0(Long.valueOf(j3));
                    fVar.b0(this.f15501c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f15502e;
                d0Var.getClass();
                this.f15500b.dismiss();
                if (j3 != 0) {
                    d0Var.K0(qp.s1(d0Var.f28621a).M0(Long.valueOf(j3)), this.f15501c, this.d);
                    return;
                }
                return;
        }
    }
}
