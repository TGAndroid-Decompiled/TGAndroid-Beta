package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15711a;
    public final e f15712b;

    public d(f fVar, e eVar) {
        this.f15711a = fVar;
        this.f15712b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15711a, this.f15712b, j3, 9));
    }
}
