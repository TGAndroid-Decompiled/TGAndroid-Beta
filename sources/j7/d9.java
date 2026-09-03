package j7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class d9 {
    public final d6.b f8958a;
    public final AtomicLong f8959b;

    public d9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f8959b = new AtomicLong(-1L);
                this.f8958a = new com.google.android.gms.common.api.j(context, d6.b.f4203k, new b6.q("mlkit:vision"), com.google.android.gms.common.api.i.f2713c);
                return;
            case 2:
                this.f8959b = new AtomicLong(-1L);
                this.f8958a = new com.google.android.gms.common.api.j(context, d6.b.f4203k, new b6.q("mlkit:vision"), com.google.android.gms.common.api.i.f2713c);
                return;
            default:
                this.f8959b = new AtomicLong(-1L);
                this.f8958a = new com.google.android.gms.common.api.j(context, d6.b.f4203k, new b6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f2713c);
                return;
        }
    }
}
