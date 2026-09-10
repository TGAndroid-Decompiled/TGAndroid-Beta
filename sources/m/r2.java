package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f13135a;
    public final ViewGroup f13136b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f13135a = i10;
        this.f13136b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f13135a) {
            case 0:
                SearchView searchView = (SearchView) this.f13136b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f690d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f13136b;
                f3Var.h = z10;
                if (f3Var.f19111f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f13136b;
                i3Var.f19296n = z10;
                if (i3Var.f19295f) {
                    i3Var.c();
                }
                i3Var.a(z10);
                return;
        }
    }
}
