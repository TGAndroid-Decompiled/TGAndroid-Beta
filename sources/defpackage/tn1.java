package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class tn1 implements Supplier {
    public final byte a;

    @Override
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ArrayList();
            default:
                return new HashSet();
        }
    }
}
