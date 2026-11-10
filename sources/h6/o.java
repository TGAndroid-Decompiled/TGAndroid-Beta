package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g6.d0;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public d0 f14270o;
    public final boolean f14271p;
    public final h f14272q;

    public o(h hVar, boolean z9) {
        super(null);
        this.f14272q = hVar;
        this.f14271p = z9;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.n o() {
        if (this.f14270o == null) {
            this.f14270o = new d0(this, 3);
        }
        return this.f14270o;
    }

    public final void p() {
        if (!this.f14271p) {
            Iterator it = this.f14272q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f14272q.f14255i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f14272q.f14249a) {
                n();
            }
        } catch (j6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
