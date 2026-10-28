package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f17841a;
    public final ViewGroup f17842b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f17841a = i10;
        this.f17842b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f17841a) {
            case 0:
                SearchView searchView = (SearchView) this.f17842b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2220d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.f17842b;
                d3Var.f24006n = z10;
                if (d3Var.h) {
                    d3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f17842b;
                g3Var.f24153s = z10;
                if (g3Var.f24151n) {
                    g3Var.c();
                }
                g3Var.a(z10);
                return;
        }
    }
}
