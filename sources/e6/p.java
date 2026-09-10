package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.i f7335o;
    public final boolean f7336p;
    public final h f7337q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f7337q = hVar;
        this.f7336p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f7335o == null) {
            this.f7335o = new a6.i(this, 16);
        }
        return this.f7335o;
    }

    public final void p() {
        if (!this.f7336p) {
            Iterator it = this.f7337q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f7337q.f7319i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f7337q.f7314a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
