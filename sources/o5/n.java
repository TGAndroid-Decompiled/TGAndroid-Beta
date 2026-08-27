package o5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

public abstract class n extends BasePendingResult {

    public m5.o f19349o;

    public final boolean f19350p;

    public final h f19351q;

    public n(h hVar, boolean z10) {
        super(null);
        this.f19351q = hVar;
        this.f19350p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new m(status, 1);
    }

    public abstract void n();

    public final r5.o o() {
        if (this.f19349o == null) {
            this.f19349o = new m5.o(this, 4);
        }
        return this.f19349o;
    }

    public final void p() {
        if (!this.f19350p) {
            Iterator it = this.f19351q.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = this.f19351q.f19337i.iterator();
            while (it2.hasNext()) {
                ((g) it2.next()).f();
            }
        }
        try {
            synchronized (this.f19351q.f19331a) {
                n();
            }
        } catch (r5.l unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
