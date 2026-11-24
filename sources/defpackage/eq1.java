package defpackage;

import android.view.View;
public final class eq1 implements View.OnAttachStateChangeListener {
    public final byte a;
    public final tm b;

    public eq1(tm tmVar, byte b) {
        this.a = b;
        this.b = tmVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                tmVar.a();
                return;
            case 1:
                tmVar.a();
                return;
            default:
                tmVar.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                tmVar.b();
                return;
            case 1:
                tmVar.b();
                return;
            default:
                tmVar.b();
                return;
        }
    }
}
