package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f20208a;
    public final m0 f20209b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f20209b = m0Var;
        this.f20208a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f20209b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f20208a);
        }
    }
}
