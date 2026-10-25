package ag;

import org.telegram.messenger.AndroidUtilities;
public final class t {
    public final s f1377a;
    public long f1378b;
    public boolean f1379c;
    public final a3.d d = new a3.d(this, 4);

    public t(s sVar) {
        this.f1377a = sVar;
    }

    public final void a(long j10) {
        if (this.f1379c && this.f1378b == j10) {
            return;
        }
        this.f1378b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f1379c = true;
        a3.d dVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    public final void b() {
        this.f1379c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
