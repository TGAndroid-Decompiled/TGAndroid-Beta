package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public a6.m f8388o;
    public final boolean f8389p;
    public final h f8390q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f8390q = hVar;
        this.f8389p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f8388o == null) {
            this.f8388o = new a6.m(this, 18);
        }
        return this.f8388o;
    }

    public final void p() {
        if (!this.f8389p) {
            Iterator it = this.f8390q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f8390q.f8375i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.j(it);
            }
        }
        try {
            synchronized (this.f8390q.f8370a) {
                n();
            }
        } catch (g6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
