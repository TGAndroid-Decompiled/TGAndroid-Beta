package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.ui.ActionBar.t1;
public final class d implements or {
    public final int f20008a;
    public final t1 f20009b;
    public final long f20010c;
    public final boolean d;
    public final fs f20011e;

    public d(fs fsVar, t1 t1Var, long j3, boolean z10, int i7) {
        this.f20008a = i7;
        this.f20011e = fsVar;
        this.f20009b = t1Var;
        this.f20010c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f20008a) {
            case 0:
                f fVar = (f) this.f20011e;
                fVar.getClass();
                this.f20009b.dismiss();
                if (j3 != 0) {
                    fVar.f20023b = -j3;
                    fVar.f20024c = fVar.getMessagesController().O0(Long.valueOf(j3));
                    fVar.b0(this.f20010c, this.d);
                    return;
                }
                return;
            default:
                c0 c0Var = (c0) this.f20011e;
                c0Var.getClass();
                this.f20009b.dismiss();
                if (j3 != 0) {
                    c0Var.L0(mp.u1(c0Var.f30223a).O0(Long.valueOf(j3)), this.f20010c, this.d);
                    return;
                }
                return;
        }
    }
}
