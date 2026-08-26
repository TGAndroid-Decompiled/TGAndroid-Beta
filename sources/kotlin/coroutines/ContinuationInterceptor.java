package kotlin.coroutines;

public interface ContinuationInterceptor extends CoroutineContext.Element {

    public final class Key implements CoroutineContext.Key {
        public static final Key $$INSTANCE = new Key();
    }
}
