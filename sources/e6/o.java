package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public qb.c f8507o;
    public final boolean f8508p;
    public final h f8509q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f8509q = hVar;
        this.f8508p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8507o == null) {
            this.f8507o = new qb.c(this, 17);
        }
        return this.f8507o;
    }

    public final void p() {
        if (!this.f8508p) {
            Iterator it = this.f8509q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8509q.f8494i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.j(it);
            }
        }
        try {
            synchronized (this.f8509q.f8489a) {
                n();
            }
        } catch (g6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
