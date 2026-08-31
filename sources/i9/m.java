package i9;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class m implements Callable {
    public final long f7962a;
    public final n f7963b;

    public m(n nVar, long j10) {
        this.f7963b = nVar;
        this.f7962a = j10;
    }

    @Override
    public final Object call() {
        Bundle h = android.support.v4.media.a.h(1, "fatal");
        h.putLong("timestamp", this.f7962a);
        this.f7963b.f7973k.A(h);
        return null;
    }
}
