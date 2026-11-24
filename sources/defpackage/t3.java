package defpackage;

import java.util.concurrent.CancellationException;
public final class t3 {
    public static final t3 c;
    public static final t3 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (a4.d) {
            d = null;
            c = null;
            return;
        }
        d = new t3(false, null);
        c = new t3(true, null);
    }

    public t3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
