package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.x;
public final class kyc implements eo4 {
    public final Context a;

    public kyc(Context context) {
        this.a = context;
    }

    @Override
    public final void a() {
        x xVar = x.v;
        synchronized (xVar.a) {
            xVar.l = false;
        }
        xVar.b.removeCallbacks(xVar.u);
        xVar.b.postDelayed(xVar.u, 30000L);
    }

    @Override
    public final void b() {
        Utilities.e.c(new dh1(this.a, (byte) 29));
    }
}
