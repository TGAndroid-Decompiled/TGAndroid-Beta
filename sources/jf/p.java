package jf;

import cg.m2;
import org.telegram.messenger.AndroidUtilities;
public final class p {
    public final o f11663a;
    public long f11664b;
    public boolean f11665c;
    public final m2 d = new m2(this, 28);

    public p(o oVar) {
        this.f11663a = oVar;
    }

    public final void a(long j10) {
        if (this.f11665c && this.f11664b == j10) {
            return;
        }
        this.f11664b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f11665c = true;
        m2 m2Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(m2Var);
        AndroidUtilities.runOnUIThread(m2Var, 1000L);
    }

    public final void b() {
        this.f11665c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
