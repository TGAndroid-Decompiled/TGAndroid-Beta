package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f14444a;
    public final m0 f14445b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f14445b = m0Var;
        this.f14444a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14445b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14444a);
        }
    }
}
