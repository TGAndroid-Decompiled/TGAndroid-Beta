package fh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f6641a;

    public a(b bVar) {
        this.f6641a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f6641a.f6644c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f6641a.f6644c.f();
    }
}
