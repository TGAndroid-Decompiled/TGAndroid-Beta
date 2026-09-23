package ni;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15227a;
    public final e f15228b;

    public d(f fVar, e eVar) {
        this.f15227a = fVar;
        this.f15228b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15227a, this.f15228b, j3, 9));
    }
}
