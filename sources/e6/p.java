package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.m f8035o;
    public final boolean f8036p;
    public final h f8037q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8037q = hVar;
        this.f8036p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8035o == null) {
            this.f8035o = new a6.m(this, 16);
        }
        return this.f8035o;
    }

    public final void p() {
        if (!this.f8036p) {
            Iterator it = this.f8037q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8037q.f8019i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f8037q.f8014a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
