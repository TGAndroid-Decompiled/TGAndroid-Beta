package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class rk implements Supplier {
    public final int f17941a;

    @Override
    public final Object get() {
        switch (this.f17941a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
