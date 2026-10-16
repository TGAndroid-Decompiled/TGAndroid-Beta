package be;

import java.util.concurrent.CancellationException;
public final class h1 extends CancellationException {
    public final transient g1 f2682a;

    public h1(String str, Throwable th2, g1 g1Var) {
        super(str);
        this.f2682a = g1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (!kotlin.jvm.internal.i.a(h1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(h1Var.f2682a, this.f2682a) || !kotlin.jvm.internal.i.a(h1Var.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i10;
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f2682a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override
    public final String toString() {
        return super.toString() + "; job=" + this.f2682a;
    }
}
