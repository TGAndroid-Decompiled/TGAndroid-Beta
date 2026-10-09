package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f15810a;
    public final ViewGroup f15811b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f15810a = i10;
        this.f15811b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15810a) {
            case 0:
                SearchView searchView = (SearchView) this.f15811b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2252d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f15811b;
                g3Var.h = z10;
                if (g3Var.f22117f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f15811b;
                j3Var.f22301n = z10;
                if (j3Var.f22300f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
