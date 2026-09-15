package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14301a;
    public final ViewGroup f14302b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14301a = i10;
        this.f14302b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14301a) {
            case 0:
                SearchView searchView = (SearchView) this.f14302b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2000d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f14302b;
                f3Var.h = z10;
                if (f3Var.f20066f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f14302b;
                i3Var.f20232n = z10;
                if (i3Var.f20231f) {
                    i3Var.c();
                }
                i3Var.a(z10);
                return;
        }
    }
}
