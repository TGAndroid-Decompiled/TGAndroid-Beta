package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f15779a;
    public final m0 f15780b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f15780b = m0Var;
        this.f15779a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f15780b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f15779a);
        }
    }
}
