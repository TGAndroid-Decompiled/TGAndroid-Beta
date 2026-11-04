package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import r4.n0;
public final class c extends Handler {
    public final int f11680a;
    public WeakReference f11681b;

    public c(int i3) {
        this.f11680a = i3;
    }

    @Override
    public final void handleMessage(android.os.Message r44) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(n0 n0Var) {
        this.f11680a = 2;
        this.f11681b = new WeakReference(n0Var);
    }
}
