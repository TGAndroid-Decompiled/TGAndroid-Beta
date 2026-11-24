package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
public final class vr2 extends wf6 {
    public final TimeUnit j;

    public vr2(String str, LongSupplier longSupplier, TimeUnit timeUnit, int i) {
        super(str, longSupplier, 0L, Long.MAX_VALUE, i);
        this.j = timeUnit;
    }

    public final long g(TimeUnit timeUnit) {
        return timeUnit.convert(f(), this.j);
    }

    public final String toString() {
        return this.a + "=" + f() + " " + this.j;
    }
}
