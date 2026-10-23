package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public qb.c f8394o;
    public final boolean f8395p;
    public final h f8396q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f8396q = hVar;
        this.f8395p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8394o == null) {
            this.f8394o = new qb.c(this, 18);
        }
        return this.f8394o;
    }

    public final void p() {
        if (!this.f8395p) {
            Iterator it = this.f8396q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8396q.f8381i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.j(it);
            }
        }
        try {
            synchronized (this.f8396q.f8376a) {
                n();
            }
        } catch (g6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
