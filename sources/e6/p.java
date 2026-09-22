package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.m f8032o;
    public final boolean f8033p;
    public final h f8034q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8034q = hVar;
        this.f8033p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8032o == null) {
            this.f8032o = new a6.m(this, 16);
        }
        return this.f8032o;
    }

    public final void p() {
        if (!this.f8033p) {
            Iterator it = this.f8034q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8034q.f8016i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a4.a.k(it);
            }
        }
        try {
            synchronized (this.f8034q.f8011a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
