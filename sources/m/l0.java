package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.k f13238a;
    public final m0 f13239b;

    public l0(m0 m0Var, androidx.mediarouter.app.k kVar) {
        this.f13239b = m0Var;
        this.f13238a = kVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13239b.T.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13238a);
        }
    }
}
