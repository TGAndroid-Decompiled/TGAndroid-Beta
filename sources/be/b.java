package be;

import j7.g0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f1768a;
    public final ArrayList f1769b;
    public final ArrayList f1770c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f1771f;
    public b h;
    public a f1772n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f1769b) {
            try {
                boolean z4 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.e) {
                    ArrayList arrayList = this.d;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Reference reference = (Reference) arrayList.get(size);
                        if (reference != null) {
                            obj2 = reference.get();
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            arrayList.remove(size);
                        } else if (obj2 == obj) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        arrayList.add(new WeakReference(obj));
                        z4 = true;
                    }
                    g0.a(this.f1770c, obj);
                    return z4;
                }
                this.f1769b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f1769b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.f1769b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f1770c.contains(reference)) {
                            this.f1770c.add(reference);
                        }
                        g0.a(this.d, reference.get());
                    }
                } else {
                    this.f1769b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f1769b;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((Reference) arrayList.get(size)).get() == obj) {
                    return size;
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean isEmpty() {
        boolean z4;
        synchronized (this.f1769b) {
            try {
                if (this.e) {
                    if (this.f1769b.isEmpty() && this.d.isEmpty()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    return z4;
                }
                ArrayList arrayList = this.f1769b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f1769b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f1771f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f1769b) {
            try {
                if (this.f1768a) {
                    if (!this.e) {
                        this.e = true;
                        a aVar = this.f1772n;
                        if (aVar == null) {
                            this.f1772n = new a(this);
                        } else {
                            aVar.f1765a = this.f1769b.size();
                            this.f1772n.f1766b = null;
                        }
                        return this.f1772n;
                    }
                    throw new IllegalStateException();
                } else if (this.f1769b.isEmpty()) {
                    return Collections.emptyIterator();
                } else {
                    return new a(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.f1769b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.f1769b.get(indexOf);
                    if (!this.f1770c.contains(reference)) {
                        this.f1770c.add(reference);
                    }
                    g0.a(this.d, reference.get());
                } else {
                    this.f1769b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z4) {
        this.f1770c = new ArrayList();
        this.d = new ArrayList();
        this.f1771f = null;
        this.f1768a = z4;
        this.f1769b = new ArrayList();
    }
}
