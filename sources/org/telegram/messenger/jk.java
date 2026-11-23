package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class jk implements Supplier {
    public final int f24995a;

    @Override
    public final Object get() {
        switch (this.f24995a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
