package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import zi.k0;
public abstract class o extends BasePendingResult {
    public k0 f13940o;
    public final boolean f13941p;
    public final h f13942q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f13942q = hVar;
        this.f13941p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.r d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.n o() {
        if (this.f13940o == null) {
            this.f13940o = new k0(this);
        }
        return this.f13940o;
    }

    public final void p() {
        if (!this.f13941p) {
            Iterator it = this.f13942q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f13942q.f13925i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f13942q.f13919a) {
                n();
            }
        } catch (j6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
