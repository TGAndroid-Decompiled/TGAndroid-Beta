package ah;

import android.view.View;

public final class a implements View.OnAttachStateChangeListener {

    public final b f740a;

    public a(b bVar) {
        this.f740a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f740a.f743c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f740a.f743c.f();
    }
}
