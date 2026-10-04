package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public xa.c f8699o;
    public final boolean f8700p;
    public final h f8701q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8701q = hVar;
        this.f8700p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8699o == null) {
            this.f8699o = new xa.c(this, 17);
        }
        return this.f8699o;
    }

    public final void p() {
        if (!this.f8700p) {
            Iterator it = this.f8701q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8701q.f8683i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a4.a.k(it);
            }
        }
        try {
            synchronized (this.f8701q.f8677a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
