package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class fid extends BasePendingResult {
    public k09 o;
    public final boolean p;
    public final v99 q;

    public fid(v99 v99Var, boolean z) {
        super(null);
        this.q = v99Var;
        this.p = z;
    }

    @Override
    public final ie9 d(Status status) {
        return new ohd(status, (byte) 1);
    }

    public abstract void n();

    public final ydd o() {
        k09 k09Var = this.o;
        if (k09Var == null) {
            k09 k09Var2 = new k09(this, (byte) 26);
            this.o = k09Var2;
            return k09Var2;
        }
        return k09Var;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.q.i.iterator();
                while (it2.hasNext()) {
                    ((u99) it2.next()).f();
                }
            } else {
                throw qu6.l(it);
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (fdd unused) {
            a(new ohd(new Status(2100, null, null, null), (byte) 1));
        }
    }
}
