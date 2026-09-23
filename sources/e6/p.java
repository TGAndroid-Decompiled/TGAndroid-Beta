package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.m f8018o;
    public final boolean f8019p;
    public final h f8020q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8020q = hVar;
        this.f8019p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8018o == null) {
            this.f8018o = new a6.m(this, 16);
        }
        return this.f8018o;
    }

    public final void p() {
        if (!this.f8019p) {
            Iterator it = this.f8020q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8020q.f8002i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a4.a.k(it);
            }
        }
        try {
            synchronized (this.f8020q.f7997a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
