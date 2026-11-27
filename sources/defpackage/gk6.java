package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class gk6 extends LinkedHashMap {
    public static final gk6 b;
    public boolean a = true;

    static {
        gk6 gk6Var = new gk6();
        b = gk6Var;
        gk6Var.a = false;
    }

    public final void b() {
        if (this.a) {
            return;
        }
        p3d.a();
    }

    public final gk6 c() {
        if (isEmpty()) {
            return new gk6();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.a = true;
        return linkedHashMap;
    }

    @Override
    public final void clear() {
        b();
        super.clear();
    }

    @Override
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = pr5.a;
                hashCode = length;
                for (byte b2 : bArr) {
                    hashCode = (hashCode * 31) + b2;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = pr5.a;
                int i3 = length2;
                for (byte b3 : bArr2) {
                    i3 = (i3 * 31) + b3;
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            } else {
                i2 = value.hashCode();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = pr5.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            Charset charset = pr5.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
