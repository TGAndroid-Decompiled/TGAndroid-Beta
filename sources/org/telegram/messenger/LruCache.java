package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LruCache<T> {
    private final LinkedHashMap<String, T> map;
    private final LinkedHashMap<String, ArrayList<String>> mapFilters;
    private int maxSize;
    private int size;

    public LruCache(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i10;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
        this.mapFilters = new LinkedHashMap<>();
    }

    private int safeSizeOf(String str, T t10) {
        int iSizeOf = sizeOf(str, t10);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + t10);
    }

    private void trimToSize(int i10, String str) {
        ArrayList<String> arrayList;
        synchronized (this) {
            try {
                Iterator<Map.Entry<String, T>> it = this.map.entrySet().iterator();
                while (it.hasNext() && this.size > i10 && !this.map.isEmpty()) {
                    Map.Entry<String, T> next = it.next();
                    String key = next.getKey();
                    if (str == null || !str.equals(key)) {
                        T value = next.getValue();
                        this.size -= safeSizeOf(key, value);
                        it.remove();
                        String[] strArrSplit = key.split("@");
                        if (strArrSplit.length > 1 && (arrayList = this.mapFilters.get(strArrSplit[0])) != null) {
                            arrayList.remove(strArrSplit[1]);
                            if (arrayList.isEmpty()) {
                                this.mapFilters.remove(strArrSplit[0]);
                            }
                        }
                        entryRemoved(true, key, value, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean contains(String str) {
        return this.map.containsKey(str);
    }

    public final synchronized Set<Map.Entry<String, T>> entrySet() {
        return this.map.entrySet();
    }

    public final void evictAll() {
        trimToSize(-1, null);
    }

    public final T get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                T t10 = this.map.get(str);
                if (t10 != null) {
                    return t10;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ArrayList<String> getFilterKeys(String str) {
        ArrayList<String> arrayList = this.mapFilters.get(str);
        if (arrayList != null) {
            return new ArrayList<>(arrayList);
        }
        return null;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public void moveToFront(String str) {
        T tRemove = this.map.remove(str);
        if (tRemove != null) {
            this.map.put(str, tRemove);
        }
    }

    public T put(String str, T t10) {
        T tPut;
        if (str == null || t10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.size += safeSizeOf(str, t10);
                tPut = this.map.put(str, t10);
                if (tPut != null) {
                    this.size -= safeSizeOf(str, tPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String[] strArrSplit = str.split("@");
        if (strArrSplit.length > 1) {
            ArrayList<String> arrayList = this.mapFilters.get(strArrSplit[0]);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mapFilters.put(strArrSplit[0], arrayList);
            }
            if (!arrayList.contains(strArrSplit[1])) {
                arrayList.add(strArrSplit[1]);
            }
        }
        if (tPut != null) {
            entryRemoved(false, str, tPut, t10);
        }
        trimToSize(this.maxSize, str);
        return tPut;
    }

    public final T remove(String str) {
        T tRemove;
        ArrayList<String> arrayList;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                tRemove = this.map.remove(str);
                if (tRemove != null) {
                    this.size -= safeSizeOf(str, tRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tRemove != null) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length > 1 && (arrayList = this.mapFilters.get(strArrSplit[0])) != null) {
                arrayList.remove(strArrSplit[1]);
                if (arrayList.isEmpty()) {
                    this.mapFilters.remove(strArrSplit[0]);
                }
            }
            entryRemoved(false, str, tRemove, null);
        }
        return tRemove;
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(String str, T t10) {
        return 1;
    }

    public void entryRemoved(boolean z10, String str, T t10, T t11) {
    }
}
