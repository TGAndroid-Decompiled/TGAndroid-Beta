package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import s4.m0;
public final class c extends Handler {
    public final int f12646a;
    public WeakReference f12647b;

    public c(int i7) {
        this.f12646a = i7;
    }

    @Override
    public final void handleMessage(android.os.Message r44) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(m0 m0Var) {
        this.f12646a = 2;
        this.f12647b = new WeakReference(m0Var);
    }
}
