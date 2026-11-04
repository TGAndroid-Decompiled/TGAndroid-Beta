package ji;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.lr;
import org.telegram.ui.ActionBar.s1;
public final class c implements lr {
    public final int f16279a;
    public final s1 f16280b;
    public final long f16281c;
    public final boolean d;
    public final cs f16282e;

    public c(cs csVar, s1 s1Var, long j10, boolean z10, int i3) {
        this.f16279a = i3;
        this.f16282e = csVar;
        this.f16280b = s1Var;
        this.f16281c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f16279a) {
            case 0:
                e eVar = (e) this.f16282e;
                eVar.getClass();
                this.f16280b.dismiss();
                if (j10 != 0) {
                    eVar.f16294b = -j10;
                    eVar.f16295c = eVar.getMessagesController().M0(Long.valueOf(j10));
                    eVar.b0(this.f16281c, this.d);
                    return;
                }
                return;
            default:
                b0 b0Var = (b0) this.f16282e;
                b0Var.getClass();
                this.f16280b.dismiss();
                if (j10 != 0) {
                    b0Var.K0(hp.s1(b0Var.f28583a).M0(Long.valueOf(j10)), this.f16281c, this.d);
                    return;
                }
                return;
        }
    }
}
