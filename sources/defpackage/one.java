package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public abstract class one {
    public static final Object a(lj7 lj7Var, ni8 ni8Var, Serializable serializable) {
        lj7Var.getClass();
        ni8Var.getClass();
        Object obj = lj7Var.a.get(ni8Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        if (obj == null) {
            return serializable;
        }
        return obj;
    }
}
