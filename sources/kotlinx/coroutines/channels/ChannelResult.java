package kotlinx.coroutines.channels;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class ChannelResult {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();

    public static Object m332constructorimpl(Object obj) {
        return obj;
    }

    public static final boolean m336isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    public static final boolean m335isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    public static final Object m334getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    public static final Throwable m333exceptionOrNullimpl(Object obj) {
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

        public final Object m339successJP2dKIU(Object obj) {
            return ChannelResult.m332constructorimpl(obj);
        }

        public final Object m338failurePtdJZtk() {
            return ChannelResult.m332constructorimpl(ChannelResult.failed);
        }

        public final Object m337closedJP2dKIU(Throwable th) {
            return ChannelResult.m332constructorimpl(new Closed(th));
        }
    }
}
