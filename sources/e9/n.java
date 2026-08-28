package e9;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final long f5020a;
    public final o f5021b;

    public n(o oVar, long j10) {
        this.f5021b = oVar;
        this.f5020a = j10;
    }

    @Override
    public final Object call() {
        Bundle h = aa.d.h(1, "fatal");
        h.putLong("timestamp", this.f5020a);
        this.f5021b.f5031k.V1(h);
        return null;
    }
}
