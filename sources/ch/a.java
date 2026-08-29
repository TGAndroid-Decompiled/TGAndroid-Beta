package ch;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f3473a;

    public a(b bVar) {
        this.f3473a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f3473a.f3476c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f3473a.f3476c.f();
    }
}
