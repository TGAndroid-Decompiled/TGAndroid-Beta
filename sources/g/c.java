package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.n0;
public final class c extends Handler {
    public final int f9740a;
    public WeakReference f9741b;

    public c(int i10) {
        this.f9740a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(n0 n0Var) {
        this.f9740a = 2;
        this.f9741b = new WeakReference(n0Var);
    }
}
