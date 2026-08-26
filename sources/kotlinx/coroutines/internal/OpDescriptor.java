package kotlinx.coroutines.internal;

import kotlinx.coroutines.JobKt;

public abstract class OpDescriptor {
    public abstract Object perform(Object obj);

    public final String toString() {
        return getClass().getSimpleName() + '@' + JobKt.getHexAddress(this);
    }
}
