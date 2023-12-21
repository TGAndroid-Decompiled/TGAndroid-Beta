package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;
public final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    private final Throwable cause;
    private final String errorHint;

    @Override
    public MainCoroutineDispatcher getImmediate() {
        return this;
    }

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    @Override
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override
    public Void mo151dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        missing();
        throw new KotlinNothingValueException();
    }

    private final Void missing() {
        String stringPlus;
        if (this.cause == null) {
            MainDispatchersKt.throwMissingMainDispatcherException();
            throw new KotlinNothingValueException();
        }
        String str = this.errorHint;
        String str2 = "";
        if (str != null && (stringPlus = Intrinsics.stringPlus(". ", str)) != null) {
            str2 = stringPlus;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Module with the Main dispatcher had failed to initialize", str2), this.cause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.cause;
        sb.append(th != null ? Intrinsics.stringPlus(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
