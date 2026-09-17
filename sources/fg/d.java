package fg;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f9514a;
    public final e f9515b;

    public d(f fVar, e eVar) {
        this.f9514a = fVar;
        this.f9515b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f9514a, this.f9515b, j3, 8));
    }
}
