package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14523a;
    public final ViewGroup f14524b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14523a = i10;
        this.f14524b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14523a) {
            case 0:
                SearchView searchView = (SearchView) this.f14524b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2005d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f14524b;
                h3Var.h = z10;
                if (h3Var.f20373f) {
                    h3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f14524b;
                k3Var.f20530n = z10;
                if (k3Var.f20529f) {
                    k3Var.c();
                }
                k3Var.a(z10);
                return;
        }
    }
}
