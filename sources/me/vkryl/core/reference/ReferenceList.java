package me.vkryl.core.reference;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

public final class ReferenceList implements Iterable, ReferenceCreator {
    private final boolean cacheIterator;
    private final FullnessListener fullnessListener;
    private boolean isFull;
    private boolean isLocked;
    private final List items;
    private final List itemsToAdd;
    private final List itemsToRemove;
    private Itr itr;
    ReferenceList next;
    private final Semaphore semaphore;

    public interface FullnessListener {
        void onFullnessStateChanged(ReferenceList referenceList, boolean z);
    }

    @Override
    public Reference newReference(Object obj) {
        return ReferenceCreator.CC.$default$newReference(this, obj);
    }

    public ReferenceList() {
        this(false, true, null);
    }

    public ReferenceList(boolean z) {
        this(z, true, null);
    }

    public ReferenceList(boolean z, boolean z2, FullnessListener fullnessListener) {
        this.itemsToRemove = new ArrayList();
        this.itemsToAdd = new ArrayList();
        this.semaphore = z ? new Semaphore(1) : null;
        this.cacheIterator = z2;
        this.items = new ArrayList();
        this.fullnessListener = fullnessListener;
    }

    private void checkFull() {
        boolean z;
        if (this.fullnessListener == null || this.isFull == (z = !this.items.isEmpty())) {
            return;
        }
        this.isFull = z;
        this.fullnessListener.onFullnessStateChanged(this, z);
    }

    private void lock() {
        if (this.isLocked) {
            throw new IllegalStateException();
        }
        this.isLocked = true;
    }

    public void unlock() {
        if (!this.isLocked) {
            throw new IllegalStateException();
        }
        this.isLocked = false;
        if (!this.itemsToRemove.isEmpty()) {
            this.items.removeAll(this.itemsToRemove);
            this.itemsToRemove.clear();
        }
        if (!this.itemsToAdd.isEmpty()) {
            this.items.addAll(this.itemsToAdd);
            this.itemsToAdd.clear();
        }
        checkFull();
    }

    private int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = this.items.size() - 1; size >= 0; size--) {
            if (((Reference) this.items.get(size)).get() == obj) {
                return size;
            }
        }
        return -1;
    }

    public final boolean add(Object obj) {
        synchronized (this.items) {
            try {
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (this.isLocked) {
                    boolean zAddReference = ReferenceUtils.addReference(this, this.itemsToAdd, obj);
                    ReferenceUtils.removeReference(this.itemsToRemove, obj);
                    return zAddReference;
                }
                this.items.add(newReference(obj));
                checkFull();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.items) {
            try {
                int iIndexOf = indexOf(obj);
                if (iIndexOf == -1) {
                    return false;
                }
                if (this.isLocked) {
                    Reference reference = (Reference) this.items.get(iIndexOf);
                    if (!this.itemsToRemove.contains(reference)) {
                        this.itemsToRemove.add(reference);
                    }
                    ReferenceUtils.removeReference(this.itemsToAdd, reference.get());
                } else {
                    this.items.remove(iIndexOf);
                    checkFull();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.items) {
            try {
                if (this.isLocked) {
                    for (Reference reference : this.items) {
                        if (!this.itemsToRemove.contains(reference)) {
                            this.itemsToRemove.add(reference);
                        }
                        ReferenceUtils.removeReference(this.itemsToAdd, reference.get());
                    }
                } else {
                    this.items.clear();
                    checkFull();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isEmpty() {
        synchronized (this.items) {
            try {
                if (this.isLocked) {
                    return this.items.isEmpty() && this.itemsToAdd.isEmpty();
                }
                ReferenceUtils.gcReferenceList(this.items);
                return this.items.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        Semaphore semaphore = this.semaphore;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
        }
        synchronized (this.items) {
            try {
                if (this.cacheIterator) {
                    lock();
                    Itr itr = this.itr;
                    if (itr == null) {
                        this.itr = new Itr();
                    } else {
                        itr.index = this.items.size();
                        this.itr.nextItem = null;
                    }
                    return this.itr;
                }
                if (this.items.isEmpty()) {
                    return Collections.emptyIterator();
                }
                return new Itr();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final class Itr implements Iterator {
        private int index;
        private Object nextItem;

        private Itr() {
            this.index = ReferenceList.this.items.size();
        }

        @Override
        public final boolean hasNext() {
            synchronized (ReferenceList.this.items) {
                try {
                    this.nextItem = null;
                    while (this.nextItem == null && this.index > 0) {
                        List list = ReferenceList.this.items;
                        int i = this.index - 1;
                        this.index = i;
                        Reference reference = (Reference) list.get(i);
                        Object obj = reference.get();
                        if (obj != null && !ReferenceList.this.itemsToRemove.contains(reference)) {
                            this.nextItem = obj;
                            break;
                        }
                    }
                    if (this.nextItem == null && ReferenceList.this.cacheIterator) {
                        ReferenceList.this.unlock();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.nextItem != null) {
                return true;
            }
            if (ReferenceList.this.semaphore == null) {
                return false;
            }
            ReferenceList.this.semaphore.release();
            return false;
        }

        @Override
        public final Object next() {
            Object obj = this.nextItem;
            if (obj != null) {
                return obj;
            }
            throw new NoSuchElementException();
        }
    }
}
