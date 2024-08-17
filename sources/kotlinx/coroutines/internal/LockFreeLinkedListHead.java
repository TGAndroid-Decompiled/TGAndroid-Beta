package kotlinx.coroutines.internal;

public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    @Override
    public boolean isRemoved() {
        return false;
    }
}
