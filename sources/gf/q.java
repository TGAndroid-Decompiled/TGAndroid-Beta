package gf;

import org.telegram.messenger.AndroidUtilities;

public final class q {

    public final p f7049a;

    public long f7050b;

    public boolean f7051c;
    public final f2.r d = new f2.r(this, 3);

    public q(p pVar) {
        this.f7049a = pVar;
    }

    public final void a(long j10) {
        if (this.f7051c && this.f7050b == j10) {
            return;
        }
        this.f7050b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f7051c = true;
        f2.r rVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(rVar);
        AndroidUtilities.runOnUIThread(rVar, 1000L);
    }

    public final void b() {
        this.f7051c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
