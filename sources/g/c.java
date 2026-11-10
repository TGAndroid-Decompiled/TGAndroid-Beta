package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import s4.m0;
public final class c extends Handler {
    public final int f13298a;
    public WeakReference f13299b;

    public c(int i7) {
        this.f13298a = i7;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(m0 m0Var) {
        this.f13298a = 2;
        this.f13299b = new WeakReference(m0Var);
    }
}
