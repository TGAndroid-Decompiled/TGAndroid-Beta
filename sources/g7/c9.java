package g7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

public final class c9 {

    public final a6.c f6434a;

    public final AtomicLong f6435b;

    public c9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f6435b = new AtomicLong(-1L);
                this.f6434a = new a6.c(context, a6.c.f103k, new y5.p("mlkit:vision"), com.google.android.gms.common.api.i.f3198c);
                break;
            case 2:
                this.f6435b = new AtomicLong(-1L);
                this.f6434a = new a6.c(context, a6.c.f103k, new y5.p("mlkit:vision"), com.google.android.gms.common.api.i.f3198c);
                break;
            default:
                this.f6435b = new AtomicLong(-1L);
                this.f6434a = new a6.c(context, a6.c.f103k, new y5.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f3198c);
                break;
        }
    }
}
