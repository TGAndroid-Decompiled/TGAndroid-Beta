package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;
public final class ok implements Supplier {
    public final int f24335a;

    @Override
    public final Object get() {
        switch (this.f24335a) {
            case 0:
                return new HashSet();
            default:
                return new ArrayList();
        }
    }
}
