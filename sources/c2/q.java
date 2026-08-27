package c2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class q extends r {

    public final Object f2326a = new Object();

    public Executor f2327b;

    public a9.i f2328c;
    public n d;

    public ArrayList f2329e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(n nVar, ArrayList arrayList) {
        if (nVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.f2326a) {
            try {
                try {
                    Executor executor = this.f2327b;
                    if (executor != null) {
                        executor.execute(new bf.e(this, this.f2328c, nVar, arrayList, 2));
                    } else {
                        this.d = nVar;
                        this.f2329e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
