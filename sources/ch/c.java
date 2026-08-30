package ch;

import cg.h0;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final h0 f2598a;
    public b f2600c = b.f2595a;
    public final ag.d d = new ag.d(this, 16);
    public final long f2599b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(h0 h0Var) {
        this.f2598a = h0Var;
    }

    public final void a(b bVar, boolean z4) {
        if (this.f2600c != bVar) {
            ag.d dVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.f2600c = bVar;
            if (z4) {
                this.f2598a.run(bVar);
            }
            if (bVar == b.f2596b || bVar == b.f2597c) {
                AndroidUtilities.runOnUIThread(dVar, this.f2599b);
            }
        }
    }
}
