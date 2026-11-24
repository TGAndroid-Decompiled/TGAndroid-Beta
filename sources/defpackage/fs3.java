package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class fs3 {
    public final int a;
    public final rz6 b;
    public final CopyOnWriteArrayList c;

    public fs3(CopyOnWriteArrayList copyOnWriteArrayList, int i, rz6 rz6Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = rz6Var;
    }

    public final void a(jk2 jk2Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            es3 es3Var = (es3) it.next();
            hac.X(es3Var.a, new pz2(this, es3Var.b, jk2Var, (byte) 14));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            es3 es3Var = (es3) it.next();
            hac.X(es3Var.a, new ds3(this, es3Var.b, (byte) 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            es3 es3Var = (es3) it.next();
            hac.X(es3Var.a, new ob4(this, es3Var.b, i, (byte) 2));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            es3 es3Var = (es3) it.next();
            hac.X(es3Var.a, new pz2(this, es3Var.b, exc, (byte) 13));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            es3 es3Var = (es3) it.next();
            hac.X(es3Var.a, new ds3(this, es3Var.b, (byte) 0));
        }
    }
}
