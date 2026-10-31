package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.n0;
public final class c extends Handler {
    public final int f7168a;
    public WeakReference f7169b;

    public c(int i10) {
        this.f7168a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(n0 n0Var) {
        this.f7168a = 2;
        this.f7169b = new WeakReference(n0Var);
    }
}
