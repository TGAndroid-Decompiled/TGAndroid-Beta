package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class q89 implements Iterator {
    public int a;
    public Object b;
    public final r89 c;

    public q89(r89 r89Var) {
        this.c = r89Var;
        this.a = r89Var.b.size();
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
                r89 r89Var = this.c;
                if (r89Var.a) {
                    ArrayList arrayList2 = r89Var.b;
                    ArrayList arrayList3 = r89Var.d;
                    ArrayList arrayList4 = r89Var.c;
                    if (r89Var.e) {
                        r89Var.e = false;
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
        lq5.n();
        return null;
    }
}
