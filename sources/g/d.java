package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.m0;
public final class d extends Handler {
    public final int f8366a;
    public WeakReference f8367b;

    public d(int i10) {
        this.f8366a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r40) {
        throw new UnsupportedOperationException("Method not decompiled: g.d.handleMessage(android.os.Message):void");
    }

    public d(m0 m0Var) {
        this.f8366a = 2;
        this.f8367b = new WeakReference(m0Var);
    }
}
