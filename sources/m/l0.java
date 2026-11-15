package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f19750a;
    public final m0 f19751b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f19751b = m0Var;
        this.f19750a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f19751b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f19750a);
        }
    }
}
