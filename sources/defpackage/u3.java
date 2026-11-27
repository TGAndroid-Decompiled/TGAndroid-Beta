package defpackage;

import java.util.concurrent.CancellationException;
public final class u3 {
    public static final u3 c;
    public static final u3 d;
    public final boolean a;
    public final CancellationException b;

    static {
        if (b4.d) {
            d = null;
            c = null;
            return;
        }
        d = new u3(false, null);
        c = new u3(true, null);
    }

    public u3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
