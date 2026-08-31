package be;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f1916a;
    public Object f1917b;
    public final b f1918c;

    public a(b bVar) {
        this.f1918c = bVar;
        this.f1916a = bVar.f1920b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f1918c.f1920b) {
            try {
                this.f1917b = null;
                while (true) {
                    if (this.f1917b != null || (i10 = this.f1916a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f1918c.f1920b;
                    int i11 = i10 - 1;
                    this.f1916a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f1918c.f1921c.contains(reference)) {
                        this.f1917b = obj;
                        break;
                    }
                }
                if (this.f1917b == null) {
                    b bVar = this.f1918c;
                    if (bVar.f1919a) {
                        ArrayList arrayList2 = bVar.f1920b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f1921c;
                        if (bVar.f1922e) {
                            bVar.f1922e = false;
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
        if (this.f1917b == null) {
            Semaphore semaphore = this.f1918c.f1923f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f1917b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
