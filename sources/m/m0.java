package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.k f17000a;
    public final n0 f17001b;

    public m0(n0 n0Var, androidx.mediarouter.app.k kVar) {
        this.f17001b = n0Var;
        this.f17000a = kVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f17001b.S.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f17000a);
        }
    }
}
