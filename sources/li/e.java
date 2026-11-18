package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.u1;
public final class e implements or {
    public final int f19917a;
    public final u1 f19918b;
    public final long f19919c;
    public final boolean d;
    public final fs f19920e;

    public e(fs fsVar, u1 u1Var, long j3, boolean z10, int i7) {
        this.f19917a = i7;
        this.f19920e = fsVar;
        this.f19918b = u1Var;
        this.f19919c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f19917a) {
            case 0:
                g gVar = (g) this.f19920e;
                gVar.getClass();
                this.f19918b.dismiss();
                if (j3 != 0) {
                    gVar.f19932b = -j3;
                    gVar.f19933c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.f19919c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f19920e;
                d0Var.getClass();
                this.f19918b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(mp.u1(d0Var.f30189a).O0(Long.valueOf(j3)), this.f19919c, this.d);
                    return;
                }
                return;
        }
    }
}
