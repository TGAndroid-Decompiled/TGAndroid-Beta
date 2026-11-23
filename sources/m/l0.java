package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f20145a;
    public final m0 f20146b;

    public l0(m0 m0Var, androidx.mediarouter.app.i iVar) {
        this.f20146b = m0Var;
        this.f20145a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f20146b.X.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f20145a);
        }
    }
}
