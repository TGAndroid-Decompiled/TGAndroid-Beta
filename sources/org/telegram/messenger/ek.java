package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class ek implements Supplier {
    public final int f22363a;

    @Override
    public final Object get() {
        switch (this.f22363a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
