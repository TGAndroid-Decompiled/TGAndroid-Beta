package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import zi.k0;
public abstract class o extends BasePendingResult {
    public k0 f13935o;
    public final boolean f13936p;
    public final h f13937q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f13937q = hVar;
        this.f13936p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.r d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.n o() {
        if (this.f13935o == null) {
            this.f13935o = new k0(this);
        }
        return this.f13935o;
    }

    public final void p() {
        if (!this.f13936p) {
            Iterator it = this.f13937q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f13937q.f13920i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f13937q.f13914a) {
                n();
            }
        } catch (j6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
