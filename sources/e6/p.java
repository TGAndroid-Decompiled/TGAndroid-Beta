package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.m f8019o;
    public final boolean f8020p;
    public final h f8021q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8021q = hVar;
        this.f8020p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8019o == null) {
            this.f8019o = new a6.m(this, 16);
        }
        return this.f8019o;
    }

    public final void p() {
        if (!this.f8020p) {
            Iterator it = this.f8021q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8021q.f8003i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f8021q.f7998a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
