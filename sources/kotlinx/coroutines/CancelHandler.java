package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

public interface CancelHandler extends NotCompleted {
    void invoke(Throwable th);

    public static final class UserSupplied implements CancelHandler {
        private final Function1 handler;

        public UserSupplied(Function1 function1) {
            this.handler = function1;
        }

        @Override
        public void invoke(Throwable th) {
            this.handler.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + DebugStringsKt.getClassSimpleName(this.handler) + '@' + DebugStringsKt.getHexAddress(this) + ']';
        }
    }
}
