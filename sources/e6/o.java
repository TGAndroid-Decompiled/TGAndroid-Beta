package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public a6.m f8510o;
    public final boolean f8511p;
    public final h f8512q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f8512q = hVar;
        this.f8511p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8510o == null) {
            this.f8510o = new a6.m(this, 16);
        }
        return this.f8510o;
    }

    public final void p() {
        if (!this.f8511p) {
            Iterator it = this.f8512q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8512q.f8497i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.j(it);
            }
        }
        try {
            synchronized (this.f8512q.f8492a) {
                n();
            }
        } catch (g6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
