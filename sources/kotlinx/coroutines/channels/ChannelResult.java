package kotlinx.coroutines.channels;

import kotlin.jvm.internal.Intrinsics;

public abstract class ChannelResult {
    public static final Failed failed = new Failed();

    public final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Closed) {
                return Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override
        public final String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public class Failed {
        public String toString() {
            return "Failed";
        }
    }
}
