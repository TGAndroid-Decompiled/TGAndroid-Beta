package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class zv6 extends aw6 {
    public final Object a = new Object();
    public Executor b;
    public v34 c;
    public ev6 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(ev6 ev6Var, ArrayList arrayList) {
        if (ev6Var != null) {
            synchronized (this.a) {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new xv6(this, this.c, ev6Var, arrayList, (byte) 1));
                } else {
                    this.d = ev6Var;
                    this.e = new ArrayList(arrayList);
                }
            }
            return;
        }
        p3d.h("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
