package me.vkryl.core.reference;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ReferenceList implements Iterable {
    public final boolean cacheIterator;
    public boolean isLocked;
    public final ArrayList items;
    public final ArrayList itemsToAdd;
    public final ArrayList itemsToRemove;
    public Itr itr;
    public ReferenceList next;

    public final class Itr implements Iterator {
        public int index;
        public Object nextItem;

        public Itr() {
            this.index = ReferenceList.this.items.size();
        }

        @Override
        public final boolean hasNext() {
            int i;
            synchronized (ReferenceList.this.items) {
                try {
                    this.nextItem = null;
                    while (this.nextItem == null && (i = this.index) > 0) {
                        ArrayList arrayList = ReferenceList.this.items;
                        int i2 = i - 1;
                        this.index = i2;
                        Reference reference = (Reference) arrayList.get(i2);
                        Object obj = reference.get();
                        if (obj != null && !ReferenceList.this.itemsToRemove.contains(reference)) {
                            this.nextItem = obj;
                            break;
                        }
                    }
                    if (this.nextItem == null) {
                        ReferenceList referenceList = ReferenceList.this;
                        if (referenceList.cacheIterator) {
                            if (!referenceList.isLocked) {
                                throw new IllegalStateException();
                            }
                            referenceList.isLocked = false;
                            ArrayList arrayList2 = referenceList.itemsToRemove;
                            boolean zIsEmpty = arrayList2.isEmpty();
                            ArrayList arrayList3 = referenceList.items;
                            if (!zIsEmpty) {
                                arrayList3.removeAll(arrayList2);
                                arrayList2.clear();
                            }
                            ArrayList arrayList4 = referenceList.itemsToAdd;
                            if (!arrayList4.isEmpty()) {
                                arrayList3.addAll(arrayList4);
                                arrayList4.clear();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.nextItem != null;
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

    public ReferenceList() {
        this(true);
    }

    public final void add(Object obj) {
        int size;
        synchronized (this.items) {
            if (obj == null) {
                size = -1;
                break;
            }
            try {
                size = this.items.size() - 1;
                while (true) {
                    if (size < 0) {
                        size = -1;
                        break;
                    } else if (((Reference) this.items.get(size)).get() == obj) {
                        break;
                    } else {
                        size--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            if (size != -1) {
                return;
            }
            if (!this.isLocked) {
                this.items.add(new WeakReference(obj));
                return;
            }
            ArrayList arrayList = this.itemsToAdd;
            boolean z = false;
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                Reference reference = (Reference) arrayList.get(size2);
                Object obj2 = reference != null ? reference.get() : null;
                if (obj2 == null) {
                    arrayList.remove(size2);
                } else if (obj2 == obj) {
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(new WeakReference(obj));
            }
            ReferenceUtils.removeReference(this.itemsToRemove, obj);
        }
    }

    public final void clear() {
        synchronized (this.items) {
            try {
                if (this.isLocked) {
                    ArrayList arrayList = this.items;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Reference reference = (Reference) obj;
                        if (!this.itemsToRemove.contains(reference)) {
                            this.itemsToRemove.add(reference);
                        }
                        ReferenceUtils.removeReference(this.itemsToAdd, reference.get());
                    }
                } else {
                    this.items.clear();
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
                ArrayList arrayList = this.items;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.items.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        synchronized (this.items) {
            try {
                if (!this.cacheIterator) {
                    if (this.items.isEmpty()) {
                        return Collections.emptyIterator();
                    }
                    return new Itr();
                }
                if (this.isLocked) {
                    throw new IllegalStateException();
                }
                this.isLocked = true;
                Itr itr = this.itr;
                if (itr == null) {
                    this.itr = new Itr();
                } else {
                    itr.index = this.items.size();
                    this.itr.nextItem = null;
                }
                return this.itr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean remove(Object obj) {
        int size;
        synchronized (this.items) {
            if (obj == null) {
                size = -1;
                break;
            }
            try {
                size = this.items.size() - 1;
                while (true) {
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((Reference) this.items.get(size)).get() == obj) {
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
            if (size == -1) {
                return false;
            }
            if (this.isLocked) {
                Reference reference = (Reference) this.items.get(size);
                if (!this.itemsToRemove.contains(reference)) {
                    this.itemsToRemove.add(reference);
                }
                ReferenceUtils.removeReference(this.itemsToAdd, reference.get());
            } else {
                this.items.remove(size);
            }
            return true;
        }
    }

    public ReferenceList(boolean z) {
        this.itemsToRemove = new ArrayList();
        this.itemsToAdd = new ArrayList();
        this.cacheIterator = z;
        this.items = new ArrayList();
    }
}
