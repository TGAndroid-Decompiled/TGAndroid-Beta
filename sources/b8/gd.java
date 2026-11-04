package b8;

import java.io.Serializable;
import java.util.Arrays;
public abstract class gd {
    public static final Object a(p1.b bVar, p1.e key, Serializable serializable) {
        kotlin.jvm.internal.j.e(bVar, "<this>");
        kotlin.jvm.internal.j.e(key, "key");
        Object obj = bVar.f53059a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.j.d(obj, "copyOf(this, size)");
        }
        if (obj == null) {
            return serializable;
        }
        return obj;
    }
}
