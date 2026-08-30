package i9;

import android.os.Bundle;
import java.util.concurrent.Callable;
public final class m implements Callable {
    public final long f7397a;
    public final n f7398b;

    public m(n nVar, long j10) {
        this.f7398b = nVar;
        this.f7397a = j10;
    }

    @Override
    public final Object call() {
        Bundle h = android.support.v4.media.a.h(1, "fatal");
        h.putLong("timestamp", this.f7397a);
        this.f7398b.f7407k.K(h);
        return null;
    }
}
