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
        if (i10 > 0) {
            this.maxSize = i10;
            this.map = new LinkedHashMap<>(0, 0.75f, true);
            this.mapFilters = new LinkedHashMap<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int safeSizeOf(String str, T t6) {
        int sizeOf = sizeOf(str, t6);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + t6);
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
                        String[] split = key.split("@");
                        if (split.length > 1 && (arrayList = this.mapFilters.get(split[0])) != null) {
                            arrayList.remove(split[1]);
                            if (arrayList.isEmpty()) {
                                this.mapFilters.remove(split[0]);
                            }
                        }
                        entryRemoved(true, key, value, null);
                    }
                }
            } finally {
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
        if (str != null) {
            synchronized (this) {
                try {
                    T t6 = this.map.get(str);
                    if (t6 != null) {
                        return t6;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new NullPointerException("key == null");
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
        T remove = this.map.remove(str);
        if (remove != null) {
            this.map.put(str, remove);
        }
    }

    public T put(String str, T t6) {
        T put;
        if (str != null && t6 != null) {
            synchronized (this) {
                try {
                    this.size += safeSizeOf(str, t6);
                    put = this.map.put(str, t6);
                    if (put != null) {
                        this.size -= safeSizeOf(str, put);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String[] split = str.split("@");
            if (split.length > 1) {
                ArrayList<String> arrayList = this.mapFilters.get(split[0]);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.mapFilters.put(split[0], arrayList);
                }
                if (!arrayList.contains(split[1])) {
                    arrayList.add(split[1]);
                }
            }
            if (put != null) {
                entryRemoved(false, str, put, t6);
            }
            trimToSize(this.maxSize, str);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final T remove(String str) {
        T remove;
        ArrayList<String> arrayList;
        if (str != null) {
            synchronized (this) {
                try {
                    remove = this.map.remove(str);
                    if (remove != null) {
                        this.size -= safeSizeOf(str, remove);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (remove != null) {
                String[] split = str.split("@");
                if (split.length > 1 && (arrayList = this.mapFilters.get(split[0])) != null) {
                    arrayList.remove(split[1]);
                    if (arrayList.isEmpty()) {
                        this.mapFilters.remove(split[0]);
                    }
                }
                entryRemoved(false, str, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(String str, T t6) {
        return 1;
    }

    public void entryRemoved(boolean z4, String str, T t6, T t9) {
    }
}
