package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import s4.m0;
public final class c extends Handler {
    public final int f13296a;
    public WeakReference f13297b;

    public c(int i7) {
        this.f13296a = i7;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.c.handleMessage(android.os.Message):void");
    }

    public c(m0 m0Var) {
        this.f13296a = 2;
        this.f13297b = new WeakReference(m0Var);
    }
}
