package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.j f15721a;
    public final m0 f15722b;

    public l0(m0 m0Var, androidx.mediarouter.app.j jVar) {
        this.f15722b = m0Var;
        this.f15721a = jVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f15722b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f15721a);
        }
    }
}
