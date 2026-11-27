package defpackage;

import android.view.View;
public final class fp1 implements View.OnAttachStateChangeListener {
    public final byte a;
    public final ul b;

    public fp1(ul ulVar, byte b) {
        this.a = b;
        this.b = ulVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        ul ulVar = this.b;
        switch (b) {
            case 0:
                ulVar.a();
                return;
            case 1:
                ulVar.a();
                return;
            default:
                ulVar.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        ul ulVar = this.b;
        switch (b) {
            case 0:
                ulVar.b();
                return;
            case 1:
                ulVar.b();
                return;
            default:
                ulVar.b();
                return;
        }
    }
}
