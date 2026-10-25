package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.m0;
public final class c extends Handler {
    public final int f12115a;
    public WeakReference f12116b;

    public c(int i10) {
        this.f12115a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(m0 m0Var) {
        this.f12115a = 2;
        this.f12116b = new WeakReference(m0Var);
    }
}
