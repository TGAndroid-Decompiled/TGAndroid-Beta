package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.m0;
public final class c extends Handler {
    public final int f12114a;
    public WeakReference f12115b;

    public c(int i10) {
        this.f12114a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(m0 m0Var) {
        this.f12114a = 2;
        this.f12115b = new WeakReference(m0Var);
    }
}
