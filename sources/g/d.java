package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.m0;
public final class d extends Handler {
    public final int f10202a;
    public WeakReference f10203b;

    public d(int i10) {
        this.f10202a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r42) {
        throw new UnsupportedOperationException("Method not decompiled: g.d.handleMessage(android.os.Message):void");
    }

    public d(m0 m0Var) {
        this.f10202a = 2;
        this.f10203b = new WeakReference(m0Var);
    }
}
