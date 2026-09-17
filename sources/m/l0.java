package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f14228a;
    public final m0 f14229b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f14229b = m0Var;
        this.f14228a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14229b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14228a);
        }
    }
}
