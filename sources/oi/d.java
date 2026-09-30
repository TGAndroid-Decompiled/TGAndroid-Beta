package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15755a;
    public final e f15756b;

    public d(f fVar, e eVar) {
        this.f15755a = fVar;
        this.f15756b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15755a, this.f15756b, j3, 9));
    }
}
