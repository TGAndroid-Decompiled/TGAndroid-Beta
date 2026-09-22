package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public pb.c f8034o;
    public final boolean f8035p;
    public final h f8036q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f8036q = hVar;
        this.f8035p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new o(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8034o == null) {
            this.f8034o = new pb.c(this, 17);
        }
        return this.f8034o;
    }

    public final void p() {
        if (!this.f8035p) {
            Iterator it = this.f8036q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8036q.f8018i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f8036q.f8013a) {
                n();
            }
        } catch (g6.k unused) {
            a(new o(new Status(2100, null, null, null), 1));
        }
    }
}
