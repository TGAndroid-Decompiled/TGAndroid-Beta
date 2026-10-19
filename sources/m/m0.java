package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f16250a;
    public final n0 f16251b;

    public m0(n0 n0Var, androidx.mediarouter.app.i iVar) {
        this.f16251b = n0Var;
        this.f16250a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f16251b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f16250a);
        }
    }
}
