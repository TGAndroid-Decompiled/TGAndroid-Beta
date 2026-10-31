package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class n extends BasePendingResult {
    public k6.h f6302o;
    public final boolean f6303p;
    public final h f6304q;

    public n(h hVar, boolean z10) {
        super(null);
        this.f6304q = hVar;
        this.f6303p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new m(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.f6302o == null) {
            this.f6302o = new k6.h(this, 20);
        }
        return this.f6302o;
    }

    public final void p() {
        if (!this.f6303p) {
            Iterator it = this.f6304q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f6304q.f6290i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.h(it);
            }
        }
        try {
            synchronized (this.f6304q.f6285a) {
                n();
            }
        } catch (g6.k unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
