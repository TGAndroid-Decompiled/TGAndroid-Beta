package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class b0f {
    public final ua4 a;
    public final AtomicLong b;

    public b0f(Context context, byte b) {
        switch (b) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new c05(context, ua4.o, new oib("mlkit:vision"), b05.c);
                return;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new c05(context, ua4.o, new oib("mlkit:natural_language"), b05.c);
                return;
        }
    }
}
