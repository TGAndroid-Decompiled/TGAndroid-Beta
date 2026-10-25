package n2;

import ai.h0;
import e2.n0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jg.f1;
import u2.g0;
public final class j {
    public final int f18625a;
    public final g0 f18626b;
    public final CopyOnWriteArrayList f18627c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.f18627c = copyOnWriteArrayList;
        this.f18625a = i10;
        this.f18626b = g0Var;
    }

    public final void a(pa.d dVar) {
        Iterator it = this.f18627c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f18623a, new f1(this, iVar.f18624b, dVar, 13));
        }
    }

    public final void b() {
        Iterator it = this.f18627c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f18623a, new h(this, iVar.f18624b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.f18627c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f18623a, new h0(this, iVar.f18624b, i10, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f18627c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f18623a, new f1(this, iVar.f18624b, exc, 12));
        }
    }

    public final void e() {
        Iterator it = this.f18627c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.f18623a, new h(this, iVar.f18624b, 0));
        }
    }
}
