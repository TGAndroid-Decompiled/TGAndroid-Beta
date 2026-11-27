package defpackage;

import android.view.ViewTreeObserver;
public final class jx1 implements ViewTreeObserver.OnDrawListener {
    public final wla a;
    public final a8a b;

    public jx1(wla wlaVar, a8a a8aVar) {
        this.a = wlaVar;
        this.b = a8aVar;
    }

    @Override
    public final void onDraw() {
        wla wlaVar = this.a;
        wlaVar.post(new on1(this, wlaVar, this.b, (byte) 10));
    }
}
