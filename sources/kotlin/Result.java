package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Result implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final Object value;

    public static final Result m290boximpl(Object obj) {
        return new Result(obj);
    }

    public static Object m291constructorimpl(Object obj) {
        return obj;
    }

    public static boolean m292equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).m298unboximpl());
    }

    public static int m294hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return m292equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m294hashCodeimpl(this.value);
    }

    public final Object m298unboximpl() {
        return this.value;
    }

    private Result(Object obj) {
        this.value = obj;
    }

    public static final boolean m296isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    public static final boolean m295isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    public static final Throwable m293exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public String toString() {
        return m297toStringimpl(this.value);
    }

    public static String m297toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }
}
