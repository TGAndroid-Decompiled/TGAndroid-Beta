package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f13053a;
    public final m0 f13054b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f13054b = m0Var;
        this.f13053a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13054b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13053a);
        }
    }
}
