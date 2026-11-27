package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class bud extends LinkedHashMap {
    public static final bud b;
    public boolean a = true;

    static {
        bud budVar = new bud();
        b = budVar;
        budVar.a = false;
    }

    public static int c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            Charset charset = vnd.a;
            int i = length;
            for (byte b2 : bArr) {
                i = (i * 31) + b2;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof xbe)) {
            return obj.hashCode();
        } else {
            p3d.a();
            return 0;
        }
    }

    public final void b() {
        if (this.a) {
            return;
        }
        p3d.a();
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
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += c(entry.getKey()) ^ c(entry.getValue());
        }
        return i;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = vnd.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            Charset charset = vnd.a;
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
