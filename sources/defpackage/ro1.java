package defpackage;

import android.view.View;
public final class ro1 implements View.OnAttachStateChangeListener {
    public final byte a;
    public final tl b;

    public ro1(tl tlVar, byte b) {
        this.a = b;
        this.b = tlVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        tl tlVar = this.b;
        switch (b) {
            case 0:
                tlVar.a();
                return;
            case 1:
                tlVar.a();
                return;
            default:
                tlVar.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        tl tlVar = this.b;
        switch (b) {
            case 0:
                tlVar.b();
                return;
            case 1:
                tlVar.b();
                return;
            default:
                tlVar.b();
                return;
        }
    }
}
