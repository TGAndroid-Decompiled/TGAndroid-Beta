package g6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class n extends BasePendingResult {
    public c6.i f12025o;
    public final boolean f12026p;
    public final h f12027q;

    public n(h hVar, boolean z10) {
        super(null);
        this.f12027q = hVar;
        this.f12026p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new m(status, 1);
    }

    public abstract void n();

    public final i6.n o() {
        if (this.f12025o == null) {
            this.f12025o = new c6.i(this, 26);
        }
        return this.f12025o;
    }

    public final void p() {
        if (!this.f12026p) {
            Iterator it = this.f12027q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f12027q.f12013i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                throw a1.g.m(it);
            }
        }
        try {
            synchronized (this.f12027q.f12007a) {
                n();
            }
        } catch (i6.k unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
