package kf;

import org.telegram.messenger.AndroidUtilities;
public final class p {
    public final o f10488a;
    public long f10489b;
    public boolean f10490c;
    public final e3.h d = new e3.h(this, 22);

    public p(o oVar) {
        this.f10488a = oVar;
    }

    public final void a(long j10) {
        if (this.f10490c && this.f10489b == j10) {
            return;
        }
        this.f10489b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f10490c = true;
        e3.h hVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        AndroidUtilities.runOnUIThread(hVar, 1000L);
    }

    public final void b() {
        this.f10490c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
