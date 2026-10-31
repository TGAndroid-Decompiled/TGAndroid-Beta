package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class qk implements Supplier {
    public final int f17595a;

    @Override
    public final Object get() {
        switch (this.f17595a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
