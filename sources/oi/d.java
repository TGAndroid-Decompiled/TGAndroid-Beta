package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15754a;
    public final e f15755b;

    public d(f fVar, e eVar) {
        this.f15754a = fVar;
        this.f15755b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15754a, this.f15755b, j3, 9));
    }
}
