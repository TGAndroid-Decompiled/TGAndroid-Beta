package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public xa.c f8692o;
    public final boolean f8693p;
    public final h f8694q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8694q = hVar;
        this.f8693p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8692o == null) {
            this.f8692o = new xa.c(this, 15);
        }
        return this.f8692o;
    }

    public final void p() {
        if (!this.f8693p) {
            Iterator it = this.f8694q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8694q.f8676i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.k(it);
            }
        }
        try {
            synchronized (this.f8694q.f8670a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
