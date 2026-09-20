package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15743a;
    public final e f15744b;

    public d(f fVar, e eVar) {
        this.f15743a = fVar;
        this.f15744b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15743a, this.f15744b, j3, 9));
    }
}
