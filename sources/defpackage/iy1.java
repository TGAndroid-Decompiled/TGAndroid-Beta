package defpackage;

import android.view.ViewTreeObserver;
public final class iy1 implements ViewTreeObserver.OnDrawListener {
    public final dka a;
    public final k6a b;

    public iy1(dka dkaVar, k6a k6aVar) {
        this.a = dkaVar;
        this.b = k6aVar;
    }

    @Override
    public final void onDraw() {
        dka dkaVar = this.a;
        dkaVar.post(new co1(this, dkaVar, this.b, (byte) 10));
    }
}
