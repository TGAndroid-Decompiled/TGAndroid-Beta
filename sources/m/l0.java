package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f17760a;
    public final m0 f17761b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f17761b = m0Var;
        this.f17760a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f17761b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f17760a);
        }
    }
}
