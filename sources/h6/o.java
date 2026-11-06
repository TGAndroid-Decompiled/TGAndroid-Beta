package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g6.d0;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public d0 f14268o;
    public final boolean f14269p;
    public final h f14270q;

    public o(h hVar, boolean z9) {
        super(null);
        this.f14270q = hVar;
        this.f14269p = z9;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.n o() {
        if (this.f14268o == null) {
            this.f14268o = new d0(this, 3);
        }
        return this.f14268o;
    }

    public final void p() {
        if (!this.f14269p) {
            Iterator it = this.f14270q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f14270q.f14253i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f14270q.f14247a) {
                n();
            }
        } catch (j6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
