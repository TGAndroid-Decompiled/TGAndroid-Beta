package ji;

import org.telegram.messenger.i0;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f10435a;
    public final e f10436b;

    public d(f fVar, e eVar) {
        this.f10435a = fVar;
        this.f10436b = eVar;
    }

    @Override
    public void run(long j10) {
        i0.g3(new a3.i0(this.f10435a, this.f10436b, j10, 1));
    }
}
