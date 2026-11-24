package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
public abstract class ndd extends BasePendingResult {
    public v39 o;
    public final boolean p;
    public final i69 q;

    public ndd(i69 i69Var, boolean z) {
        super(null);
        this.q = i69Var;
        this.p = z;
    }

    @Override
    public final ua9 d(Status status) {
        return new vcd(status, (byte) 1);
    }

    public abstract void n();

    public final f9d o() {
        v39 v39Var = this.o;
        if (v39Var == null) {
            v39 v39Var2 = new v39(this, (byte) 26);
            this.o = v39Var2;
            return v39Var2;
        }
        return v39Var;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = this.q.i.iterator();
                while (it2.hasNext()) {
                    ((h69) it2.next()).f();
                }
            } else {
                throw ls6.l(it);
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (m8d unused) {
            a(new vcd(new Status(2100, null, null, null), (byte) 1));
        }
    }
}
