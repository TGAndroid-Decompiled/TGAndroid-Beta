package me.vkryl.core.reference;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
                    ReferenceMap.$r8$lambda$1Z7GUuA1JJHKJg5Y894SRunCXbQ(this.f$0, null, referenceList, z3);
                }
            };
        } else {
            this.fullnessListenerHelper = null;
        }
    }

    public static void $r8$lambda$1Z7GUuA1JJHKJg5Y894SRunCXbQ(ReferenceMap referenceMap, FullnessListener fullnessListener, ReferenceList referenceList, boolean z) {
        referenceMap.getClass();
        synchronized (fullnessListener) {
            try {
                if (z) {
                    int i = referenceMap.fullnessCounter;
                    referenceMap.fullnessCounter = i + 1;
                    if (i == 0) {
                        fullnessListener.onFullnessStateChanged(referenceMap, true);
                    }
                } else {
                    int i2 = referenceMap.fullnessCounter - 1;
                    referenceMap.fullnessCounter = i2;
                    if (i2 == 0) {
                        fullnessListener.onFullnessStateChanged(referenceMap, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean add(Object obj, Object obj2) {
        boolean zAdd;
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
                zAdd = referenceList.add(obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAdd;
    }

    public final boolean has(Object obj) {
        boolean z;
        synchronized (this.map) {
            try {
                ReferenceList referenceList = (ReferenceList) this.map.get(obj);
                z = (referenceList == null || referenceList.isEmpty()) ? false : true;
            } catch (Throwable th) {
                throw th;
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
