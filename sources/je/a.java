package je;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f9826a;
    public Object f9827b;
    public final b f9828c;

    public a(b bVar) {
        this.f9828c = bVar;
        this.f9826a = bVar.f9830b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f9828c.f9830b) {
            try {
                this.f9827b = null;
                while (true) {
                    if (this.f9827b != null || (i10 = this.f9826a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f9828c.f9830b;
                    int i11 = i10 - 1;
                    this.f9826a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f9828c.f9831c.contains(reference)) {
                        this.f9827b = obj;
                        break;
                    }
                }
                if (this.f9827b == null) {
                    b bVar = this.f9828c;
                    if (bVar.f9829a) {
                        ArrayList arrayList2 = bVar.f9830b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f9831c;
                        if (bVar.e) {
                            bVar.e = false;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f9827b == null) {
            Semaphore semaphore = this.f9828c.f9832f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f9827b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
