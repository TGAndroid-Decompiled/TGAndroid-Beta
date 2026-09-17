package fg;

import a3.g0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f9486a;
    public final e f9487b;

    public d(f fVar, e eVar) {
        this.f9486a = fVar;
        this.f9487b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new g0(this.f9486a, this.f9487b, j3, 8));
    }
}
