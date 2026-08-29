package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f16686a;
    public final ViewGroup f16687b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f16686a = i10;
        this.f16687b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f16686a) {
            case 0:
                SearchView searchView = (SearchView) this.f16687b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.W;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.f16687b;
                d3Var.h = z10;
                if (d3Var.f24221f) {
                    d3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f16687b;
                g3Var.f24391n = z10;
                if (g3Var.f24390f) {
                    g3Var.c();
                }
                g3Var.a(z10);
                return;
        }
    }
}
