package f7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class d9 {
    public final z5.b f5643a;
    public final AtomicLong f5644b;

    public d9(Context context, int i9) {
        switch (i9) {
            case 1:
                this.f5644b = new AtomicLong(-1L);
                this.f5643a = new com.google.android.gms.common.api.j(context, z5.b.f50307k, new x5.p("mlkit:vision"), com.google.android.gms.common.api.i.f2753c);
                return;
            case 2:
                this.f5644b = new AtomicLong(-1L);
                this.f5643a = new com.google.android.gms.common.api.j(context, z5.b.f50307k, new x5.p("mlkit:vision"), com.google.android.gms.common.api.i.f2753c);
                return;
            default:
                this.f5644b = new AtomicLong(-1L);
                this.f5643a = new com.google.android.gms.common.api.j(context, z5.b.f50307k, new x5.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f2753c);
                return;
        }
    }
}
