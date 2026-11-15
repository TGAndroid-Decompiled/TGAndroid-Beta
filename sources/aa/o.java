package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final long f827a;
    public final p f828b;

    public o(p pVar, long j3) {
        this.f828b = pVar;
        this.f827a = j3;
    }

    @Override
    public final Object call() {
        Bundle f10 = r.b.f(1, "fatal");
        f10.putLong("timestamp", this.f827a);
        this.f828b.f839k.O(f10);
        return null;
    }
}
