package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
public final class g79 implements Iterable {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f;
    public g79 h;
    public f79 n;

    public g79(int i, boolean z) {
        Semaphore semaphore;
        this.c = new ArrayList();
        this.d = new ArrayList();
        if (z) {
            semaphore = new Semaphore(1);
        } else {
            semaphore = null;
        }
        this.f = semaphore;
        this.a = true;
        this.b = new ArrayList();
    }

    public final boolean add(Object obj) {
        Object obj2;
        synchronized (this.b) {
            boolean z = false;
            if (indexOf(obj) != -1) {
                return false;
            }
            if (this.e) {
                ArrayList arrayList = this.d;
                boolean z2 = false;
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
                        z2 = true;
                    }
                }
                if (!z2) {
                    arrayList.add(new WeakReference(obj));
                    z = true;
                }
                oue.a(this.c, obj);
                return z;
            }
            this.b.add(new WeakReference(obj));
            return true;
        }
    }

    public final void clear() {
        synchronized (this.b) {
            boolean z = this.e;
            ArrayList arrayList = this.b;
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Reference reference = (Reference) obj;
                    if (!this.c.contains(reference)) {
                        this.c.add(reference);
                    }
                    oue.a(this.d, reference.get());
                }
            } else {
                arrayList.clear();
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.b;
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
        boolean z;
        synchronized (this.b) {
            boolean z2 = this.e;
            ArrayList arrayList = this.b;
            if (z2) {
                if (arrayList.isEmpty() && this.d.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                return z;
            }
            if (arrayList != null) {
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    if (((Reference) arrayList.get(size)).get() == null) {
                        arrayList.remove(size);
                    }
                }
            }
            return this.b.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        f79 f79Var;
        Semaphore semaphore = this.f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.b) {
            if (this.a) {
                if (!this.e) {
                    this.e = true;
                    f79 f79Var2 = this.n;
                    if (f79Var2 == null) {
                        f79Var = new f79(this);
                        this.n = f79Var;
                    } else {
                        f79Var2.a = this.b.size();
                        f79Var = this.n;
                        f79Var.b = null;
                    }
                    return f79Var;
                }
                throw new IllegalStateException();
            } else if (this.b.isEmpty()) {
                return Collections.emptyIterator();
            } else {
                return new f79(this);
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.b) {
            int indexOf = indexOf(obj);
            if (indexOf == -1) {
                return false;
            }
            boolean z = this.e;
            ArrayList arrayList = this.b;
            if (z) {
                Reference reference = (Reference) arrayList.get(indexOf);
                if (!this.c.contains(reference)) {
                    this.c.add(reference);
                }
                oue.a(this.d, reference.get());
            } else {
                arrayList.remove(indexOf);
            }
            return true;
        }
    }

    public g79() {
        this(0, false);
    }
}
