package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f17169a;
    public final e f17170b;

    public d(f fVar, e eVar) {
        this.f17169a = fVar;
        this.f17170b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f17169a, this.f17170b, j3, 9));
    }
}
