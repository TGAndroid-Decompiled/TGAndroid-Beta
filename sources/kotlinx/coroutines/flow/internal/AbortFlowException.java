package kotlinx.coroutines.flow.internal;

import com.google.firebase.sessions.SessionDatastoreImpl;
import java.util.concurrent.CancellationException;

public final class AbortFlowException extends CancellationException {
    public final transient SessionDatastoreImpl.AnonymousClass1.C00001 owner;

    public AbortFlowException(SessionDatastoreImpl.AnonymousClass1.C00001 c00001) {
        super("Flow was aborted, no more elements needed");
        this.owner = c00001;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
