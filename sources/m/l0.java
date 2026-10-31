package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f12453a;
    public final m0 f12454b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f12454b = m0Var;
        this.f12453a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f12454b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f12453a);
        }
    }
}
