package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.k f13236a;
    public final m0 f13237b;

    public l0(m0 m0Var, androidx.mediarouter.app.k kVar) {
        this.f13237b = m0Var;
        this.f13236a = kVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13237b.T.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13236a);
        }
    }
}
