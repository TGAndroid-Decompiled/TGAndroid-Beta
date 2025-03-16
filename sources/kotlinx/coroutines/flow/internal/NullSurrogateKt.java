package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.Symbol;

public abstract class NullSurrogateKt {
    public static final Symbol NULL = new Symbol("NULL");
    public static final Symbol UNINITIALIZED = new Symbol("UNINITIALIZED");
    public static final Symbol DONE = new Symbol("DONE");
}
