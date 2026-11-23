package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final long f826a;
    public final p f827b;

    public o(p pVar, long j3) {
        this.f827b = pVar;
        this.f826a = j3;
    }

    @Override
    public final Object call() {
        Bundle f10 = p5.c.f(1, "fatal");
        f10.putLong("timestamp", this.f826a);
        this.f827b.f838k.I(f10);
        return null;
    }
}
