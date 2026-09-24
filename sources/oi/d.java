package oi;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f15739a;
    public final e f15740b;

    public d(f fVar, e eVar) {
        this.f15739a = fVar;
        this.f15740b = eVar;
    }

    @Override
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.f15739a, this.f15740b, j3, 9));
    }
}
