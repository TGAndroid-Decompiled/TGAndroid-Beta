package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15758a;
    public final e f15759b;

    public d(f fVar, e eVar) {
        this.f15758a = fVar;
        this.f15759b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15758a, this.f15759b, j3, 9));
    }
}
