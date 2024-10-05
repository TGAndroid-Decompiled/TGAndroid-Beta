package kotlinx.coroutines.android;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;

public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    private HandlerDispatcher() {
    }

    public HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
