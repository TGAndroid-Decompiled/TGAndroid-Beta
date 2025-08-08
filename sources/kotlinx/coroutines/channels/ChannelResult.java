package kotlinx.coroutines.channels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class ChannelResult {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();

    public static Object m257constructorimpl(Object obj) {
        return obj;
    }

    public static final boolean m261isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    public static final boolean m260isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    public static final Object m259getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    public static final Throwable m258exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Object m264successJP2dKIU(Object obj) {
            return ChannelResult.m257constructorimpl(obj);
        }

        public final Object m263failurePtdJZtk() {
            return ChannelResult.m257constructorimpl(ChannelResult.failed);
        }

        public final Object m262closedJP2dKIU(Throwable th) {
            return ChannelResult.m257constructorimpl(new Closed(th));
        }
    }
}
