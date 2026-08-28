package c2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class q extends r {
    public final Object f2213a = new Object();
    public Executor f2214b;
    public xa.c f2215c;
    public n d;
    public ArrayList f2216e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(n nVar, ArrayList arrayList) {
        if (nVar != null) {
            synchronized (this.f2213a) {
                try {
                    try {
                        Executor executor = this.f2214b;
                        if (executor != null) {
                            executor.execute(new af.f(this, this.f2215c, nVar, arrayList, 2));
                        } else {
                            this.d = nVar;
                            this.f2216e = new ArrayList(arrayList);
                        }
                        return;
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
        throw new NullPointerException("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
