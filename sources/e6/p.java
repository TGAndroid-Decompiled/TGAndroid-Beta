package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public xa.c f8690o;
    public final boolean f8691p;
    public final h f8692q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8692q = hVar;
        this.f8691p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8690o == null) {
            this.f8690o = new xa.c(this, 15);
        }
        return this.f8690o;
    }

    public final void p() {
        if (!this.f8691p) {
            Iterator it = this.f8692q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8692q.f8674i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.k(it);
            }
        }
        try {
            synchronized (this.f8692q.f8668a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
