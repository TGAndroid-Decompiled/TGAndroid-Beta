package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.k f13541a;
    public final n0 f13542b;

    public m0(n0 n0Var, androidx.mediarouter.app.k kVar) {
        this.f13542b = n0Var;
        this.f13541a = kVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13542b.T.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13541a);
        }
    }
}
