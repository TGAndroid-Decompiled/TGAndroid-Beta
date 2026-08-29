package h7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class b9 {
    public final b6.c f7567a;
    public final AtomicLong f7568b;

    public b9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f7568b = new AtomicLong(-1L);
                this.f7567a = new com.google.android.gms.common.api.j(context, b6.c.f1939k, new z5.p("mlkit:vision"), com.google.android.gms.common.api.i.f3767c);
                return;
            case 2:
                this.f7568b = new AtomicLong(-1L);
                this.f7567a = new com.google.android.gms.common.api.j(context, b6.c.f1939k, new z5.p("mlkit:vision"), com.google.android.gms.common.api.i.f3767c);
                return;
            default:
                this.f7568b = new AtomicLong(-1L);
                this.f7567a = new com.google.android.gms.common.api.j(context, b6.c.f1939k, new z5.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f3767c);
                return;
        }
    }
}
