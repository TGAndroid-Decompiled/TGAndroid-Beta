package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public abstract class mle {
    public static final Object a(ih7 ih7Var, lg8 lg8Var, Serializable serializable) {
        ih7Var.getClass();
        lg8Var.getClass();
        Object obj = ih7Var.a.get(lg8Var);
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
