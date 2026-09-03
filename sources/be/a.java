package be;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
public final class a implements Iterator {
    public int f1777a;
    public Object f1778b;
    public final b f1779c;

    public a(b bVar) {
        this.f1779c = bVar;
        this.f1777a = bVar.f1781b.size();
    }

    @Override
    public final boolean hasNext() {
        int i10;
        synchronized (this.f1779c.f1781b) {
            try {
                this.f1778b = null;
                while (true) {
                    if (this.f1778b != null || (i10 = this.f1777a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.f1779c.f1781b;
                    int i11 = i10 - 1;
                    this.f1777a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.f1779c.f1782c.contains(reference)) {
                        this.f1778b = obj;
                        break;
                    }
                }
                if (this.f1778b == null) {
                    b bVar = this.f1779c;
                    if (bVar.f1780a) {
                        ArrayList arrayList2 = bVar.f1781b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.f1782c;
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
        if (this.f1778b == null) {
            Semaphore semaphore = this.f1779c.f1783f;
            if (semaphore != null) {
                semaphore.release();
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        Object obj = this.f1778b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
