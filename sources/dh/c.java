package dh;

import dg.h0;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final h0 f4748a;
    public b f4750c = b.f4744a;
    public final ag.e d = new ag.e(this, 21);
    public final long f4749b = (AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f;

    public c(h0 h0Var) {
        this.f4748a = h0Var;
    }

    public final void a(b bVar, boolean z4) {
        if (this.f4750c != bVar) {
            ag.e eVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(eVar);
            this.f4750c = bVar;
            if (z4) {
                this.f4748a.run(bVar);
            }
            if (bVar == b.f4745b || bVar == b.f4746c) {
                AndroidUtilities.runOnUIThread(eVar, this.f4749b);
            }
        }
    }
}
