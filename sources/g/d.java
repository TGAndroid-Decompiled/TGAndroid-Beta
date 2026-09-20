package g;

import android.os.Handler;
import java.lang.ref.WeakReference;
import p4.m0;
public final class d extends Handler {
    public final int f9238a;
    public WeakReference f9239b;

    public d(int i10) {
        this.f9238a = i10;
    }

    @Override
    public final void handleMessage(android.os.Message r43) {
        throw new UnsupportedOperationException("Method not decompiled: g.d.handleMessage(android.os.Message):void");
    }

    public d(m0 m0Var) {
        this.f9238a = 2;
        this.f9239b = new WeakReference(m0Var);
    }
}
