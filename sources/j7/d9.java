package j7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class d9 {
    public final d6.b f8976a;
    public final AtomicLong f8977b;

    public d9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f8977b = new AtomicLong(-1L);
                this.f8976a = new com.google.android.gms.common.api.j(context, d6.b.f4222k, new b6.q("mlkit:vision"), com.google.android.gms.common.api.i.f2730c);
                return;
            case 2:
                this.f8977b = new AtomicLong(-1L);
                this.f8976a = new com.google.android.gms.common.api.j(context, d6.b.f4222k, new b6.q("mlkit:vision"), com.google.android.gms.common.api.i.f2730c);
                return;
            default:
                this.f8977b = new AtomicLong(-1L);
                this.f8976a = new com.google.android.gms.common.api.j(context, d6.b.f4222k, new b6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f2730c);
                return;
        }
    }
}
