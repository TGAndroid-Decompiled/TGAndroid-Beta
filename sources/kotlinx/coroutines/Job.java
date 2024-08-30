package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

public interface Job extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    public static final class Key implements CoroutineContext.Key {
        static final Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
