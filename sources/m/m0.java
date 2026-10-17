package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f16244a;
    public final n0 f16245b;

    public m0(n0 n0Var, androidx.mediarouter.app.i iVar) {
        this.f16245b = n0Var;
        this.f16244a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f16245b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f16244a);
        }
    }
}
