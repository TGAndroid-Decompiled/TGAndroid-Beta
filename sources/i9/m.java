package i9;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class m implements Callable {
    public final long f7379a;
    public final n f7380b;

    public m(n nVar, long j10) {
        this.f7380b = nVar;
        this.f7379a = j10;
    }

    @Override
    public final Object call() {
        Bundle h = android.support.v4.media.a.h(1, "fatal");
        h.putLong("timestamp", this.f7379a);
        this.f7380b.f7389k.q2(h);
        return null;
    }
}
