package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class dve extends LinkedHashMap {
    public static final dve b;
    public boolean a = true;

    static {
        dve dveVar = new dve();
        b = dveVar;
        dveVar.a = false;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            Charset charset = iqe.a;
            int i = length;
            for (byte b2 : bArr) {
                i = (i * 31) + b2;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof eqe)) {
            return obj.hashCode();
        } else {
            gxc.b();
            return 0;
        }
    }

    public final void c() {
        if (this.a) {
            return;
        }
        gxc.b();
    }

    @Override
    public final void clear() {
        c();
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
            i += b(entry.getKey()) ^ b(entry.getValue());
        }
        return i;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        c();
        Charset charset = iqe.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = iqe.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
