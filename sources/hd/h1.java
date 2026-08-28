package hd;

import java.util.concurrent.CancellationException;
public final class h1 extends CancellationException {
    public final transient g1 f10448a;

    public h1(String str, Throwable th, g1 g1Var) {
        super(str);
        this.f10448a = g1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (!kotlin.jvm.internal.i.a(h1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(h1Var.f10448a, this.f10448a) || !kotlin.jvm.internal.i.a(h1Var.getCause(), getCause())) {
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
        int i9;
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = (this.f10448a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i9 = cause.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    @Override
    public final String toString() {
        return super.toString() + "; job=" + this.f10448a;
    }
}
