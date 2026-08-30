package c2;

import android.os.Handler;
import java.lang.ref.WeakReference;
public final class u0 extends Handler {
    public final int f2008a;
    public WeakReference f2009b;

    public u0(int i10) {
        this.f2008a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r39) {
        throw new UnsupportedOperationException("Method not decompiled: c2.u0.handleMessage(android.os.Message):void");
    }

    public u0(s0 s0Var) {
        this.f2008a = 0;
        this.f2009b = new WeakReference(s0Var);
    }
}
