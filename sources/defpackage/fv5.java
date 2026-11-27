package defpackage;

import java.util.concurrent.CancellationException;
public final class fv5 extends CancellationException {
    public final transient ev5 a;

    public fv5(String str, Throwable th, ev5 ev5Var) {
        super(str);
        this.a = ev5Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof fv5) {
                fv5 fv5Var = (fv5) obj;
                if (!ur5.a(fv5Var.getMessage(), getMessage()) || !ur5.a(fv5Var.a, this.a) || !ur5.a(fv5Var.getCause(), getCause())) {
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
