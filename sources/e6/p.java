package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public a6.m f8030o;
    public final boolean f8031p;
    public final h f8032q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8032q = hVar;
        this.f8031p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8030o == null) {
            this.f8030o = new a6.m(this, 16);
        }
        return this.f8030o;
    }

    public final void p() {
        if (!this.f8031p) {
            Iterator it = this.f8032q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8032q.f8014i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f8032q.f8009a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
