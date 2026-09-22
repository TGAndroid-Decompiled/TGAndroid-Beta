package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14300a;
    public final ViewGroup f14301b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14300a = i10;
        this.f14301b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14300a) {
            case 0:
                SearchView searchView = (SearchView) this.f14301b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2002d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f14301b;
                f3Var.h = z10;
                if (f3Var.f20060f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f14301b;
                i3Var.f20193n = z10;
                if (i3Var.f20192f) {
                    i3Var.c();
                }
                i3Var.a(z10);
                return;
        }
    }
}
