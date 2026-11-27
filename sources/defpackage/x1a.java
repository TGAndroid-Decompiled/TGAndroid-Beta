package defpackage;

import android.view.View;
public final class x1a implements View.OnLayoutChangeListener {
    public final b2a a;

    public x1a(b2a b2aVar) {
        this.a = b2aVar;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b1();
    }
}
