package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f13639a;
    public final ViewGroup f13640b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f13639a = i10;
        this.f13640b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f13639a) {
            case 0:
                SearchView searchView = (SearchView) this.f13640b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f414a0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z4);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f13640b;
                f3Var.h = z4;
                if (f3Var.f21052f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f13640b;
                i3Var.f21202n = z4;
                if (i3Var.f21201f) {
                    i3Var.c();
                }
                i3Var.a(z4);
                return;
        }
    }
}
