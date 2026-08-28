package ff;

import org.telegram.messenger.AndroidUtilities;
public final class q {
    public final p f6249a;
    public long f6250b;
    public boolean f6251c;
    public final af.e d = new af.e(this, 26);

    public q(p pVar) {
        this.f6249a = pVar;
    }

    public final void a(long j10) {
        if (this.f6251c && this.f6250b == j10) {
            return;
        }
        this.f6250b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f6251c = true;
        af.e eVar = this.d;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    public final void b() {
        this.f6251c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
