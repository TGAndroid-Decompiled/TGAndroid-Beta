package ae;

import java.util.concurrent.CancellationException;
public final class i1 extends CancellationException {
    public final transient h1 f466a;

    public i1(String str, Throwable th2, h1 h1Var) {
        super(str);
        this.f466a = h1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i1) {
                i1 i1Var = (i1) obj;
                if (!kotlin.jvm.internal.i.a(i1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(i1Var.f466a, this.f466a) || !kotlin.jvm.internal.i.a(i1Var.getCause(), getCause())) {
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
        int hashCode = (this.f466a.hashCode() + (message.hashCode() * 31)) * 31;
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
        return super.toString() + "; job=" + this.f466a;
    }
}
