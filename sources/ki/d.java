package ki;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f12533a;
    public final e f12534b;

    public d(f fVar, e eVar) {
        this.f12533a = fVar;
        this.f12534b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f12533a, this.f12534b, j3, 3));
    }
}
