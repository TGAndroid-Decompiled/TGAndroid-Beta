package o5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import n5.e0;
public abstract class n extends BasePendingResult {
    public e0 f19002o;
    public final boolean f19003p;
    public final h f19004q;

    public n(h hVar, boolean z10) {
        super(null);
        this.f19004q = hVar;
        this.f19003p = z10;
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        return new m(status, 1);
    }

    public abstract void n();

    public final q5.o o() {
        if (this.f19002o == null) {
            this.f19002o = new e0(this, 5);
        }
        return this.f19002o;
    }

    public final void p() {
        if (!this.f19003p) {
            Iterator it = this.f19004q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.f19004q.f18990i.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).f();
                }
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        try {
            synchronized (this.f19004q.f18984a) {
                n();
            }
        } catch (q5.l unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
