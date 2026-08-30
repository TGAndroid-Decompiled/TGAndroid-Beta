package lf;

import org.telegram.messenger.AndroidUtilities;
public final class p {
    public final o f12048a;
    public long f12049b;
    public boolean f12050c;
    public final ef.e d = new ef.e(this, 29);

    public p(o oVar) {
        this.f12048a = oVar;
    }

    public final void a(long j10) {
        if (this.f12050c && this.f12049b == j10) {
            return;
        }
        this.f12049b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f12050c = true;
        ef.e eVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    public final void b() {
        this.f12050c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
