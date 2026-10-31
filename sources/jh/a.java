package jh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f10388a;

    public a(b bVar) {
        this.f10388a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f10388a.f10391c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f10388a.f10391c.f();
    }
}
