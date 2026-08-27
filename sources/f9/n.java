package f9;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class n implements Callable {

    public final long f5952a;

    public final o f5953b;

    public n(o oVar, long j10) {
        this.f5953b = oVar;
        this.f5952a = j10;
    }

    @Override
    public final Object call() {
        Bundle bundleG = a9.p.g(1, "fatal");
        bundleG.putLong("timestamp", this.f5952a);
        this.f5953b.f5963k.s(bundleG);
        return null;
    }
}
