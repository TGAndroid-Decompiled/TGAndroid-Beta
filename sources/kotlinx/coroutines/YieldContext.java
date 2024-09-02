package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class YieldContext extends AbstractCoroutineContextElement {
    public static final Key Key = new Key(null);
    public boolean dispatcherWasUnconfined;

    public static final class Key implements CoroutineContext.Key<YieldContext> {
        public Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public YieldContext() {
        super(Key);
    }
}
