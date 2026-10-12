package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f15573a;
    public final ViewGroup f15574b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f15573a = i10;
        this.f15574b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f15573a) {
            case 0:
                SearchView searchView = (SearchView) this.f15574b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2250d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f15574b;
                g3Var.h = z10;
                if (g3Var.f21889f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f15574b;
                j3Var.f22084n = z10;
                if (j3Var.f22083f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
