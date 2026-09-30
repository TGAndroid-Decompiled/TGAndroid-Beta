package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.m f8029o;
    public final boolean f8030p;
    public final h f8031q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8031q = hVar;
        this.f8030p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8029o == null) {
            this.f8029o = new a6.m(this, 16);
        }
        return this.f8029o;
    }

    public final void p() {
        if (!this.f8030p) {
            Iterator it = this.f8031q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8031q.f8013i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a4.a.k(it);
            }
        }
        try {
            synchronized (this.f8031q.f8008a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
