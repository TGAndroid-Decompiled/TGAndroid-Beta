package oh;

import gg.v1;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final ai.b f14583a;
    public b f14585c = b.f14580a;
    public final v1 d = new v1(this, 28);
    public final long f14584b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(ai.b bVar) {
        this.f14583a = bVar;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f14585c != bVar) {
            v1 v1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            this.f14585c = bVar;
            if (z10) {
                this.f14583a.run(bVar);
            }
            if (bVar == b.f14581b || bVar == b.f14582c) {
                AndroidUtilities.runOnUIThread(v1Var, this.f14584b);
            }
        }
    }
}
