package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f15876a;
    public final ViewGroup f15877b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f15876a = i10;
        this.f15877b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15876a) {
            case 0:
                SearchView searchView = (SearchView) this.f15877b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2173d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f15877b;
                g3Var.h = z10;
                if (g3Var.f22135f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f15877b;
                j3Var.f22315n = z10;
                if (j3Var.f22314f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
