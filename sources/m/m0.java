package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.h f16597a;
    public final n0 f16598b;

    public m0(n0 n0Var, androidx.mediarouter.app.h hVar) {
        this.f16598b = n0Var;
        this.f16597a = hVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f16598b.S.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f16597a);
        }
    }
}
