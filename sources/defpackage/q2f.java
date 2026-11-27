package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class q2f {
    public final qa4 a;
    public final AtomicLong b;

    public q2f(Context context, byte b) {
        switch (b) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new h05(context, qa4.o, new jkb("mlkit:vision"), g05.c);
                return;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new h05(context, qa4.o, new jkb("mlkit:natural_language"), g05.c);
                return;
        }
    }
}
