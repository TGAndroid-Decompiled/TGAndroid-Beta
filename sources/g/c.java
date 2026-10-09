package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.m0;
public final class c extends Handler {
    public final int f10108a;
    public WeakReference f10109b;

    public c(int i10) {
        this.f10108a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(m0 m0Var) {
        this.f10108a = 2;
        this.f10109b = new WeakReference(m0Var);
    }
}
