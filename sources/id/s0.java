package id;

import java.lang.reflect.InvocationTargetException;

public final class s0 extends u0 {

    public final m f11192c;
    public final w0 d;

    public s0(w0 w0Var, long j10, m mVar) {
        super(j10);
        this.d = w0Var;
        this.f11192c = mVar;
    }

    @Override
    public final void run() throws IllegalAccessException, InvocationTargetException {
        this.f11192c.D(this.d);
    }

    @Override
    public final String toString() {
        return super.toString() + this.f11192c;
    }
}
