package defpackage;

import java.util.concurrent.CancellationException;
public final class ct5 extends CancellationException {
    public final transient bt5 a;

    public ct5(String str, Throwable th, bt5 bt5Var) {
        super(str);
        this.a = bt5Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ct5) {
                ct5 ct5Var = (ct5) obj;
                if (!rp5.a(ct5Var.getMessage(), getMessage()) || !rp5.a(ct5Var.a, this.a) || !rp5.a(ct5Var.getCause(), getCause())) {
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
