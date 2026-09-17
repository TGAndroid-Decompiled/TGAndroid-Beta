package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.i f8926o;
    public final boolean f8927p;
    public final h f8928q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8928q = hVar;
        this.f8927p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8926o == null) {
            this.f8926o = new a6.i(this, 17);
        }
        return this.f8926o;
    }

    public final void p() {
        if (!this.f8927p) {
            Iterator it = this.f8928q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8928q.f8910i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f8928q.f8904a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
