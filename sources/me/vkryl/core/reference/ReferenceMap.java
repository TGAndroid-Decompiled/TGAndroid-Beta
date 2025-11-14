package me.vkryl.core.reference;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.vkryl.core.reference.ReferenceList;

public class ReferenceMap {
    private final boolean cacheIterator;
    private int fullnessCounter;
    private final ReferenceList.FullnessListener fullnessListenerHelper;
    private final boolean isThreadSafe;
    protected final Map map;
    private ReferenceList reuse;

    public interface FullnessListener {
        void onFullnessStateChanged(ReferenceMap referenceMap, boolean z);
    }

    public ReferenceMap(boolean z) {
        this(z, true, null);
    }

    public ReferenceMap(boolean z, boolean z2, final FullnessListener fullnessListener) {
        this.map = new HashMap();
        this.isThreadSafe = z;
        this.cacheIterator = z2;
        if (fullnessListener != null) {
            this.fullnessListenerHelper = new ReferenceList.FullnessListener(fullnessListener) {
                @Override
                public final void onFullnessStateChanged(ReferenceList referenceList, boolean z3) {
                    ReferenceMap.this.lambda$new$0(null, referenceList, z3);
                }
            };
        } else {
            this.fullnessListenerHelper = null;
        }
    }

    public void lambda$new$0(FullnessListener fullnessListener, ReferenceList referenceList, boolean z) {
        synchronized (fullnessListener) {
            try {
                if (z) {
                    int i = this.fullnessCounter;
                    this.fullnessCounter = i + 1;
                    if (i == 0) {
                        fullnessListener.onFullnessStateChanged(this, true);
                    }
                } else {
                    int i2 = this.fullnessCounter - 1;
                    this.fullnessCounter = i2;
                    if (i2 == 0) {
                        fullnessListener.onFullnessStateChanged(this, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean add(Object obj, Object obj2) {
        boolean add;
        synchronized (this.map) {
            try {
                ReferenceList referenceList = (ReferenceList) this.map.get(obj);
                if (referenceList == null) {
                    referenceList = this.reuse;
                    if (referenceList != null) {
                        this.reuse = referenceList.next;
                        referenceList.next = null;
                    } else {
                        referenceList = new ReferenceList(this.isThreadSafe, this.cacheIterator, this.fullnessListenerHelper);
                    }
                    this.map.put(obj, referenceList);
                }
                add = referenceList.add(obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    public final boolean has(Object obj) {
        boolean z;
        synchronized (this.map) {
            try {
                ReferenceList referenceList = (ReferenceList) this.map.get(obj);
                z = (referenceList == null || referenceList.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z;
    }

    public final void remove(Object obj, Object obj2) {
        synchronized (this.map) {
            try {
                ReferenceList referenceList = (ReferenceList) this.map.get(obj);
                if (referenceList != null) {
                    referenceList.remove(obj2);
                    if (referenceList.isEmpty()) {
                        this.map.remove(obj);
                        referenceList.next = this.reuse;
                        this.reuse = referenceList;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Iterator iterator(Object obj) {
        Iterator it;
        synchronized (this.map) {
            try {
                ReferenceList referenceList = (ReferenceList) this.map.get(obj);
                it = referenceList != null ? referenceList.iterator() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return it;
    }
}
