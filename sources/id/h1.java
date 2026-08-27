package id;

import java.util.concurrent.CancellationException;

public final class h1 extends CancellationException {

    public final transient g1 f11157a;

    public h1(String str, Throwable th, g1 g1Var) {
        super(str);
        this.f11157a = g1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.j.a(h1Var.getMessage(), getMessage()) && kotlin.jvm.internal.j.a(h1Var.f11157a, this.f11157a) && kotlin.jvm.internal.j.a(h1Var.getCause(), getCause());
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.j.b(message);
        int iHashCode = (this.f11157a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return super.toString() + "; job=" + this.f11157a;
    }
}
