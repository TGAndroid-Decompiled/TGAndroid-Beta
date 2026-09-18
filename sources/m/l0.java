package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f14403a;
    public final m0 f14404b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f14404b = m0Var;
        this.f14403a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14404b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14403a);
        }
    }
}
