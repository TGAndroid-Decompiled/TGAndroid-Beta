package ni;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15252a;
    public final e f15253b;

    public d(f fVar, e eVar) {
        this.f15252a = fVar;
        this.f15253b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15252a, this.f15253b, j3, 9));
    }
}
