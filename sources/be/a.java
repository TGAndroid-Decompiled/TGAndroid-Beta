package be;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f1765a;
    public Object f1766b;
    public final b f1767c;

    public a(b bVar) {
        this.f1767c = bVar;
        this.f1765a = bVar.f1769b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f1767c.f1769b) {
            try {
                this.f1766b = null;
                while (true) {
                    if (this.f1766b != null || (i10 = this.f1765a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f1767c.f1769b;
                    int i11 = i10 - 1;
                    this.f1765a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f1767c.f1770c.contains(reference)) {
                        this.f1766b = obj;
                        break;
                    }
                }
                if (this.f1766b == null) {
                    b bVar = this.f1767c;
                    if (bVar.f1768a) {
                        ArrayList arrayList2 = bVar.f1769b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f1770c;
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
        if (this.f1766b == null) {
            Semaphore semaphore = this.f1767c.f1771f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f1766b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
