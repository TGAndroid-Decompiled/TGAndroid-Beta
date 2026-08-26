package kotlinx.coroutines;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

public final class NodeList extends LockFreeLinkedListNode implements Incomplete {
    @Override
    public final NodeList getList() {
        return this;
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    @Override
    public final boolean isRemoved() {
        return false;
    }
}
