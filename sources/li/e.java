package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.u1;
public final class e implements or {
    public final int f19914a;
    public final u1 f19915b;
    public final long f19916c;
    public final boolean d;
    public final fs f19917e;

    public e(fs fsVar, u1 u1Var, long j3, boolean z10, int i7) {
        this.f19914a = i7;
        this.f19917e = fsVar;
        this.f19915b = u1Var;
        this.f19916c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f19914a) {
            case 0:
                g gVar = (g) this.f19917e;
                gVar.getClass();
                this.f19915b.dismiss();
                if (j3 != 0) {
                    gVar.f19929b = -j3;
                    gVar.f19930c = gVar.getMessagesController().O0(Long.valueOf(j3));
                    gVar.b0(this.f19916c, this.d);
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f19917e;
                d0Var.getClass();
                this.f19915b.dismiss();
                if (j3 != 0) {
                    d0Var.L0(mp.u1(d0Var.f30187a).O0(Long.valueOf(j3)), this.f19916c, this.d);
                    return;
                }
                return;
        }
    }
}
