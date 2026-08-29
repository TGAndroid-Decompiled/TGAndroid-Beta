package ah;

import ag.i0;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final i0 f740a;
    public b f742c = b.f736a;
    public final a4.g d = new a4.g(this, 5);
    public final long f741b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(i0 i0Var) {
        this.f740a = i0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.f742c != bVar) {
            a4.g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            this.f742c = bVar;
            if (z10) {
                this.f740a.run(bVar);
            }
            if (bVar == b.f737b || bVar == b.f738c) {
                AndroidUtilities.runOnUIThread(gVar, this.f741b);
            }
        }
    }
}
