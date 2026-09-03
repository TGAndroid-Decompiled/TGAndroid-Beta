package eh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f5579a;

    public a(b bVar) {
        this.f5579a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f5579a.f5582c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f5579a.f5582c.f();
    }
}
