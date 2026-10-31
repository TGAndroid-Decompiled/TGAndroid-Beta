package je;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f9825a;
    public Object f9826b;
    public final b f9827c;

    public a(b bVar) {
        this.f9827c = bVar;
        this.f9825a = bVar.f9829b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f9827c.f9829b) {
            try {
                this.f9826b = null;
                while (true) {
                    if (this.f9826b != null || (i10 = this.f9825a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f9827c.f9829b;
                    int i11 = i10 - 1;
                    this.f9825a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f9827c.f9830c.contains(reference)) {
                        this.f9826b = obj;
                        break;
                    }
                }
                if (this.f9826b == null) {
                    b bVar = this.f9827c;
                    if (bVar.f9828a) {
                        ArrayList arrayList2 = bVar.f9829b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f9830c;
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
        if (this.f9826b == null) {
            Semaphore semaphore = this.f9827c.f9831f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f9826b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
