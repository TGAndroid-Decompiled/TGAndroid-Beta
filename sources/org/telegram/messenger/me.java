package org.telegram.messenger;

import java.util.HashSet;
import java.util.function.Supplier;
public final class me implements Supplier {
    @Override
    public final Object get() {
        return new HashSet();
    }
}
