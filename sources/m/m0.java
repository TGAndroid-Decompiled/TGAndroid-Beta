package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

public final class m0 implements PopupWindow.OnDismissListener {

    public final l.d f17375a;

    public final n0 f17376b;

    public m0(n0 n0Var, l.d dVar) {
        this.f17376b = n0Var;
        this.f17375a = dVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f17376b.S.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f17375a);
        }
    }
}
