package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f15147a;
    public final m0 f15148b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f15148b = m0Var;
        this.f15147a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f15148b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f15147a);
        }
    }
}
