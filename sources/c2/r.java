package c2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class r extends s {
    public final Object f2159a = new Object();
    public Executor f2160b;
    public androidx.biometric.f0 f2161c;
    public n d;
    public ArrayList f2162e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(n nVar, ArrayList arrayList) {
        if (nVar != null) {
            synchronized (this.f2159a) {
                try {
                    try {
                        Executor executor = this.f2160b;
                        if (executor != null) {
                            executor.execute(new p(this, this.f2161c, nVar, arrayList, 1));
                        } else {
                            this.d = nVar;
                            this.f2162e = new ArrayList(arrayList);
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
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
