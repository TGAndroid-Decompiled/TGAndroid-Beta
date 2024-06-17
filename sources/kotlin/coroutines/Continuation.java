package kotlin.coroutines;

public interface Continuation<T> {
    CoroutineContext getContext();

    void resumeWith(Object obj);
}
