package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15771a;
    public final e f15772b;

    public d(f fVar, e eVar) {
        this.f15771a = fVar;
        this.f15772b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15771a, this.f15772b, j3, 9));
    }
}
