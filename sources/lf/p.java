package lf;

import org.telegram.messenger.AndroidUtilities;
public final class p {
    public final o f12499a;
    public long f12500b;
    public boolean f12501c;
    public final eh.m d = new eh.m(this, 23);

    public p(o oVar) {
        this.f12499a = oVar;
    }

    public final void a(long j10) {
        if (this.f12501c && this.f12500b == j10) {
            return;
        }
        this.f12500b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f12501c = true;
        eh.m mVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(mVar);
        AndroidUtilities.runOnUIThread(mVar, 1000L);
    }

    public final void b() {
        this.f12501c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
