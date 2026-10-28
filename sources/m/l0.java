package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f17759a;
    public final m0 f17760b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f17760b = m0Var;
        this.f17759a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f17760b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f17759a);
        }
    }
}
