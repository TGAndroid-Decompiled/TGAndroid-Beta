package ni;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15250a;
    public final e f15251b;

    public d(f fVar, e eVar) {
        this.f15250a = fVar;
        this.f15251b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15250a, this.f15251b, j3, 9));
    }
}
