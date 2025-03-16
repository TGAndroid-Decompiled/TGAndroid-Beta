package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

public abstract class StateFlowKt {
    private static final Symbol NONE = new Symbol("NONE");
    private static final Symbol PENDING = new Symbol("PENDING");

    public static final MutableStateFlow MutableStateFlow(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(obj);
    }

    public static final Symbol access$getNONE$p() {
        return NONE;
    }

    public static final Symbol access$getPENDING$p() {
        return PENDING;
    }
}
