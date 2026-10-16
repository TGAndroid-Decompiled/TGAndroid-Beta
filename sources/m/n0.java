package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f14899a;
    public final o0 f14900b;

    public n0(o0 o0Var, androidx.mediarouter.app.i iVar) {
        this.f14900b = o0Var;
        this.f14899a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14900b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14899a);
        }
    }
}
