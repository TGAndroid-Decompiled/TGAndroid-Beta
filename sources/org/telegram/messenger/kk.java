package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class kk implements Supplier {
    public final int f25064a;

    @Override
    public final Object get() {
        switch (this.f25064a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
