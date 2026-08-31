package be;

import j7.h0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class b implements Iterable {
    public final boolean f1919a;
    public final ArrayList f1920b;
    public final ArrayList f1921c;
    public final ArrayList d;
    public boolean f1922e;
    public final Semaphore f1923f;
    public b h;
    public a f1924n;

    public b() {
        this(true);
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.f1920b) {
            try {
                boolean z4 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.f1922e) {
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
                    h0.a(this.f1921c, obj);
                    return z4;
                }
                this.f1920b.add(new WeakReference(obj));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.f1920b) {
            try {
                if (this.f1922e) {
                    ArrayList arrayList = this.f1920b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Reference reference = (Reference) obj;
                        if (!this.f1921c.contains(reference)) {
                            this.f1921c.add(reference);
                        }
                        h0.a(this.d, reference.get());
                    }
                } else {
                    this.f1920b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f1920b;
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
        synchronized (this.f1920b) {
            try {
                if (this.f1922e) {
                    if (this.f1920b.isEmpty() && this.d.isEmpty()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    return z4;
                }
                ArrayList arrayList = this.f1920b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.f1920b.isEmpty();
            } finally {
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.f1923f;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.f1920b) {
            try {
                if (this.f1919a) {
                    if (!this.f1922e) {
                        this.f1922e = true;
                        a aVar = this.f1924n;
                        if (aVar == null) {
                            this.f1924n = new a(this);
                        } else {
                            aVar.f1916a = this.f1920b.size();
                            this.f1924n.f1917b = null;
                        }
                        return this.f1924n;
                    }
                    throw new IllegalStateException();
                } else if (this.f1920b.isEmpty()) {
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
        synchronized (this.f1920b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.f1922e) {
                    Reference reference = (Reference) this.f1920b.get(indexOf);
                    if (!this.f1921c.contains(reference)) {
                        this.f1921c.add(reference);
                    }
                    h0.a(this.d, reference.get());
                } else {
                    this.f1920b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z4) {
        this.f1921c = new ArrayList();
        this.d = new ArrayList();
        this.f1923f = null;
        this.f1919a = z4;
        this.f1920b = new ArrayList();
    }
}
