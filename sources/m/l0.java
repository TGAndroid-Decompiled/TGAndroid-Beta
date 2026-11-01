package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f12454a;
    public final m0 f12455b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f12455b = m0Var;
        this.f12454a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f12455b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f12454a);
        }
    }
}
