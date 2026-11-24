package defpackage;

import java.util.concurrent.CancellationException;
public final class bv5 extends CancellationException {
    public final transient av5 a;

    public bv5(String str, Throwable th, av5 av5Var) {
        super(str);
        this.a = av5Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof bv5) {
                bv5 bv5Var = (bv5) obj;
                if (!rr5.a(bv5Var.getMessage(), getMessage()) || !rr5.a(bv5Var.a, this.a) || !rr5.a(bv5Var.getCause(), getCause())) {
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
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
