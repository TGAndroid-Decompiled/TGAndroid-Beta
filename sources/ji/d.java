package ji;

import org.telegram.messenger.i0;
import org.telegram.tgnet.RequestTimeDelegate;
public final class d implements RequestTimeDelegate {
    public final f f10434a;
    public final e f10435b;

    public d(f fVar, e eVar) {
        this.f10434a = fVar;
        this.f10435b = eVar;
    }

    @Override
    public void run(long j10) {
        i0.g3(new a3.i0(this.f10434a, this.f10435b, j10, 1));
    }
}
