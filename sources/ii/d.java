package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.u1;
public final class d implements tr {
    public final int f15496a;
    public final u1 f15497b;
    public final long f15498c;
    public final boolean d;
    public final ls f15499e;

    public d(ls lsVar, u1 u1Var, long j3, boolean z9, int i7) {
        this.f15496a = i7;
        this.f15499e = lsVar;
        this.f15497b = u1Var;
        this.f15498c = j3;
        this.d = z9;
    }

    @Override
    public final void run(long j3) {
        switch (this.f15496a) {
            case 0:
                f fVar = (f) this.f15499e;
                fVar.getClass();
                this.f15497b.dismiss();
                if (j3 != 0) {
                    fVar.f15523b = -j3;
                    fVar.f15524c = fVar.getMessagesController().M0(Long.valueOf(j3));
                    fVar.b0(this.f15498c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f15499e;
                d0Var.getClass();
                this.f15497b.dismiss();
                if (j3 != 0) {
                    d0Var.K0(qp.s1(d0Var.f28613a).M0(Long.valueOf(j3)), this.f15498c, this.d);
                    return;
                }
                return;
        }
    }
}
