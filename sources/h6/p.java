package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class p extends BasePendingResult {
    public o f13937o;
    public final boolean f13938p;
    public final h f13939q;

    public p(h hVar, boolean z10) {
        super(null);
        this.f13939q = hVar;
        this.f13938p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.r d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.o o() {
        if (this.f13937o == null) {
            this.f13937o = new o(this, 0);
        }
        return this.f13937o;
    }

    public final void p() {
        if (!this.f13938p) {
            Iterator it = this.f13939q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f13939q.f13920i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f13939q.f13914a) {
                n();
            }
        } catch (j6.l unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
