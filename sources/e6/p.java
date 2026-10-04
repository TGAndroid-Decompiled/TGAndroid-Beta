package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public xa.c f8698o;
    public final boolean f8699p;
    public final h f8700q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8700q = hVar;
        this.f8699p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8698o == null) {
            this.f8698o = new xa.c(this, 17);
        }
        return this.f8698o;
    }

    public final void p() {
        if (!this.f8699p) {
            Iterator it = this.f8700q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8700q.f8682i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f8700q.f8676a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
