package ni;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15262a;
    public final e f15263b;

    public d(f fVar, e eVar) {
        this.f15262a = fVar;
        this.f15263b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15262a, this.f15263b, j3, 9));
    }
}
