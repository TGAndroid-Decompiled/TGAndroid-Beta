package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class o extends BasePendingResult {
    public ob.c f13628o;
    public final boolean f13629p;
    public final h f13630q;

    public o(h hVar, boolean z10) {
        super(null);
        this.f13630q = hVar;
        this.f13629p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.r d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.n o() {
        if (this.f13628o == null) {
            this.f13628o = new ob.c(this, 28);
        }
        return this.f13628o;
    }

    public final void p() {
        if (!this.f13629p) {
            Iterator it = this.f13630q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f13630q.f13613i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f13630q.f13607a) {
                n();
            }
        } catch (j6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
