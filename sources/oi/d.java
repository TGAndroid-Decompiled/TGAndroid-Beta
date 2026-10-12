package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f16921a;
    public final e f16922b;

    public d(f fVar, e eVar) {
        this.f16921a = fVar;
        this.f16922b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f16921a, this.f16922b, j3, 9));
    }
}
