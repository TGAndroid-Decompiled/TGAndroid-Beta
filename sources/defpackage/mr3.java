package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class mr3 {
    public final int a;
    public final vz6 b;
    public final CopyOnWriteArrayList c;

    public mr3(CopyOnWriteArrayList copyOnWriteArrayList, int i, vz6 vz6Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = vz6Var;
    }

    public final void a(rj2 rj2Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lr3 lr3Var = (lr3) it.next();
            gcc.X(lr3Var.a, new cv2(this, lr3Var.b, rj2Var, (byte) 16));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lr3 lr3Var = (lr3) it.next();
            gcc.X(lr3Var.a, new kr3(this, lr3Var.b, (byte) 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lr3 lr3Var = (lr3) it.next();
            gcc.X(lr3Var.a, new sb4(this, lr3Var.b, i, (byte) 2));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lr3 lr3Var = (lr3) it.next();
            gcc.X(lr3Var.a, new cv2(this, lr3Var.b, exc, (byte) 15));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            lr3 lr3Var = (lr3) it.next();
            gcc.X(lr3Var.a, new kr3(this, lr3Var.b, (byte) 0));
        }
    }
}
