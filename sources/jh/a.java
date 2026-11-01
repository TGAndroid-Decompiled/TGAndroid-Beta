package jh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f10389a;

    public a(b bVar) {
        this.f10389a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f10389a.f10392c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f10389a.f10392c.f();
    }
}
