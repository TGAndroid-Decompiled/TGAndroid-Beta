package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class zxe {
    public final u84 a;
    public final AtomicLong b;

    public zxe(Context context, byte b) {
        switch (b) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new by4(context, u84.o, new ngb("mlkit:vision"), ay4.c);
                return;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new by4(context, u84.o, new ngb("mlkit:natural_language"), ay4.c);
                return;
        }
    }
}
