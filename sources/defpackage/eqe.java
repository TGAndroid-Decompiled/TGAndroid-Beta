package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public abstract class eqe {
    public static final Object a(rj7 rj7Var, zj8 zj8Var, Serializable serializable) {
        rj7Var.getClass();
        zj8Var.getClass();
        Object obj = rj7Var.a.get(zj8Var);
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
