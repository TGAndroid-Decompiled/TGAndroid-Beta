package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f16331a;
    public final ViewGroup f16332b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f16331a = i10;
        this.f16332b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f16331a) {
            case 0:
                SearchView searchView = (SearchView) this.f16332b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2771d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f16332b;
                f3Var.h = z10;
                if (f3Var.f22227f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f16332b;
                i3Var.f22401n = z10;
                if (i3Var.f22400f) {
                    i3Var.c();
                }
                i3Var.a(z10);
                return;
        }
    }
}
