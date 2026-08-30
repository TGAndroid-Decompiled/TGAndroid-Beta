package eh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f5590a;

    public a(b bVar) {
        this.f5590a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f5590a.f5593c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f5590a.f5593c.f();
    }
}
