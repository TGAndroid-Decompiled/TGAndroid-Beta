package b8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class jg {
    public final r6.d f2699a;
    public final AtomicLong f2700b;

    public jg(Context context, int i3) {
        switch (i3) {
            case 1:
                this.f2700b = new AtomicLong(-1L);
                this.f2699a = new com.google.android.gms.common.api.j(context, r6.d.f54400m, new p6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f6594c);
                return;
            case 2:
                this.f2700b = new AtomicLong(-1L);
                this.f2699a = new com.google.android.gms.common.api.j(context, r6.d.f54400m, new p6.q("mlkit:vision"), com.google.android.gms.common.api.i.f6594c);
                return;
            default:
                this.f2700b = new AtomicLong(-1L);
                this.f2699a = new com.google.android.gms.common.api.j(context, r6.d.f54400m, new p6.q("mlkit:vision"), com.google.android.gms.common.api.i.f6594c);
                return;
        }
    }
}
