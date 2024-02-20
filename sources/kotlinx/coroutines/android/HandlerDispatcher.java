package kotlinx.coroutines.android;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HandlerDispatcher() {
    }
}
