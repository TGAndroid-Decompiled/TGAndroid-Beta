package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class k {
    public final int f16543a;
    public final f0 f16544b;
    public final CopyOnWriteArrayList f16545c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f16545c = copyOnWriteArrayList;
        this.f16543a = i10;
        this.f16544b = f0Var;
    }

    public final void a() {
        Iterator it = this.f16545c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16541a, new i(this, jVar.f16542b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16545c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16541a, new i(this, jVar.f16542b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16545c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16541a, new s1(this, jVar.f16542b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16545c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16541a, new gg.t(this, jVar.f16542b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f16545c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16541a, new i(this, jVar.f16542b, 0));
        }
    }
}
