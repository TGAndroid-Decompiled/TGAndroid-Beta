package ch;

import cg.h0;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final h0 f2581a;
    public b f2583c = b.f2578a;
    public final ag.d d = new ag.d(this, 16);
    public final long f2582b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(h0 h0Var) {
        this.f2581a = h0Var;
    }

    public final void a(b bVar, boolean z4) {
        if (this.f2583c != bVar) {
            ag.d dVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.f2583c = bVar;
            if (z4) {
                this.f2581a.run(bVar);
            }
            if (bVar == b.f2579b || bVar == b.f2580c) {
                AndroidUtilities.runOnUIThread(dVar, this.f2582b);
            }
        }
    }
}
