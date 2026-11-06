package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m0 implements PopupWindow.OnDismissListener {
    public final androidx.mediarouter.app.i f19154a;
    public final n0 f19155b;

    public m0(n0 n0Var, androidx.mediarouter.app.i iVar) {
        this.f19155b = n0Var;
        this.f19154a = iVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f19155b.W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f19154a);
        }
    }
}
