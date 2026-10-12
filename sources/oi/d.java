package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f16920a;
    public final e f16921b;

    public d(f fVar, e eVar) {
        this.f16920a = fVar;
        this.f16921b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f16920a, this.f16921b, j3, 9));
    }
}
