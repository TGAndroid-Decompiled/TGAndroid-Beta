package ld;

import java.util.concurrent.CancellationException;
public final class g1 extends CancellationException {
    public final transient f1 f11890a;

    public g1(String str, Throwable th2, f1 f1Var) {
        super(str);
        this.f11890a = f1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof g1) {
                g1 g1Var = (g1) obj;
                if (!kotlin.jvm.internal.j.a(g1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.j.a(g1Var.f11890a, this.f11890a) || !kotlin.jvm.internal.j.a(g1Var.getCause(), getCause())) {
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
        kotlin.jvm.internal.j.b(message);
        int hashCode = (this.f11890a.hashCode() + (message.hashCode() * 31)) * 31;
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
        return super.toString() + "; job=" + this.f11890a;
    }
}
