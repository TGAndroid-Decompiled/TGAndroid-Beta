package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class YieldContext extends AbstractCoroutineContextElement {
    public static final Key Key = new Key(null);

    public static final class Key implements CoroutineContext.Key {
        private Key() {
        }

        public Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
