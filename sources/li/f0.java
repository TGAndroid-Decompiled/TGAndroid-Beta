package li;

import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.yw;
public final class f0 implements qr, nr {
    public final int f19566a;
    public final long f19567b;
    public final boolean f19568c;
    public final is d;
    public final Object f19569e;

    public f0(t1 t1Var, e2 e2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.f19569e = e2Var;
        this.f19566a = i7;
        this.f19567b = j3;
        this.f19568c = z10;
    }

    @Override
    public void j(boolean z10) {
        yw ywVar = (yw) this.d;
        long j3 = this.f19567b;
        boolean z11 = this.f19568c;
        yw.x0(this.f19566a, j3, (TLRPC.Chat) this.f19569e, ywVar, z11, z10);
    }

    @Override
    public void run(long j3) {
        e2 e2Var = (e2) this.f19569e;
        ((t1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        np.s1(this.f19566a).Q2(-j3, this.f19567b, false, this.f19568c, new bi.n(e2Var, j3, 1));
    }

    public f0(yw ywVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = ywVar;
        this.f19566a = i7;
        this.f19569e = chat;
        this.f19567b = j3;
        this.f19568c = z10;
    }
}
