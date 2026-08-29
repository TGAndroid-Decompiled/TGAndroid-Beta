package g9;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final long f7177a;
    public final p f7178b;

    public o(p pVar, long j10) {
        this.f7178b = pVar;
        this.f7177a = j10;
    }

    @Override
    public final Object call() {
        Bundle h = a4.w.h(1, "fatal");
        h.putLong("timestamp", this.f7177a);
        this.f7178b.f7188k.a(h);
        return null;
    }
}
