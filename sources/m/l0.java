package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f20111a;
    public final m0 f20112b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f20112b = m0Var;
        this.f20111a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f20112b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f20111a);
        }
    }
}
