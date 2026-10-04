package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;
public final class k {
    public final int f16544a;
    public final f0 f16545b;
    public final CopyOnWriteArrayList f16546c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.f16546c = copyOnWriteArrayList;
        this.f16544a = i10;
        this.f16545b = f0Var;
    }

    public final void a() {
        Iterator it = this.f16546c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16542a, new i(this, jVar.f16543b, 2));
        }
    }

    public final void b() {
        Iterator it = this.f16546c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16542a, new i(this, jVar.f16543b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f16546c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16542a, new s1(this, jVar.f16543b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f16546c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16542a, new gg.t(this, jVar.f16543b, exc, 27));
        }
    }

    public final void e() {
        Iterator it = this.f16546c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.f16542a, new i(this, jVar.f16543b, 0));
        }
    }
}
