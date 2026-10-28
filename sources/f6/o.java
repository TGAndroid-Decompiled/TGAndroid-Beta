package f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public a4.l f10231o;
    public final boolean f10232p;
    public final h f10233q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f10233q = hVar;
        this.f10232p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final h6.n o() {
        if (this.f10231o == null) {
            this.f10231o = new a4.l(this, 16);
        }
        return this.f10231o;
    }

    public final void p() {
        if (!this.f10232p) {
            Iterator it = this.f10233q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f10233q.f10218i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.j(it);
            }
        }
        try {
            synchronized (this.f10233q.f10213a) {
                n();
            }
        } catch (h6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
