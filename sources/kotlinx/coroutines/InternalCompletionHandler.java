package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

public interface InternalCompletionHandler {

    public final class UserSupplied implements InternalCompletionHandler {
        public final Function1 handler;

        public UserSupplied(Function1 function1) {
            this.handler = function1;
        }

        @Override
        public final void invoke(Throwable th) {
            this.handler.invoke(th);
        }

        public final String toString() {
            return "InternalCompletionHandler.UserSupplied[" + this.handler.getClass().getSimpleName() + '@' + JobKt.getHexAddress(this) + ']';
        }
    }

    void invoke(Throwable th);
}
