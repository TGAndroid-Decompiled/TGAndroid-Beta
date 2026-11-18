package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f20117a;
    public final m0 f20118b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f20118b = m0Var;
        this.f20117a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f20118b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f20117a);
        }
    }
}
