package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f17173a;
    public final e f17174b;

    public d(f fVar, e eVar) {
        this.f17173a = fVar;
        this.f17174b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f17173a, this.f17174b, j3, 9));
    }
}
