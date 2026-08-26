package me.vkryl.core.reference;

import java.util.HashMap;

public final class ReferenceMap {
    public ReferenceList reuse;
    public final HashMap map = new HashMap();
    public final boolean cacheIterator = true;

    public final boolean has(Long l) {
        boolean z;
        synchronized (this.map) {
            try {
                ReferenceList referenceList = (ReferenceList) this.map.get(l);
                z = (referenceList == null || referenceList.isEmpty()) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
