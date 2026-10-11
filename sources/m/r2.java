package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f15835a;
    public final ViewGroup f15836b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f15835a = i10;
        this.f15836b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15835a) {
            case 0:
                SearchView searchView = (SearchView) this.f15836b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2252d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f15836b;
                g3Var.h = z10;
                if (g3Var.f22109f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f15836b;
                j3Var.f22293n = z10;
                if (j3Var.f22292f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
