package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class p implements Callable {
    public final long f830a;
    public final q f831b;

    public p(q qVar, long j3) {
        this.f831b = qVar;
        this.f830a = j3;
    }

    @Override
    public final Object call() {
        Bundle f10 = rf.b.f(1, "fatal");
        f10.putLong("timestamp", this.f830a);
        this.f831b.f842k.a2(f10);
        return null;
    }
}
