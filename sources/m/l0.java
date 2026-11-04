package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f18638a;
    public final m0 f18639b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f18639b = m0Var;
        this.f18638a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f18639b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f18638a);
        }
    }
}
