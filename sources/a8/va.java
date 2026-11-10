package a8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class va {
    public final s6.d f688a;
    public final AtomicLong f689b;

    public va(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f689b = new AtomicLong(-1L);
                this.f688a = new com.google.android.gms.common.api.j(context, s6.d.f54944m, new q6.q("mlkit:vision"), com.google.android.gms.common.api.i.f6545c);
                return;
            case 2:
                this.f689b = new AtomicLong(-1L);
                this.f688a = new com.google.android.gms.common.api.j(context, s6.d.f54944m, new q6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f6545c);
                return;
            default:
                this.f689b = new AtomicLong(-1L);
                this.f688a = new com.google.android.gms.common.api.j(context, s6.d.f54944m, new q6.q("mlkit:vision"), com.google.android.gms.common.api.i.f6545c);
                return;
        }
    }
}
