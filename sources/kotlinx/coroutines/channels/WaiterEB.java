package kotlinx.coroutines.channels;

import kotlinx.coroutines.Waiter;

public final class WaiterEB {
    public final Waiter waiter;

    public WaiterEB(Waiter waiter) {
        this.waiter = waiter;
    }

    public final String toString() {
        return "WaiterEB(" + this.waiter + ')';
    }
}
