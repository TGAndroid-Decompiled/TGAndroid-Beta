package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f14439a;
    public final m0 f14440b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f14440b = m0Var;
        this.f14439a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14440b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14439a);
        }
    }
}
