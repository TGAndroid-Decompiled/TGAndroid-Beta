package defpackage;

import android.view.ViewTreeObserver;
public final class vw1 implements ViewTreeObserver.OnDrawListener {
    public final bia a;
    public final i4a b;

    public vw1(bia biaVar, i4a i4aVar) {
        this.a = biaVar;
        this.b = i4aVar;
    }

    @Override
    public final void onDraw() {
        bia biaVar = this.a;
        biaVar.post(new jn1(this, biaVar, this.b, (byte) 8));
    }
}
