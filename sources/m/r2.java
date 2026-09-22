package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14538a;
    public final ViewGroup f14539b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14538a = i10;
        this.f14539b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14538a) {
            case 0:
                SearchView searchView = (SearchView) this.f14539b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2004d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f14539b;
                h3Var.h = z10;
                if (h3Var.f20388f) {
                    h3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f14539b;
                k3Var.f20545n = z10;
                if (k3Var.f20544f) {
                    k3Var.c();
                }
                k3Var.a(z10);
                return;
        }
    }
}
