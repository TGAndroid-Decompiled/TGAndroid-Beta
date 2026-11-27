package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public abstract class v3f {
    public static o3f a;

    public static Map a(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return qbe.n;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    public static synchronized j2f b(y0f y0fVar) {
        j2f j2fVar;
        synchronized (v3f.class) {
            o3f o3fVar = a;
            if (o3fVar == null) {
                o3fVar = new o3f((byte) 0);
                a = o3fVar;
            }
            j2fVar = (j2f) o3fVar.c(y0fVar);
        }
        return j2fVar;
    }
}
