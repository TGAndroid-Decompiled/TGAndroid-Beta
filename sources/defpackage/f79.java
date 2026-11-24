package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class f79 implements Iterator {
    public int a;
    public Object b;
    public final g79 c;

    public f79(g79 g79Var) {
        this.c = g79Var;
        this.a = g79Var.b.size();
    }

    @Override
    public final boolean hasNext() {
        Object obj;
        int i;
        synchronized (this.c.b) {
            this.b = null;
            while (true) {
                obj = this.b;
                if (obj != null || (i = this.a) <= 0) {
                    break;
                }
                ArrayList arrayList = this.c.b;
                int i2 = i - 1;
                this.a = i2;
                Reference reference = (Reference) arrayList.get(i2);
                Object obj2 = reference.get();
                if (obj2 != null && !this.c.c.contains(reference)) {
                    this.b = obj2;
                    obj = obj2;
                    break;
                }
            }
            if (obj == null) {
                g79 g79Var = this.c;
                if (g79Var.a) {
                    ArrayList arrayList2 = g79Var.b;
                    ArrayList arrayList3 = g79Var.d;
                    ArrayList arrayList4 = g79Var.c;
                    if (g79Var.e) {
                        g79Var.e = false;
                        if (!arrayList4.isEmpty()) {
                            arrayList2.removeAll(arrayList4);
                            arrayList4.clear();
                        }
                        if (!arrayList3.isEmpty()) {
                            arrayList2.addAll(arrayList3);
                            arrayList3.clear();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        if (this.b == null) {
            Semaphore semaphore = this.c.f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        u36.g();
        return null;
    }
}
