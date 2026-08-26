package kotlinx.coroutines;

public final class IncompleteStateBox {
    public final Incomplete state;

    public IncompleteStateBox(Incomplete incomplete) {
        this.state = incomplete;
    }
}
