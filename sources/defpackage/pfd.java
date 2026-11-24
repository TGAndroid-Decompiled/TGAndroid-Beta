package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class pfd extends BasePendingResult {
    public oo8 o;
    public final boolean p;
    public final k89 q;

    public pfd(k89 k89Var, boolean z) {
        super(null);
        this.q = k89Var;
        this.p = z;
    }

    @Override
    public final uc9 d(Status status) {
        return new xed(status, (byte) 1);
    }

    public abstract void n();

    public final hbd o() {
        oo8 oo8Var = this.o;
        if (oo8Var == null) {
            oo8 oo8Var2 = new oo8(this, (byte) 29);
            this.o = oo8Var2;
            return oo8Var2;
        }
        return oo8Var;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.q.i.iterator();
                while (it2.hasNext()) {
                    ((j89) it2.next()).f();
                }
            } else {
                throw kt6.l(it);
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (oad unused) {
            a(new xed(new Status(2100, null, null, null), (byte) 1));
        }
    }
}
