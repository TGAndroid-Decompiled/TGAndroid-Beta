package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public qb.c f8389o;
    public final boolean f8390p;
    public final h f8391q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f8391q = hVar;
        this.f8390p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8389o == null) {
            this.f8389o = new qb.c(this, 18);
        }
        return this.f8389o;
    }

    public final void p() {
        if (!this.f8390p) {
            Iterator it = this.f8391q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8391q.f8376i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.j(it);
            }
        }
        try {
            synchronized (this.f8391q.f8371a) {
                n();
            }
        } catch (g6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
