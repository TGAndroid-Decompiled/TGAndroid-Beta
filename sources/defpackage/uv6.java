package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
public abstract class uv6 extends vv6 {
    public final Object a = new Object();
    public Executor b;
    public k44 c;
    public zu6 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(zu6 zu6Var, ArrayList arrayList) {
        if (zu6Var != null) {
            synchronized (this.a) {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new sv6(this, this.c, zu6Var, arrayList, (byte) 1));
                } else {
                    this.d = zu6Var;
                    this.e = new ArrayList(arrayList);
                }
            }
            return;
        }
        gxc.d("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
