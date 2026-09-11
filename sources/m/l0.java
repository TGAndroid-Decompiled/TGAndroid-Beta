package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f15564a;
    public final m0 f15565b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f15565b = m0Var;
        this.f15564a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f15565b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f15564a);
        }
    }
}
